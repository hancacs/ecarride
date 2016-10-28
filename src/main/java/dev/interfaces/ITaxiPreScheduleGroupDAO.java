package dev.interfaces;

import dev.models.TaxiPreScheduleGroup;

import java.util.List;

/**
 * Interface for TaxiPreScheduleGroupDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiPreScheduleGroupDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiPreScheduleGroup
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
	 * ITaxiPreScheduleGroupDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPreScheduleGroup entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiPreScheduleGroup entity);

	/**
	 * Delete a persistent TaxiPreScheduleGroup entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiPreScheduleGroupDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPreScheduleGroup entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiPreScheduleGroup entity);

	/**
	 * Persist a previously saved TaxiPreScheduleGroup entity and return it or a
	 * copy of it to the sender. A copy of the TaxiPreScheduleGroup entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiPreScheduleGroupDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPreScheduleGroup entity to update
	 * @return TaxiPreScheduleGroup the persisted TaxiPreScheduleGroup entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiPreScheduleGroup update(TaxiPreScheduleGroup entity);

	public TaxiPreScheduleGroup findById(Integer id);

	/**
	 * Find all TaxiPreScheduleGroup entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiPreScheduleGroup property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPreScheduleGroup> found by query
	 */
	public List<TaxiPreScheduleGroup> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiPreScheduleGroup> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiPreScheduleGroup> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiPreScheduleGroup entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPreScheduleGroup> all TaxiPreScheduleGroup entities
	 */
	public List<TaxiPreScheduleGroup> findAll(int... rowStartIdxAndCount);
}