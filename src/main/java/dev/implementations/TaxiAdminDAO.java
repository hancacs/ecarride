package dev.implementations;

import dev.interfaces.ITaxiAdminDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiAdmin;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiAdmin entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see TaxiAdmin
 * @author MyEclipse Persistence Tools
 */
public class TaxiAdminDAO implements ITaxiAdminDAO {
	// property constants
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String BASE_ID = "baseId";
	public static final String COMPANY_ID = "companyId";
	public static final String MENU_LIST = "menuList";
	public static final String PERMISSION = "permission";
	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String EMAIL = "email";
	public static final String PHONE = "phone";
	public static final String SECONDARY_PHONE = "secondaryPhone";
	public static final String PROFILE_PHOTO = "profilePhoto";
	public static final String IP = "ip";
	public static final String REMEMBER_TOKEN = "rememberToken";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiAdmin entity. All
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
	 * TaxiAdminDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdmin entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiAdmin entity) {
		EntityManagerHelper.log("saving TaxiAdmin instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiAdmin entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiAdminDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdmin entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiAdmin entity) {
		EntityManagerHelper.log("deleting TaxiAdmin instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiAdmin.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiAdmin entity and return it or a copy of it
	 * to the sender. A copy of the TaxiAdmin entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiAdminDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdmin entity to update
	 * @return TaxiAdmin the persisted TaxiAdmin entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiAdmin update(TaxiAdmin entity) {
		EntityManagerHelper.log("updating TaxiAdmin instance", Level.INFO, null);
		try {
			TaxiAdmin result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiAdmin findById(Integer id) {
		EntityManagerHelper.log("finding TaxiAdmin instance with id: " + id, Level.INFO, null);
		try {
			TaxiAdmin instance = getEntityManager().find(TaxiAdmin.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiAdmin entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiAdmin property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiAdmin> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiAdmin> findByProperty(String propertyName, final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiAdmin instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiAdmin model where model." + propertyName
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

	public List<TaxiAdmin> findByUsername(Object username, int... rowStartIdxAndCount) {
		return findByProperty(USERNAME, username, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByPassword(Object password, int... rowStartIdxAndCount) {
		return findByProperty(PASSWORD, password, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByBaseId(Object baseId, int... rowStartIdxAndCount) {
		return findByProperty(BASE_ID, baseId, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByCompanyId(Object companyId, int... rowStartIdxAndCount) {
		return findByProperty(COMPANY_ID, companyId, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByMenuList(Object menuList, int... rowStartIdxAndCount) {
		return findByProperty(MENU_LIST, menuList, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByPermission(Object permission, int... rowStartIdxAndCount) {
		return findByProperty(PERMISSION, permission, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByFirstName(Object firstName, int... rowStartIdxAndCount) {
		return findByProperty(FIRST_NAME, firstName, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByLastName(Object lastName, int... rowStartIdxAndCount) {
		return findByProperty(LAST_NAME, lastName, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByEmail(Object email, int... rowStartIdxAndCount) {
		return findByProperty(EMAIL, email, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByPhone(Object phone, int... rowStartIdxAndCount) {
		return findByProperty(PHONE, phone, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findBySecondaryPhone(Object secondaryPhone, int... rowStartIdxAndCount) {
		return findByProperty(SECONDARY_PHONE, secondaryPhone, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByProfilePhoto(Object profilePhoto, int... rowStartIdxAndCount) {
		return findByProperty(PROFILE_PHOTO, profilePhoto, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByIp(Object ip, int... rowStartIdxAndCount) {
		return findByProperty(IP, ip, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByRememberToken(Object rememberToken, int... rowStartIdxAndCount) {
		return findByProperty(REMEMBER_TOKEN, rememberToken, rowStartIdxAndCount);
	}

	public List<TaxiAdmin> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiAdmin entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiAdmin> all TaxiAdmin entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiAdmin> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiAdmin instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiAdmin model";
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