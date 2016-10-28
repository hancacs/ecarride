package dev.implementations;

import dev.interfaces.IInsuranceInfoDAO;
import dev.models.EntityManagerHelper;
import dev.models.InsuranceInfo;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * InsuranceInfo entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see InsuranceInfo
 * @author MyEclipse Persistence Tools
 */
public class InsuranceInfoDAO implements IInsuranceInfoDAO {
	// property constants
	public static final String FIRSTNAME = "firstname";
	public static final String LASTNAME = "lastname";
	public static final String INSURANCE_COMPANY_ID = "insuranceCompanyId";
	public static final String STARTING_ADDRESS = "startingAddress";
	public static final String STARTING_BOROUGH = "startingBorough";
	public static final String ENDING_ADDRESS = "endingAddress";
	public static final String ENDING_BOROUGH = "endingBorough";
	public static final String STATUS = "status";
	public static final String PRICE = "price";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved InsuranceInfo entity. All
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
	 * InsuranceInfoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            InsuranceInfo entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(InsuranceInfo entity) {
		EntityManagerHelper.log("saving InsuranceInfo instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent InsuranceInfo entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * InsuranceInfoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            InsuranceInfo entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(InsuranceInfo entity) {
		EntityManagerHelper.log("deleting InsuranceInfo instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(InsuranceInfo.class, entity.getInfoId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved InsuranceInfo entity and return it or a copy
	 * of it to the sender. A copy of the InsuranceInfo entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = InsuranceInfoDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            InsuranceInfo entity to update
	 * @return InsuranceInfo the persisted InsuranceInfo entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public InsuranceInfo update(InsuranceInfo entity) {
		EntityManagerHelper.log("updating InsuranceInfo instance", Level.INFO, null);
		try {
			InsuranceInfo result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public InsuranceInfo findById(Long id) {
		EntityManagerHelper.log("finding InsuranceInfo instance with id: " + id, Level.INFO, null);
		try {
			InsuranceInfo instance = getEntityManager().find(InsuranceInfo.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all InsuranceInfo entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the InsuranceInfo property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<InsuranceInfo> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<InsuranceInfo> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding InsuranceInfo instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from InsuranceInfo model where model." + propertyName
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

	public List<InsuranceInfo> findByFirstname(Object firstname, int... rowStartIdxAndCount) {
		return findByProperty(FIRSTNAME, firstname, rowStartIdxAndCount);
	}

	public List<InsuranceInfo> findByLastname(Object lastname, int... rowStartIdxAndCount) {
		return findByProperty(LASTNAME, lastname, rowStartIdxAndCount);
	}

	public List<InsuranceInfo> findByInsuranceCompanyId(Object insuranceCompanyId, int... rowStartIdxAndCount) {
		return findByProperty(INSURANCE_COMPANY_ID, insuranceCompanyId, rowStartIdxAndCount);
	}

	public List<InsuranceInfo> findByStartingAddress(Object startingAddress, int... rowStartIdxAndCount) {
		return findByProperty(STARTING_ADDRESS, startingAddress, rowStartIdxAndCount);
	}

	public List<InsuranceInfo> findByStartingBorough(Object startingBorough, int... rowStartIdxAndCount) {
		return findByProperty(STARTING_BOROUGH, startingBorough, rowStartIdxAndCount);
	}

	public List<InsuranceInfo> findByEndingAddress(Object endingAddress, int... rowStartIdxAndCount) {
		return findByProperty(ENDING_ADDRESS, endingAddress, rowStartIdxAndCount);
	}

	public List<InsuranceInfo> findByEndingBorough(Object endingBorough, int... rowStartIdxAndCount) {
		return findByProperty(ENDING_BOROUGH, endingBorough, rowStartIdxAndCount);
	}

	public List<InsuranceInfo> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	public List<InsuranceInfo> findByPrice(Object price, int... rowStartIdxAndCount) {
		return findByProperty(PRICE, price, rowStartIdxAndCount);
	}

	/**
	 * Find all InsuranceInfo entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<InsuranceInfo> all InsuranceInfo entities
	 */
	@SuppressWarnings("unchecked")
	public List<InsuranceInfo> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all InsuranceInfo instances", Level.INFO, null);
		try {
			final String queryString = "select model from InsuranceInfo model";
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