package dev.interfaces;

import dev.models.InsuranceInfo;

import java.util.List;

/**
 * Interface for InsuranceInfoDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IInsuranceInfoDAO {
	/**
	 * Perform an initial save of a previously unsaved InsuranceInfo entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * IInsuranceInfoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            InsuranceInfo entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(InsuranceInfo entity);

	/**
	 * Delete a persistent InsuranceInfo entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IInsuranceInfoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            InsuranceInfo entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(InsuranceInfo entity);

	/**
	 * Persist a previously saved InsuranceInfo entity and return it or a copy
	 * of it to the sender. A copy of the InsuranceInfo entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IInsuranceInfoDAO.update(entity);
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
	public InsuranceInfo update(InsuranceInfo entity);

	public InsuranceInfo findById(Long id);

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
	 *            count of results to return.
	 * @return List<InsuranceInfo> found by query
	 */
	public List<InsuranceInfo> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<InsuranceInfo> findByFirstname(Object firstname, int... rowStartIdxAndCount);

	public List<InsuranceInfo> findByLastname(Object lastname, int... rowStartIdxAndCount);

	public List<InsuranceInfo> findByInsuranceCompanyId(Object insuranceCompanyId, int... rowStartIdxAndCount);

	public List<InsuranceInfo> findByStartingAddress(Object startingAddress, int... rowStartIdxAndCount);

	public List<InsuranceInfo> findByStartingBorough(Object startingBorough, int... rowStartIdxAndCount);

	public List<InsuranceInfo> findByEndingAddress(Object endingAddress, int... rowStartIdxAndCount);

	public List<InsuranceInfo> findByEndingBorough(Object endingBorough, int... rowStartIdxAndCount);

	public List<InsuranceInfo> findByStatus(Object status, int... rowStartIdxAndCount);

	public List<InsuranceInfo> findByPrice(Object price, int... rowStartIdxAndCount);

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
	public List<InsuranceInfo> findAll(int... rowStartIdxAndCount);
}