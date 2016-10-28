package dev.interfaces;

import dev.models.TaxiAdminmenu;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiAdminmenuDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiAdminmenuDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiAdminmenu entity. All
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
	 * ITaxiAdminmenuDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdminmenu entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiAdminmenu entity);

	/**
	 * Delete a persistent TaxiAdminmenu entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiAdminmenuDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdminmenu entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiAdminmenu entity);

	/**
	 * Persist a previously saved TaxiAdminmenu entity and return it or a copy
	 * of it to the sender. A copy of the TaxiAdminmenu entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiAdminmenuDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdminmenu entity to update
	 * @return TaxiAdminmenu the persisted TaxiAdminmenu entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiAdminmenu update(TaxiAdminmenu entity);

	public TaxiAdminmenu findById(Integer id);

	/**
	 * Find all TaxiAdminmenu entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiAdminmenu property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiAdminmenu> found by query
	 */
	public List<TaxiAdminmenu> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiAdminmenu> findByParentId(Object parentId, int... rowStartIdxAndCount);

	public List<TaxiAdminmenu> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiAdminmenu> findByUrl(Object url, int... rowStartIdxAndCount);

	public List<TaxiAdminmenu> findByAngularUrl(Object angularUrl, int... rowStartIdxAndCount);

	public List<TaxiAdminmenu> findByPage(Object page, int... rowStartIdxAndCount);

	public List<TaxiAdminmenu> findByClass_(Object class_, int... rowStartIdxAndCount);

	public List<TaxiAdminmenu> findByImgUrl(Object imgUrl, int... rowStartIdxAndCount);

	public List<TaxiAdminmenu> findByDisplayOrder(Object displayOrder, int... rowStartIdxAndCount);

	public List<TaxiAdminmenu> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiAdminmenu entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiAdminmenu> all TaxiAdminmenu entities
	 */
	public List<TaxiAdminmenu> findAll(int... rowStartIdxAndCount);
}