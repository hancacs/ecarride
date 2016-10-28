package dev.implementations;

import dev.interfaces.ITaxiUserCardDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiUserCard;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiUserCard entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see TaxiUserCard
 * @author MyEclipse Persistence Tools
 */
public class TaxiUserCardDAO implements ITaxiUserCardDAO {
	// property constants
	public static final String USER_ID = "userId";
	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String CARD_NO = "cardNo";
	public static final String CARD_TYPE = "cardType";
	public static final String CARD_CVV = "cardCvv";
	public static final String CARD_VALID_MON = "cardValidMon";
	public static final String CARD_VALID_YEAR = "cardValidYear";
	public static final String MYDEFAULT = "mydefault";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiUserCard entity. All
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
	 * TaxiUserCardDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserCard entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiUserCard entity) {
		EntityManagerHelper.log("saving TaxiUserCard instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiUserCard entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiUserCardDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserCard entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiUserCard entity) {
		EntityManagerHelper.log("deleting TaxiUserCard instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiUserCard.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiUserCard entity and return it or a copy of
	 * it to the sender. A copy of the TaxiUserCard entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiUserCardDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiUserCard entity to update
	 * @return TaxiUserCard the persisted TaxiUserCard entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiUserCard update(TaxiUserCard entity) {
		EntityManagerHelper.log("updating TaxiUserCard instance", Level.INFO, null);
		try {
			TaxiUserCard result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiUserCard findById(Integer id) {
		EntityManagerHelper.log("finding TaxiUserCard instance with id: " + id, Level.INFO, null);
		try {
			TaxiUserCard instance = getEntityManager().find(TaxiUserCard.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiUserCard entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiUserCard property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiUserCard> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiUserCard> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiUserCard instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiUserCard model where model." + propertyName
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

	public List<TaxiUserCard> findByUserId(Object userId, int... rowStartIdxAndCount) {
		return findByProperty(USER_ID, userId, rowStartIdxAndCount);
	}

	public List<TaxiUserCard> findByFirstName(Object firstName, int... rowStartIdxAndCount) {
		return findByProperty(FIRST_NAME, firstName, rowStartIdxAndCount);
	}

	public List<TaxiUserCard> findByLastName(Object lastName, int... rowStartIdxAndCount) {
		return findByProperty(LAST_NAME, lastName, rowStartIdxAndCount);
	}

	public List<TaxiUserCard> findByCardNo(Object cardNo, int... rowStartIdxAndCount) {
		return findByProperty(CARD_NO, cardNo, rowStartIdxAndCount);
	}

	public List<TaxiUserCard> findByCardType(Object cardType, int... rowStartIdxAndCount) {
		return findByProperty(CARD_TYPE, cardType, rowStartIdxAndCount);
	}

	public List<TaxiUserCard> findByCardCvv(Object cardCvv, int... rowStartIdxAndCount) {
		return findByProperty(CARD_CVV, cardCvv, rowStartIdxAndCount);
	}

	public List<TaxiUserCard> findByCardValidMon(Object cardValidMon, int... rowStartIdxAndCount) {
		return findByProperty(CARD_VALID_MON, cardValidMon, rowStartIdxAndCount);
	}

	public List<TaxiUserCard> findByCardValidYear(Object cardValidYear, int... rowStartIdxAndCount) {
		return findByProperty(CARD_VALID_YEAR, cardValidYear, rowStartIdxAndCount);
	}

	public List<TaxiUserCard> findByMydefault(Object mydefault, int... rowStartIdxAndCount) {
		return findByProperty(MYDEFAULT, mydefault, rowStartIdxAndCount);
	}

	public List<TaxiUserCard> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiUserCard entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiUserCard> all TaxiUserCard entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiUserCard> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiUserCard instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiUserCard model";
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