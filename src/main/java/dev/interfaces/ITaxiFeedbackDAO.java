package dev.interfaces;

import dev.models.TaxiFeedback;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiFeedbackDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiFeedbackDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiFeedback entity. All
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
	 * ITaxiFeedbackDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFeedback entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiFeedback entity);

	/**
	 * Delete a persistent TaxiFeedback entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiFeedbackDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFeedback entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiFeedback entity);

	/**
	 * Persist a previously saved TaxiFeedback entity and return it or a copy of
	 * it to the sender. A copy of the TaxiFeedback entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiFeedbackDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFeedback entity to update
	 * @return TaxiFeedback the persisted TaxiFeedback entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiFeedback update(TaxiFeedback entity);

	public TaxiFeedback findById(Integer id);

	/**
	 * Find all TaxiFeedback entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiFeedback property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiFeedback> found by query
	 */
	public List<TaxiFeedback> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiFeedback> findByFeedback(Object feedback, int... rowStartIdxAndCount);

	public List<TaxiFeedback> findByRating(Object rating, int... rowStartIdxAndCount);

	public List<TaxiFeedback> findByReason(Object reason, int... rowStartIdxAndCount);

	public List<TaxiFeedback> findByFamily(Object family, int... rowStartIdxAndCount);

	public List<TaxiFeedback> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiFeedback entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiFeedback> all TaxiFeedback entities
	 */
	public List<TaxiFeedback> findAll(int... rowStartIdxAndCount);
}