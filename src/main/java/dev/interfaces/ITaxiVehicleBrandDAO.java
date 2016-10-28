package dev.interfaces;

import dev.models.TaxiVehicleBrand;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiVehicleBrandDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiVehicleBrandDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiVehicleBrand entity.
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
	 * ITaxiVehicleBrandDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicleBrand entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiVehicleBrand entity);

	/**
	 * Delete a persistent TaxiVehicleBrand entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiVehicleBrandDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicleBrand entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiVehicleBrand entity);

	/**
	 * Persist a previously saved TaxiVehicleBrand entity and return it or a
	 * copy of it to the sender. A copy of the TaxiVehicleBrand entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiVehicleBrandDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicleBrand entity to update
	 * @return TaxiVehicleBrand the persisted TaxiVehicleBrand entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiVehicleBrand update(TaxiVehicleBrand entity);

	public TaxiVehicleBrand findById(Integer id);

	/**
	 * Find all TaxiVehicleBrand entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiVehicleBrand property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiVehicleBrand> found by query
	 */
	public List<TaxiVehicleBrand> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiVehicleBrand> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiVehicleBrand> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiVehicleBrand entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiVehicleBrand> all TaxiVehicleBrand entities
	 */
	public List<TaxiVehicleBrand> findAll(int... rowStartIdxAndCount);
}