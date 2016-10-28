package dev.interfaces;

import dev.models.TaxiContent;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiContentDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiContentDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiContent entity. All
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
	 * ITaxiContentDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiContent entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiContent entity);

	/**
	 * Delete a persistent TaxiContent entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiContentDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiContent entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiContent entity);

	/**
	 * Persist a previously saved TaxiContent entity and return it or a copy of
	 * it to the sender. A copy of the TaxiContent entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiContentDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiContent entity to update
	 * @return TaxiContent the persisted TaxiContent entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiContent update(TaxiContent entity);

	public TaxiContent findById(Integer id);

	/**
	 * Find all TaxiContent entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiContent property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiContent> found by query
	 */
	public List<TaxiContent> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiContent> findByParentId(Object parentId, int... rowStartIdxAndCount);

	public List<TaxiContent> findByTitle(Object title, int... rowStartIdxAndCount);

	public List<TaxiContent> findByContent(Object content, int... rowStartIdxAndCount);

	public List<TaxiContent> findByPageTitle(Object pageTitle, int... rowStartIdxAndCount);

	public List<TaxiContent> findByPageKeyword(Object pageKeyword, int... rowStartIdxAndCount);

	public List<TaxiContent> findByPageDescription(Object pageDescription, int... rowStartIdxAndCount);

	public List<TaxiContent> findByAccessKey(Object accessKey, int... rowStartIdxAndCount);

	public List<TaxiContent> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiContent entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiContent> all TaxiContent entities
	 */
	public List<TaxiContent> findAll(int... rowStartIdxAndCount);
}