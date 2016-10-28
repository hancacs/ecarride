package dev.interfaces;

import dev.models.TaxiTripStatus;

import java.util.List;

/**
 * Interface for TaxiTripStatusDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiTripStatusDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiTripStatus entity.
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
	 * ITaxiTripStatusDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripStatus entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiTripStatus entity);

	/**
	 * Delete a persistent TaxiTripStatus entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiTripStatusDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripStatus entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiTripStatus entity);

	/**
	 * Persist a previously saved TaxiTripStatus entity and return it or a copy
	 * of it to the sender. A copy of the TaxiTripStatus entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiTripStatusDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripStatus entity to update
	 * @return TaxiTripStatus the persisted TaxiTripStatus entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiTripStatus update(TaxiTripStatus entity);

	public TaxiTripStatus findById(Integer id);

	/**
	 * Find all TaxiTripStatus entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiTripStatus property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTripStatus> found by query
	 */
	public List<TaxiTripStatus> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiTripStatus> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiTripStatus> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiTripStatus entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTripStatus> all TaxiTripStatus entities
	 */
	public List<TaxiTripStatus> findAll(int... rowStartIdxAndCount);
}