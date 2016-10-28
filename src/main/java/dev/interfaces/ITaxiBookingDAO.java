package dev.interfaces;

import dev.models.TaxiBooking;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

/**
 * Interface for TaxiBookingDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiBookingDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiBooking entity. All
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
	 * ITaxiBookingDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBooking entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiBooking entity);

	/**
	 * Delete a persistent TaxiBooking entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiBookingDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBooking entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiBooking entity);

	/**
	 * Persist a previously saved TaxiBooking entity and return it or a copy of
	 * it to the sender. A copy of the TaxiBooking entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiBookingDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBooking entity to update
	 * @return TaxiBooking the persisted TaxiBooking entity instance, may not be
	 *         the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiBooking update(TaxiBooking entity);

	public TaxiBooking findById(Integer id);

	/**
	 * Find all TaxiBooking entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiBooking property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiBooking> found by query
	 */
	public List<TaxiBooking> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByUserId(Object userId, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByRouteOption(Object routeOption, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByAssignedDriverId(Object assignedDriverId, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByApprovedByOperator(Object approvedByOperator, int... rowStartIdxAndCount);

	public List<TaxiBooking> findBySecondaryPhone(Object secondaryPhone, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByConfirmed(Object confirmed, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByAssignedVehicleTypeId(Object assignedVehicleTypeId, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByInsuranceRatebookId(Object insuranceRatebookId, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByInsuranceId(Object insuranceId, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByInsuranceCompanyName(Object insuranceCompanyName, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByInsuranceCostCode(Object insuranceCostCode, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByEtaFare(Object etaFare, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByNoOfPassenger(Object noOfPassenger, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByNoOfBaggage(Object noOfBaggage, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByAirport(Object airport, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByTerminal(Object terminal, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByFlightCarrier(Object flightCarrier, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByFlightNum(Object flightNum, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByComments(Object comments, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByBookingType(Object bookingType, int... rowStartIdxAndCount);

	public List<TaxiBooking> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiBooking entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiBooking> all TaxiBooking entities
	 */
	public List<TaxiBooking> findAll(int... rowStartIdxAndCount);
}