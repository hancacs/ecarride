package dev.interfaces;

import dev.models.TaxiCompany;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

/**
 * Interface for TaxiCompanyDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiCompanyDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiCompany entity. All
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
	 * ITaxiCompanyDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiCompany entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiCompany entity);

	/**
	 * Delete a persistent TaxiCompany entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiCompanyDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiCompany entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiCompany entity);

	/**
	 * Persist a previously saved TaxiCompany entity and return it or a copy of
	 * it to the sender. A copy of the TaxiCompany entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiCompanyDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiCompany entity to update
	 * @return TaxiCompany the persisted TaxiCompany entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiCompany update(TaxiCompany entity);

	public TaxiCompany findById(Integer id);

	/**
	 * Find all TaxiCompany entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiCompany property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiCompany> found by query
	 */
	public List<TaxiCompany> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiCompany> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiCompany> findByPhone(Object phone, int... rowStartIdxAndCount);

	public List<TaxiCompany> findByEmail(Object email, int... rowStartIdxAndCount);

	public List<TaxiCompany> findByAddressOne(Object addressOne, int... rowStartIdxAndCount);

	public List<TaxiCompany> findByAddressTwo(Object addressTwo, int... rowStartIdxAndCount);

	public List<TaxiCompany> findByCity(Object city, int... rowStartIdxAndCount);

	public List<TaxiCompany> findByState(Object state, int... rowStartIdxAndCount);

	public List<TaxiCompany> findByZipcode(Object zipcode, int... rowStartIdxAndCount);

	public List<TaxiCompany> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiCompany entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiCompany> all TaxiCompany entities
	 */
	public List<TaxiCompany> findAll(int... rowStartIdxAndCount);
}