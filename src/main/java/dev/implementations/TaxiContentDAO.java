package dev.implementations;

import dev.interfaces.ITaxiContentDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiContent;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiContent entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see dev.models.TaxiContent
 * @author MyEclipse Persistence Tools
 */
public class TaxiContentDAO implements ITaxiContentDAO {
	// property constants
	public static final String PARENT_ID = "parentId";
	public static final String TITLE = "title";
	public static final String CONTENT = "content";
	public static final String PAGE_TITLE = "pageTitle";
	public static final String PAGE_KEYWORD = "pageKeyword";
	public static final String PAGE_DESCRIPTION = "pageDescription";
	public static final String ACCESS_KEY = "accessKey";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiContent entity. All
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
	 * TaxiContentDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiContent entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiContent entity) {
		EntityManagerHelper.log("saving TaxiContent instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiContent entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiContentDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiContent entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiContent entity) {
		EntityManagerHelper.log("deleting TaxiContent instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiContent.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiContent entity and return it or a copy of
	 * it to the sender. A copy of the TaxiContent entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiContentDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiContent entity to update
	 * @return TaxiContent the persisted TaxiContent entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiContent update(TaxiContent entity) {
		EntityManagerHelper.log("updating TaxiContent instance", Level.INFO, null);
		try {
			TaxiContent result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiContent findById(Integer id) {
		EntityManagerHelper.log("finding TaxiContent instance with id: " + id, Level.INFO, null);
		try {
			TaxiContent instance = getEntityManager().find(TaxiContent.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiContent entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiContent property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiContent> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiContent> findByProperty(String propertyName, final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiContent instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiContent model where model." + propertyName
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

	public List<TaxiContent> findByParentId(Object parentId, int... rowStartIdxAndCount) {
		return findByProperty(PARENT_ID, parentId, rowStartIdxAndCount);
	}

	public List<TaxiContent> findByTitle(Object title, int... rowStartIdxAndCount) {
		return findByProperty(TITLE, title, rowStartIdxAndCount);
	}

	public List<TaxiContent> findByContent(Object content, int... rowStartIdxAndCount) {
		return findByProperty(CONTENT, content, rowStartIdxAndCount);
	}

	public List<TaxiContent> findByPageTitle(Object pageTitle, int... rowStartIdxAndCount) {
		return findByProperty(PAGE_TITLE, pageTitle, rowStartIdxAndCount);
	}

	public List<TaxiContent> findByPageKeyword(Object pageKeyword, int... rowStartIdxAndCount) {
		return findByProperty(PAGE_KEYWORD, pageKeyword, rowStartIdxAndCount);
	}

	public List<TaxiContent> findByPageDescription(Object pageDescription, int... rowStartIdxAndCount) {
		return findByProperty(PAGE_DESCRIPTION, pageDescription, rowStartIdxAndCount);
	}

	public List<TaxiContent> findByAccessKey(Object accessKey, int... rowStartIdxAndCount) {
		return findByProperty(ACCESS_KEY, accessKey, rowStartIdxAndCount);
	}

	public List<TaxiContent> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiContent entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiContent> all TaxiContent entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiContent> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiContent instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiContent model";
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