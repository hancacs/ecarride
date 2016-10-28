package dev.implementations;

import dev.interfaces.ITaxiDriverRatingDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiDriverRating;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiDriverRating entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see TaxiDriverRating
 * @author MyEclipse Persistence Tools
 */
public class TaxiDriverRatingDAO implements ITaxiDriverRatingDAO {
	// property constants
	public static final String DRIVER_ID = "driverId";
	public static final String RATING = "rating";
	public static final String COMMENT = "comment";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiDriverRating entity.
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
	 * TaxiDriverRatingDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriverRating entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiDriverRating entity) {
		EntityManagerHelper.log("saving TaxiDriverRating instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiDriverRating entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiDriverRatingDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriverRating entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiDriverRating entity) {
		EntityManagerHelper.log("deleting TaxiDriverRating instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiDriverRating.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiDriverRating entity and return it or a
	 * copy of it to the sender. A copy of the TaxiDriverRating entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiDriverRatingDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriverRating entity to update
	 * @return TaxiDriverRating the persisted TaxiDriverRating entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiDriverRating update(TaxiDriverRating entity) {
		EntityManagerHelper.log("updating TaxiDriverRating instance", Level.INFO, null);
		try {
			TaxiDriverRating result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiDriverRating findById(Integer id) {
		EntityManagerHelper.log("finding TaxiDriverRating instance with id: " + id, Level.INFO, null);
		try {
			TaxiDriverRating instance = getEntityManager().find(TaxiDriverRating.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiDriverRating entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiDriverRating property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiDriverRating> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiDriverRating> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TaxiDriverRating instance with property: " + propertyName + ", value: " + value, Level.INFO,
				null);
		try {
			final String queryString = "select model from TaxiDriverRating model where model." + propertyName
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

	public List<TaxiDriverRating> findByDriverId(Object driverId, int... rowStartIdxAndCount) {
		return findByProperty(DRIVER_ID, driverId, rowStartIdxAndCount);
	}

	public List<TaxiDriverRating> findByRating(Object rating, int... rowStartIdxAndCount) {
		return findByProperty(RATING, rating, rowStartIdxAndCount);
	}

	public List<TaxiDriverRating> findByComment(Object comment, int... rowStartIdxAndCount) {
		return findByProperty(COMMENT, comment, rowStartIdxAndCount);
	}

	public List<TaxiDriverRating> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiDriverRating entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiDriverRating> all TaxiDriverRating entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiDriverRating> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiDriverRating instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiDriverRating model";
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