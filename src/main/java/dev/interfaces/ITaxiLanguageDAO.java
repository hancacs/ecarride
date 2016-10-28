package dev.interfaces;

import dev.models.TaxiLanguage;

import java.util.List;

/**
 * Interface for TaxiLanguageDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiLanguageDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiLanguage entity. All
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
	 * ITaxiLanguageDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiLanguage entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiLanguage entity);

	/**
	 * Delete a persistent TaxiLanguage entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiLanguageDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiLanguage entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiLanguage entity);

	/**
	 * Persist a previously saved TaxiLanguage entity and return it or a copy of
	 * it to the sender. A copy of the TaxiLanguage entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiLanguageDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiLanguage entity to update
	 * @return TaxiLanguage the persisted TaxiLanguage entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiLanguage update(TaxiLanguage entity);

	public TaxiLanguage findById(Integer id);

	/**
	 * Find all TaxiLanguage entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiLanguage property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiLanguage> found by query
	 */
	public List<TaxiLanguage> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiLanguage> findByLanguageName(Object languageName, int... rowStartIdxAndCount);

	public List<TaxiLanguage> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiLanguage entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiLanguage> all TaxiLanguage entities
	 */
	public List<TaxiLanguage> findAll(int... rowStartIdxAndCount);
}