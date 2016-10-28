package dev.implementations;

import dev.interfaces.ITaxiTripHistoryDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiTripHistory;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiTripHistory entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see dev.models.TaxiTripHistory
 * @author MyEclipse Persistence Tools
 */
public class TaxiTripHistoryDAO implements ITaxiTripHistoryDAO {
	// property constants
	public static final String BASE_ID = "baseId";
	public static final String COMPANY_ID = "companyId";
	public static final String USER_ID = "userId";
	public static final String DRIVER_ID = "driverId";
	public static final String TRIP_TYPE = "tripType";
	public static final String NOTIFY_DRIVER_ID = "notifyDriverId";
	public static final String SCRIPT_STATUS = "scriptStatus";
	public static final String PICKUP_LAT = "pickupLat";
	public static final String PICKUP_LNG = "pickupLng";
	public static final String PICKUP_LOCATION = "pickupLocation";
	public static final String DESTINATION_LAT = "destinationLat";
	public static final String DESTINATION_LNG = "destinationLng";
	public static final String DESTINATION_LOCATION = "destinationLocation";
	public static final String PET = "pet";
	public static final String WHEELCHAIR = "wheelchair";
	public static final String WALKING_AID = "walkingAid";
	public static final String ESTIMATE_TIME = "estimateTime";
	public static final String ESTIMATE_LOW_FARE = "estimateLowFare";
	public static final String ESTIMATE_HIGH_FARE = "estimateHighFare";
	public static final String ESTIMATE_HIGH_FARE_ORIGIN = "estimateHighFareOrigin";
	public static final String NEGOTIATED_PRICE = "negotiatedPrice";
	public static final String BASE_FARE = "baseFare";
	public static final String DISTANCE_FARE = "distanceFare";
	public static final String MINUTE_FARE = "minuteFare";
	public static final String TRIP_FARE = "tripFare";
	public static final String TRIP_FARE_ORIGIN = "tripFareOrigin";
	public static final String GAS_SURCHARGE = "gasSurcharge";
	public static final String TOLL_FEE = "tollFee";
	public static final String BLACK_CAR_FUND = "blackCarFund";
	public static final String TAX = "tax";
	public static final String TIP = "tip";
	public static final String SIGNUP_DISCOUNT = "signupDiscount";
	public static final String COUPON_DISCOUNT = "couponDiscount";
	public static final String COUPON_CODE = "couponCode";
	public static final String ADJUSTMENT = "adjustment";
	public static final String TOTAL_AMOUNT = "totalAmount";
	public static final String DSP_SHARE = "dspShare";
	public static final String BASE_SHARE = "baseShare";
	public static final String DRIVER_SHARE = "driverShare";
	public static final String COMMENTS = "comments";
	public static final String COMMENTS_TYPE = "commentsType";
	public static final String CANCEL_ADDRESS = "cancelAddress";
	public static final String FAVORITE = "favorite";
	public static final String TRIP_STATUS = "tripStatus";
	public static final String PAY_STATUS = "payStatus";
	public static final String REAL_PICKUP_LOCATION = "realPickupLocation";
	public static final String REAL_START_LOCATION = "realStartLocation";
	public static final String DISTANCE = "distance";
	public static final String END_DESTINATION = "endDestination";
	public static final String USER_SIGNATURE = "userSignature";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiTripHistory entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * TaxiTripHistoryDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripHistory entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiTripHistory entity) {
		EntityManagerHelper.log("saving TaxiTripHistory instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiTripHistory entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiTripHistoryDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiTripHistory entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiTripHistory entity) {
		EntityManagerHelper.log("deleting TaxiTripHistory instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiTripHistory.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiTripHistory entity and return it or a copy
	 * of it to the sender. A copy of the TaxiTripHistory entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiTripHistoryDAO.update(entity);
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
	public TaxiTripHistory update(TaxiTripHistory entity) {
		EntityManagerHelper.log("updating TaxiTripHistory instance", Level.INFO, null);
		try {
			TaxiTripHistory result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiTripHistory findById(Integer id) {
		EntityManagerHelper.log("finding TaxiTripHistory instance with id: " + id, Level.INFO, null);
		try {
			TaxiTripHistory instance = getEntityManager().find(TaxiTripHistory.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

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
	 *            number of results to return.
	 * @return List<TaxiTripHistory> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiTripHistory> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiTripHistory instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiTripHistory model where model." + propertyName
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

	public List<TaxiTripHistory> findByBaseId(Object baseId, int... rowStartIdxAndCount) {
		return findByProperty(BASE_ID, baseId, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByCompanyId(Object companyId, int... rowStartIdxAndCount) {
		return findByProperty(COMPANY_ID, companyId, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByUserId(Object userId, int... rowStartIdxAndCount) {
		return findByProperty(USER_ID, userId, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByDriverId(Object driverId, int... rowStartIdxAndCount) {
		return findByProperty(DRIVER_ID, driverId, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByTripType(Object tripType, int... rowStartIdxAndCount) {
		return findByProperty(TRIP_TYPE, tripType, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByNotifyDriverId(Object notifyDriverId, int... rowStartIdxAndCount) {
		return findByProperty(NOTIFY_DRIVER_ID, notifyDriverId, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByScriptStatus(Object scriptStatus, int... rowStartIdxAndCount) {
		return findByProperty(SCRIPT_STATUS, scriptStatus, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByPickupLat(Object pickupLat, int... rowStartIdxAndCount) {
		return findByProperty(PICKUP_LAT, pickupLat, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByPickupLng(Object pickupLng, int... rowStartIdxAndCount) {
		return findByProperty(PICKUP_LNG, pickupLng, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByPickupLocation(Object pickupLocation, int... rowStartIdxAndCount) {
		return findByProperty(PICKUP_LOCATION, pickupLocation, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByDestinationLat(Object destinationLat, int... rowStartIdxAndCount) {
		return findByProperty(DESTINATION_LAT, destinationLat, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByDestinationLng(Object destinationLng, int... rowStartIdxAndCount) {
		return findByProperty(DESTINATION_LNG, destinationLng, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByDestinationLocation(Object destinationLocation, int... rowStartIdxAndCount) {
		return findByProperty(DESTINATION_LOCATION, destinationLocation, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByPet(Object pet, int... rowStartIdxAndCount) {
		return findByProperty(PET, pet, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByWheelchair(Object wheelchair, int... rowStartIdxAndCount) {
		return findByProperty(WHEELCHAIR, wheelchair, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByWalkingAid(Object walkingAid, int... rowStartIdxAndCount) {
		return findByProperty(WALKING_AID, walkingAid, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByEstimateTime(Object estimateTime, int... rowStartIdxAndCount) {
		return findByProperty(ESTIMATE_TIME, estimateTime, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByEstimateLowFare(Object estimateLowFare, int... rowStartIdxAndCount) {
		return findByProperty(ESTIMATE_LOW_FARE, estimateLowFare, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByEstimateHighFare(Object estimateHighFare, int... rowStartIdxAndCount) {
		return findByProperty(ESTIMATE_HIGH_FARE, estimateHighFare, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByEstimateHighFareOrigin(Object estimateHighFareOrigin,
			int... rowStartIdxAndCount) {
		return findByProperty(ESTIMATE_HIGH_FARE_ORIGIN, estimateHighFareOrigin, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByNegotiatedPrice(Object negotiatedPrice, int... rowStartIdxAndCount) {
		return findByProperty(NEGOTIATED_PRICE, negotiatedPrice, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByBaseFare(Object baseFare, int... rowStartIdxAndCount) {
		return findByProperty(BASE_FARE, baseFare, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByDistanceFare(Object distanceFare, int... rowStartIdxAndCount) {
		return findByProperty(DISTANCE_FARE, distanceFare, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByMinuteFare(Object minuteFare, int... rowStartIdxAndCount) {
		return findByProperty(MINUTE_FARE, minuteFare, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByTripFare(Object tripFare, int... rowStartIdxAndCount) {
		return findByProperty(TRIP_FARE, tripFare, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByTripFareOrigin(Object tripFareOrigin, int... rowStartIdxAndCount) {
		return findByProperty(TRIP_FARE_ORIGIN, tripFareOrigin, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByGasSurcharge(Object gasSurcharge, int... rowStartIdxAndCount) {
		return findByProperty(GAS_SURCHARGE, gasSurcharge, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByTollFee(Object tollFee, int... rowStartIdxAndCount) {
		return findByProperty(TOLL_FEE, tollFee, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByBlackCarFund(Object blackCarFund, int... rowStartIdxAndCount) {
		return findByProperty(BLACK_CAR_FUND, blackCarFund, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByTax(Object tax, int... rowStartIdxAndCount) {
		return findByProperty(TAX, tax, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByTip(Object tip, int... rowStartIdxAndCount) {
		return findByProperty(TIP, tip, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findBySignupDiscount(Object signupDiscount, int... rowStartIdxAndCount) {
		return findByProperty(SIGNUP_DISCOUNT, signupDiscount, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByCouponDiscount(Object couponDiscount, int... rowStartIdxAndCount) {
		return findByProperty(COUPON_DISCOUNT, couponDiscount, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByCouponCode(Object couponCode, int... rowStartIdxAndCount) {
		return findByProperty(COUPON_CODE, couponCode, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByAdjustment(Object adjustment, int... rowStartIdxAndCount) {
		return findByProperty(ADJUSTMENT, adjustment, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByTotalAmount(Object totalAmount, int... rowStartIdxAndCount) {
		return findByProperty(TOTAL_AMOUNT, totalAmount, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByDspShare(Object dspShare, int... rowStartIdxAndCount) {
		return findByProperty(DSP_SHARE, dspShare, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByBaseShare(Object baseShare, int... rowStartIdxAndCount) {
		return findByProperty(BASE_SHARE, baseShare, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByDriverShare(Object driverShare, int... rowStartIdxAndCount) {
		return findByProperty(DRIVER_SHARE, driverShare, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByComments(Object comments, int... rowStartIdxAndCount) {
		return findByProperty(COMMENTS, comments, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByCommentsType(Object commentsType, int... rowStartIdxAndCount) {
		return findByProperty(COMMENTS_TYPE, commentsType, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByCancelAddress(Object cancelAddress, int... rowStartIdxAndCount) {
		return findByProperty(CANCEL_ADDRESS, cancelAddress, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByFavorite(Object favorite, int... rowStartIdxAndCount) {
		return findByProperty(FAVORITE, favorite, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByTripStatus(Object tripStatus, int... rowStartIdxAndCount) {
		return findByProperty(TRIP_STATUS, tripStatus, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByPayStatus(Object payStatus, int... rowStartIdxAndCount) {
		return findByProperty(PAY_STATUS, payStatus, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByRealPickupLocation(Object realPickupLocation, int... rowStartIdxAndCount) {
		return findByProperty(REAL_PICKUP_LOCATION, realPickupLocation, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByRealStartLocation(Object realStartLocation, int... rowStartIdxAndCount) {
		return findByProperty(REAL_START_LOCATION, realStartLocation, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByDistance(Object distance, int... rowStartIdxAndCount) {
		return findByProperty(DISTANCE, distance, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByEndDestination(Object endDestination, int... rowStartIdxAndCount) {
		return findByProperty(END_DESTINATION, endDestination, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByUserSignature(Object userSignature, int... rowStartIdxAndCount) {
		return findByProperty(USER_SIGNATURE, userSignature, rowStartIdxAndCount);
	}

	public List<TaxiTripHistory> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

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
	@SuppressWarnings("unchecked")
	public List<TaxiTripHistory> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiTripHistory instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiTripHistory model";
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