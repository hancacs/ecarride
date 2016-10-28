package dev.interfaces;

import dev.models.TaxiTrip;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

/**
 * Interface for TaxiTripDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiTripDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiTrip entity. All
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
	 * ITaxiTripDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTrip entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiTrip entity);

	/**
	 * Delete a persistent TaxiTrip entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiTripDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTrip entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiTrip entity);

	/**
	 * Persist a previously saved TaxiTrip entity and return it or a copy of it
	 * to the sender. A copy of the TaxiTrip entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiTripDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTrip entity to update
	 * @return TaxiTrip the persisted TaxiTrip entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiTrip update(TaxiTrip entity);

	public TaxiTrip findById(Integer id);

	/**
	 * Find all TaxiTrip entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiTrip property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTrip> found by query
	 */
	public List<TaxiTrip> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByDriverId(Object driverId, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByGroupId(Object groupId, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByTripType(Object tripType, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByNotifyDriverId(Object notifyDriverId, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByScriptStatus(Object scriptStatus, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByPickupLat(Object pickupLat, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByPickupLng(Object pickupLng, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByPickupLocation(Object pickupLocation, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByDestinationLat(Object destinationLat, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByDestinationLng(Object destinationLng, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByDestinationLocation(Object destinationLocation, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByPet(Object pet, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByWheelchair(Object wheelchair, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByWalkingAid(Object walkingAid, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByEstimateTime(Object estimateTime, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByEstimateLowFare(Object estimateLowFare, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByEstimateHighFare(Object estimateHighFare, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByEstimateHighFareOrigin(Object estimateHighFareOrigin, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByNegotiatedPrice(Object negotiatedPrice, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByBaseFare(Object baseFare, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByDistanceFare(Object distanceFare, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByMinuteFare(Object minuteFare, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByTripFare(Object tripFare, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByTripFareOrigin(Object tripFareOrigin, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByGasSurcharge(Object gasSurcharge, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByTollFee(Object tollFee, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByBlackCarFund(Object blackCarFund, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByTax(Object tax, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByTip(Object tip, int... rowStartIdxAndCount);

	public List<TaxiTrip> findBySignupDiscount(Object signupDiscount, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByCouponDiscount(Object couponDiscount, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByCouponCode(Object couponCode, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByAdjustment(Object adjustment, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByTotalAmount(Object totalAmount, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByDspShare(Object dspShare, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByBaseShare(Object baseShare, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByDriverShare(Object driverShare, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByComments(Object comments, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByCommentsType(Object commentsType, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByCancelAddress(Object cancelAddress, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByFavorite(Object favorite, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByTripStatus(Object tripStatus, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByPayStatus(Object payStatus, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByRealPickupLocation(Object realPickupLocation, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByRealStartLocation(Object realStartLocation, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByDistance(Object distance, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByEndDestination(Object endDestination, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByTimezone(Object timezone, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByUserSignature(Object userSignature, int... rowStartIdxAndCount);

	public List<TaxiTrip> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiTrip entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTrip> all TaxiTrip entities
	 */
	public List<TaxiTrip> findAll(int... rowStartIdxAndCount);
}