package dev.implementations;

import dev.interfaces.ITaxiVehicleDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiVehicle;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiVehicle entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see TaxiVehicle
 * @author MyEclipse Persistence Tools
 */
public class TaxiVehicleDAO implements ITaxiVehicleDAO {
	// property constants
	public static final String DRIVER_ID = "driverId";
	public static final String VIN = "vin";
	public static final String YEAR = "year";
	public static final String BRAND = "brand";
	public static final String MODEL = "model";
	public static final String VEHICLE_LICENSE_STATE = "vehicleLicenseState";
	public static final String PROFILE_PHOTO = "profilePhoto";
	public static final String VEHICLE_PLATE_NUM = "vehiclePlateNum";
	public static final String VEHICLE_REGISTRATION = "vehicleRegistration";
	public static final String VEHICLE_REGISTRATION_STATUS = "vehicleRegistrationStatus";
	public static final String LIABILITY_INSURANCE = "liabilityInsurance";
	public static final String LIABILITY_AMOUNT = "liabilityAmount";
	public static final String LIABILITY_ECARRIDE_CERTIFICATE_HOLDER = "liabilityEcarrideCertificateHolder";
	public static final String LIABILITY_ECARRIDE_ADDITIONAL_INSURED = "liabilityEcarrideAdditionalInsured";
	public static final String LIABILITY_SELF_INSURED = "liabilitySelfInsured";
	public static final String LIABILITY_NAME_INSURER = "liabilityNameInsurer";
	public static final String LIABILITY_INSURANCE_STATUS = "liabilityInsuranceStatus";
	public static final String EXTRA_INSURANCE = "extraInsurance";
	public static final String EXTRA_INSURANCE_STATUS = "extraInsuranceStatus";
	public static final String VEHICLE_TLC_FHV_LICENSE = "vehicleTlcFhvLicense";
	public static final String VEHICLE_TLC_FHV_LICENSE_NUM = "vehicleTlcFhvLicenseNum";
	public static final String VEHICLE_TLC_FHV_LICENSE_STATUS = "vehicleTlcFhvLicenseStatus";
	public static final String VEHICLE_INSPECTION = "vehicleInspection";
	public static final String VEHICLE_INSPECTION_STATUS = "vehicleInspectionStatus";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiVehicle entity. All
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
	 * TaxiVehicleDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicle entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiVehicle entity) {
		EntityManagerHelper.log("saving TaxiVehicle instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiVehicle entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiVehicleDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicle entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiVehicle entity) {
		EntityManagerHelper.log("deleting TaxiVehicle instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiVehicle.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiVehicle entity and return it or a copy of
	 * it to the sender. A copy of the TaxiVehicle entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiVehicleDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiVehicle entity to update
	 * @return TaxiVehicle the persisted TaxiVehicle entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiVehicle update(TaxiVehicle entity) {
		EntityManagerHelper.log("updating TaxiVehicle instance", Level.INFO, null);
		try {
			TaxiVehicle result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiVehicle findById(Integer id) {
		EntityManagerHelper.log("finding TaxiVehicle instance with id: " + id, Level.INFO, null);
		try {
			TaxiVehicle instance = getEntityManager().find(TaxiVehicle.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiVehicle entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiVehicle property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiVehicle> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiVehicle> findByProperty(String propertyName, final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiVehicle instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiVehicle model where model." + propertyName
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

	public List<TaxiVehicle> findByDriverId(Object driverId, int... rowStartIdxAndCount) {
		return findByProperty(DRIVER_ID, driverId, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByVin(Object vin, int... rowStartIdxAndCount) {
		return findByProperty(VIN, vin, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByYear(Object year, int... rowStartIdxAndCount) {
		return findByProperty(YEAR, year, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByBrand(Object brand, int... rowStartIdxAndCount) {
		return findByProperty(BRAND, brand, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByModel(Object model, int... rowStartIdxAndCount) {
		return findByProperty(MODEL, model, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByVehicleLicenseState(Object vehicleLicenseState, int... rowStartIdxAndCount) {
		return findByProperty(VEHICLE_LICENSE_STATE, vehicleLicenseState, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByProfilePhoto(Object profilePhoto, int... rowStartIdxAndCount) {
		return findByProperty(PROFILE_PHOTO, profilePhoto, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByVehiclePlateNum(Object vehiclePlateNum, int... rowStartIdxAndCount) {
		return findByProperty(VEHICLE_PLATE_NUM, vehiclePlateNum, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByVehicleRegistration(Object vehicleRegistration, int... rowStartIdxAndCount) {
		return findByProperty(VEHICLE_REGISTRATION, vehicleRegistration, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByVehicleRegistrationStatus(Object vehicleRegistrationStatus,
			int... rowStartIdxAndCount) {
		return findByProperty(VEHICLE_REGISTRATION_STATUS, vehicleRegistrationStatus, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByLiabilityInsurance(Object liabilityInsurance, int... rowStartIdxAndCount) {
		return findByProperty(LIABILITY_INSURANCE, liabilityInsurance, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByLiabilityAmount(Object liabilityAmount, int... rowStartIdxAndCount) {
		return findByProperty(LIABILITY_AMOUNT, liabilityAmount, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByLiabilityEcarrideCertificateHolder(Object liabilityEcarrideCertificateHolder,
			int... rowStartIdxAndCount) {
		return findByProperty(LIABILITY_ECARRIDE_CERTIFICATE_HOLDER, liabilityEcarrideCertificateHolder,
				rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByLiabilityEcarrideAdditionalInsured(Object liabilityEcarrideAdditionalInsured,
			int... rowStartIdxAndCount) {
		return findByProperty(LIABILITY_ECARRIDE_ADDITIONAL_INSURED, liabilityEcarrideAdditionalInsured,
				rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByLiabilitySelfInsured(Object liabilitySelfInsured, int... rowStartIdxAndCount) {
		return findByProperty(LIABILITY_SELF_INSURED, liabilitySelfInsured, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByLiabilityNameInsurer(Object liabilityNameInsurer, int... rowStartIdxAndCount) {
		return findByProperty(LIABILITY_NAME_INSURER, liabilityNameInsurer, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByLiabilityInsuranceStatus(Object liabilityInsuranceStatus,
			int... rowStartIdxAndCount) {
		return findByProperty(LIABILITY_INSURANCE_STATUS, liabilityInsuranceStatus, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByExtraInsurance(Object extraInsurance, int... rowStartIdxAndCount) {
		return findByProperty(EXTRA_INSURANCE, extraInsurance, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByExtraInsuranceStatus(Object extraInsuranceStatus, int... rowStartIdxAndCount) {
		return findByProperty(EXTRA_INSURANCE_STATUS, extraInsuranceStatus, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByVehicleTlcFhvLicense(Object vehicleTlcFhvLicense, int... rowStartIdxAndCount) {
		return findByProperty(VEHICLE_TLC_FHV_LICENSE, vehicleTlcFhvLicense, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByVehicleTlcFhvLicenseNum(Object vehicleTlcFhvLicenseNum, int... rowStartIdxAndCount) {
		return findByProperty(VEHICLE_TLC_FHV_LICENSE_NUM, vehicleTlcFhvLicenseNum, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByVehicleTlcFhvLicenseStatus(Object vehicleTlcFhvLicenseStatus,
			int... rowStartIdxAndCount) {
		return findByProperty(VEHICLE_TLC_FHV_LICENSE_STATUS, vehicleTlcFhvLicenseStatus, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByVehicleInspection(Object vehicleInspection, int... rowStartIdxAndCount) {
		return findByProperty(VEHICLE_INSPECTION, vehicleInspection, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByVehicleInspectionStatus(Object vehicleInspectionStatus, int... rowStartIdxAndCount) {
		return findByProperty(VEHICLE_INSPECTION_STATUS, vehicleInspectionStatus, rowStartIdxAndCount);
	}

	public List<TaxiVehicle> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiVehicle entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiVehicle> all TaxiVehicle entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiVehicle> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiVehicle instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiVehicle model";
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