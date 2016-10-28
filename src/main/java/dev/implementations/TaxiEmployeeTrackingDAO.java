package dev.implementations;

import dev.interfaces.ITaxiEmployeeTrackingDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiEmployeeTracking;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiEmployeeTracking entities. Transaction control of the save(), update()
 * and delete() operations must be handled externally by senders of these
 * methods or must be manually added to each of these methods for data to be
 * persisted to the JPA datastore.
 * 
 * @see dev.models.TaxiEmployeeTracking
 * @author MyEclipse Persistence Tools
 */
public class TaxiEmployeeTrackingDAO implements ITaxiEmployeeTrackingDAO {
	// property constants
	public static final String EMPLOYEE_ID = "employeeId";
	public static final String CHECK_HISTORY = "checkHistory";
	public static final String WORKING_HOURS = "workingHours";
	public static final String WORK_SUMMARY = "workSummary";
	public static final String ROUTE_PHOTO = "routePhoto";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiEmployeeTracking
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
	 * TaxiEmployeeTrackingDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiEmployeeTracking entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiEmployeeTracking entity) {
		EntityManagerHelper.log("saving TaxiEmployeeTracking instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiEmployeeTracking entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiEmployeeTrackingDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiEmployeeTracking entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiEmployeeTracking entity) {
		EntityManagerHelper.log("deleting TaxiEmployeeTracking instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiEmployeeTracking.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiEmployeeTracking entity and return it or a
	 * copy of it to the sender. A copy of the TaxiEmployeeTracking entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiEmployeeTrackingDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiEmployeeTracking entity to update
	 * @return TaxiEmployeeTracking the persisted TaxiEmployeeTracking entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiEmployeeTracking update(TaxiEmployeeTracking entity) {
		EntityManagerHelper.log("updating TaxiEmployeeTracking instance", Level.INFO, null);
		try {
			TaxiEmployeeTracking result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiEmployeeTracking findById(Integer id) {
		EntityManagerHelper.log("finding TaxiEmployeeTracking instance with id: " + id, Level.INFO, null);
		try {
			TaxiEmployeeTracking instance = getEntityManager().find(TaxiEmployeeTracking.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiEmployeeTracking entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiEmployeeTracking property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiEmployeeTracking> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiEmployeeTracking> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TaxiEmployeeTracking instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiEmployeeTracking model where model." + propertyName
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

	public List<TaxiEmployeeTracking> findByEmployeeId(Object employeeId, int... rowStartIdxAndCount) {
		return findByProperty(EMPLOYEE_ID, employeeId, rowStartIdxAndCount);
	}

	public List<TaxiEmployeeTracking> findByCheckHistory(Object checkHistory, int... rowStartIdxAndCount) {
		return findByProperty(CHECK_HISTORY, checkHistory, rowStartIdxAndCount);
	}

	public List<TaxiEmployeeTracking> findByWorkingHours(Object workingHours, int... rowStartIdxAndCount) {
		return findByProperty(WORKING_HOURS, workingHours, rowStartIdxAndCount);
	}

	public List<TaxiEmployeeTracking> findByWorkSummary(Object workSummary, int... rowStartIdxAndCount) {
		return findByProperty(WORK_SUMMARY, workSummary, rowStartIdxAndCount);
	}

	public List<TaxiEmployeeTracking> findByRoutePhoto(Object routePhoto, int... rowStartIdxAndCount) {
		return findByProperty(ROUTE_PHOTO, routePhoto, rowStartIdxAndCount);
	}

	public List<TaxiEmployeeTracking> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiEmployeeTracking entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiEmployeeTracking> all TaxiEmployeeTracking entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiEmployeeTracking> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiEmployeeTracking instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiEmployeeTracking model";
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