package dev.implementations;

import dev.interfaces.ITaxiAdminPermissionDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiAdminPermission;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiAdminPermission entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see dev.models.TaxiAdminPermission
 * @author MyEclipse Persistence Tools
 */
public class TaxiAdminPermissionDAO implements ITaxiAdminPermissionDAO {
	// property constants
	public static final String LEVEL = "level";
	public static final String LEVEL_NAME = "levelName";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiAdminPermission
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * TaxiAdminPermissionDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdminPermission entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiAdminPermission entity) {
		EntityManagerHelper.log("saving TaxiAdminPermission instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiAdminPermission entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiAdminPermissionDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdminPermission entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiAdminPermission entity) {
		EntityManagerHelper.log("deleting TaxiAdminPermission instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiAdminPermission.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiAdminPermission entity and return it or a
	 * copy of it to the sender. A copy of the TaxiAdminPermission entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiAdminPermissionDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdminPermission entity to update
	 * @return TaxiAdminPermission the persisted TaxiAdminPermission entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiAdminPermission update(TaxiAdminPermission entity) {
		EntityManagerHelper.log("updating TaxiAdminPermission instance", Level.INFO, null);
		try {
			TaxiAdminPermission result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiAdminPermission findById(Integer id) {
		EntityManagerHelper.log("finding TaxiAdminPermission instance with id: " + id, Level.INFO, null);
		try {
			TaxiAdminPermission instance = getEntityManager().find(TaxiAdminPermission.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiAdminPermission entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiAdminPermission property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiAdminPermission> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiAdminPermission> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TaxiAdminPermission instance with property: " + propertyName + ", value: " + value, Level.INFO,
				null);
		try {
			final String queryString = "select model from TaxiAdminPermission model where model." + propertyName
					+ "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<TaxiAdminPermission> findByLevel(Object level, int... rowStartIdxAndCount) {
		return findByProperty(LEVEL, level, rowStartIdxAndCount);
	}

	public List<TaxiAdminPermission> findByLevelName(Object levelName, int... rowStartIdxAndCount) {
		return findByProperty(LEVEL_NAME, levelName, rowStartIdxAndCount);
	}

	public List<TaxiAdminPermission> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiAdminPermission entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiAdminPermission> all TaxiAdminPermission entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiAdminPermission> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiAdminPermission instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiAdminPermission model";
			Query query = getEntityManager().createQuery(queryString);
			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
				if (rowStartIdx > 0) {
					query.setFirstResult(rowStartIdx);
				}

				if (rowStartIdxAndCount.length > 1) {
					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
					if (rowCount > 0) {
						query.setMaxResults(rowCount);
					}
				}
			}
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}