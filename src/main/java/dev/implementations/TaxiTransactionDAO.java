package dev.implementations;

import dev.interfaces.ITaxiTransactionDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiTransaction;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiTransaction entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see TaxiTransaction
 * @author MyEclipse Persistence Tools
 */
public class TaxiTransactionDAO implements ITaxiTransactionDAO {
	// property constants
	public static final String TRANSACTION_ID = "transactionId";
	public static final String TRANSACTION_STATUS = "transactionStatus";
	public static final String TRANSACTION_AMOUNT = "transactionAmount";
	public static final String TRANSACTION_CARDNO = "transactionCardno";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiTransaction entity.
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
	 * TaxiTransactionDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTransaction entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiTransaction entity) {
		EntityManagerHelper.log("saving TaxiTransaction instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiTransaction entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiTransactionDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTransaction entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiTransaction entity) {
		EntityManagerHelper.log("deleting TaxiTransaction instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiTransaction.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiTransaction entity and return it or a copy
	 * of it to the sender. A copy of the TaxiTransaction entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiTransactionDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTransaction entity to update
	 * @return TaxiTransaction the persisted TaxiTransaction entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiTransaction update(TaxiTransaction entity) {
		EntityManagerHelper.log("updating TaxiTransaction instance", Level.INFO, null);
		try {
			TaxiTransaction result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiTransaction findById(Integer id) {
		EntityManagerHelper.log("finding TaxiTransaction instance with id: " + id, Level.INFO, null);
		try {
			TaxiTransaction instance = getEntityManager().find(TaxiTransaction.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiTransaction entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiTransaction property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiTransaction> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiTransaction> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiTransaction instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiTransaction model where model." + propertyName
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

	public List<TaxiTransaction> findByTransactionId(Object transactionId, int... rowStartIdxAndCount) {
		return findByProperty(TRANSACTION_ID, transactionId, rowStartIdxAndCount);
	}

	public List<TaxiTransaction> findByTransactionStatus(Object transactionStatus, int... rowStartIdxAndCount) {
		return findByProperty(TRANSACTION_STATUS, transactionStatus, rowStartIdxAndCount);
	}

	public List<TaxiTransaction> findByTransactionAmount(Object transactionAmount, int... rowStartIdxAndCount) {
		return findByProperty(TRANSACTION_AMOUNT, transactionAmount, rowStartIdxAndCount);
	}

	public List<TaxiTransaction> findByTransactionCardno(Object transactionCardno, int... rowStartIdxAndCount) {
		return findByProperty(TRANSACTION_CARDNO, transactionCardno, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiTransaction entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTransaction> all TaxiTransaction entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiTransaction> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiTransaction instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiTransaction model";
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