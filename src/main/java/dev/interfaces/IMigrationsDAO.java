package dev.interfaces;

import dev.models.Migrations;
import dev.models.MigrationsId;

import java.util.List;

/**
 * Interface for MigrationsDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IMigrationsDAO {
	/**
	 * Perform an initial save of a previously unsaved Migrations entity. All
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
	 * IMigrationsDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Migrations entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Migrations entity);

	/**
	 * Delete a persistent Migrations entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IMigrationsDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Migrations entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Migrations entity);

	/**
	 * Persist a previously saved Migrations entity and return it or a copy of
	 * it to the sender. A copy of the Migrations entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IMigrationsDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Migrations entity to update
	 * @return Migrations the persisted Migrations entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Migrations update(Migrations entity);

	public Migrations findById(MigrationsId id);

	/**
	 * Find all Migrations entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Migrations property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Migrations> found by query
	 */
	public List<Migrations> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	/**
	 * Find all Migrations entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Migrations> all Migrations entities
	 */
	public List<Migrations> findAll(int... rowStartIdxAndCount);
}