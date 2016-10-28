package dev.interfaces;

import dev.models.TaxiZipcodeZone;

import java.util.List;

/**
 * Interface for TaxiZipcodeZoneDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiZipcodeZoneDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiZipcodeZone entity.
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
	 * ITaxiZipcodeZoneDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiZipcodeZone entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiZipcodeZone entity);

	/**
	 * Delete a persistent TaxiZipcodeZone entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiZipcodeZoneDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiZipcodeZone entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiZipcodeZone entity);

	/**
	 * Persist a previously saved TaxiZipcodeZone entity and return it or a copy
	 * of it to the sender. A copy of the TaxiZipcodeZone entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiZipcodeZoneDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiZipcodeZone entity to update
	 * @return TaxiZipcodeZone the persisted TaxiZipcodeZone entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiZipcodeZone update(TaxiZipcodeZone entity);

	public TaxiZipcodeZone findById(String id);

	/**
	 * Find all TaxiZipcodeZone entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiZipcodeZone property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiZipcodeZone> found by query
	 */
	public List<TaxiZipcodeZone> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiZipcodeZone> findByBaseId(Object baseId, int... rowStartIdxAndCount);

	public List<TaxiZipcodeZone> findByCompanyId(Object companyId, int... rowStartIdxAndCount);

	public List<TaxiZipcodeZone> findByZone(Object zone, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiZipcodeZone entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiZipcodeZone> all TaxiZipcodeZone entities
	 */
	public List<TaxiZipcodeZone> findAll(int... rowStartIdxAndCount);
}