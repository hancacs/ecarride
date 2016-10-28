package dev.implementations;

import dev.interfaces.ITaxiUserfavoritePlaceDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiUserfavoritePlace;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiUserfavoritePlace entities. Transaction control of the save(), update()
 * and delete() operations must be handled externally by senders of these
 * methods or must be manually added to each of these methods for data to be
 * persisted to the JPA datastore.
 * 
 * @see TaxiUserfavoritePlace
 * @author MyEclipse Persistence Tools
 */
public class TaxiUserfavoritePlaceDAO implements ITaxiUserfavoritePlaceDAO {
	// property constants
	public static final String USER_ID = "userId";
	public static final String FAVORITE_LOCATION = "favoriteLocation";
	public static final String LATITUDE = "latitude";
	public static final String LONGITUDE = "longitude";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiUserfavoritePlace
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
	 * TaxiUserfavoritePlaceDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserfavoritePlace entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiUserfavoritePlace entity) {
		EntityManagerHelper.log("saving TaxiUserfavoritePlace instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiUserfavoritePlace entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiUserfavoritePlaceDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserfavoritePlace entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiUserfavoritePlace entity) {
		EntityManagerHelper.log("deleting TaxiUserfavoritePlace instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiUserfavoritePlace.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiUserfavoritePlace entity and return it or
	 * a copy of it to the sender. A copy of the TaxiUserfavoritePlace entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#merge(Object)
	 * EntityManager#merge} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiUserfavoritePlaceDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserfavoritePlace entity to update
	 * @return TaxiUserfavoritePlace the persisted TaxiUserfavoritePlace entity
	 *         instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiUserfavoritePlace update(TaxiUserfavoritePlace entity) {
		EntityManagerHelper.log("updating TaxiUserfavoritePlace instance", Level.INFO, null);
		try {
			TaxiUserfavoritePlace result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiUserfavoritePlace findById(Integer id) {
		EntityManagerHelper.log("finding TaxiUserfavoritePlace instance with id: " + id, Level.INFO, null);
		try {
			TaxiUserfavoritePlace instance = getEntityManager().find(TaxiUserfavoritePlace.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiUserfavoritePlace entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiUserfavoritePlace property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiUserfavoritePlace> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiUserfavoritePlace> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TaxiUserfavoritePlace instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiUserfavoritePlace model where model." + propertyName
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

	public List<TaxiUserfavoritePlace> findByUserId(Object userId, int... rowStartIdxAndCount) {
		return findByProperty(USER_ID, userId, rowStartIdxAndCount);
	}

	public List<TaxiUserfavoritePlace> findByFavoriteLocation(Object favoriteLocation, int... rowStartIdxAndCount) {
		return findByProperty(FAVORITE_LOCATION, favoriteLocation, rowStartIdxAndCount);
	}

	public List<TaxiUserfavoritePlace> findByLatitude(Object latitude, int... rowStartIdxAndCount) {
		return findByProperty(LATITUDE, latitude, rowStartIdxAndCount);
	}

	public List<TaxiUserfavoritePlace> findByLongitude(Object longitude, int... rowStartIdxAndCount) {
		return findByProperty(LONGITUDE, longitude, rowStartIdxAndCount);
	}

	public List<TaxiUserfavoritePlace> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiUserfavoritePlace entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiUserfavoritePlace> all TaxiUserfavoritePlace entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiUserfavoritePlace> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiUserfavoritePlace instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiUserfavoritePlace model";
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