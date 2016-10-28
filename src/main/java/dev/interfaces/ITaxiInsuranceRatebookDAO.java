package dev.interfaces;

import dev.models.TaxiInsuranceRatebook;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiInsuranceRatebookDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiInsuranceRatebookDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiInsuranceRatebook
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
	 * ITaxiInsuranceRatebookDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiInsuranceRatebook entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiInsuranceRatebook entity);

	/**
	 * Delete a persistent TaxiInsuranceRatebook entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiInsuranceRatebookDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiInsuranceRatebook entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiInsuranceRatebook entity);

	/**
	 * Persist a previously saved TaxiInsuranceRatebook entity and return it or
	 * a copy of it to the sender. A copy of the TaxiInsuranceRatebook entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiInsuranceRatebookDAO.update(entity);
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
	public TaxiInsuranceRatebook update(TaxiInsuranceRatebook entity);

	public TaxiInsuranceRatebook findById(Integer id);

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
	 *            count of results to return.
	 * @return List<TaxiInsuranceRatebook> found by query
	 */
	public List<TaxiInsuranceRatebook> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiInsuranceRatebook> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiInsuranceRatebook> findByBasefare(Object basefare, int... rowStartIdxAndCount);

	public List<TaxiInsuranceRatebook> findByMilefare(Object milefare, int... rowStartIdxAndCount);

	public List<TaxiInsuranceRatebook> findByMinfare(Object minfare, int... rowStartIdxAndCount);

	public List<TaxiInsuranceRatebook> findByMinimumfare(Object minimumfare, int... rowStartIdxAndCount);

	public List<TaxiInsuranceRatebook> findByCancelfare(Object cancelfare, int... rowStartIdxAndCount);

	public List<TaxiInsuranceRatebook> findByStatus(Object status, int... rowStartIdxAndCount);

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
	public List<TaxiInsuranceRatebook> findAll(int... rowStartIdxAndCount);
}