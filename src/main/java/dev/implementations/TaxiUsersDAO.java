//package dev.implementations;
//
//import dev.interfaces.ITaxiUsersDAO;
//import dev.models.EntityManagerHelper;
//import dev.models.TaxiUsers;
//
//import java.util.List;
//import java.util.logging.Level;
//import javax.persistence.EntityManager;
//import javax.persistence.Query;
//
///**
// * A data access object (DAO) providing persistence and search support for
// * TaxiUsers entities. Transaction control of the save(), update() and delete()
// * operations must be handled externally by senders of these methods or must be
// * manually added to each of these methods for data to be persisted to the JPA
// * datastore.
// *
// * @see dev.models.TaxiUsers
// * @author MyEclipse Persistence Tools
// */
//public class TaxiUsersDAO implements ITaxiUsersDAO {
//	// property constants
//	public static final String CUSTOMER_ID = "customerId";
//	public static final String USER_TYPE = "userType";
//	public static final String USERNAME = "username";
//	public static final String PASSWORD = "password";
//	public static final String FIRST_NAME = "firstName";
//	public static final String LAST_NAME = "lastName";
//	public static final String APP_LANGUAGE = "appLanguage";
//	public static final String DEVICE_TOKEN = "deviceToken";
//	public static final String DEVICE_ID = "deviceId";
//	public static final String MOBILE_OS = "mobileOs";
//	public static final String OBJECT_ID = "objectId";
//	public static final String EMAIL = "email";
//	public static final String PHONE = "phone";
//	public static final String SECONDARY_PHONE = "secondaryPhone";
//	public static final String VERIFICATION_CODE = "verificationCode";
//	public static final String PREFERRED_DRIVER_ID = "preferredDriverId";
//	public static final String ADDRESS = "address";
//	public static final String PROFILE_PHOTO = "profilePhoto";
//	public static final String USER_IP = "userIp";
//	public static final String APPROVABLE_MAIL = "approvableMail";
//	public static final String STATUS = "status";
//
//	private EntityManager getEntityManager() {
//		return EntityManagerHelper.getEntityManager();
//	}
//
//	/**
//	 * Perform an initial save of a previously unsaved TaxiUsers entity. All
//	 * subsequent persist actions of this entity should use the #update()
//	 * method. This operation must be performed within the a database
//	 * transaction context for the entity's data to be permanently saved to the
//	 * persistence store, i.e., database. This method uses the
//	 * {@link EntityManager#persist(Object)
//	 * EntityManager#persist} operation.
//	 *
//	 * <pre>
//	 *
//	 * EntityManagerHelper.beginTransaction();
//	 * TaxiUsersDAO.save(entity);
//	 * EntityManagerHelper.commit();
//	 * </pre>
//	 *
//	 * @param entity
//	 *            TaxiUsers entity to persist
//	 * @throws RuntimeException
//	 *             when the operation fails
//	 */
//	public void save(TaxiUsers entity) {
//		EntityManagerHelper.log("saving TaxiUsers instance", Level.INFO, null);
//		try {
//			getEntityManager().persist(entity);
//			EntityManagerHelper.log("save successful", Level.INFO, null);
//		} catch (RuntimeException re) {
//			EntityManagerHelper.log("save failed", Level.SEVERE, re);
//			throw re;
//		}
//	}
//
//	/**
//	 * Delete a persistent TaxiUsers entity. This operation must be performed
//	 * within the a database transaction context for the entity's data to be
//	 * permanently deleted from the persistence store, i.e., database. This
//	 * method uses the {@link EntityManager#remove(Object)
//	 * EntityManager#delete} operation.
//	 *
//	 * <pre>
//	 * EntityManagerHelper.beginTransaction();
//	 * TaxiUsersDAO.delete(entity);
//	 * EntityManagerHelper.commit();
//	 * entity = null;
//	 * </pre>
//	 *
//	 * @param entity
//	 *            TaxiUsers entity to delete
//	 * @throws RuntimeException
//	 *             when the operation fails
//	 */
//	public void delete(TaxiUsers entity) {
//		EntityManagerHelper.log("deleting TaxiUsers instance", Level.INFO, null);
//		try {
//			entity = getEntityManager().getReference(TaxiUsers.class, entity.getId());
//			getEntityManager().remove(entity);
//			EntityManagerHelper.log("delete successful", Level.INFO, null);
//		} catch (RuntimeException re) {
//			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
//			throw re;
//		}
//	}
//
//	/**
//	 * Persist a previously saved TaxiUsers entity and return it or a copy of it
//	 * to the sender. A copy of the TaxiUsers entity parameter is returned when
//	 * the JPA persistence mechanism has not previously been tracking the
//	 * updated entity. This operation must be performed within the a database
//	 * transaction context for the entity's data to be permanently saved to the
//	 * persistence store, i.e., database. This method uses the
//	 * {@link EntityManager#merge(Object) EntityManager#merge}
//	 * operation.
//	 *
//	 * <pre>
//	 * EntityManagerHelper.beginTransaction();
//	 * entity = TaxiUsersDAO.update(entity);
//	 * EntityManagerHelper.commit();
//	 * </pre>
//	 *
//	 * @param entity
//	 *            TaxiUsers entity to update
//	 * @return TaxiUsers the persisted TaxiUsers entity instance, may not be the
//	 *         same
//	 * @throws RuntimeException
//	 *             if the operation fails
//	 */
//	public TaxiUsers update(TaxiUsers entity) {
//		EntityManagerHelper.log("updating TaxiUsers instance", Level.INFO, null);
//		try {
//			TaxiUsers result = getEntityManager().merge(entity);
//			EntityManagerHelper.log("update successful", Level.INFO, null);
//			return result;
//		} catch (RuntimeException re) {
//			EntityManagerHelper.log("update failed", Level.SEVERE, re);
//			throw re;
//		}
//	}
//
//	public TaxiUsers findById(Integer id) {
//		EntityManagerHelper.log("finding TaxiUsers instance with id: " + id, Level.INFO, null);
//		try {
//			TaxiUsers instance = getEntityManager().find(TaxiUsers.class, id);
//			return instance;
//		} catch (RuntimeException re) {
//			EntityManagerHelper.log("find failed", Level.SEVERE, re);
//			throw re;
//		}
//	}
//
//	/**
//	 * Find all TaxiUsers entities with a specific property value.
//	 *
//	 * @param propertyName
//	 *            the name of the TaxiUsers property to query
//	 * @param value
//	 *            the property value to match
//	 * @param rowStartIdxAndCount
//	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
//	 *            row index in the query result-set to begin collecting the
//	 *            results. rowStartIdxAndCount[1] specifies the the maximum
//	 *            number of results to return.
//	 * @return List<TaxiUsers> found by query
//	 */
//	@SuppressWarnings("unchecked")
//	public List<TaxiUsers> findByProperty(String propertyName, final Object value, final int... rowStartIdxAndCount) {
//		EntityManagerHelper.log("finding TaxiUsers instance with property: " + propertyName + ", value: " + value,
//				Level.INFO, null);
//		try {
//			final String queryString = "select model from TaxiUsers model where model." + propertyName
//					+ "= :propertyValue";
//			Query query = getEntityManager().createQuery(queryString);
//			query.setParameter("propertyValue", value);
//			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
//				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
//				if (rowStartIdx > 0) {
//					query.setFirstResult(rowStartIdx);
//				}
//
//				if (rowStartIdxAndCount.length > 1) {
//					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
//					if (rowCount > 0) {
//						query.setMaxResults(rowCount);
//					}
//				}
//			}
//			return query.getResultList();
//		} catch (RuntimeException re) {
//			EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
//			throw re;
//		}
//	}
//
//	public List<TaxiUsers> findByCustomerId(Object customerId, int... rowStartIdxAndCount) {
//		return findByProperty(CUSTOMER_ID, customerId, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByUserType(Object userType, int... rowStartIdxAndCount) {
//		return findByProperty(USER_TYPE, userType, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByUsername(Object username, int... rowStartIdxAndCount) {
//		return findByProperty(USERNAME, username, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByPassword(Object password, int... rowStartIdxAndCount) {
//		return findByProperty(PASSWORD, password, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByFirstName(Object firstName, int... rowStartIdxAndCount) {
//		return findByProperty(FIRST_NAME, firstName, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByLastName(Object lastName, int... rowStartIdxAndCount) {
//		return findByProperty(LAST_NAME, lastName, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByAppLanguage(Object appLanguage, int... rowStartIdxAndCount) {
//		return findByProperty(APP_LANGUAGE, appLanguage, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByDeviceToken(Object deviceToken, int... rowStartIdxAndCount) {
//		return findByProperty(DEVICE_TOKEN, deviceToken, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByDeviceId(Object deviceId, int... rowStartIdxAndCount) {
//		return findByProperty(DEVICE_ID, deviceId, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByMobileOs(Object mobileOs, int... rowStartIdxAndCount) {
//		return findByProperty(MOBILE_OS, mobileOs, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByObjectId(Object objectId, int... rowStartIdxAndCount) {
//		return findByProperty(OBJECT_ID, objectId, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByEmail(Object email, int... rowStartIdxAndCount) {
//		return findByProperty(EMAIL, email, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByPhone(Object phone, int... rowStartIdxAndCount) {
//		return findByProperty(PHONE, phone, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findBySecondaryPhone(Object secondaryPhone, int... rowStartIdxAndCount) {
//		return findByProperty(SECONDARY_PHONE, secondaryPhone, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByVerificationCode(Object verificationCode, int... rowStartIdxAndCount) {
//		return findByProperty(VERIFICATION_CODE, verificationCode, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByPreferredDriverId(Object preferredDriverId, int... rowStartIdxAndCount) {
//		return findByProperty(PREFERRED_DRIVER_ID, preferredDriverId, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByAddress(Object address, int... rowStartIdxAndCount) {
//		return findByProperty(ADDRESS, address, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByProfilePhoto(Object profilePhoto, int... rowStartIdxAndCount) {
//		return findByProperty(PROFILE_PHOTO, profilePhoto, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByUserIp(Object userIp, int... rowStartIdxAndCount) {
//		return findByProperty(USER_IP, userIp, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByApprovableMail(Object approvableMail, int... rowStartIdxAndCount) {
//		return findByProperty(APPROVABLE_MAIL, approvableMail, rowStartIdxAndCount);
//	}
//
//	public List<TaxiUsers> findByStatus(Object status, int... rowStartIdxAndCount) {
//		return findByProperty(STATUS, status, rowStartIdxAndCount);
//	}
//
//	/**
//	 * Find all TaxiUsers entities.
//	 *
//	 * @param rowStartIdxAndCount
//	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
//	 *            row index in the query result-set to begin collecting the
//	 *            results. rowStartIdxAndCount[1] specifies the the maximum
//	 *            count of results to return.
//	 * @return List<TaxiUsers> all TaxiUsers entities
//	 */
//	@SuppressWarnings("unchecked")
//	public List<TaxiUsers> findAll(final int... rowStartIdxAndCount) {
//		EntityManagerHelper.log("finding all TaxiUsers instances", Level.INFO, null);
//		try {
//			final String queryString = "select model from TaxiUsers model";
//			Query query = getEntityManager().createQuery(queryString);
//			if (rowStartIdxAndCount != null && rowStartIdxAndCount.length > 0) {
//				int rowStartIdx = Math.max(0, rowStartIdxAndCount[0]);
//				if (rowStartIdx > 0) {
//					query.setFirstResult(rowStartIdx);
//				}
//
//				if (rowStartIdxAndCount.length > 1) {
//					int rowCount = Math.max(0, rowStartIdxAndCount[1]);
//					if (rowCount > 0) {
//						query.setMaxResults(rowCount);
//					}
//				}
//			}
//			return query.getResultList();
//		} catch (RuntimeException re) {
//			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
//			throw re;
//		}
//	}
//
//}