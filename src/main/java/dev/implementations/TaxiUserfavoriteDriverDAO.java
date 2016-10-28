package dev.implementations;

import dev.interfaces.ITaxiUserfavoriteDriverDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiUserfavoriteDriver;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiUserfavoriteDriver entities. Transaction control of the save(), update()
 * and delete() operations must be handled externally by senders of these
 * methods or must be manually added to each of these methods for data to be
 * persisted to the JPA datastore.
 * 
 * @see dev.models.TaxiUserfavoriteDriver
 * @author MyEclipse Persistence Tools
 */
public class TaxiUserfavoriteDriverDAO implements ITaxiUserfavoriteDriverDAO {
	// property constants
	public static final String BASE_ID = "baseId";
	public static final String COMPANY_ID = "companyId";
	public static final String USER_ID = "userId";
	public static final String DRIVER_ID = "driverId";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiUserfavoriteDriver
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
	 * TaxiUserfavoriteDriverDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserfavoriteDriver entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiUserfavoriteDriver entity) {
		EntityManagerHelper.log("saving TaxiUserfavoriteDriver instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiUserfavoriteDriver entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiUserfavoriteDriverDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserfavoriteDriver entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiUserfavoriteDriver entity) {
		EntityManagerHelper.log("deleting TaxiUserfavoriteDriver instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiUserfavoriteDriver.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiUserfavoriteDriver entity and return it or
	 * a copy of it to the sender. A copy of the TaxiUserfavoriteDriver entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiUserfavoriteDriverDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserfavoriteDriver entity to update
	 * @return TaxiUserfavoriteDriver the persisted TaxiUserfavoriteDriver
	 *         entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiUserfavoriteDriver update(TaxiUserfavoriteDriver entity) {
		EntityManagerHelper.log("updating TaxiUserfavoriteDriver instance", Level.INFO, null);
		try {
			TaxiUserfavoriteDriver result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiUserfavoriteDriver findById(Integer id) {
		EntityManagerHelper.log("finding TaxiUserfavoriteDriver instance with id: " + id, Level.INFO, null);
		try {
			TaxiUserfavoriteDriver instance = getEntityManager().find(TaxiUserfavoriteDriver.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiUserfavoriteDriver entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiUserfavoriteDriver property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiUserfavoriteDriver> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiUserfavoriteDriver> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TaxiUserfavoriteDriver instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiUserfavoriteDriver model where model." + propertyName
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

	public List<TaxiUserfavoriteDriver> findByBaseId(Object baseId, int... rowStartIdxAndCount) {
		return findByProperty(BASE_ID, baseId, rowStartIdxAndCount);
	}

	public List<TaxiUserfavoriteDriver> findByCompanyId(Object companyId, int... rowStartIdxAndCount) {
		return findByProperty(COMPANY_ID, companyId, rowStartIdxAndCount);
	}

	public List<TaxiUserfavoriteDriver> findByUserId(Object userId, int... rowStartIdxAndCount) {
		return findByProperty(USER_ID, userId, rowStartIdxAndCount);
	}

	public List<TaxiUserfavoriteDriver> findByDriverId(Object driverId, int... rowStartIdxAndCount) {
		return findByProperty(DRIVER_ID, driverId, rowStartIdxAndCount);
	}

	public List<TaxiUserfavoriteDriver> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiUserfavoriteDriver entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiUserfavoriteDriver> all TaxiUserfavoriteDriver entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiUserfavoriteDriver> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiUserfavoriteDriver instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiUserfavoriteDriver model";
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