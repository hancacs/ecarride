package dev.interfaces;

import dev.models.TaxiBase;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Interface for TaxiBaseDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiBaseDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiBase entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiBaseDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBase entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiBase entity);

	/**
	 * Delete a persistent TaxiBase entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiBaseDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBase entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiBase entity);

	/**
	 * Persist a previously saved TaxiBase entity and return it or a copy of it
	 * to the sender. A copy of the TaxiBase entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiBaseDAO.update(entity);
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
	public TaxiBase update(TaxiBase entity);

	public TaxiBase findById(Integer id);

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
	 *            count of results to return.
	 * @return List<TaxiBase> found by query
	 */
	public List<TaxiBase> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiBase> findByName(Object name, int... rowStartIdxAndCount);

	public List<TaxiBase> findByDispatchingLicenseNum(Object dispatchingLicenseNum, int... rowStartIdxAndCount);

	public List<TaxiBase> findByMainContact(Object mainContact, int... rowStartIdxAndCount);

	public List<TaxiBase> findByAddress(Object address, int... rowStartIdxAndCount);

	public List<TaxiBase> findByCity(Object city, int... rowStartIdxAndCount);

	public List<TaxiBase> findByState(Object state, int... rowStartIdxAndCount);

	public List<TaxiBase> findByZipcode(Object zipcode, int... rowStartIdxAndCount);

	public List<TaxiBase> findByPhone(Object phone, int... rowStartIdxAndCount);

	public List<TaxiBase> findByFax(Object fax, int... rowStartIdxAndCount);

	public List<TaxiBase> findByTlcLicense(Object tlcLicense, int... rowStartIdxAndCount);

	public List<TaxiBase> findByTlcLicenseNum(Object tlcLicenseNum, int... rowStartIdxAndCount);

	public List<TaxiBase> findByTlcLicenseStatus(Object tlcLicenseStatus, int... rowStartIdxAndCount);

	public List<TaxiBase> findByAutomobileLiability(Object automobileLiability, int... rowStartIdxAndCount);

	public List<TaxiBase> findByAutomobileLiabilityAmount(Object automobileLiabilityAmount, int... rowStartIdxAndCount);

	public List<TaxiBase> findByAutomobileLiabilityOperrCertificateHolder(
            Object automobileLiabilityOperrCertificateHolder, int... rowStartIdxAndCount);

	public List<TaxiBase> findByAutomobileLiabilitySelfInsured(Object automobileLiabilitySelfInsured,
                                                               int... rowStartIdxAndCount);

	public List<TaxiBase> findByAutomobileLiabilityOperrAdditionalInsured(
            Object automobileLiabilityOperrAdditionalInsured, int... rowStartIdxAndCount);

	public List<TaxiBase> findByAutomobileLiabilityNameInsurer(Object automobileLiabilityNameInsurer,
                                                               int... rowStartIdxAndCount);

	public List<TaxiBase> findByAutomobileLiabilityStatus(Object automobileLiabilityStatus, int... rowStartIdxAndCount);

	public List<TaxiBase> findByGeneralLiability(Object generalLiability, int... rowStartIdxAndCount);

	public List<TaxiBase> findByGeneralLiabilityAmount(Object generalLiabilityAmount, int... rowStartIdxAndCount);

	public List<TaxiBase> findByGeneralLiabilityOperrCertificateHolder(Object generalLiabilityOperrCertificateHolder,
                                                                       int... rowStartIdxAndCount);

	public List<TaxiBase> findByGeneralLiabilitySelfInsured(Object generalLiabilitySelfInsured,
                                                            int... rowStartIdxAndCount);

	public List<TaxiBase> findByGeneralLiabilityOperrAdditionalInsured(Object generalLiabilityOperrAdditionalInsured,
                                                                       int... rowStartIdxAndCount);

	public List<TaxiBase> findByGeneralLiabilityNameInsurer(Object generalLiabilityNameInsurer,
                                                            int... rowStartIdxAndCount);

	public List<TaxiBase> findByGeneralLiabilityStatus(Object generalLiabilityStatus, int... rowStartIdxAndCount);

	public List<TaxiBase> findByIrsRegisteredBusinessName(Object irsRegisteredBusinessName, int... rowStartIdxAndCount);

	public List<TaxiBase> findByFederalTax(Object federalTax, int... rowStartIdxAndCount);

	public List<TaxiBase> findByTinEinSsn(Object tinEinSsn, int... rowStartIdxAndCount);

	public List<TaxiBase> findByFederalTaxNum(Object federalTaxNum, int... rowStartIdxAndCount);

	public List<TaxiBase> findByFederalTaxStatus(Object federalTaxStatus, int... rowStartIdxAndCount);

	public List<TaxiBase> findByWorkersCompensation(Object workersCompensation, int... rowStartIdxAndCount);

	public List<TaxiBase> findByWorkersCompensationAmount(Object workersCompensationAmount, int... rowStartIdxAndCount);

	public List<TaxiBase> findByWorkersCompensationStatus(Object workersCompensationStatus, int... rowStartIdxAndCount);

	public List<TaxiBase> findByTrainingAttestation(Object trainingAttestation, int... rowStartIdxAndCount);

	public List<TaxiBase> findByTrainingAttestationStatus(Object trainingAttestationStatus, int... rowStartIdxAndCount);

	public List<TaxiBase> findByScheduleA(Object scheduleA, int... rowStartIdxAndCount);

	public List<TaxiBase> findByScheduleAStatus(Object scheduleAStatus, int... rowStartIdxAndCount);

	public List<TaxiBase> findByScheduleB(Object scheduleB, int... rowStartIdxAndCount);

	public List<TaxiBase> findByScheduleBStatus(Object scheduleBStatus, int... rowStartIdxAndCount);

	public List<TaxiBase> findByAetnaInsuranceAmendment(Object aetnaInsuranceAmendment, int... rowStartIdxAndCount);

	public List<TaxiBase> findByAetnaInsuranceAmendmentStatus(Object aetnaInsuranceAmendmentStatus,
                                                              int... rowStartIdxAndCount);

	public List<TaxiBase> findByWellcareInsuranceAmendment(Object wellcareInsuranceAmendment,
                                                           int... rowStartIdxAndCount);

	public List<TaxiBase> findByWellcareInsuranceAmendmentStatus(Object wellcareInsuranceAmendmentStatus,
                                                                 int... rowStartIdxAndCount);

	public List<TaxiBase> findByInsuranceEndorsementAmendment(Object insuranceEndorsementAmendment,
                                                              int... rowStartIdxAndCount);

	public List<TaxiBase> findByInsuranceEndorsementAmendmentStatus(Object insuranceEndorsementAmendmentStatus,
                                                                    int... rowStartIdxAndCount);

	public List<TaxiBase> findByNyctAmendment(Object nyctAmendment, int... rowStartIdxAndCount);

	public List<TaxiBase> findByNyctAmendmentStatus(Object nyctAmendmentStatus, int... rowStartIdxAndCount);

	public List<TaxiBase> findByServiceAgreement(Object serviceAgreement, int... rowStartIdxAndCount);

	public List<TaxiBase> findByServiceAgreementStatus(Object serviceAgreementStatus, int... rowStartIdxAndCount);

	public List<TaxiBase> findByVisitPerformedBy(Object visitPerformedBy, int... rowStartIdxAndCount);

	public List<TaxiBase> findByVisitType(Object visitType, int... rowStartIdxAndCount);

	public List<TaxiBase> findByApptCancelledByVendor(Object apptCancelledByVendor, int... rowStartIdxAndCount);

	public List<TaxiBase> findByNoShow(Object noShow, int... rowStartIdxAndCount);

	public List<TaxiBase> findByProviderAudit(Object providerAudit, int... rowStartIdxAndCount);

	public List<TaxiBase> findByStatus(Object status, int... rowStartIdxAndCount);

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
	public List<TaxiBase> findAll(int... rowStartIdxAndCount);
}