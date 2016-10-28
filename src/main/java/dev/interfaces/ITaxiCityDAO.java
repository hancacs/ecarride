package dev.interfaces;

import dev.models.TaxiCity;

import java.util.List;

/**
 * Interface for TaxiCityDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiCityDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiCity entity. All
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
	 * ITaxiCityDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiCity entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiCity entity);

	/**
	 * Delete a persistent TaxiCity entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiCityDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiCity entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiCity entity);

	/**
	 * Persist a previously saved TaxiCity entity and return it or a copy of it
	 * to the sender. A copy of the TaxiCity entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiCityDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiCity entity to update
	 * @return TaxiCity the persisted TaxiCity entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiCity update(TaxiCity entity);

	public TaxiCity findById(Integer id);

	/**
	 * Find all TaxiCity entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiCity property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiCity> found by query
	 */
	public List<TaxiCity> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiCity> findByLatitude(Object latitude, int... rowStartIdxAndCount);

	public List<TaxiCity> findByLongitude(Object longitude, int... rowStartIdxAndCount);

	public List<TaxiCity> findByState(Object state, int... rowStartIdxAndCount);

	public List<TaxiCity> findByCity(Object city, int... rowStartIdxAndCount);

	public List<TaxiCity> findByCounty(Object county, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiCity entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiCity> all TaxiCity entities
	 */
	public List<TaxiCity> findAll(int... rowStartIdxAndCount);
}