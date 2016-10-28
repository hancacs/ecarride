package dev.implementations;

import dev.interfaces.ITaxiPreScheduleHistoryDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiPreScheduleHistory;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiPreScheduleHistory entities. Transaction control of the save(), update()
 * and delete() operations must be handled externally by senders of these
 * methods or must be manually added to each of these methods for data to be
 * persisted to the JPA datastore.
 * 
 * @see TaxiPreScheduleHistory
 * @author MyEclipse Persistence Tools
 */
public class TaxiPreScheduleHistoryDAO implements ITaxiPreScheduleHistoryDAO {
	// property constants
	public static final String UPDATE_TIMES = "updateTimes";
	public static final String COUNT_TIMES = "countTimes";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiPreScheduleHistory
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
	 * TaxiPreScheduleHistoryDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPreScheduleHistory entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiPreScheduleHistory entity) {
		EntityManagerHelper.log("saving TaxiPreScheduleHistory instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiPreScheduleHistory entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiPreScheduleHistoryDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPreScheduleHistory entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiPreScheduleHistory entity) {
		EntityManagerHelper.log("deleting TaxiPreScheduleHistory instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiPreScheduleHistory.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiPreScheduleHistory entity and return it or
	 * a copy of it to the sender. A copy of the TaxiPreScheduleHistory entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiPreScheduleHistoryDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPreScheduleHistory entity to update
	 * @return TaxiPreScheduleHistory the persisted TaxiPreScheduleHistory
	 *         entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiPreScheduleHistory update(TaxiPreScheduleHistory entity) {
		EntityManagerHelper.log("updating TaxiPreScheduleHistory instance", Level.INFO, null);
		try {
			TaxiPreScheduleHistory result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiPreScheduleHistory findById(Integer id) {
		EntityManagerHelper.log("finding TaxiPreScheduleHistory instance with id: " + id, Level.INFO, null);
		try {
			TaxiPreScheduleHistory instance = getEntityManager().find(TaxiPreScheduleHistory.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiPreScheduleHistory entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiPreScheduleHistory property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiPreScheduleHistory> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiPreScheduleHistory> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TaxiPreScheduleHistory instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiPreScheduleHistory model where model." + propertyName
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

	public List<TaxiPreScheduleHistory> findByUpdateTimes(Object updateTimes, int... rowStartIdxAndCount) {
		return findByProperty(UPDATE_TIMES, updateTimes, rowStartIdxAndCount);
	}

	public List<TaxiPreScheduleHistory> findByCountTimes(Object countTimes, int... rowStartIdxAndCount) {
		return findByProperty(COUNT_TIMES, countTimes, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiPreScheduleHistory entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPreScheduleHistory> all TaxiPreScheduleHistory entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiPreScheduleHistory> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiPreScheduleHistory instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiPreScheduleHistory model";
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