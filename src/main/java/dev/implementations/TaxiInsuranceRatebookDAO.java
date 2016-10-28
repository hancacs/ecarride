package dev.implementations;

import dev.interfaces.ITaxiInsuranceRatebookDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiInsuranceRatebook;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiInsuranceRatebook entities. Transaction control of the save(), update()
 * and delete() operations must be handled externally by senders of these
 * methods or must be manually added to each of these methods for data to be
 * persisted to the JPA datastore.
 * 
 * @see dev.models.TaxiInsuranceRatebook
 * @author MyEclipse Persistence Tools
 */
public class TaxiInsuranceRatebookDAO implements ITaxiInsuranceRatebookDAO {
	// property constants
	public static final String NAME = "name";
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
	 * Perform an initial save of a previously unsaved TaxiInsuranceRatebook
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
	 * TaxiInsuranceRatebookDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiInsuranceRatebook entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiInsuranceRatebook entity) {
		EntityManagerHelper.log("saving TaxiInsuranceRatebook instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiInsuranceRatebook entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiInsuranceRatebookDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiInsuranceRatebook entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiInsuranceRatebook entity) {
		EntityManagerHelper.log("deleting TaxiInsuranceRatebook instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiInsuranceRatebook.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiInsuranceRatebook entity and return it or
	 * a copy of it to the sender. A copy of the TaxiInsuranceRatebook entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiInsuranceRatebookDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiInsuranceRatebook entity to update
	 * @return TaxiInsuranceRatebook the persisted TaxiInsuranceRatebook entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiInsuranceRatebook update(TaxiInsuranceRatebook entity) {
		EntityManagerHelper.log("updating TaxiInsuranceRatebook instance", Level.INFO, null);
		try {
			TaxiInsuranceRatebook result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiInsuranceRatebook findById(Integer id) {
		EntityManagerHelper.log("finding TaxiInsuranceRatebook instance with id: " + id, Level.INFO, null);
		try {
			TaxiInsuranceRatebook instance = getEntityManager().find(TaxiInsuranceRatebook.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiInsuranceRatebook entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiInsuranceRatebook property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiInsuranceRatebook> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiInsuranceRatebook> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TaxiInsuranceRatebook instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiInsuranceRatebook model where model." + propertyName
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

	public List<TaxiInsuranceRatebook> findByName(Object name, int... rowStartIdxAndCount) {
		return findByProperty(NAME, name, rowStartIdxAndCount);
	}

	public List<TaxiInsuranceRatebook> findByBasefare(Object basefare, int... rowStartIdxAndCount) {
		return findByProperty(BASEFARE, basefare, rowStartIdxAndCount);
	}

	public List<TaxiInsuranceRatebook> findByMilefare(Object milefare, int... rowStartIdxAndCount) {
		return findByProperty(MILEFARE, milefare, rowStartIdxAndCount);
	}

	public List<TaxiInsuranceRatebook> findByMinfare(Object minfare, int... rowStartIdxAndCount) {
		return findByProperty(MINFARE, minfare, rowStartIdxAndCount);
	}

	public List<TaxiInsuranceRatebook> findByMinimumfare(Object minimumfare, int... rowStartIdxAndCount) {
		return findByProperty(MINIMUMFARE, minimumfare, rowStartIdxAndCount);
	}

	public List<TaxiInsuranceRatebook> findByCancelfare(Object cancelfare, int... rowStartIdxAndCount) {
		return findByProperty(CANCELFARE, cancelfare, rowStartIdxAndCount);
	}

	public List<TaxiInsuranceRatebook> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiInsuranceRatebook entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiInsuranceRatebook> all TaxiInsuranceRatebook entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiInsuranceRatebook> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiInsuranceRatebook instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiInsuranceRatebook model";
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