package dev.implementations;

import dev.interfaces.ITaxiRatebookDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiRatebook;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiRatebook entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see TaxiRatebook
 * @author MyEclipse Persistence Tools
 */
public class TaxiRatebookDAO implements ITaxiRatebookDAO {
	// property constants
	public static final String RATEBOOK_TYPE = "ratebookType";
	public static final String INSURANCE_COMPANY = "insuranceCompany";
	public static final String BASEFARE = "basefare";
	public static final String MILEFARE = "milefare";
	public static final String MINFARE = "minfare";
	public static final String MINIMUMFARE = "minimumfare";
	public static final String CANCELFARE = "cancelfare";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiRatebook entity. All
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
	 * TaxiRatebookDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiRatebook entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiRatebook entity) {
		EntityManagerHelper.log("saving TaxiRatebook instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiRatebook entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiRatebookDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiRatebook entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiRatebook entity) {
		EntityManagerHelper.log("deleting TaxiRatebook instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiRatebook.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiRatebook entity and return it or a copy of
	 * it to the sender. A copy of the TaxiRatebook entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiRatebookDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiRatebook entity to update
	 * @return TaxiRatebook the persisted TaxiRatebook entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiRatebook update(TaxiRatebook entity) {
		EntityManagerHelper.log("updating TaxiRatebook instance", Level.INFO, null);
		try {
			TaxiRatebook result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiRatebook findById(Integer id) {
		EntityManagerHelper.log("finding TaxiRatebook instance with id: " + id, Level.INFO, null);
		try {
			TaxiRatebook instance = getEntityManager().find(TaxiRatebook.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiRatebook entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiRatebook property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiRatebook> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiRatebook> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiRatebook instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiRatebook model where model." + propertyName
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

	public List<TaxiRatebook> findByRatebookType(Object ratebookType, int... rowStartIdxAndCount) {
		return findByProperty(RATEBOOK_TYPE, ratebookType, rowStartIdxAndCount);
	}

	public List<TaxiRatebook> findByInsuranceCompany(Object insuranceCompany, int... rowStartIdxAndCount) {
		return findByProperty(INSURANCE_COMPANY, insuranceCompany, rowStartIdxAndCount);
	}

	public List<TaxiRatebook> findByBasefare(Object basefare, int... rowStartIdxAndCount) {
		return findByProperty(BASEFARE, basefare, rowStartIdxAndCount);
	}

	public List<TaxiRatebook> findByMilefare(Object milefare, int... rowStartIdxAndCount) {
		return findByProperty(MILEFARE, milefare, rowStartIdxAndCount);
	}

	public List<TaxiRatebook> findByMinfare(Object minfare, int... rowStartIdxAndCount) {
		return findByProperty(MINFARE, minfare, rowStartIdxAndCount);
	}

	public List<TaxiRatebook> findByMinimumfare(Object minimumfare, int... rowStartIdxAndCount) {
		return findByProperty(MINIMUMFARE, minimumfare, rowStartIdxAndCount);
	}

	public List<TaxiRatebook> findByCancelfare(Object cancelfare, int... rowStartIdxAndCount) {
		return findByProperty(CANCELFARE, cancelfare, rowStartIdxAndCount);
	}

	public List<TaxiRatebook> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiRatebook entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiRatebook> all TaxiRatebook entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiRatebook> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiRatebook instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiRatebook model";
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