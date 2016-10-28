package dev.implementations;

import dev.interfaces.ITaxiPromoDetailDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiPromoDetail;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiPromoDetail entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see dev.models.TaxiPromoDetail
 * @author MyEclipse Persistence Tools
 */
public class TaxiPromoDetailDAO implements ITaxiPromoDetailDAO {
	// property constants
	public static final String BASE_ID = "baseId";
	public static final String COMPANY_ID = "companyId";
	public static final String USER_ID = "userId";
	public static final String TRIP_ID = "tripId";
	public static final String PROMO_CODE = "promoCode";
	public static final String USED_COUNT = "usedCount";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiPromoDetail entity.
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
	 * TaxiPromoDetailDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPromoDetail entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiPromoDetail entity) {
		EntityManagerHelper.log("saving TaxiPromoDetail instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiPromoDetail entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiPromoDetailDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPromoDetail entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiPromoDetail entity) {
		EntityManagerHelper.log("deleting TaxiPromoDetail instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiPromoDetail.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiPromoDetail entity and return it or a copy
	 * of it to the sender. A copy of the TaxiPromoDetail entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiPromoDetailDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiPromoDetail entity to update
	 * @return TaxiPromoDetail the persisted TaxiPromoDetail entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiPromoDetail update(TaxiPromoDetail entity) {
		EntityManagerHelper.log("updating TaxiPromoDetail instance", Level.INFO, null);
		try {
			TaxiPromoDetail result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiPromoDetail findById(Integer id) {
		EntityManagerHelper.log("finding TaxiPromoDetail instance with id: " + id, Level.INFO, null);
		try {
			TaxiPromoDetail instance = getEntityManager().find(TaxiPromoDetail.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiPromoDetail entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiPromoDetail property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiPromoDetail> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiPromoDetail> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiPromoDetail instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiPromoDetail model where model." + propertyName
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

	public List<TaxiPromoDetail> findByBaseId(Object baseId, int... rowStartIdxAndCount) {
		return findByProperty(BASE_ID, baseId, rowStartIdxAndCount);
	}

	public List<TaxiPromoDetail> findByCompanyId(Object companyId, int... rowStartIdxAndCount) {
		return findByProperty(COMPANY_ID, companyId, rowStartIdxAndCount);
	}

	public List<TaxiPromoDetail> findByUserId(Object userId, int... rowStartIdxAndCount) {
		return findByProperty(USER_ID, userId, rowStartIdxAndCount);
	}

	public List<TaxiPromoDetail> findByTripId(Object tripId, int... rowStartIdxAndCount) {
		return findByProperty(TRIP_ID, tripId, rowStartIdxAndCount);
	}

	public List<TaxiPromoDetail> findByPromoCode(Object promoCode, int... rowStartIdxAndCount) {
		return findByProperty(PROMO_CODE, promoCode, rowStartIdxAndCount);
	}

	public List<TaxiPromoDetail> findByUsedCount(Object usedCount, int... rowStartIdxAndCount) {
		return findByProperty(USED_COUNT, usedCount, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiPromoDetail entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiPromoDetail> all TaxiPromoDetail entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiPromoDetail> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiPromoDetail instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiPromoDetail model";
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