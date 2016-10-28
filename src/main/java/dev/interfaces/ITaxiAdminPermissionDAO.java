package dev.interfaces;

import dev.models.TaxiAdminPermission;

import java.util.List;

/**
 * Interface for TaxiAdminPermissionDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiAdminPermissionDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiAdminPermission
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
	 * ITaxiAdminPermissionDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdminPermission entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiAdminPermission entity);

	/**
	 * Delete a persistent TaxiAdminPermission entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiAdminPermissionDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdminPermission entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiAdminPermission entity);

	/**
	 * Persist a previously saved TaxiAdminPermission entity and return it or a
	 * copy of it to the sender. A copy of the TaxiAdminPermission entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiAdminPermissionDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdminPermission entity to update
	 * @return TaxiAdminPermission the persisted TaxiAdminPermission entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiAdminPermission update(TaxiAdminPermission entity);

	public TaxiAdminPermission findById(Integer id);

	/**
	 * Find all TaxiAdminPermission entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiAdminPermission property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiAdminPermission> found by query
	 */
	public List<TaxiAdminPermission> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiAdminPermission> findByLevel(Object level, int... rowStartIdxAndCount);

	public List<TaxiAdminPermission> findByLevelName(Object levelName, int... rowStartIdxAndCount);

	public List<TaxiAdminPermission> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiAdminPermission entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiAdminPermission> all TaxiAdminPermission entities
	 */
	public List<TaxiAdminPermission> findAll(int... rowStartIdxAndCount);
}