package dev.interfaces;

import dev.models.TaxiTripDetail;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiTripDetailDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiTripDetailDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiTripDetail entity.
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
	 * ITaxiTripDetailDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripDetail entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiTripDetail entity);

	/**
	 * Delete a persistent TaxiTripDetail entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiTripDetailDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripDetail entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiTripDetail entity);

	/**
	 * Persist a previously saved TaxiTripDetail entity and return it or a copy
	 * of it to the sender. A copy of the TaxiTripDetail entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiTripDetailDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripDetail entity to update
	 * @return TaxiTripDetail the persisted TaxiTripDetail entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiTripDetail update(TaxiTripDetail entity);

	public TaxiTripDetail findById(Integer id);

	/**
	 * Find all TaxiTripDetail entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiTripDetail property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTripDetail> found by query
	 */
	public List<TaxiTripDetail> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiTripDetail> findByTripType(Object tripType, int... rowStartIdxAndCount);

	public List<TaxiTripDetail> findByDistance(Object distance, int... rowStartIdxAndCount);

	public List<TaxiTripDetail> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiTripDetail entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTripDetail> all TaxiTripDetail entities
	 */
	public List<TaxiTripDetail> findAll(int... rowStartIdxAndCount);
}