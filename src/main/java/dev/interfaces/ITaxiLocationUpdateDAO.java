package dev.interfaces;

import dev.models.TaxiLocationUpdate;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiLocationUpdateDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiLocationUpdateDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiLocationUpdate
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
	 * ITaxiLocationUpdateDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiLocationUpdate entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiLocationUpdate entity);

	/**
	 * Delete a persistent TaxiLocationUpdate entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiLocationUpdateDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiLocationUpdate entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiLocationUpdate entity);

	/**
	 * Persist a previously saved TaxiLocationUpdate entity and return it or a
	 * copy of it to the sender. A copy of the TaxiLocationUpdate entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiLocationUpdateDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiLocationUpdate entity to update
	 * @return TaxiLocationUpdate the persisted TaxiLocationUpdate entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiLocationUpdate update(TaxiLocationUpdate entity);

	public TaxiLocationUpdate findById(Integer id);

	/**
	 * Find all TaxiLocationUpdate entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiLocationUpdate property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiLocationUpdate> found by query
	 */
	public List<TaxiLocationUpdate> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiLocationUpdate> findByBaseId(Object baseId, int... rowStartIdxAndCount);

	public List<TaxiLocationUpdate> findByCompanyId(Object companyId, int... rowStartIdxAndCount);

	public List<TaxiLocationUpdate> findByDriverId(Object driverId, int... rowStartIdxAndCount);

	public List<TaxiLocationUpdate> findByLat(Object lat, int... rowStartIdxAndCount);

	public List<TaxiLocationUpdate> findByLng(Object lng, int... rowStartIdxAndCount);

	public List<TaxiLocationUpdate> findByDirection(Object direction, int... rowStartIdxAndCount);

	public List<TaxiLocationUpdate> findByDutyStatus(Object dutyStatus, int... rowStartIdxAndCount);

	public List<TaxiLocationUpdate> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiLocationUpdate entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiLocationUpdate> all TaxiLocationUpdate entities
	 */
	public List<TaxiLocationUpdate> findAll(int... rowStartIdxAndCount);
}