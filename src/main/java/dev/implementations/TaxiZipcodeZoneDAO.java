package dev.implementations;

import dev.interfaces.ITaxiZipcodeZoneDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiZipcodeZone;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiZipcodeZone entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see dev.models.TaxiZipcodeZone
 * @author MyEclipse Persistence Tools
 */
public class TaxiZipcodeZoneDAO implements ITaxiZipcodeZoneDAO {
	// property constants
	public static final String BASE_ID = "baseId";
	public static final String COMPANY_ID = "companyId";
	public static final String ZONE = "zone";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiZipcodeZone entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * TaxiZipcodeZoneDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiZipcodeZone entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiZipcodeZone entity) {
		EntityManagerHelper.log("saving TaxiZipcodeZone instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiZipcodeZone entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiZipcodeZoneDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiZipcodeZone entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiZipcodeZone entity) {
		EntityManagerHelper.log("deleting TaxiZipcodeZone instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiZipcodeZone.class, entity.getZipcode());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiZipcodeZone entity and return it or a copy
	 * of it to the sender. A copy of the TaxiZipcodeZone entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiZipcodeZoneDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiZipcodeZone entity to update
	 * @return TaxiZipcodeZone the persisted TaxiZipcodeZone entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiZipcodeZone update(TaxiZipcodeZone entity) {
		EntityManagerHelper.log("updating TaxiZipcodeZone instance", Level.INFO, null);
		try {
			TaxiZipcodeZone result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiZipcodeZone findById(String id) {
		EntityManagerHelper.log("finding TaxiZipcodeZone instance with id: " + id, Level.INFO, null);
		try {
			TaxiZipcodeZone instance = getEntityManager().find(TaxiZipcodeZone.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiZipcodeZone entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiZipcodeZone property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiZipcodeZone> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiZipcodeZone> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiZipcodeZone instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiZipcodeZone model where model." + propertyName
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

	public List<TaxiZipcodeZone> findByBaseId(Object baseId, int... rowStartIdxAndCount) {
		return findByProperty(BASE_ID, baseId, rowStartIdxAndCount);
	}

	public List<TaxiZipcodeZone> findByCompanyId(Object companyId, int... rowStartIdxAndCount) {
		return findByProperty(COMPANY_ID, companyId, rowStartIdxAndCount);
	}

	public List<TaxiZipcodeZone> findByZone(Object zone, int... rowStartIdxAndCount) {
		return findByProperty(ZONE, zone, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiZipcodeZone entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiZipcodeZone> all TaxiZipcodeZone entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiZipcodeZone> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiZipcodeZone instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiZipcodeZone model";
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