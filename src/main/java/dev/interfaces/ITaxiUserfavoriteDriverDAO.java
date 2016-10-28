package dev.interfaces;

import dev.models.TaxiUserfavoriteDriver;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiUserfavoriteDriverDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiUserfavoriteDriverDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiUserfavoriteDriver
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiUserfavoriteDriverDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserfavoriteDriver entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiUserfavoriteDriver entity);

	/**
	 * Delete a persistent TaxiUserfavoriteDriver entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiUserfavoriteDriverDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserfavoriteDriver entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiUserfavoriteDriver entity);

	/**
	 * Persist a previously saved TaxiUserfavoriteDriver entity and return it or
	 * a copy of it to the sender. A copy of the TaxiUserfavoriteDriver entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiUserfavoriteDriverDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserfavoriteDriver entity to update
	 * @return TaxiUserfavoriteDriver the persisted TaxiUserfavoriteDriver
	 *         entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiUserfavoriteDriver update(TaxiUserfavoriteDriver entity);

	public TaxiUserfavoriteDriver findById(Integer id);

	/**
	 * Find all TaxiUserfavoriteDriver entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiUserfavoriteDriver property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiUserfavoriteDriver> found by query
	 */
	public List<TaxiUserfavoriteDriver> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiUserfavoriteDriver> findByBaseId(Object baseId, int... rowStartIdxAndCount);

	public List<TaxiUserfavoriteDriver> findByCompanyId(Object companyId, int... rowStartIdxAndCount);

	public List<TaxiUserfavoriteDriver> findByUserId(Object userId, int... rowStartIdxAndCount);

	public List<TaxiUserfavoriteDriver> findByDriverId(Object driverId, int... rowStartIdxAndCount);

	public List<TaxiUserfavoriteDriver> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiUserfavoriteDriver entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiUserfavoriteDriver> all TaxiUserfavoriteDriver entities
	 */
	public List<TaxiUserfavoriteDriver> findAll(int... rowStartIdxAndCount);
}