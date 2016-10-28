package dev.interfaces;

import dev.models.TaxiTollDetail;

import java.sql.Time;
import java.util.List;

/**
 * Interface for TaxiTollDetailDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiTollDetailDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiTollDetail entity.
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
	 * ITaxiTollDetailDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTollDetail entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiTollDetail entity);

	/**
	 * Delete a persistent TaxiTollDetail entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiTollDetailDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTollDetail entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiTollDetail entity);

	/**
	 * Persist a previously saved TaxiTollDetail entity and return it or a copy
	 * of it to the sender. A copy of the TaxiTollDetail entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiTollDetailDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTollDetail entity to update
	 * @return TaxiTollDetail the persisted TaxiTollDetail entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiTollDetail update(TaxiTollDetail entity);

	public TaxiTollDetail findById(Integer id);

	/**
	 * Find all TaxiTollDetail entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiTollDetail property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTollDetail> found by query
	 */
	public List<TaxiTollDetail> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiTollDetail> findByTollCode(Object tollCode, int... rowStartIdxAndCount);

	public List<TaxiTollDetail> findByType(Object type, int... rowStartIdxAndCount);

	public List<TaxiTollDetail> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiTollDetail entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTollDetail> all TaxiTollDetail entities
	 */
	public List<TaxiTollDetail> findAll(int... rowStartIdxAndCount);
}