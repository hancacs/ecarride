package dev.implementations;

import dev.interfaces.ITaxiUserDriverDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiUserDriver;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiUserDriver entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see TaxiUserDriver
 * @author MyEclipse Persistence Tools
 */
public class TaxiUserDriverDAO implements ITaxiUserDriverDAO {
	// property constants
	public static final String USER_ID = "userId";
	public static final String DRIVER_ID = "driverId";
	public static final String PRIORITY = "priority";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiUserDriver entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * TaxiUserDriverDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserDriver entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiUserDriver entity) {
		EntityManagerHelper.log("saving TaxiUserDriver instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiUserDriver entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiUserDriverDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserDriver entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiUserDriver entity) {
		EntityManagerHelper.log("deleting TaxiUserDriver instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiUserDriver.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiUserDriver entity and return it or a copy
	 * of it to the sender. A copy of the TaxiUserDriver entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiUserDriverDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserDriver entity to update
	 * @return TaxiUserDriver the persisted TaxiUserDriver entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiUserDriver update(TaxiUserDriver entity) {
		EntityManagerHelper.log("updating TaxiUserDriver instance", Level.INFO, null);
		try {
			TaxiUserDriver result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiUserDriver findById(Integer id) {
		EntityManagerHelper.log("finding TaxiUserDriver instance with id: " + id, Level.INFO, null);
		try {
			TaxiUserDriver instance = getEntityManager().find(TaxiUserDriver.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiUserDriver entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiUserDriver property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiUserDriver> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiUserDriver> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiUserDriver instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiUserDriver model where model." + propertyName
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

	public List<TaxiUserDriver> findByUserId(Object userId, int... rowStartIdxAndCount) {
		return findByProperty(USER_ID, userId, rowStartIdxAndCount);
	}

	public List<TaxiUserDriver> findByDriverId(Object driverId, int... rowStartIdxAndCount) {
		return findByProperty(DRIVER_ID, driverId, rowStartIdxAndCount);
	}

	public List<TaxiUserDriver> findByPriority(Object priority, int... rowStartIdxAndCount) {
		return findByProperty(PRIORITY, priority, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiUserDriver entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiUserDriver> all TaxiUserDriver entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiUserDriver> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiUserDriver instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiUserDriver model";
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