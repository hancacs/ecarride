package dev.interfaces;

import dev.models.TaxiUserfavoritePlace;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiUserfavoritePlaceDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiUserfavoritePlaceDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiUserfavoritePlace
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
	 * ITaxiUserfavoritePlaceDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserfavoritePlace entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiUserfavoritePlace entity);

	/**
	 * Delete a persistent TaxiUserfavoritePlace entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiUserfavoritePlaceDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserfavoritePlace entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiUserfavoritePlace entity);

	/**
	 * Persist a previously saved TaxiUserfavoritePlace entity and return it or
	 * a copy of it to the sender. A copy of the TaxiUserfavoritePlace entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiUserfavoritePlaceDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserfavoritePlace entity to update
	 * @return TaxiUserfavoritePlace the persisted TaxiUserfavoritePlace entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiUserfavoritePlace update(TaxiUserfavoritePlace entity);

	public TaxiUserfavoritePlace findById(Integer id);

	/**
	 * Find all TaxiUserfavoritePlace entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiUserfavoritePlace property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiUserfavoritePlace> found by query
	 */
	public List<TaxiUserfavoritePlace> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiUserfavoritePlace> findByUserId(Object userId, int... rowStartIdxAndCount);

	public List<TaxiUserfavoritePlace> findByFavoriteLocation(Object favoriteLocation, int... rowStartIdxAndCount);

	public List<TaxiUserfavoritePlace> findByLatitude(Object latitude, int... rowStartIdxAndCount);

	public List<TaxiUserfavoritePlace> findByLongitude(Object longitude, int... rowStartIdxAndCount);

	public List<TaxiUserfavoritePlace> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiUserfavoritePlace entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiUserfavoritePlace> all TaxiUserfavoritePlace entities
	 */
	public List<TaxiUserfavoritePlace> findAll(int... rowStartIdxAndCount);
}