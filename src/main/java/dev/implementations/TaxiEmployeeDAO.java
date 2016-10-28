package dev.implementations;

import dev.interfaces.ITaxiEmployeeDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiEmployee;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiEmployee entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see TaxiEmployee
 * @author MyEclipse Persistence Tools
 */
public class TaxiEmployeeDAO implements ITaxiEmployeeDAO {
	// property constants
	public static final String BASE_ID = "baseId";
	public static final String COMPANY_ID = "companyId";
	public static final String ADMIN_ID = "adminId";
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String PHONE = "phone";
	public static final String EMAIL = "email";
	public static final String DUTY_STATUS = "dutyStatus";
	public static final String CURRENT_LAT = "currentLat";
	public static final String CURRENT_LNG = "currentLng";
	public static final String DEVICE_ID = "deviceId";
	public static final String MOBILE_OS = "mobileOs";
	public static final String OBJECT_ID = "objectId";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiEmployee entity. All
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
	 * TaxiEmployeeDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiEmployee entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiEmployee entity) {
		EntityManagerHelper.log("saving TaxiEmployee instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiEmployee entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiEmployeeDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiEmployee entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiEmployee entity) {
		EntityManagerHelper.log("deleting TaxiEmployee instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiEmployee.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiEmployee entity and return it or a copy of
	 * it to the sender. A copy of the TaxiEmployee entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiEmployeeDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiEmployee entity to update
	 * @return TaxiEmployee the persisted TaxiEmployee entity instance, may not
	 *         be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiEmployee update(TaxiEmployee entity) {
		EntityManagerHelper.log("updating TaxiEmployee instance", Level.INFO, null);
		try {
			TaxiEmployee result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiEmployee findById(Integer id) {
		EntityManagerHelper.log("finding TaxiEmployee instance with id: " + id, Level.INFO, null);
		try {
			TaxiEmployee instance = getEntityManager().find(TaxiEmployee.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiEmployee entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiEmployee property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiEmployee> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiEmployee> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiEmployee instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiEmployee model where model." + propertyName
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

	public List<TaxiEmployee> findByBaseId(Object baseId, int... rowStartIdxAndCount) {
		return findByProperty(BASE_ID, baseId, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByCompanyId(Object companyId, int... rowStartIdxAndCount) {
		return findByProperty(COMPANY_ID, companyId, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByAdminId(Object adminId, int... rowStartIdxAndCount) {
		return findByProperty(ADMIN_ID, adminId, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByUsername(Object username, int... rowStartIdxAndCount) {
		return findByProperty(USERNAME, username, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByPassword(Object password, int... rowStartIdxAndCount) {
		return findByProperty(PASSWORD, password, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByFirstName(Object firstName, int... rowStartIdxAndCount) {
		return findByProperty(FIRST_NAME, firstName, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByLastName(Object lastName, int... rowStartIdxAndCount) {
		return findByProperty(LAST_NAME, lastName, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByPhone(Object phone, int... rowStartIdxAndCount) {
		return findByProperty(PHONE, phone, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByEmail(Object email, int... rowStartIdxAndCount) {
		return findByProperty(EMAIL, email, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByDutyStatus(Object dutyStatus, int... rowStartIdxAndCount) {
		return findByProperty(DUTY_STATUS, dutyStatus, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByCurrentLat(Object currentLat, int... rowStartIdxAndCount) {
		return findByProperty(CURRENT_LAT, currentLat, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByCurrentLng(Object currentLng, int... rowStartIdxAndCount) {
		return findByProperty(CURRENT_LNG, currentLng, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByDeviceId(Object deviceId, int... rowStartIdxAndCount) {
		return findByProperty(DEVICE_ID, deviceId, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByMobileOs(Object mobileOs, int... rowStartIdxAndCount) {
		return findByProperty(MOBILE_OS, mobileOs, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByObjectId(Object objectId, int... rowStartIdxAndCount) {
		return findByProperty(OBJECT_ID, objectId, rowStartIdxAndCount);
	}

	public List<TaxiEmployee> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiEmployee entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiEmployee> all TaxiEmployee entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiEmployee> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiEmployee instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiEmployee model";
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