package dev.implementations;

import dev.interfaces.ITaxiTripPoolDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiTripPool;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiTripPool entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see TaxiTripPool
 * @author MyEclipse Persistence Tools
 */
public class TaxiTripPoolDAO implements ITaxiTripPoolDAO {
	// property constants
	public static final String PICKUP_LAT = "pickupLat";
	public static final String PICKUP_LNG = "pickupLng";
	public static final String PICKUP_LOCATION = "pickupLocation";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiTripPool entity. All
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
	 * TaxiTripPoolDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripPool entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiTripPool entity) {
		EntityManagerHelper.log("saving TaxiTripPool instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiTripPool entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiTripPoolDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripPool entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiTripPool entity) {
		EntityManagerHelper.log("deleting TaxiTripPool instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiTripPool.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiTripPool entity and return it or a copy of
	 * it to the sender. A copy of the TaxiTripPool entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiTripPoolDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripPool entity to update
	 * @return TaxiTripPool the persisted TaxiTripPool entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiTripPool update(TaxiTripPool entity) {
		EntityManagerHelper.log("updating TaxiTripPool instance", Level.INFO, null);
		try {
			TaxiTripPool result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiTripPool findById(Integer id) {
		EntityManagerHelper.log("finding TaxiTripPool instance with id: " + id, Level.INFO, null);
		try {
			TaxiTripPool instance = getEntityManager().find(TaxiTripPool.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiTripPool entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiTripPool property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiTripPool> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiTripPool> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiTripPool instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiTripPool model where model." + propertyName
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

	public List<TaxiTripPool> findByPickupLat(Object pickupLat, int... rowStartIdxAndCount) {
		return findByProperty(PICKUP_LAT, pickupLat, rowStartIdxAndCount);
	}

	public List<TaxiTripPool> findByPickupLng(Object pickupLng, int... rowStartIdxAndCount) {
		return findByProperty(PICKUP_LNG, pickupLng, rowStartIdxAndCount);
	}

	public List<TaxiTripPool> findByPickupLocation(Object pickupLocation, int... rowStartIdxAndCount) {
		return findByProperty(PICKUP_LOCATION, pickupLocation, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiTripPool entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTripPool> all TaxiTripPool entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiTripPool> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiTripPool instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiTripPool model";
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