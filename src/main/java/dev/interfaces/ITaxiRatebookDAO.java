package dev.interfaces;

import dev.models.TaxiRatebook;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiRatebookDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiRatebookDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiRatebook entity. All
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
	 * ITaxiRatebookDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiRatebook entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiRatebook entity);

	/**
	 * Delete a persistent TaxiRatebook entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiRatebookDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiRatebook entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiRatebook entity);

	/**
	 * Persist a previously saved TaxiRatebook entity and return it or a copy of
	 * it to the sender. A copy of the TaxiRatebook entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiRatebookDAO.update(entity);
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
	public TaxiRatebook update(TaxiRatebook entity);

	public TaxiRatebook findById(Integer id);

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
	 *            count of results to return.
	 * @return List<TaxiRatebook> found by query
	 */
	public List<TaxiRatebook> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiRatebook> findByRatebookType(Object ratebookType, int... rowStartIdxAndCount);

	public List<TaxiRatebook> findByInsuranceCompany(Object insuranceCompany, int... rowStartIdxAndCount);

	public List<TaxiRatebook> findByBasefare(Object basefare, int... rowStartIdxAndCount);

	public List<TaxiRatebook> findByMilefare(Object milefare, int... rowStartIdxAndCount);

	public List<TaxiRatebook> findByMinfare(Object minfare, int... rowStartIdxAndCount);

	public List<TaxiRatebook> findByMinimumfare(Object minimumfare, int... rowStartIdxAndCount);

	public List<TaxiRatebook> findByCancelfare(Object cancelfare, int... rowStartIdxAndCount);

	public List<TaxiRatebook> findByStatus(Object status, int... rowStartIdxAndCount);

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
	public List<TaxiRatebook> findAll(int... rowStartIdxAndCount);
}