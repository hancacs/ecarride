//package dev.implementations;
//
//import dev.interfaces.ITaxiDriverDAO;
//import dev.models.EntityManagerHelper;
//import dev.models.TaxiDriver;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.logging.Level;
//import javax.persistence.EntityManager;
//import javax.persistence.Query;
//
///**
// * A data access object (DAO) providing persistence and search support for
// * TaxiDriver entities. Transaction control of the save(), update() and delete()
// * operations must be handled externally by senders of these methods or must be
// * manually added to each of these methods for data to be persisted to the JPA
// * datastore.
// *
// * @see TaxiDriver
// * @author MyEclipse Persistence Tools
// */
//
//@Repository
//public class TaxiDriverDAO implements ITaxiDriverDAO {
//	// property constants
//	public static final String MERCHANT_ACCOUNT_ID = "merchantAccountId";
//	public static final String GROUP_ID = "groupId";
//	public static final String USERNAME = "username";
//	public static final String PASSWORD = "password";
//	public static final String DRIVER_TYPE = "driverType";
//	public static final String FIRST_NAME = "firstName";
//	public static final String LAST_NAME = "lastName";
//	public static final String FLEET_NUM = "fleetNum";
//	public static final String PHONE = "phone";
//	public static final String SECONDARY_PHONE = "secondaryPhone";
//	public static final String EMAIL = "email";
//	public static final String GENDER = "gender";
//	public static final String NATIONALITY = "nationality";
//	public static final String DRIVING_EXPERIENCE = "drivingExperience";
//	public static final String VERIFICATION_CODE = "verificationCode";
//	public static final String PROFILE_PHOTO = "profilePhoto";
//	public static final String SIGNATURE = "signature";
//	public static final String DRIVER_LICENSE = "driverLicense";
//	public static final String DRIVER_LICENSE_NUM = "driverLicenseNum";
//	public static final String DRIVER_LICENSE_CLASS = "driverLicenseClass";
//	public static final String DRIVER_LICENSE_STATE = "driverLicenseState";
//	public static final String DRIVER_LICENSE_STATUS = "driverLicenseStatus";
//	public static final String DRIVER_TLC_FHV_LICENSE = "driverTlcFhvLicense";
//	public static final String DRIVER_TLC_FHV_LICENSE_NUM = "driverTlcFhvLicenseNum";
//	public static final String DRIVER_TLC_FHV_LICENSE_STATUS = "driverTlcFhvLicenseStatus";
//	public static final String BACKGROUND_CHECK = "backgroundCheck";
//	public static final String BACKGROUND_CHECK_STATUS = "backgroundCheckStatus";
//	public static final String DRIVING_RECORD = "drivingRecord";
//	public static final String DRIVING_RECORD_STATUS = "drivingRecordStatus";
//	public static final String DRUG_SCREEN = "drugScreen";
//	public static final String DRUG_SCREEN_STATUS = "drugScreenStatus";
//	public static final String ADDRESS = "address";
//	public static final String CITY = "city";
//	public static final String STATE = "state";
//	public static final String ZIPCODE = "zipcode";
//	public static final String ALLOW_PETS = "allowPets";
//	public static final String ALLOW_WHEELCHAIR = "allowWheelchair";
//	public static final String DUTY_STATUS = "dutyStatus";
//	public static final String APP_LANGUAGE = "appLanguage";
//	public static final String DEVICE_TOKEN = "deviceToken";
//	public static final String DEVICE_ID = "deviceId";
//	public static final String MOBILE_OS = "mobileOs";
//	public static final String OBJECT_ID = "objectId";
//	public static final String APPROVABLE_MAIL = "approvableMail";
//	public static final String BASE_APPROVED = "baseApproved";
//	public static final String STATUS = "status";
//
//	private EntityManager getEntityManager() {
//		return EntityManagerHelper.getEntityManager();
//	}
//
//	/**
//	 * Perform an initial save of a previously unsaved TaxiDriver entity. All
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
//	 * TaxiDriverDAO.save(entity);
//	 * EntityManagerHelper.commit();
//	 * </pre>
//	 *
//	 * @param entity
//	 *            TaxiDriver entity to persist
//	 * @throws RuntimeException
//	 *             when the operation fails
//	 */
//	public void save(TaxiDriver entity) {
//		EntityManagerHelper.log("saving TaxiDriver instance", Level.INFO, null);
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
//	 * Delete a persistent TaxiDriver entity. This operation must be performed
//	 * within the a database transaction context for the entity's data to be
//	 * permanently deleted from the persistence store, i.e., database. This
//	 * method uses the {@link EntityManager#remove(Object)
//	 * EntityManager#delete} operation.
//	 *
//	 * <pre>
//	 * EntityManagerHelper.beginTransaction();
//	 * TaxiDriverDAO.delete(entity);
//	 * EntityManagerHelper.commit();
//	 * entity = null;
//	 * </pre>
//	 *
//	 * @param entity
//	 *            TaxiDriver entity to delete
//	 * @throws RuntimeException
//	 *             when the operation fails
//	 */
//	public void delete(TaxiDriver entity) {
//		EntityManagerHelper.log("deleting TaxiDriver instance", Level.INFO, null);
//		try {
//			entity = getEntityManager().getReference(TaxiDriver.class, entity.getId());
//			getEntityManager().remove(entity);
//			EntityManagerHelper.log("delete successful", Level.INFO, null);
//		} catch (RuntimeException re) {
//			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
//			throw re;
//		}
//	}
//
//	/**
//	 * Persist a previously saved TaxiDriver entity and return it or a copy of
//	 * it to the sender. A copy of the TaxiDriver entity parameter is returned
//	 * when the JPA persistence mechanism has not previously been tracking the
//	 * updated entity. This operation must be performed within the a database
//	 * transaction context for the entity's data to be permanently saved to the
//	 * persistence store, i.e., database. This method uses the
//	 * {@link EntityManager#merge(Object) EntityManager#merge}
//	 * operation.
//	 *
//	 * <pre>
//	 * EntityManagerHelper.beginTransaction();
//	 * entity = TaxiDriverDAO.update(entity);
//	 * EntityManagerHelper.commit();
//	 * </pre>
//	 *
//	 * @param entity
//	 *            TaxiDriver entity to update
//	 * @return TaxiDriver the persisted TaxiDriver entity instance, may not be
//	 *         the same
//	 * @throws RuntimeException
//	 *             if the operation fails
//	 */
//	public TaxiDriver update(TaxiDriver entity) {
//		EntityManagerHelper.log("updating TaxiDriver instance", Level.INFO, null);
//		try {
//			TaxiDriver result = getEntityManager().merge(entity);
//			EntityManagerHelper.log("update successful", Level.INFO, null);
//			return result;
//		} catch (RuntimeException re) {
//			EntityManagerHelper.log("update failed", Level.SEVERE, re);
//			throw re;
//		}
//	}
//
//	public TaxiDriver findById(Integer id) {
//		EntityManagerHelper.log("finding TaxiDriver instance with id: " + id, Level.INFO, null);
//		try {
//			TaxiDriver instance = getEntityManager().find(TaxiDriver.class, id);
//			return instance;
//		} catch (RuntimeException re) {
//			EntityManagerHelper.log("find failed", Level.SEVERE, re);
//			throw re;
//		}
//	}
//
//	/**
//	 * Find all TaxiDriver entities with a specific property value.
//	 *
//	 * @param propertyName
//	 *            the name of the TaxiDriver property to query
//	 * @param value
//	 *            the property value to match
//	 * @param rowStartIdxAndCount
//	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
//	 *            row index in the query result-set to begin collecting the
//	 *            results. rowStartIdxAndCount[1] specifies the the maximum
//	 *            number of results to return.
//	 * @return List<TaxiDriver> found by query
//	 */
//	@SuppressWarnings("unchecked")
//	public List<TaxiDriver> findByProperty(String propertyName, final Object value, final int... rowStartIdxAndCount) {
//		EntityManagerHelper.log("finding TaxiDriver instance with property: " + propertyName + ", value: " + value,
//				Level.INFO, null);
//		try {
//			final String queryString = "select model from TaxiDriver model where model." + propertyName
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
//	public List<TaxiDriver> findByMerchantAccountId(Object merchantAccountId, int... rowStartIdxAndCount) {
//		return findByProperty(MERCHANT_ACCOUNT_ID, merchantAccountId, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByGroupId(Object groupId, int... rowStartIdxAndCount) {
//		return findByProperty(GROUP_ID, groupId, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByUsername(Object username, int... rowStartIdxAndCount) {
//		return findByProperty(USERNAME, username, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByPassword(Object password, int... rowStartIdxAndCount) {
//		return findByProperty(PASSWORD, password, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDriverType(Object driverType, int... rowStartIdxAndCount) {
//		return findByProperty(DRIVER_TYPE, driverType, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByFirstName(Object firstName, int... rowStartIdxAndCount) {
//		return findByProperty(FIRST_NAME, firstName, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByLastName(Object lastName, int... rowStartIdxAndCount) {
//		return findByProperty(LAST_NAME, lastName, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByFleetNum(Object fleetNum, int... rowStartIdxAndCount) {
//		return findByProperty(FLEET_NUM, fleetNum, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByPhone(Object phone, int... rowStartIdxAndCount) {
//		return findByProperty(PHONE, phone, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findBySecondaryPhone(Object secondaryPhone, int... rowStartIdxAndCount) {
//		return findByProperty(SECONDARY_PHONE, secondaryPhone, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByEmail(Object email, int... rowStartIdxAndCount) {
//		return findByProperty(EMAIL, email, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByGender(Object gender, int... rowStartIdxAndCount) {
//		return findByProperty(GENDER, gender, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByNationality(Object nationality, int... rowStartIdxAndCount) {
//		return findByProperty(NATIONALITY, nationality, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDrivingExperience(Object drivingExperience, int... rowStartIdxAndCount) {
//		return findByProperty(DRIVING_EXPERIENCE, drivingExperience, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByVerificationCode(Object verificationCode, int... rowStartIdxAndCount) {
//		return findByProperty(VERIFICATION_CODE, verificationCode, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByProfilePhoto(Object profilePhoto, int... rowStartIdxAndCount) {
//		return findByProperty(PROFILE_PHOTO, profilePhoto, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findBySignature(Object signature, int... rowStartIdxAndCount) {
//		return findByProperty(SIGNATURE, signature, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDriverLicense(Object driverLicense, int... rowStartIdxAndCount) {
//		return findByProperty(DRIVER_LICENSE, driverLicense, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDriverLicenseNum(Object driverLicenseNum, int... rowStartIdxAndCount) {
//		return findByProperty(DRIVER_LICENSE_NUM, driverLicenseNum, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDriverLicenseClass(Object driverLicenseClass, int... rowStartIdxAndCount) {
//		return findByProperty(DRIVER_LICENSE_CLASS, driverLicenseClass, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDriverLicenseState(Object driverLicenseState, int... rowStartIdxAndCount) {
//		return findByProperty(DRIVER_LICENSE_STATE, driverLicenseState, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDriverLicenseStatus(Object driverLicenseStatus, int... rowStartIdxAndCount) {
//		return findByProperty(DRIVER_LICENSE_STATUS, driverLicenseStatus, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDriverTlcFhvLicense(Object driverTlcFhvLicense, int... rowStartIdxAndCount) {
//		return findByProperty(DRIVER_TLC_FHV_LICENSE, driverTlcFhvLicense, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDriverTlcFhvLicenseNum(Object driverTlcFhvLicenseNum, int... rowStartIdxAndCount) {
//		return findByProperty(DRIVER_TLC_FHV_LICENSE_NUM, driverTlcFhvLicenseNum, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDriverTlcFhvLicenseStatus(Object driverTlcFhvLicenseStatus,
//			int... rowStartIdxAndCount) {
//		return findByProperty(DRIVER_TLC_FHV_LICENSE_STATUS, driverTlcFhvLicenseStatus, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByBackgroundCheck(Object backgroundCheck, int... rowStartIdxAndCount) {
//		return findByProperty(BACKGROUND_CHECK, backgroundCheck, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByBackgroundCheckStatus(Object backgroundCheckStatus, int... rowStartIdxAndCount) {
//		return findByProperty(BACKGROUND_CHECK_STATUS, backgroundCheckStatus, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDrivingRecord(Object drivingRecord, int... rowStartIdxAndCount) {
//		return findByProperty(DRIVING_RECORD, drivingRecord, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDrivingRecordStatus(Object drivingRecordStatus, int... rowStartIdxAndCount) {
//		return findByProperty(DRIVING_RECORD_STATUS, drivingRecordStatus, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDrugScreen(Object drugScreen, int... rowStartIdxAndCount) {
//		return findByProperty(DRUG_SCREEN, drugScreen, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDrugScreenStatus(Object drugScreenStatus, int... rowStartIdxAndCount) {
//		return findByProperty(DRUG_SCREEN_STATUS, drugScreenStatus, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByAddress(Object address, int... rowStartIdxAndCount) {
//		return findByProperty(ADDRESS, address, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByCity(Object city, int... rowStartIdxAndCount) {
//		return findByProperty(CITY, city, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByState(Object state, int... rowStartIdxAndCount) {
//		return findByProperty(STATE, state, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByZipcode(Object zipcode, int... rowStartIdxAndCount) {
//		return findByProperty(ZIPCODE, zipcode, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByAllowPets(Object allowPets, int... rowStartIdxAndCount) {
//		return findByProperty(ALLOW_PETS, allowPets, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByAllowWheelchair(Object allowWheelchair, int... rowStartIdxAndCount) {
//		return findByProperty(ALLOW_WHEELCHAIR, allowWheelchair, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDutyStatus(Object dutyStatus, int... rowStartIdxAndCount) {
//		return findByProperty(DUTY_STATUS, dutyStatus, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByAppLanguage(Object appLanguage, int... rowStartIdxAndCount) {
//		return findByProperty(APP_LANGUAGE, appLanguage, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDeviceToken(Object deviceToken, int... rowStartIdxAndCount) {
//		return findByProperty(DEVICE_TOKEN, deviceToken, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByDeviceId(Object deviceId, int... rowStartIdxAndCount) {
//		return findByProperty(DEVICE_ID, deviceId, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByMobileOs(Object mobileOs, int... rowStartIdxAndCount) {
//		return findByProperty(MOBILE_OS, mobileOs, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByObjectId(Object objectId, int... rowStartIdxAndCount) {
//		return findByProperty(OBJECT_ID, objectId, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByApprovableMail(Object approvableMail, int... rowStartIdxAndCount) {
//		return findByProperty(APPROVABLE_MAIL, approvableMail, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByBaseApproved(Object baseApproved, int... rowStartIdxAndCount) {
//		return findByProperty(BASE_APPROVED, baseApproved, rowStartIdxAndCount);
//	}
//
//	public List<TaxiDriver> findByStatus(Object status, int... rowStartIdxAndCount) {
//		return findByProperty(STATUS, status, rowStartIdxAndCount);
//	}
//
//	/**
//	 * Find all TaxiDriver entities.
//	 *
//	 * @param rowStartIdxAndCount
//	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
//	 *            row index in the query result-set to begin collecting the
//	 *            results. rowStartIdxAndCount[1] specifies the the maximum
//	 *            count of results to return.
//	 * @return List<TaxiDriver> all TaxiDriver entities
//	 */
//	@SuppressWarnings("unchecked")
//	public List<TaxiDriver> findAll(final int... rowStartIdxAndCount) {
//		EntityManagerHelper.log("finding all TaxiDriver instances", Level.INFO, null);
//		try {
//			final String queryString = "select model from TaxiDriver model";
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