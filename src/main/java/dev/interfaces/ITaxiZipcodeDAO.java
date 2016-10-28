package dev.interfaces;

import dev.models.TaxiZipcode;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiZipcodeDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiZipcodeDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiZipcode entity. All
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
	 * ITaxiZipcodeDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiZipcode entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiZipcode entity);

	/**
	 * Delete a persistent TaxiZipcode entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiZipcodeDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiZipcode entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiZipcode entity);

	/**
	 * Persist a previously saved TaxiZipcode entity and return it or a copy of
	 * it to the sender. A copy of the TaxiZipcode entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiZipcodeDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiZipcode entity to update
	 * @return TaxiZipcode the persisted TaxiZipcode entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiZipcode update(TaxiZipcode entity);

	public TaxiZipcode findById(Integer id);

	/**
	 * Find all TaxiZipcode entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiZipcode property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiZipcode> found by query
	 */
	public List<TaxiZipcode> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiZipcode> findByAdminId(Object adminId, int... rowStartIdxAndCount);

	public List<TaxiZipcode> findByZipcode(Object zipcode, int... rowStartIdxAndCount);

	public List<TaxiZipcode> findByVehicleTypeId(Object vehicleTypeId, int... rowStartIdxAndCount);

	public List<TaxiZipcode> findByVehicleType(Object vehicleType, int... rowStartIdxAndCount);

	public List<TaxiZipcode> findByBasefare(Object basefare, int... rowStartIdxAndCount);

	public List<TaxiZipcode> findByMilefare(Object milefare, int... rowStartIdxAndCount);

	public List<TaxiZipcode> findByMinfare(Object minfare, int... rowStartIdxAndCount);

	public List<TaxiZipcode> findByMinimumfare(Object minimumfare, int... rowStartIdxAndCount);

	public List<TaxiZipcode> findByCancelfare(Object cancelfare, int... rowStartIdxAndCount);

	public List<TaxiZipcode> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiZipcode entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiZipcode> all TaxiZipcode entities
	 */
	public List<TaxiZipcode> findAll(int... rowStartIdxAndCount);
}