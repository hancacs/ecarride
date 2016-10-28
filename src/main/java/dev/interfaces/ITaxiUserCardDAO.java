package dev.interfaces;

import dev.models.TaxiUserCard;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiUserCardDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiUserCardDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiUserCard entity. All
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
	 * ITaxiUserCardDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserCard entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiUserCard entity);

	/**
	 * Delete a persistent TaxiUserCard entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiUserCardDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserCard entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiUserCard entity);

	/**
	 * Persist a previously saved TaxiUserCard entity and return it or a copy of
	 * it to the sender. A copy of the TaxiUserCard entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiUserCardDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserCard entity to update
	 * @return TaxiUserCard the persisted TaxiUserCard entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiUserCard update(TaxiUserCard entity);

	public TaxiUserCard findById(Integer id);

	/**
	 * Find all TaxiUserCard entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiUserCard property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiUserCard> found by query
	 */
	public List<TaxiUserCard> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiUserCard> findByUserId(Object userId, int... rowStartIdxAndCount);

	public List<TaxiUserCard> findByFirstName(Object firstName, int... rowStartIdxAndCount);

	public List<TaxiUserCard> findByLastName(Object lastName, int... rowStartIdxAndCount);

	public List<TaxiUserCard> findByCardNo(Object cardNo, int... rowStartIdxAndCount);

	public List<TaxiUserCard> findByCardType(Object cardType, int... rowStartIdxAndCount);

	public List<TaxiUserCard> findByCardCvv(Object cardCvv, int... rowStartIdxAndCount);

	public List<TaxiUserCard> findByCardValidMon(Object cardValidMon, int... rowStartIdxAndCount);

	public List<TaxiUserCard> findByCardValidYear(Object cardValidYear, int... rowStartIdxAndCount);

	public List<TaxiUserCard> findByMydefault(Object mydefault, int... rowStartIdxAndCount);

	public List<TaxiUserCard> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiUserCard entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiUserCard> all TaxiUserCard entities
	 */
	public List<TaxiUserCard> findAll(int... rowStartIdxAndCount);
}