package dev.interfaces;

import dev.models.TaxiFareCalType;

import java.util.List;
import java.util.Set;

/**
 * Interface for TaxiFareCalTypeDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiFareCalTypeDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiFareCalType entity.
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
	 * ITaxiFareCalTypeDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFareCalType entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiFareCalType entity);

	/**
	 * Delete a persistent TaxiFareCalType entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiFareCalTypeDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFareCalType entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiFareCalType entity);

	/**
	 * Persist a previously saved TaxiFareCalType entity and return it or a copy
	 * of it to the sender. A copy of the TaxiFareCalType entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiFareCalTypeDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiFareCalType entity to update
	 * @return TaxiFareCalType the persisted TaxiFareCalType entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiFareCalType update(TaxiFareCalType entity);

	public TaxiFareCalType findById(Integer id);

	/**
	 * Find all TaxiFareCalType entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiFareCalType property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiFareCalType> found by query
	 */
	public List<TaxiFareCalType> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiFareCalType> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiFareCalType> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiFareCalType entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiFareCalType> all TaxiFareCalType entities
	 */
	public List<TaxiFareCalType> findAll(int... rowStartIdxAndCount);
}