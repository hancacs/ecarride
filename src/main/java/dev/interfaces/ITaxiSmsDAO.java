package dev.interfaces;

import dev.models.TaxiSms;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiSmsDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiSmsDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiSms entity. All
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
	 * ITaxiSmsDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiSms entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiSms entity);

	/**
	 * Delete a persistent TaxiSms entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiSmsDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiSms entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiSms entity);

	/**
	 * Persist a previously saved TaxiSms entity and return it or a copy of it
	 * to the sender. A copy of the TaxiSms entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiSmsDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiSms entity to update
	 * @return TaxiSms the persisted TaxiSms entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiSms update(TaxiSms entity);

	public TaxiSms findById(Integer id);

	/**
	 * Find all TaxiSms entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiSms property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiSms> found by query
	 */
	public List<TaxiSms> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiSms> findByBaseId(Object baseId, int... rowStartIdxAndCount);

	public List<TaxiSms> findByCompanyId(Object companyId, int... rowStartIdxAndCount);

	public List<TaxiSms> findByUserType(Object userType, int... rowStartIdxAndCount);

	public List<TaxiSms> findBySms(Object sms, int... rowStartIdxAndCount);

	public List<TaxiSms> findByMobile(Object mobile, int... rowStartIdxAndCount);

	public List<TaxiSms> findByMobileNo(Object mobileNo, int... rowStartIdxAndCount);

	public List<TaxiSms> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiSms entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiSms> all TaxiSms entities
	 */
	public List<TaxiSms> findAll(int... rowStartIdxAndCount);
}