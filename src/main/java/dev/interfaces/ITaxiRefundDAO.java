package dev.interfaces;

import dev.models.TaxiRefund;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiRefundDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiRefundDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiRefund entity. All
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
	 * ITaxiRefundDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiRefund entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiRefund entity);

	/**
	 * Delete a persistent TaxiRefund entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiRefundDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiRefund entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiRefund entity);

	/**
	 * Persist a previously saved TaxiRefund entity and return it or a copy of
	 * it to the sender. A copy of the TaxiRefund entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiRefundDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiRefund entity to update
	 * @return TaxiRefund the persisted TaxiRefund entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiRefund update(TaxiRefund entity);

	public TaxiRefund findById(Integer id);

	/**
	 * Find all TaxiRefund entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiRefund property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiRefund> found by query
	 */
	public List<TaxiRefund> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiRefund> findByBaseId(Object baseId, int... rowStartIdxAndCount);

	public List<TaxiRefund> findByCompanyId(Object companyId, int... rowStartIdxAndCount);

	public List<TaxiRefund> findByTripId(Object tripId, int... rowStartIdxAndCount);

	public List<TaxiRefund> findByTransactionId(Object transactionId, int... rowStartIdxAndCount);

	public List<TaxiRefund> findByAmount(Object amount, int... rowStartIdxAndCount);

	public List<TaxiRefund> findByComment(Object comment, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiRefund entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiRefund> all TaxiRefund entities
	 */
	public List<TaxiRefund> findAll(int... rowStartIdxAndCount);
}