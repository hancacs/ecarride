package dev.interfaces;

import dev.models.TaxiCountryList;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiCountryListDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiCountryListDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiCountryList entity.
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
	 * ITaxiCountryListDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiCountryList entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiCountryList entity);

	/**
	 * Delete a persistent TaxiCountryList entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiCountryListDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiCountryList entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiCountryList entity);

	/**
	 * Persist a previously saved TaxiCountryList entity and return it or a copy
	 * of it to the sender. A copy of the TaxiCountryList entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiCountryListDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiCountryList entity to update
	 * @return TaxiCountryList the persisted TaxiCountryList entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiCountryList update(TaxiCountryList entity);

	public TaxiCountryList findById(Integer id);

	/**
	 * Find all TaxiCountryList entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiCountryList property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiCountryList> found by query
	 */
	public List<TaxiCountryList> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiCountryList> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiCountryList> findByCode(Object code, int... rowStartIdxAndCount);

	public List<TaxiCountryList> findByDisplayOrder(Object displayOrder, int... rowStartIdxAndCount);

	public List<TaxiCountryList> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiCountryList entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiCountryList> all TaxiCountryList entities
	 */
	public List<TaxiCountryList> findAll(int... rowStartIdxAndCount);
}