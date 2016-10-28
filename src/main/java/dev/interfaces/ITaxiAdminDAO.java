package dev.interfaces;

import dev.models.TaxiAdmin;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiAdminDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiAdminDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiAdmin entity. All
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
	 * ITaxiAdminDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdmin entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiAdmin entity);

	/**
	 * Delete a persistent TaxiAdmin entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiAdminDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdmin entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiAdmin entity);

	/**
	 * Persist a previously saved TaxiAdmin entity and return it or a copy of it
	 * to the sender. A copy of the TaxiAdmin entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiAdminDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdmin entity to update
	 * @return TaxiAdmin the persisted TaxiAdmin entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiAdmin update(TaxiAdmin entity);

	public TaxiAdmin findById(Integer id);

	/**
	 * Find all TaxiAdmin entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiAdmin property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiAdmin> found by query
	 */
	public List<TaxiAdmin> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByUsername(Object username, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByPassword(Object password, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByBaseId(Object baseId, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByCompanyId(Object companyId, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByMenuList(Object menuList, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByPermission(Object permission, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByFirstName(Object firstName, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByLastName(Object lastName, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByEmail(Object email, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByPhone(Object phone, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findBySecondaryPhone(Object secondaryPhone, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByProfilePhoto(Object profilePhoto, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByIp(Object ip, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByRememberToken(Object rememberToken, int... rowStartIdxAndCount);

	public List<TaxiAdmin> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiAdmin entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiAdmin> all TaxiAdmin entities
	 */
	public List<TaxiAdmin> findAll(int... rowStartIdxAndCount);
}