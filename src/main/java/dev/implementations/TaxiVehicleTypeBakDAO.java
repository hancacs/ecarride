package dev.implementations;

import dev.interfaces.ITaxiVehicleTypeBakDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiVehicleTypeBak;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiVehicleTypeBak entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see TaxiVehicleTypeBak
 * @author MyEclipse Persistence Tools
 */
public class TaxiVehicleTypeBakDAO implements ITaxiVehicleTypeBakDAO {
	// property constants
	public static final String VEHICLE_TYPE = "vehicleType";
	public static final String BASE_TYPE = "baseType";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiVehicleTypeBak
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
	 * TaxiVehicleTypeBakDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicleTypeBak entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiVehicleTypeBak entity) {
		EntityManagerHelper.log("saving TaxiVehicleTypeBak instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiVehicleTypeBak entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiVehicleTypeBakDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicleTypeBak entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiVehicleTypeBak entity) {
		EntityManagerHelper.log("deleting TaxiVehicleTypeBak instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiVehicleTypeBak.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiVehicleTypeBak entity and return it or a
	 * copy of it to the sender. A copy of the TaxiVehicleTypeBak entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiVehicleTypeBakDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicleTypeBak entity to update
	 * @return TaxiVehicleTypeBak the persisted TaxiVehicleTypeBak entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiVehicleTypeBak update(TaxiVehicleTypeBak entity) {
		EntityManagerHelper.log("updating TaxiVehicleTypeBak instance", Level.INFO, null);
		try {
			TaxiVehicleTypeBak result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiVehicleTypeBak findById(Integer id) {
		EntityManagerHelper.log("finding TaxiVehicleTypeBak instance with id: " + id, Level.INFO, null);
		try {
			TaxiVehicleTypeBak instance = getEntityManager().find(TaxiVehicleTypeBak.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiVehicleTypeBak entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiVehicleTypeBak property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiVehicleTypeBak> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiVehicleTypeBak> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TaxiVehicleTypeBak instance with property: " + propertyName + ", value: " + value, Level.INFO,
				null);
		try {
			final String queryString = "select model from TaxiVehicleTypeBak model where model." + propertyName
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

	public List<TaxiVehicleTypeBak> findByVehicleType(Object vehicleType, int... rowStartIdxAndCount) {
		return findByProperty(VEHICLE_TYPE, vehicleType, rowStartIdxAndCount);
	}

	public List<TaxiVehicleTypeBak> findByBaseType(Object baseType, int... rowStartIdxAndCount) {
		return findByProperty(BASE_TYPE, baseType, rowStartIdxAndCount);
	}

	public List<TaxiVehicleTypeBak> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiVehicleTypeBak entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiVehicleTypeBak> all TaxiVehicleTypeBak entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiVehicleTypeBak> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiVehicleTypeBak instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiVehicleTypeBak model";
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