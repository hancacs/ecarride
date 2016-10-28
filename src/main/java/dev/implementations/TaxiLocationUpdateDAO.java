package dev.implementations;

import dev.interfaces.ITaxiLocationUpdateDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiLocationUpdate;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiLocationUpdate entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see dev.models.TaxiLocationUpdate
 * @author MyEclipse Persistence Tools
 */
public class TaxiLocationUpdateDAO implements ITaxiLocationUpdateDAO {
	// property constants
	public static final String BASE_ID = "baseId";
	public static final String COMPANY_ID = "companyId";
	public static final String DRIVER_ID = "driverId";
	public static final String LAT = "lat";
	public static final String LNG = "lng";
	public static final String DIRECTION = "direction";
	public static final String DUTY_STATUS = "dutyStatus";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiLocationUpdate
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * TaxiLocationUpdateDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiLocationUpdate entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiLocationUpdate entity) {
		EntityManagerHelper.log("saving TaxiLocationUpdate instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiLocationUpdate entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiLocationUpdateDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiLocationUpdate entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiLocationUpdate entity) {
		EntityManagerHelper.log("deleting TaxiLocationUpdate instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiLocationUpdate.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiLocationUpdate entity and return it or a
	 * copy of it to the sender. A copy of the TaxiLocationUpdate entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiLocationUpdateDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiLocationUpdate entity to update
	 * @return TaxiLocationUpdate the persisted TaxiLocationUpdate entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiLocationUpdate update(TaxiLocationUpdate entity) {
		EntityManagerHelper.log("updating TaxiLocationUpdate instance", Level.INFO, null);
		try {
			TaxiLocationUpdate result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiLocationUpdate findById(Integer id) {
		EntityManagerHelper.log("finding TaxiLocationUpdate instance with id: " + id, Level.INFO, null);
		try {
			TaxiLocationUpdate instance = getEntityManager().find(TaxiLocationUpdate.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiLocationUpdate entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiLocationUpdate property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiLocationUpdate> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiLocationUpdate> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TaxiLocationUpdate instance with property: " + propertyName + ", value: " + value, Level.INFO,
				null);
		try {
			final String queryString = "select model from TaxiLocationUpdate model where model." + propertyName
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

	public List<TaxiLocationUpdate> findByBaseId(Object baseId, int... rowStartIdxAndCount) {
		return findByProperty(BASE_ID, baseId, rowStartIdxAndCount);
	}

	public List<TaxiLocationUpdate> findByCompanyId(Object companyId, int... rowStartIdxAndCount) {
		return findByProperty(COMPANY_ID, companyId, rowStartIdxAndCount);
	}

	public List<TaxiLocationUpdate> findByDriverId(Object driverId, int... rowStartIdxAndCount) {
		return findByProperty(DRIVER_ID, driverId, rowStartIdxAndCount);
	}

	public List<TaxiLocationUpdate> findByLat(Object lat, int... rowStartIdxAndCount) {
		return findByProperty(LAT, lat, rowStartIdxAndCount);
	}

	public List<TaxiLocationUpdate> findByLng(Object lng, int... rowStartIdxAndCount) {
		return findByProperty(LNG, lng, rowStartIdxAndCount);
	}

	public List<TaxiLocationUpdate> findByDirection(Object direction, int... rowStartIdxAndCount) {
		return findByProperty(DIRECTION, direction, rowStartIdxAndCount);
	}

	public List<TaxiLocationUpdate> findByDutyStatus(Object dutyStatus, int... rowStartIdxAndCount) {
		return findByProperty(DUTY_STATUS, dutyStatus, rowStartIdxAndCount);
	}

	public List<TaxiLocationUpdate> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiLocationUpdate entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiLocationUpdate> all TaxiLocationUpdate entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiLocationUpdate> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiLocationUpdate instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiLocationUpdate model";
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