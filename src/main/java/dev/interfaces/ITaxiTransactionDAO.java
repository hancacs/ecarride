package dev.interfaces;

import dev.models.TaxiTransaction;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiTransactionDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiTransactionDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiTransaction entity.
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
	 * ITaxiTransactionDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTransaction entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiTransaction entity);

	/**
	 * Delete a persistent TaxiTransaction entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiTransactionDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTransaction entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiTransaction entity);

	/**
	 * Persist a previously saved TaxiTransaction entity and return it or a copy
	 * of it to the sender. A copy of the TaxiTransaction entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiTransactionDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTransaction entity to update
	 * @return TaxiTransaction the persisted TaxiTransaction entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiTransaction update(TaxiTransaction entity);

	public TaxiTransaction findById(Integer id);

	/**
	 * Find all TaxiTransaction entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiTransaction property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTransaction> found by query
	 */
	public List<TaxiTransaction> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiTransaction> findByTransactionId(Object transactionId, int... rowStartIdxAndCount);

	public List<TaxiTransaction> findByTransactionStatus(Object transactionStatus, int... rowStartIdxAndCount);

	public List<TaxiTransaction> findByTransactionAmount(Object transactionAmount, int... rowStartIdxAndCount);

	public List<TaxiTransaction> findByTransactionCardno(Object transactionCardno, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiTransaction entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTransaction> all TaxiTransaction entities
	 */
	public List<TaxiTransaction> findAll(int... rowStartIdxAndCount);
}