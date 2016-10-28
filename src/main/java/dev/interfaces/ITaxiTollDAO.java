package dev.interfaces;

import dev.models.TaxiToll;

import java.util.List;

/**
 * Interface for TaxiTollDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiTollDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiToll entity. All
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
	 * ITaxiTollDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiToll entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiToll entity);

	/**
	 * Delete a persistent TaxiToll entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiTollDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiToll entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiToll entity);

	/**
	 * Persist a previously saved TaxiToll entity and return it or a copy of it
	 * to the sender. A copy of the TaxiToll entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiTollDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiToll entity to update
	 * @return TaxiToll the persisted TaxiToll entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiToll update(TaxiToll entity);

	public TaxiToll findById(Integer id);

	/**
	 * Find all TaxiToll entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiToll property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiToll> found by query
	 */
	public List<TaxiToll> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiToll> findByTollName(Object tollName, int... rowStartIdxAndCount);

	public List<TaxiToll> findByTollCode(Object tollCode, int... rowStartIdxAndCount);

	public List<TaxiToll> findByEzpassOffpeak(Object ezpassOffpeak, int... rowStartIdxAndCount);

	public List<TaxiToll> findByEzpassPeak(Object ezpassPeak, int... rowStartIdxAndCount);

	public List<TaxiToll> findByCash(Object cash, int... rowStartIdxAndCount);

	public List<TaxiToll> findByBorough(Object borough, int... rowStartIdxAndCount);

	public List<TaxiToll> findByZipcode(Object zipcode, int... rowStartIdxAndCount);

	public List<TaxiToll> findByLat(Object lat, int... rowStartIdxAndCount);

	public List<TaxiToll> findByLng(Object lng, int... rowStartIdxAndCount);

	public List<TaxiToll> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiToll entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiToll> all TaxiToll entities
	 */
	public List<TaxiToll> findAll(int... rowStartIdxAndCount);
}