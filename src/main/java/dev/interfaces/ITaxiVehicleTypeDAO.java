package dev.interfaces;

import dev.models.TaxiVehicleType;

import java.util.List;
import java.util.Set;

/**
 * Interface for TaxiVehicleTypeDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiVehicleTypeDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiVehicleType entity.
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
	 * ITaxiVehicleTypeDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicleType entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiVehicleType entity);

	/**
	 * Delete a persistent TaxiVehicleType entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiVehicleTypeDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicleType entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiVehicleType entity);

	/**
	 * Persist a previously saved TaxiVehicleType entity and return it or a copy
	 * of it to the sender. A copy of the TaxiVehicleType entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiVehicleTypeDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicleType entity to update
	 * @return TaxiVehicleType the persisted TaxiVehicleType entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiVehicleType update(TaxiVehicleType entity);

	public TaxiVehicleType findById(Integer id);

	/**
	 * Find all TaxiVehicleType entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiVehicleType property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiVehicleType> found by query
	 */
	public List<TaxiVehicleType> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiVehicleType> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiVehicleType> findByCapacity(Object capacity, int... rowStartIdxAndCount);

	public List<TaxiVehicleType> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiVehicleType entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiVehicleType> all TaxiVehicleType entities
	 */
	public List<TaxiVehicleType> findAll(int... rowStartIdxAndCount);
}