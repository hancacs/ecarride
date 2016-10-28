package dev.interfaces;

import dev.models.TaxiEmployee;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiEmployeeDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiEmployeeDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiEmployee entity. All
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
	 * ITaxiEmployeeDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiEmployee entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiEmployee entity);

	/**
	 * Delete a persistent TaxiEmployee entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiEmployeeDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiEmployee entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiEmployee entity);

	/**
	 * Persist a previously saved TaxiEmployee entity and return it or a copy of
	 * it to the sender. A copy of the TaxiEmployee entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiEmployeeDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiEmployee entity to update
	 * @return TaxiEmployee the persisted TaxiEmployee entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiEmployee update(TaxiEmployee entity);

	public TaxiEmployee findById(Integer id);

	/**
	 * Find all TaxiEmployee entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiEmployee property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiEmployee> found by query
	 */
	public List<TaxiEmployee> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByBaseId(Object baseId, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByCompanyId(Object companyId, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByAdminId(Object adminId, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByUsername(Object username, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByPassword(Object password, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByFirstName(Object firstName, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByLastName(Object lastName, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByPhone(Object phone, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByEmail(Object email, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByDutyStatus(Object dutyStatus, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByCurrentLat(Object currentLat, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByCurrentLng(Object currentLng, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByDeviceId(Object deviceId, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByMobileOs(Object mobileOs, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByObjectId(Object objectId, int... rowStartIdxAndCount);

	public List<TaxiEmployee> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiEmployee entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiEmployee> all TaxiEmployee entities
	 */
	public List<TaxiEmployee> findAll(int... rowStartIdxAndCount);
}