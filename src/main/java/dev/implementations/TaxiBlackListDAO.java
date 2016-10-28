package dev.implementations;

import dev.interfaces.ITaxiBlackListDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiBlackList;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiBlackList entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see dev.models.TaxiBlackList
 * @author MyEclipse Persistence Tools
 */
public class TaxiBlackListDAO implements ITaxiBlackListDAO {
	// property constants
	public static final String TYPE = "type";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiBlackList entity. All
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
	 * TaxiBlackListDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBlackList entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiBlackList entity) {
		EntityManagerHelper.log("saving TaxiBlackList instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiBlackList entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiBlackListDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBlackList entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiBlackList entity) {
		EntityManagerHelper.log("deleting TaxiBlackList instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiBlackList.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiBlackList entity and return it or a copy
	 * of it to the sender. A copy of the TaxiBlackList entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiBlackListDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBlackList entity to update
	 * @return TaxiBlackList the persisted TaxiBlackList entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiBlackList update(TaxiBlackList entity) {
		EntityManagerHelper.log("updating TaxiBlackList instance", Level.INFO, null);
		try {
			TaxiBlackList result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiBlackList findById(Integer id) {
		EntityManagerHelper.log("finding TaxiBlackList instance with id: " + id, Level.INFO, null);
		try {
			TaxiBlackList instance = getEntityManager().find(TaxiBlackList.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiBlackList entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiBlackList property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiBlackList> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiBlackList> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiBlackList instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiBlackList model where model." + propertyName
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

	public List<TaxiBlackList> findByType(Object type, int... rowStartIdxAndCount) {
		return findByProperty(TYPE, type, rowStartIdxAndCount);
	}

	public List<TaxiBlackList> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiBlackList entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiBlackList> all TaxiBlackList entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiBlackList> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiBlackList instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiBlackList model";
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