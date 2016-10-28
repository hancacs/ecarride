package dev.implementations;

import dev.interfaces.ITaxiFeedbackDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiFeedback;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiFeedback entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see TaxiFeedback
 * @author MyEclipse Persistence Tools
 */
public class TaxiFeedbackDAO implements ITaxiFeedbackDAO {
	// property constants
	public static final String FEEDBACK = "feedback";
	public static final String RATING = "rating";
	public static final String REASON = "reason";
	public static final String FAMILY = "family";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiFeedback entity. All
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
	 * TaxiFeedbackDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFeedback entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiFeedback entity) {
		EntityManagerHelper.log("saving TaxiFeedback instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiFeedback entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiFeedbackDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFeedback entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiFeedback entity) {
		EntityManagerHelper.log("deleting TaxiFeedback instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiFeedback.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiFeedback entity and return it or a copy of
	 * it to the sender. A copy of the TaxiFeedback entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiFeedbackDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFeedback entity to update
	 * @return TaxiFeedback the persisted TaxiFeedback entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiFeedback update(TaxiFeedback entity) {
		EntityManagerHelper.log("updating TaxiFeedback instance", Level.INFO, null);
		try {
			TaxiFeedback result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiFeedback findById(Integer id) {
		EntityManagerHelper.log("finding TaxiFeedback instance with id: " + id, Level.INFO, null);
		try {
			TaxiFeedback instance = getEntityManager().find(TaxiFeedback.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiFeedback entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiFeedback property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiFeedback> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiFeedback> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiFeedback instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiFeedback model where model." + propertyName
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

	public List<TaxiFeedback> findByFeedback(Object feedback, int... rowStartIdxAndCount) {
		return findByProperty(FEEDBACK, feedback, rowStartIdxAndCount);
	}

	public List<TaxiFeedback> findByRating(Object rating, int... rowStartIdxAndCount) {
		return findByProperty(RATING, rating, rowStartIdxAndCount);
	}

	public List<TaxiFeedback> findByReason(Object reason, int... rowStartIdxAndCount) {
		return findByProperty(REASON, reason, rowStartIdxAndCount);
	}

	public List<TaxiFeedback> findByFamily(Object family, int... rowStartIdxAndCount) {
		return findByProperty(FAMILY, family, rowStartIdxAndCount);
	}

	public List<TaxiFeedback> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiFeedback entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiFeedback> all TaxiFeedback entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiFeedback> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiFeedback instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiFeedback model";
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