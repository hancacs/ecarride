package dev.implementations;

import dev.interfaces.ITaxiFavoriteListDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiFavoriteList;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiFavoriteList entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see TaxiFavoriteList
 * @author MyEclipse Persistence Tools
 */
public class TaxiFavoriteListDAO implements ITaxiFavoriteListDAO {
	// property constants
	public static final String USER_CONFIRMED = "userConfirmed";
	public static final String DRIVER_CONFIRMED = "driverConfirmed";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiFavoriteList entity.
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
	 * TaxiFavoriteListDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFavoriteList entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiFavoriteList entity) {
		EntityManagerHelper.log("saving TaxiFavoriteList instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiFavoriteList entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiFavoriteListDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFavoriteList entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiFavoriteList entity) {
		EntityManagerHelper.log("deleting TaxiFavoriteList instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiFavoriteList.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiFavoriteList entity and return it or a
	 * copy of it to the sender. A copy of the TaxiFavoriteList entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiFavoriteListDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFavoriteList entity to update
	 * @return TaxiFavoriteList the persisted TaxiFavoriteList entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiFavoriteList update(TaxiFavoriteList entity) {
		EntityManagerHelper.log("updating TaxiFavoriteList instance", Level.INFO, null);
		try {
			TaxiFavoriteList result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiFavoriteList findById(Integer id) {
		EntityManagerHelper.log("finding TaxiFavoriteList instance with id: " + id, Level.INFO, null);
		try {
			TaxiFavoriteList instance = getEntityManager().find(TaxiFavoriteList.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiFavoriteList entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiFavoriteList property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiFavoriteList> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiFavoriteList> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TaxiFavoriteList instance with property: " + propertyName + ", value: " + value, Level.INFO,
				null);
		try {
			final String queryString = "select model from TaxiFavoriteList model where model." + propertyName
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

	public List<TaxiFavoriteList> findByUserConfirmed(Object userConfirmed, int... rowStartIdxAndCount) {
		return findByProperty(USER_CONFIRMED, userConfirmed, rowStartIdxAndCount);
	}

	public List<TaxiFavoriteList> findByDriverConfirmed(Object driverConfirmed, int... rowStartIdxAndCount) {
		return findByProperty(DRIVER_CONFIRMED, driverConfirmed, rowStartIdxAndCount);
	}

	public List<TaxiFavoriteList> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiFavoriteList entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiFavoriteList> all TaxiFavoriteList entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiFavoriteList> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiFavoriteList instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiFavoriteList model";
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