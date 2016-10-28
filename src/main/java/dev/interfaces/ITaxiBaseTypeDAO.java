package dev.interfaces;

import dev.models.TaxiBaseType;

import java.util.List;
import java.util.Set;

/**
 * Interface for TaxiBaseTypeDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiBaseTypeDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiBaseType entity. All
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
	 * ITaxiBaseTypeDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBaseType entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiBaseType entity);

	/**
	 * Delete a persistent TaxiBaseType entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiBaseTypeDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBaseType entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiBaseType entity);

	/**
	 * Persist a previously saved TaxiBaseType entity and return it or a copy of
	 * it to the sender. A copy of the TaxiBaseType entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiBaseTypeDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBaseType entity to update
	 * @return TaxiBaseType the persisted TaxiBaseType entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiBaseType update(TaxiBaseType entity);

	public TaxiBaseType findById(Integer id);

	/**
	 * Find all TaxiBaseType entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiBaseType property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiBaseType> found by query
	 */
	public List<TaxiBaseType> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiBaseType> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiBaseType> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiBaseType entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiBaseType> all TaxiBaseType entities
	 */
	public List<TaxiBaseType> findAll(int... rowStartIdxAndCount);
}