package dev.implementations;

import dev.interfaces.ITaxiTollDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiToll;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiToll entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see dev.models.TaxiToll
 * @author MyEclipse Persistence Tools
 */
public class TaxiTollDAO implements ITaxiTollDAO {
	// property constants
	public static final String TOLL_NAME = "tollName";
	public static final String TOLL_CODE = "tollCode";
	public static final String EZPASS_OFFPEAK = "ezpassOffpeak";
	public static final String EZPASS_PEAK = "ezpassPeak";
	public static final String CASH = "cash";
	public static final String BOROUGH = "borough";
	public static final String ZIPCODE = "zipcode";
	public static final String LAT = "lat";
	public static final String LNG = "lng";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiToll entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * TaxiTollDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiToll entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiToll entity) {
		EntityManagerHelper.log("saving TaxiToll instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiToll entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiTollDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiToll entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiToll entity) {
		EntityManagerHelper.log("deleting TaxiToll instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiToll.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiToll entity and return it or a copy of it
	 * to the sender. A copy of the TaxiToll entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiTollDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiToll entity to update
	 * @return TaxiToll the persisted TaxiToll entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiToll update(TaxiToll entity) {
		EntityManagerHelper.log("updating TaxiToll instance", Level.INFO, null);
		try {
			TaxiToll result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiToll findById(Integer id) {
		EntityManagerHelper.log("finding TaxiToll instance with id: " + id, Level.INFO, null);
		try {
			TaxiToll instance = getEntityManager().find(TaxiToll.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiToll entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiToll property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiToll> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiToll> findByProperty(String propertyName, final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiToll instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiToll model where model." + propertyName
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

	public List<TaxiToll> findByTollName(Object tollName, int... rowStartIdxAndCount) {
		return findByProperty(TOLL_NAME, tollName, rowStartIdxAndCount);
	}

	public List<TaxiToll> findByTollCode(Object tollCode, int... rowStartIdxAndCount) {
		return findByProperty(TOLL_CODE, tollCode, rowStartIdxAndCount);
	}

	public List<TaxiToll> findByEzpassOffpeak(Object ezpassOffpeak, int... rowStartIdxAndCount) {
		return findByProperty(EZPASS_OFFPEAK, ezpassOffpeak, rowStartIdxAndCount);
	}

	public List<TaxiToll> findByEzpassPeak(Object ezpassPeak, int... rowStartIdxAndCount) {
		return findByProperty(EZPASS_PEAK, ezpassPeak, rowStartIdxAndCount);
	}

	public List<TaxiToll> findByCash(Object cash, int... rowStartIdxAndCount) {
		return findByProperty(CASH, cash, rowStartIdxAndCount);
	}

	public List<TaxiToll> findByBorough(Object borough, int... rowStartIdxAndCount) {
		return findByProperty(BOROUGH, borough, rowStartIdxAndCount);
	}

	public List<TaxiToll> findByZipcode(Object zipcode, int... rowStartIdxAndCount) {
		return findByProperty(ZIPCODE, zipcode, rowStartIdxAndCount);
	}

	public List<TaxiToll> findByLat(Object lat, int... rowStartIdxAndCount) {
		return findByProperty(LAT, lat, rowStartIdxAndCount);
	}

	public List<TaxiToll> findByLng(Object lng, int... rowStartIdxAndCount) {
		return findByProperty(LNG, lng, rowStartIdxAndCount);
	}

	public List<TaxiToll> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiToll entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiToll> all TaxiToll entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiToll> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiToll instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiToll model";
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