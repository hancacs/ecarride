package dev.implementations;

import dev.interfaces.IInsuranceCompanyInfoDAO;
import dev.models.EntityManagerHelper;
import dev.models.InsuranceCompanyInfo;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * InsuranceCompanyInfo entities. Transaction control of the save(), update()
 * and delete() operations must be handled externally by senders of these
 * methods or must be manually added to each of these methods for data to be
 * persisted to the JPA datastore.
 * 
 * @see dev.models.InsuranceCompanyInfo
 * @author MyEclipse Persistence Tools
 */
public class InsuranceCompanyInfoDAO implements IInsuranceCompanyInfoDAO {
	// property constants
	public static final String INSURANCE_COMPANY_NAME = "insuranceCompanyName";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved InsuranceCompanyInfo
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
	 * InsuranceCompanyInfoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            InsuranceCompanyInfo entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(InsuranceCompanyInfo entity) {
		EntityManagerHelper.log("saving InsuranceCompanyInfo instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent InsuranceCompanyInfo entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * InsuranceCompanyInfoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            InsuranceCompanyInfo entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(InsuranceCompanyInfo entity) {
		EntityManagerHelper.log("deleting InsuranceCompanyInfo instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(InsuranceCompanyInfo.class, entity.getInsuranceCompanyId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved InsuranceCompanyInfo entity and return it or a
	 * copy of it to the sender. A copy of the InsuranceCompanyInfo entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = InsuranceCompanyInfoDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            InsuranceCompanyInfo entity to update
	 * @return InsuranceCompanyInfo the persisted InsuranceCompanyInfo entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public InsuranceCompanyInfo update(InsuranceCompanyInfo entity) {
		EntityManagerHelper.log("updating InsuranceCompanyInfo instance", Level.INFO, null);
		try {
			InsuranceCompanyInfo result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public InsuranceCompanyInfo findById(Integer id) {
		EntityManagerHelper.log("finding InsuranceCompanyInfo instance with id: " + id, Level.INFO, null);
		try {
			InsuranceCompanyInfo instance = getEntityManager().find(InsuranceCompanyInfo.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all InsuranceCompanyInfo entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the InsuranceCompanyInfo property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<InsuranceCompanyInfo> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<InsuranceCompanyInfo> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding InsuranceCompanyInfo instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from InsuranceCompanyInfo model where model." + propertyName
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

	public List<InsuranceCompanyInfo> findByInsuranceCompanyName(Object insuranceCompanyName,
			int... rowStartIdxAndCount) {
		return findByProperty(INSURANCE_COMPANY_NAME, insuranceCompanyName, rowStartIdxAndCount);
	}

	/**
	 * Find all InsuranceCompanyInfo entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<InsuranceCompanyInfo> all InsuranceCompanyInfo entities
	 */
	@SuppressWarnings("unchecked")
	public List<InsuranceCompanyInfo> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all InsuranceCompanyInfo instances", Level.INFO, null);
		try {
			final String queryString = "select model from InsuranceCompanyInfo model";
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