package dev.interfaces;

import dev.models.TaxiOptions;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiOptionsDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiOptionsDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiOptions entity. All
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
	 * ITaxiOptionsDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiOptions entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiOptions entity);

	/**
	 * Delete a persistent TaxiOptions entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiOptionsDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiOptions entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiOptions entity);

	/**
	 * Persist a previously saved TaxiOptions entity and return it or a copy of
	 * it to the sender. A copy of the TaxiOptions entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiOptionsDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiOptions entity to update
	 * @return TaxiOptions the persisted TaxiOptions entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiOptions update(TaxiOptions entity);

	public TaxiOptions findById(Integer id);

	/**
	 * Find all TaxiOptions entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiOptions property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiOptions> found by query
	 */
	public List<TaxiOptions> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiOptions> findByOptionName(Object optionName, int... rowStartIdxAndCount);

	public List<TaxiOptions> findByOptionValue(Object optionValue, int... rowStartIdxAndCount);

	public List<TaxiOptions> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiOptions entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiOptions> all TaxiOptions entities
	 */
	public List<TaxiOptions> findAll(int... rowStartIdxAndCount);
}