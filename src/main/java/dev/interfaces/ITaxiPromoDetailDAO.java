package dev.interfaces;

import dev.models.TaxiPromoDetail;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiPromoDetailDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiPromoDetailDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiPromoDetail entity.
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
	 * ITaxiPromoDetailDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPromoDetail entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiPromoDetail entity);

	/**
	 * Delete a persistent TaxiPromoDetail entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiPromoDetailDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPromoDetail entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiPromoDetail entity);

	/**
	 * Persist a previously saved TaxiPromoDetail entity and return it or a copy
	 * of it to the sender. A copy of the TaxiPromoDetail entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiPromoDetailDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPromoDetail entity to update
	 * @return TaxiPromoDetail the persisted TaxiPromoDetail entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiPromoDetail update(TaxiPromoDetail entity);

	public TaxiPromoDetail findById(Integer id);

	/**
	 * Find all TaxiPromoDetail entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiPromoDetail property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPromoDetail> found by query
	 */
	public List<TaxiPromoDetail> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiPromoDetail> findByBaseId(Object baseId, int... rowStartIdxAndCount);

	public List<TaxiPromoDetail> findByCompanyId(Object companyId, int... rowStartIdxAndCount);

	public List<TaxiPromoDetail> findByUserId(Object userId, int... rowStartIdxAndCount);

	public List<TaxiPromoDetail> findByTripId(Object tripId, int... rowStartIdxAndCount);

	public List<TaxiPromoDetail> findByPromoCode(Object promoCode, int... rowStartIdxAndCount);

	public List<TaxiPromoDetail> findByUsedCount(Object usedCount, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiPromoDetail entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPromoDetail> all TaxiPromoDetail entities
	 */
	public List<TaxiPromoDetail> findAll(int... rowStartIdxAndCount);
}