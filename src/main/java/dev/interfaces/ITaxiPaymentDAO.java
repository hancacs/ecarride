package dev.interfaces;

import dev.models.TaxiPayment;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiPaymentDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiPaymentDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiPayment entity. All
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
	 * ITaxiPaymentDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPayment entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiPayment entity);

	/**
	 * Delete a persistent TaxiPayment entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiPaymentDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPayment entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiPayment entity);

	/**
	 * Persist a previously saved TaxiPayment entity and return it or a copy of
	 * it to the sender. A copy of the TaxiPayment entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiPaymentDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPayment entity to update
	 * @return TaxiPayment the persisted TaxiPayment entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiPayment update(TaxiPayment entity);

	public TaxiPayment findById(Integer id);

	/**
	 * Find all TaxiPayment entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiPayment property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPayment> found by query
	 */
	public List<TaxiPayment> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiPayment> findByPayment(Object payment, int... rowStartIdxAndCount);

	public List<TaxiPayment> findByChequeNo(Object chequeNo, int... rowStartIdxAndCount);

	public List<TaxiPayment> findByPayStatus(Object payStatus, int... rowStartIdxAndCount);

	public List<TaxiPayment> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiPayment entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPayment> all TaxiPayment entities
	 */
	public List<TaxiPayment> findAll(int... rowStartIdxAndCount);
}