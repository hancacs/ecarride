package dev.interfaces;

import dev.models.TaxiPromo;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiPromoDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiPromoDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiPromo entity. All
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
	 * ITaxiPromoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPromo entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiPromo entity);

	/**
	 * Delete a persistent TaxiPromo entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiPromoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPromo entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiPromo entity);

	/**
	 * Persist a previously saved TaxiPromo entity and return it or a copy of it
	 * to the sender. A copy of the TaxiPromo entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiPromoDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPromo entity to update
	 * @return TaxiPromo the persisted TaxiPromo entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiPromo update(TaxiPromo entity);

	public TaxiPromo findById(Integer id);

	/**
	 * Find all TaxiPromo entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiPromo property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPromo> found by query
	 */
	public List<TaxiPromo> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiPromo> findByBaseId(Object baseId, int... rowStartIdxAndCount);

	public List<TaxiPromo> findByCompanyId(Object companyId, int... rowStartIdxAndCount);

	public List<TaxiPromo> findByUserId(Object userId, int... rowStartIdxAndCount);

	public List<TaxiPromo> findByAssignedUserId(Object assignedUserId, int... rowStartIdxAndCount);

	public List<TaxiPromo> findByPromoCode(Object promoCode, int... rowStartIdxAndCount);

	public List<TaxiPromo> findByDisPercentage(Object disPercentage, int... rowStartIdxAndCount);

	public List<TaxiPromo> findByDisAmount(Object disAmount, int... rowStartIdxAndCount);

	public List<TaxiPromo> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiPromo entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPromo> all TaxiPromo entities
	 */
	public List<TaxiPromo> findAll(int... rowStartIdxAndCount);
}