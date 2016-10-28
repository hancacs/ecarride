package dev.interfaces;

import dev.models.InsuranceCompanyInfo;

import java.util.List;

/**
 * Interface for InsuranceCompanyInfoDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IInsuranceCompanyInfoDAO {
	/**
	 * Perform an initial save of a previously unsaved InsuranceCompanyInfo
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * IInsuranceCompanyInfoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            InsuranceCompanyInfo entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(InsuranceCompanyInfo entity);

	/**
	 * Delete a persistent InsuranceCompanyInfo entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IInsuranceCompanyInfoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            InsuranceCompanyInfo entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(InsuranceCompanyInfo entity);

	/**
	 * Persist a previously saved InsuranceCompanyInfo entity and return it or a
	 * copy of it to the sender. A copy of the InsuranceCompanyInfo entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IInsuranceCompanyInfoDAO.update(entity);
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
	public InsuranceCompanyInfo update(InsuranceCompanyInfo entity);

	public InsuranceCompanyInfo findById(Integer id);

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
	 *            count of results to return.
	 * @return List<InsuranceCompanyInfo> found by query
	 */
	public List<InsuranceCompanyInfo> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<InsuranceCompanyInfo> findByInsuranceCompanyName(Object insuranceCompanyName,
                                                                 int... rowStartIdxAndCount);

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
	public List<InsuranceCompanyInfo> findAll(int... rowStartIdxAndCount);
}