package dev.implementations;

import dev.interfaces.ITaxiNotificationUnreadDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiNotificationUnread;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiNotificationUnread entities. Transaction control of the save(), update()
 * and delete() operations must be handled externally by senders of these
 * methods or must be manually added to each of these methods for data to be
 * persisted to the JPA datastore.
 * 
 * @see TaxiNotificationUnread
 * @author MyEclipse Persistence Tools
 */
public class TaxiNotificationUnreadDAO implements ITaxiNotificationUnreadDAO {
	// property constants
	public static final String USER_TYPE = "userType";
	public static final String MOBILE_OS = "mobileOs";
	public static final String NOTIFICATION = "notification";
	public static final String RESPONSE = "response";
	public static final String MESSAGE = "message";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiNotificationUnread
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
	 * TaxiNotificationUnreadDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiNotificationUnread entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiNotificationUnread entity) {
		EntityManagerHelper.log("saving TaxiNotificationUnread instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiNotificationUnread entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiNotificationUnreadDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiNotificationUnread entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiNotificationUnread entity) {
		EntityManagerHelper.log("deleting TaxiNotificationUnread instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiNotificationUnread.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiNotificationUnread entity and return it or
	 * a copy of it to the sender. A copy of the TaxiNotificationUnread entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiNotificationUnreadDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiNotificationUnread entity to update
	 * @return TaxiNotificationUnread the persisted TaxiNotificationUnread
	 *         entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiNotificationUnread update(TaxiNotificationUnread entity) {
		EntityManagerHelper.log("updating TaxiNotificationUnread instance", Level.INFO, null);
		try {
			TaxiNotificationUnread result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiNotificationUnread findById(Integer id) {
		EntityManagerHelper.log("finding TaxiNotificationUnread instance with id: " + id, Level.INFO, null);
		try {
			TaxiNotificationUnread instance = getEntityManager().find(TaxiNotificationUnread.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiNotificationUnread entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiNotificationUnread property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiNotificationUnread> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiNotificationUnread> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TaxiNotificationUnread instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiNotificationUnread model where model." + propertyName
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

	public List<TaxiNotificationUnread> findByUserType(Object userType, int... rowStartIdxAndCount) {
		return findByProperty(USER_TYPE, userType, rowStartIdxAndCount);
	}

	public List<TaxiNotificationUnread> findByMobileOs(Object mobileOs, int... rowStartIdxAndCount) {
		return findByProperty(MOBILE_OS, mobileOs, rowStartIdxAndCount);
	}

	public List<TaxiNotificationUnread> findByNotification(Object notification, int... rowStartIdxAndCount) {
		return findByProperty(NOTIFICATION, notification, rowStartIdxAndCount);
	}

	public List<TaxiNotificationUnread> findByResponse(Object response, int... rowStartIdxAndCount) {
		return findByProperty(RESPONSE, response, rowStartIdxAndCount);
	}

	public List<TaxiNotificationUnread> findByMessage(Object message, int... rowStartIdxAndCount) {
		return findByProperty(MESSAGE, message, rowStartIdxAndCount);
	}

	public List<TaxiNotificationUnread> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiNotificationUnread entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiNotificationUnread> all TaxiNotificationUnread entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiNotificationUnread> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiNotificationUnread instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiNotificationUnread model";
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