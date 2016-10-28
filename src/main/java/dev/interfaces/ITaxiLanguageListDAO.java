package dev.interfaces;

import dev.models.TaxiLanguageList;

import java.util.List;

/**
 * Interface for TaxiLanguageListDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiLanguageListDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiLanguageList entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiLanguageListDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiLanguageList entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiLanguageList entity);

	/**
	 * Delete a persistent TaxiLanguageList entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiLanguageListDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiLanguageList entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiLanguageList entity);

	/**
	 * Persist a previously saved TaxiLanguageList entity and return it or a
	 * copy of it to the sender. A copy of the TaxiLanguageList entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiLanguageListDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiLanguageList entity to update
	 * @return TaxiLanguageList the persisted TaxiLanguageList entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiLanguageList update(TaxiLanguageList entity);

	public TaxiLanguageList findById(Integer id);

	/**
	 * Find all TaxiLanguageList entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiLanguageList property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiLanguageList> found by query
	 */
	public List<TaxiLanguageList> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiLanguageList> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiLanguageList> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiLanguageList entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiLanguageList> all TaxiLanguageList entities
	 */
	public List<TaxiLanguageList> findAll(int... rowStartIdxAndCount);
}