package dev.interfaces;

import dev.models.TaxiVehicleTypeBak;

import java.util.List;

/**
 * Interface for TaxiVehicleTypeBakDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiVehicleTypeBakDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiVehicleTypeBak
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
	 * ITaxiVehicleTypeBakDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicleTypeBak entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiVehicleTypeBak entity);

	/**
	 * Delete a persistent TaxiVehicleTypeBak entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiVehicleTypeBakDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicleTypeBak entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiVehicleTypeBak entity);

	/**
	 * Persist a previously saved TaxiVehicleTypeBak entity and return it or a
	 * copy of it to the sender. A copy of the TaxiVehicleTypeBak entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiVehicleTypeBakDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicleTypeBak entity to update
	 * @return TaxiVehicleTypeBak the persisted TaxiVehicleTypeBak entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiVehicleTypeBak update(TaxiVehicleTypeBak entity);

	public TaxiVehicleTypeBak findById(Integer id);

	/**
	 * Find all TaxiVehicleTypeBak entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiVehicleTypeBak property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiVehicleTypeBak> found by query
	 */
	public List<TaxiVehicleTypeBak> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiVehicleTypeBak> findByVehicleType(Object vehicleType, int... rowStartIdxAndCount);

	public List<TaxiVehicleTypeBak> findByBaseType(Object baseType, int... rowStartIdxAndCount);

	public List<TaxiVehicleTypeBak> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiVehicleTypeBak entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiVehicleTypeBak> all TaxiVehicleTypeBak entities
	 */
	public List<TaxiVehicleTypeBak> findAll(int... rowStartIdxAndCount);
}