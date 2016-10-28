package dev.implementations;

import dev.interfaces.ITaxiRefundDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiRefund;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiRefund entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see TaxiRefund
 * @author MyEclipse Persistence Tools
 */
public class TaxiRefundDAO implements ITaxiRefundDAO {
	// property constants
	public static final String BASE_ID = "baseId";
	public static final String COMPANY_ID = "companyId";
	public static final String TRIP_ID = "tripId";
	public static final String TRANSACTION_ID = "transactionId";
	public static final String AMOUNT = "amount";
	public static final String COMMENT = "comment";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiRefund entity. All
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
	 * TaxiRefundDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiRefund entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiRefund entity) {
		EntityManagerHelper.log("saving TaxiRefund instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiRefund entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiRefundDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiRefund entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiRefund entity) {
		EntityManagerHelper.log("deleting TaxiRefund instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiRefund.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiRefund entity and return it or a copy of
	 * it to the sender. A copy of the TaxiRefund entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiRefundDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiRefund entity to update
	 * @return TaxiRefund the persisted TaxiRefund entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiRefund update(TaxiRefund entity) {
		EntityManagerHelper.log("updating TaxiRefund instance", Level.INFO, null);
		try {
			TaxiRefund result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiRefund findById(Integer id) {
		EntityManagerHelper.log("finding TaxiRefund instance with id: " + id, Level.INFO, null);
		try {
			TaxiRefund instance = getEntityManager().find(TaxiRefund.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiRefund entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiRefund property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiRefund> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiRefund> findByProperty(String propertyName, final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiRefund instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiRefund model where model." + propertyName
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

	public List<TaxiRefund> findByBaseId(Object baseId, int... rowStartIdxAndCount) {
		return findByProperty(BASE_ID, baseId, rowStartIdxAndCount);
	}

	public List<TaxiRefund> findByCompanyId(Object companyId, int... rowStartIdxAndCount) {
		return findByProperty(COMPANY_ID, companyId, rowStartIdxAndCount);
	}

	public List<TaxiRefund> findByTripId(Object tripId, int... rowStartIdxAndCount) {
		return findByProperty(TRIP_ID, tripId, rowStartIdxAndCount);
	}

	public List<TaxiRefund> findByTransactionId(Object transactionId, int... rowStartIdxAndCount) {
		return findByProperty(TRANSACTION_ID, transactionId, rowStartIdxAndCount);
	}

	public List<TaxiRefund> findByAmount(Object amount, int... rowStartIdxAndCount) {
		return findByProperty(AMOUNT, amount, rowStartIdxAndCount);
	}

	public List<TaxiRefund> findByComment(Object comment, int... rowStartIdxAndCount) {
		return findByProperty(COMMENT, comment, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiRefund entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiRefund> all TaxiRefund entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiRefund> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiRefund instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiRefund model";
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