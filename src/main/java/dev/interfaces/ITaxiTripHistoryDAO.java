package dev.interfaces;

import dev.models.TaxiTripHistory;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for TaxiTripHistoryDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITaxiTripHistoryDAO {
	/**
	 * Perform an initial save of a previously unsaved TaxiTripHistory entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiTripHistoryDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripHistory entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiTripHistory entity);

	/**
	 * Delete a persistent TaxiTripHistory entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITaxiTripHistoryDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripHistory entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiTripHistory entity);

	/**
	 * Persist a previously saved TaxiTripHistory entity and return it or a copy
	 * of it to the sender. A copy of the TaxiTripHistory entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITaxiTripHistoryDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripHistory entity to update
	 * @return TaxiTripHistory the persisted TaxiTripHistory entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiTripHistory update(TaxiTripHistory entity);

	public TaxiTripHistory findById(Integer id);

	/**
	 * Find all TaxiTripHistory entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiTripHistory property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTripHistory> found by query
	 */
	public List<TaxiTripHistory> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByBaseId(Object baseId, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByCompanyId(Object companyId, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByUserId(Object userId, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByDriverId(Object driverId, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByTripType(Object tripType, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByNotifyDriverId(Object notifyDriverId, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByScriptStatus(Object scriptStatus, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByPickupLat(Object pickupLat, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByPickupLng(Object pickupLng, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByPickupLocation(Object pickupLocation, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByDestinationLat(Object destinationLat, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByDestinationLng(Object destinationLng, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByDestinationLocation(Object destinationLocation, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByPet(Object pet, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByWheelchair(Object wheelchair, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByWalkingAid(Object walkingAid, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByEstimateTime(Object estimateTime, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByEstimateLowFare(Object estimateLowFare, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByEstimateHighFare(Object estimateHighFare, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByEstimateHighFareOrigin(Object estimateHighFareOrigin,
                                                              int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByNegotiatedPrice(Object negotiatedPrice, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByBaseFare(Object baseFare, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByDistanceFare(Object distanceFare, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByMinuteFare(Object minuteFare, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByTripFare(Object tripFare, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByTripFareOrigin(Object tripFareOrigin, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByGasSurcharge(Object gasSurcharge, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByTollFee(Object tollFee, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByBlackCarFund(Object blackCarFund, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByTax(Object tax, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByTip(Object tip, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findBySignupDiscount(Object signupDiscount, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByCouponDiscount(Object couponDiscount, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByCouponCode(Object couponCode, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByAdjustment(Object adjustment, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByTotalAmount(Object totalAmount, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByDspShare(Object dspShare, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByBaseShare(Object baseShare, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByDriverShare(Object driverShare, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByComments(Object comments, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByCommentsType(Object commentsType, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByCancelAddress(Object cancelAddress, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByFavorite(Object favorite, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByTripStatus(Object tripStatus, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByPayStatus(Object payStatus, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByRealPickupLocation(Object realPickupLocation, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByRealStartLocation(Object realStartLocation, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByDistance(Object distance, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByEndDestination(Object endDestination, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByUserSignature(Object userSignature, int... rowStartIdxAndCount);

	public List<TaxiTripHistory> findByStatus(Object status, int... rowStartIdxAndCount);

	/**
	 * Find all TaxiTripHistory entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiTripHistory> all TaxiTripHistory entities
	 */
	public List<TaxiTripHistory> findAll(int... rowStartIdxAndCount);
}