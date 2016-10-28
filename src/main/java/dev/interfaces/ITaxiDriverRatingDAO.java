package dev.interfaces;

import dev.models.TaxiDriverRating;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiDriverRatingDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiDriverRatingDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiDriverRating entity.
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
	 * ITaxiDriverRatingDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriverRating entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiDriverRating entity);

	/**
	 * Delete a persistent TaxiDriverRating entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiDriverRatingDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriverRating entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiDriverRating entity);

	/**
	 * Persist a previously saved TaxiDriverRating entity and return it or a
	 * copy of it to the sender. A copy of the TaxiDriverRating entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiDriverRatingDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriverRating entity to update
	 * @return TaxiDriverRating the persisted TaxiDriverRating entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiDriverRating update(TaxiDriverRating entity);

	public TaxiDriverRating findById(Integer id);

	/**
	 * Find all TaxiDriverRating entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiDriverRating property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiDriverRating> found by query
	 */
	public List<TaxiDriverRating> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiDriverRating> findByDriverId(Object driverId, int... rowStartIdxAndCount);

	public List<TaxiDriverRating> findByRating(Object rating, int... rowStartIdxAndCount);

	public List<TaxiDriverRating> findByComment(Object comment, int... rowStartIdxAndCount);

	public List<TaxiDriverRating> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiDriverRating entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiDriverRating> all TaxiDriverRating entities
	 */
	public List<TaxiDriverRating> findAll(int... rowStartIdxAndCount);
}