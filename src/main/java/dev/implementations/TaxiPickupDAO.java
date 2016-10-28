package dev.implementations;

import dev.interfaces.ITaxiPickupDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiPickup;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiPickup entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see TaxiPickup
 * @author MyEclipse Persistence Tools
 */
public class TaxiPickupDAO implements ITaxiPickupDAO {
	// property constants
	public static final String BASE_ID = "baseId";
	public static final String COMPANY_ID = "companyId";
	public static final String PICKUP_LOCATION = "pickupLocation";
	public static final String DESTINATION_LOCATION = "destinationLocation";
	public static final String LAT = "lat";
	public static final String LNG = "lng";
	public static final String USER_ID = "userId";
	public static final String DRIVER_ID = "driverId";
	public static final String WHEELCHAIR = "wheelchair";
	public static final String TAXI_TYPE = "taxiType";
	public static final String PICKUP_STATUS = "pickupStatus";
	public static final String COMMENTS = "comments";
	public static final String TIME = "time";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiPickup entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * TaxiPickupDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPickup entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiPickup entity) {
		EntityManagerHelper.log("saving TaxiPickup instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiPickup entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiPickupDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPickup entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiPickup entity) {
		EntityManagerHelper.log("deleting TaxiPickup instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiPickup.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiPickup entity and return it or a copy of
	 * it to the sender. A copy of the TaxiPickup entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiPickupDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPickup entity to update
	 * @return TaxiPickup the persisted TaxiPickup entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiPickup update(TaxiPickup entity) {
		EntityManagerHelper.log("updating TaxiPickup instance", Level.INFO, null);
		try {
			TaxiPickup result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiPickup findById(Integer id) {
		EntityManagerHelper.log("finding TaxiPickup instance with id: " + id, Level.INFO, null);
		try {
			TaxiPickup instance = getEntityManager().find(TaxiPickup.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiPickup entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiPickup property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiPickup> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiPickup> findByProperty(String propertyName, final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiPickup instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiPickup model where model." + propertyName
					+ "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<TaxiPickup> findByBaseId(Object baseId, int... rowStartIdxAndCount) {
		return findByProperty(BASE_ID, baseId, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByCompanyId(Object companyId, int... rowStartIdxAndCount) {
		return findByProperty(COMPANY_ID, companyId, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByPickupLocation(Object pickupLocation, int... rowStartIdxAndCount) {
		return findByProperty(PICKUP_LOCATION, pickupLocation, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByDestinationLocation(Object destinationLocation, int... rowStartIdxAndCount) {
		return findByProperty(DESTINATION_LOCATION, destinationLocation, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByLat(Object lat, int... rowStartIdxAndCount) {
		return findByProperty(LAT, lat, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByLng(Object lng, int... rowStartIdxAndCount) {
		return findByProperty(LNG, lng, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByUserId(Object userId, int... rowStartIdxAndCount) {
		return findByProperty(USER_ID, userId, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByDriverId(Object driverId, int... rowStartIdxAndCount) {
		return findByProperty(DRIVER_ID, driverId, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByWheelchair(Object wheelchair, int... rowStartIdxAndCount) {
		return findByProperty(WHEELCHAIR, wheelchair, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByTaxiType(Object taxiType, int... rowStartIdxAndCount) {
		return findByProperty(TAXI_TYPE, taxiType, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByPickupStatus(Object pickupStatus, int... rowStartIdxAndCount) {
		return findByProperty(PICKUP_STATUS, pickupStatus, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByComments(Object comments, int... rowStartIdxAndCount) {
		return findByProperty(COMMENTS, comments, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByTime(Object time, int... rowStartIdxAndCount) {
		return findByProperty(TIME, time, rowStartIdxAndCount);
	}

	public List<TaxiPickup> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiPickup entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPickup> all TaxiPickup entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiPickup> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiPickup instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiPickup model";
			Query query = getEntityManager().createQuery(queryString);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}