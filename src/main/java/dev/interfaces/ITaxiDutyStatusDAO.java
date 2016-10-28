package dev.interfaces;

import dev.models.TaxiDutyStatus;

import java.util.List;

/**
 * Interface for TaxiDutyStatusDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiDutyStatusDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiDutyStatus entity.
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
	 * ITaxiDutyStatusDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDutyStatus entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiDutyStatus entity);

	/**
	 * Delete a persistent TaxiDutyStatus entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiDutyStatusDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDutyStatus entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiDutyStatus entity);

	/**
	 * Persist a previously saved TaxiDutyStatus entity and return it or a copy
	 * of it to the sender. A copy of the TaxiDutyStatus entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiDutyStatusDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDutyStatus entity to update
	 * @return TaxiDutyStatus the persisted TaxiDutyStatus entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiDutyStatus update(TaxiDutyStatus entity);

	public TaxiDutyStatus findById(Integer id);

	/**
	 * Find all TaxiDutyStatus entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiDutyStatus property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiDutyStatus> found by query
	 */
	public List<TaxiDutyStatus> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiDutyStatus> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiDutyStatus> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiDutyStatus entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiDutyStatus> all TaxiDutyStatus entities
	 */
	public List<TaxiDutyStatus> findAll(int... rowStartIdxAndCount);
}