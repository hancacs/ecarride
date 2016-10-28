package dev.implementations;

import dev.interfaces.ITaxiBaseDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiBase;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiBase entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see TaxiBase
 * @author MyEclipse Persistence Tools
 */
public class TaxiBaseDAO implements ITaxiBaseDAO {
	// property constants
	public static final String NAME = "name";
	public static final String DISPATCHING_LICENSE_NUM = "dispatchingLicenseNum";
	public static final String MAIN_CONTACT = "mainContact";
	public static final String ADDRESS = "address";
	public static final String CITY = "city";
	public static final String STATE = "state";
	public static final String ZIPCODE = "zipcode";
	public static final String PHONE = "phone";
	public static final String FAX = "fax";
	public static final String TLC_LICENSE = "tlcLicense";
	public static final String TLC_LICENSE_NUM = "tlcLicenseNum";
	public static final String TLC_LICENSE_STATUS = "tlcLicenseStatus";
	public static final String AUTOMOBILE_LIABILITY = "automobileLiability";
	public static final String AUTOMOBILE_LIABILITY_AMOUNT = "automobileLiabilityAmount";
	public static final String AUTOMOBILE_LIABILITY_OPERR_CERTIFICATE_HOLDER = "automobileLiabilityOperrCertificateHolder";
	public static final String AUTOMOBILE_LIABILITY_SELF_INSURED = "automobileLiabilitySelfInsured";
	public static final String AUTOMOBILE_LIABILITY_OPERR_ADDITIONAL_INSURED = "automobileLiabilityOperrAdditionalInsured";
	public static final String AUTOMOBILE_LIABILITY_NAME_INSURER = "automobileLiabilityNameInsurer";
	public static final String AUTOMOBILE_LIABILITY_STATUS = "automobileLiabilityStatus";
	public static final String GENERAL_LIABILITY = "generalLiability";
	public static final String GENERAL_LIABILITY_AMOUNT = "generalLiabilityAmount";
	public static final String GENERAL_LIABILITY_OPERR_CERTIFICATE_HOLDER = "generalLiabilityOperrCertificateHolder";
	public static final String GENERAL_LIABILITY_SELF_INSURED = "generalLiabilitySelfInsured";
	public static final String GENERAL_LIABILITY_OPERR_ADDITIONAL_INSURED = "generalLiabilityOperrAdditionalInsured";
	public static final String GENERAL_LIABILITY_NAME_INSURER = "generalLiabilityNameInsurer";
	public static final String GENERAL_LIABILITY_STATUS = "generalLiabilityStatus";
	public static final String IRS_REGISTERED_BUSINESS_NAME = "irsRegisteredBusinessName";
	public static final String FEDERAL_TAX = "federalTax";
	public static final String TIN_EIN_SSN = "tinEinSsn";
	public static final String FEDERAL_TAX_NUM = "federalTaxNum";
	public static final String FEDERAL_TAX_STATUS = "federalTaxStatus";
	public static final String WORKERS_COMPENSATION = "workersCompensation";
	public static final String WORKERS_COMPENSATION_AMOUNT = "workersCompensationAmount";
	public static final String WORKERS_COMPENSATION_STATUS = "workersCompensationStatus";
	public static final String TRAINING_ATTESTATION = "trainingAttestation";
	public static final String TRAINING_ATTESTATION_STATUS = "trainingAttestationStatus";
	public static final String SCHEDULE_A = "scheduleA";
	public static final String SCHEDULE_ASTATUS = "scheduleAStatus";
	public static final String SCHEDULE_B = "scheduleB";
	public static final String SCHEDULE_BSTATUS = "scheduleBStatus";
	public static final String AETNA_INSURANCE_AMENDMENT = "aetnaInsuranceAmendment";
	public static final String AETNA_INSURANCE_AMENDMENT_STATUS = "aetnaInsuranceAmendmentStatus";
	public static final String WELLCARE_INSURANCE_AMENDMENT = "wellcareInsuranceAmendment";
	public static final String WELLCARE_INSURANCE_AMENDMENT_STATUS = "wellcareInsuranceAmendmentStatus";
	public static final String INSURANCE_ENDORSEMENT_AMENDMENT = "insuranceEndorsementAmendment";
	public static final String INSURANCE_ENDORSEMENT_AMENDMENT_STATUS = "insuranceEndorsementAmendmentStatus";
	public static final String NYCT_AMENDMENT = "nyctAmendment";
	public static final String NYCT_AMENDMENT_STATUS = "nyctAmendmentStatus";
	public static final String SERVICE_AGREEMENT = "serviceAgreement";
	public static final String SERVICE_AGREEMENT_STATUS = "serviceAgreementStatus";
	public static final String VISIT_PERFORMED_BY = "visitPerformedBy";
	public static final String VISIT_TYPE = "visitType";
	public static final String APPT_CANCELLED_BY_VENDOR = "apptCancelledByVendor";
	public static final String NO_SHOW = "noShow";
	public static final String PROVIDER_AUDIT = "providerAudit";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiBase entity. All
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
	 * TaxiBaseDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBase entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiBase entity) {
		EntityManagerHelper.log("saving TaxiBase instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiBase entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiBaseDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBase entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiBase entity) {
		EntityManagerHelper.log("deleting TaxiBase instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiBase.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiBase entity and return it or a copy of it
	 * to the sender. A copy of the TaxiBase entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiBaseDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBase entity to update
	 * @return TaxiBase the persisted TaxiBase entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiBase update(TaxiBase entity) {
		EntityManagerHelper.log("updating TaxiBase instance", Level.INFO, null);
		try {
			TaxiBase result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiBase findById(Integer id) {
		EntityManagerHelper.log("finding TaxiBase instance with id: " + id, Level.INFO, null);
		try {
			TaxiBase instance = getEntityManager().find(TaxiBase.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiBase entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiBase property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiBase> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiBase> findByProperty(String propertyName, final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiBase instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiBase model where model." + propertyName
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

	public List<TaxiBase> findByName(Object name, int... rowStartIdxAndCount) {
		return findByProperty(NAME, name, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByDispatchingLicenseNum(Object dispatchingLicenseNum, int... rowStartIdxAndCount) {
		return findByProperty(DISPATCHING_LICENSE_NUM, dispatchingLicenseNum, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByMainContact(Object mainContact, int... rowStartIdxAndCount) {
		return findByProperty(MAIN_CONTACT, mainContact, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByAddress(Object address, int... rowStartIdxAndCount) {
		return findByProperty(ADDRESS, address, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByCity(Object city, int... rowStartIdxAndCount) {
		return findByProperty(CITY, city, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByState(Object state, int... rowStartIdxAndCount) {
		return findByProperty(STATE, state, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByZipcode(Object zipcode, int... rowStartIdxAndCount) {
		return findByProperty(ZIPCODE, zipcode, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByPhone(Object phone, int... rowStartIdxAndCount) {
		return findByProperty(PHONE, phone, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByFax(Object fax, int... rowStartIdxAndCount) {
		return findByProperty(FAX, fax, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByTlcLicense(Object tlcLicense, int... rowStartIdxAndCount) {
		return findByProperty(TLC_LICENSE, tlcLicense, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByTlcLicenseNum(Object tlcLicenseNum, int... rowStartIdxAndCount) {
		return findByProperty(TLC_LICENSE_NUM, tlcLicenseNum, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByTlcLicenseStatus(Object tlcLicenseStatus, int... rowStartIdxAndCount) {
		return findByProperty(TLC_LICENSE_STATUS, tlcLicenseStatus, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByAutomobileLiability(Object automobileLiability, int... rowStartIdxAndCount) {
		return findByProperty(AUTOMOBILE_LIABILITY, automobileLiability, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByAutomobileLiabilityAmount(Object automobileLiabilityAmount,
			int... rowStartIdxAndCount) {
		return findByProperty(AUTOMOBILE_LIABILITY_AMOUNT, automobileLiabilityAmount, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByAutomobileLiabilityOperrCertificateHolder(
			Object automobileLiabilityOperrCertificateHolder, int... rowStartIdxAndCount) {
		return findByProperty(AUTOMOBILE_LIABILITY_OPERR_CERTIFICATE_HOLDER, automobileLiabilityOperrCertificateHolder,
				rowStartIdxAndCount);
	}

	public List<TaxiBase> findByAutomobileLiabilitySelfInsured(Object automobileLiabilitySelfInsured,
			int... rowStartIdxAndCount) {
		return findByProperty(AUTOMOBILE_LIABILITY_SELF_INSURED, automobileLiabilitySelfInsured, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByAutomobileLiabilityOperrAdditionalInsured(
			Object automobileLiabilityOperrAdditionalInsured, int... rowStartIdxAndCount) {
		return findByProperty(AUTOMOBILE_LIABILITY_OPERR_ADDITIONAL_INSURED, automobileLiabilityOperrAdditionalInsured,
				rowStartIdxAndCount);
	}

	public List<TaxiBase> findByAutomobileLiabilityNameInsurer(Object automobileLiabilityNameInsurer,
			int... rowStartIdxAndCount) {
		return findByProperty(AUTOMOBILE_LIABILITY_NAME_INSURER, automobileLiabilityNameInsurer, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByAutomobileLiabilityStatus(Object automobileLiabilityStatus,
			int... rowStartIdxAndCount) {
		return findByProperty(AUTOMOBILE_LIABILITY_STATUS, automobileLiabilityStatus, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByGeneralLiability(Object generalLiability, int... rowStartIdxAndCount) {
		return findByProperty(GENERAL_LIABILITY, generalLiability, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByGeneralLiabilityAmount(Object generalLiabilityAmount, int... rowStartIdxAndCount) {
		return findByProperty(GENERAL_LIABILITY_AMOUNT, generalLiabilityAmount, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByGeneralLiabilityOperrCertificateHolder(Object generalLiabilityOperrCertificateHolder,
			int... rowStartIdxAndCount) {
		return findByProperty(GENERAL_LIABILITY_OPERR_CERTIFICATE_HOLDER, generalLiabilityOperrCertificateHolder,
				rowStartIdxAndCount);
	}

	public List<TaxiBase> findByGeneralLiabilitySelfInsured(Object generalLiabilitySelfInsured,
			int... rowStartIdxAndCount) {
		return findByProperty(GENERAL_LIABILITY_SELF_INSURED, generalLiabilitySelfInsured, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByGeneralLiabilityOperrAdditionalInsured(Object generalLiabilityOperrAdditionalInsured,
			int... rowStartIdxAndCount) {
		return findByProperty(GENERAL_LIABILITY_OPERR_ADDITIONAL_INSURED, generalLiabilityOperrAdditionalInsured,
				rowStartIdxAndCount);
	}

	public List<TaxiBase> findByGeneralLiabilityNameInsurer(Object generalLiabilityNameInsurer,
			int... rowStartIdxAndCount) {
		return findByProperty(GENERAL_LIABILITY_NAME_INSURER, generalLiabilityNameInsurer, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByGeneralLiabilityStatus(Object generalLiabilityStatus, int... rowStartIdxAndCount) {
		return findByProperty(GENERAL_LIABILITY_STATUS, generalLiabilityStatus, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByIrsRegisteredBusinessName(Object irsRegisteredBusinessName,
			int... rowStartIdxAndCount) {
		return findByProperty(IRS_REGISTERED_BUSINESS_NAME, irsRegisteredBusinessName, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByFederalTax(Object federalTax, int... rowStartIdxAndCount) {
		return findByProperty(FEDERAL_TAX, federalTax, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByTinEinSsn(Object tinEinSsn, int... rowStartIdxAndCount) {
		return findByProperty(TIN_EIN_SSN, tinEinSsn, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByFederalTaxNum(Object federalTaxNum, int... rowStartIdxAndCount) {
		return findByProperty(FEDERAL_TAX_NUM, federalTaxNum, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByFederalTaxStatus(Object federalTaxStatus, int... rowStartIdxAndCount) {
		return findByProperty(FEDERAL_TAX_STATUS, federalTaxStatus, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByWorkersCompensation(Object workersCompensation, int... rowStartIdxAndCount) {
		return findByProperty(WORKERS_COMPENSATION, workersCompensation, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByWorkersCompensationAmount(Object workersCompensationAmount,
			int... rowStartIdxAndCount) {
		return findByProperty(WORKERS_COMPENSATION_AMOUNT, workersCompensationAmount, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByWorkersCompensationStatus(Object workersCompensationStatus,
			int... rowStartIdxAndCount) {
		return findByProperty(WORKERS_COMPENSATION_STATUS, workersCompensationStatus, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByTrainingAttestation(Object trainingAttestation, int... rowStartIdxAndCount) {
		return findByProperty(TRAINING_ATTESTATION, trainingAttestation, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByTrainingAttestationStatus(Object trainingAttestationStatus,
			int... rowStartIdxAndCount) {
		return findByProperty(TRAINING_ATTESTATION_STATUS, trainingAttestationStatus, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByScheduleA(Object scheduleA, int... rowStartIdxAndCount) {
		return findByProperty(SCHEDULE_A, scheduleA, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByScheduleAStatus(Object scheduleAStatus, int... rowStartIdxAndCount) {
		return findByProperty(SCHEDULE_ASTATUS, scheduleAStatus, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByScheduleB(Object scheduleB, int... rowStartIdxAndCount) {
		return findByProperty(SCHEDULE_B, scheduleB, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByScheduleBStatus(Object scheduleBStatus, int... rowStartIdxAndCount) {
		return findByProperty(SCHEDULE_BSTATUS, scheduleBStatus, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByAetnaInsuranceAmendment(Object aetnaInsuranceAmendment, int... rowStartIdxAndCount) {
		return findByProperty(AETNA_INSURANCE_AMENDMENT, aetnaInsuranceAmendment, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByAetnaInsuranceAmendmentStatus(Object aetnaInsuranceAmendmentStatus,
			int... rowStartIdxAndCount) {
		return findByProperty(AETNA_INSURANCE_AMENDMENT_STATUS, aetnaInsuranceAmendmentStatus, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByWellcareInsuranceAmendment(Object wellcareInsuranceAmendment,
			int... rowStartIdxAndCount) {
		return findByProperty(WELLCARE_INSURANCE_AMENDMENT, wellcareInsuranceAmendment, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByWellcareInsuranceAmendmentStatus(Object wellcareInsuranceAmendmentStatus,
			int... rowStartIdxAndCount) {
		return findByProperty(WELLCARE_INSURANCE_AMENDMENT_STATUS, wellcareInsuranceAmendmentStatus,
				rowStartIdxAndCount);
	}

	public List<TaxiBase> findByInsuranceEndorsementAmendment(Object insuranceEndorsementAmendment,
			int... rowStartIdxAndCount) {
		return findByProperty(INSURANCE_ENDORSEMENT_AMENDMENT, insuranceEndorsementAmendment, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByInsuranceEndorsementAmendmentStatus(Object insuranceEndorsementAmendmentStatus,
			int... rowStartIdxAndCount) {
		return findByProperty(INSURANCE_ENDORSEMENT_AMENDMENT_STATUS, insuranceEndorsementAmendmentStatus,
				rowStartIdxAndCount);
	}

	public List<TaxiBase> findByNyctAmendment(Object nyctAmendment, int... rowStartIdxAndCount) {
		return findByProperty(NYCT_AMENDMENT, nyctAmendment, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByNyctAmendmentStatus(Object nyctAmendmentStatus, int... rowStartIdxAndCount) {
		return findByProperty(NYCT_AMENDMENT_STATUS, nyctAmendmentStatus, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByServiceAgreement(Object serviceAgreement, int... rowStartIdxAndCount) {
		return findByProperty(SERVICE_AGREEMENT, serviceAgreement, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByServiceAgreementStatus(Object serviceAgreementStatus, int... rowStartIdxAndCount) {
		return findByProperty(SERVICE_AGREEMENT_STATUS, serviceAgreementStatus, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByVisitPerformedBy(Object visitPerformedBy, int... rowStartIdxAndCount) {
		return findByProperty(VISIT_PERFORMED_BY, visitPerformedBy, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByVisitType(Object visitType, int... rowStartIdxAndCount) {
		return findByProperty(VISIT_TYPE, visitType, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByApptCancelledByVendor(Object apptCancelledByVendor, int... rowStartIdxAndCount) {
		return findByProperty(APPT_CANCELLED_BY_VENDOR, apptCancelledByVendor, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByNoShow(Object noShow, int... rowStartIdxAndCount) {
		return findByProperty(NO_SHOW, noShow, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByProviderAudit(Object providerAudit, int... rowStartIdxAndCount) {
		return findByProperty(PROVIDER_AUDIT, providerAudit, rowStartIdxAndCount);
	}

	public List<TaxiBase> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiBase entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiBase> all TaxiBase entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiBase> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiBase instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiBase model";
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