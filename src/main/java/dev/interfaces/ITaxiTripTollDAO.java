package dev.interfaces;

import dev.models.TaxiTripToll;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiTripTollDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiTripTollDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiTripToll entity. All
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
	 * ITaxiTripTollDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripToll entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiTripToll entity);

	/**
	 * Delete a persistent TaxiTripToll entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiTripTollDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripToll entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiTripToll entity);

	/**
	 * Persist a previously saved TaxiTripToll entity and return it or a copy of
	 * it to the sender. A copy of the TaxiTripToll entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiTripTollDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripToll entity to update
	 * @return TaxiTripToll the persisted TaxiTripToll entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiTripToll update(TaxiTripToll entity);

	public TaxiTripToll findById(Integer id);

	/**
	 * Find all TaxiTripToll entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiTripToll property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTripToll> found by query
	 */
	public List<TaxiTripToll> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiTripToll> findByBaseId(Object baseId, int... rowStartIdxAndCount);

	public List<TaxiTripToll> findByCompanyId(Object companyId, int... rowStartIdxAndCount);

	public List<TaxiTripToll> findByTollId(Object tollId, int... rowStartIdxAndCount);

	public List<TaxiTripToll> findByTollCode(Object tollCode, int... rowStartIdxAndCount);

	public List<TaxiTripToll> findByTollName(Object tollName, int... rowStartIdxAndCount);

	public List<TaxiTripToll> findByTollPrice(Object tollPrice, int... rowStartIdxAndCount);

	public List<TaxiTripToll> findByTripId(Object tripId, int... rowStartIdxAndCount);

	public List<TaxiTripToll> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiTripToll entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTripToll> all TaxiTripToll entities
	 */
	public List<TaxiTripToll> findAll(int... rowStartIdxAndCount);
}