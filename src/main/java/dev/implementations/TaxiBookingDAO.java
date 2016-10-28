package dev.implementations;

import dev.interfaces.ITaxiBookingDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiBooking;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiBooking entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see dev.models.TaxiBooking
 * @author MyEclipse Persistence Tools
 */
public class TaxiBookingDAO implements ITaxiBookingDAO {
	// property constants
	public static final String USER_ID = "userId";
	public static final String ROUTE_OPTION = "routeOption";
	public static final String ASSIGNED_DRIVER_ID = "assignedDriverId";
	public static final String APPROVED_BY_OPERATOR = "approvedByOperator";
	public static final String SECONDARY_PHONE = "secondaryPhone";
	public static final String CONFIRMED = "confirmed";
	public static final String ASSIGNED_VEHICLE_TYPE_ID = "assignedVehicleTypeId";
	public static final String INSURANCE_RATEBOOK_ID = "insuranceRatebookId";
	public static final String INSURANCE_ID = "insuranceId";
	public static final String INSURANCE_COMPANY_NAME = "insuranceCompanyName";
	public static final String INSURANCE_COST_CODE = "insuranceCostCode";
	public static final String ETA_FARE = "etaFare";
	public static final String NO_OF_PASSENGER = "noOfPassenger";
	public static final String NO_OF_BAGGAGE = "noOfBaggage";
	public static final String AIRPORT = "airport";
	public static final String TERMINAL = "terminal";
	public static final String FLIGHT_CARRIER = "flightCarrier";
	public static final String FLIGHT_NUM = "flightNum";
	public static final String COMMENTS = "comments";
	public static final String BOOKING_TYPE = "bookingType";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiBooking entity. All
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
	 * TaxiBookingDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBooking entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiBooking entity) {
		EntityManagerHelper.log("saving TaxiBooking instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiBooking entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiBookingDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiBooking entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiBooking entity) {
		EntityManagerHelper.log("deleting TaxiBooking instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiBooking.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiBooking entity and return it or a copy of
	 * it to the sender. A copy of the TaxiBooking entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiBookingDAO.update(entity);
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
	public TaxiBooking update(TaxiBooking entity) {
		EntityManagerHelper.log("updating TaxiBooking instance", Level.INFO, null);
		try {
			TaxiBooking result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiBooking findById(Integer id) {
		EntityManagerHelper.log("finding TaxiBooking instance with id: " + id, Level.INFO, null);
		try {
			TaxiBooking instance = getEntityManager().find(TaxiBooking.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

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
	 *            number of results to return.
	 * @return List<TaxiBooking> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiBooking> findByProperty(String propertyName, final Object value, final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiBooking instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiBooking model where model." + propertyName
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

	public List<TaxiBooking> findByUserId(Object userId, int... rowStartIdxAndCount) {
		return findByProperty(USER_ID, userId, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByRouteOption(Object routeOption, int... rowStartIdxAndCount) {
		return findByProperty(ROUTE_OPTION, routeOption, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByAssignedDriverId(Object assignedDriverId, int... rowStartIdxAndCount) {
		return findByProperty(ASSIGNED_DRIVER_ID, assignedDriverId, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByApprovedByOperator(Object approvedByOperator, int... rowStartIdxAndCount) {
		return findByProperty(APPROVED_BY_OPERATOR, approvedByOperator, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findBySecondaryPhone(Object secondaryPhone, int... rowStartIdxAndCount) {
		return findByProperty(SECONDARY_PHONE, secondaryPhone, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByConfirmed(Object confirmed, int... rowStartIdxAndCount) {
		return findByProperty(CONFIRMED, confirmed, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByAssignedVehicleTypeId(Object assignedVehicleTypeId, int... rowStartIdxAndCount) {
		return findByProperty(ASSIGNED_VEHICLE_TYPE_ID, assignedVehicleTypeId, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByInsuranceRatebookId(Object insuranceRatebookId, int... rowStartIdxAndCount) {
		return findByProperty(INSURANCE_RATEBOOK_ID, insuranceRatebookId, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByInsuranceId(Object insuranceId, int... rowStartIdxAndCount) {
		return findByProperty(INSURANCE_ID, insuranceId, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByInsuranceCompanyName(Object insuranceCompanyName, int... rowStartIdxAndCount) {
		return findByProperty(INSURANCE_COMPANY_NAME, insuranceCompanyName, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByInsuranceCostCode(Object insuranceCostCode, int... rowStartIdxAndCount) {
		return findByProperty(INSURANCE_COST_CODE, insuranceCostCode, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByEtaFare(Object etaFare, int... rowStartIdxAndCount) {
		return findByProperty(ETA_FARE, etaFare, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByNoOfPassenger(Object noOfPassenger, int... rowStartIdxAndCount) {
		return findByProperty(NO_OF_PASSENGER, noOfPassenger, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByNoOfBaggage(Object noOfBaggage, int... rowStartIdxAndCount) {
		return findByProperty(NO_OF_BAGGAGE, noOfBaggage, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByAirport(Object airport, int... rowStartIdxAndCount) {
		return findByProperty(AIRPORT, airport, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByTerminal(Object terminal, int... rowStartIdxAndCount) {
		return findByProperty(TERMINAL, terminal, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByFlightCarrier(Object flightCarrier, int... rowStartIdxAndCount) {
		return findByProperty(FLIGHT_CARRIER, flightCarrier, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByFlightNum(Object flightNum, int... rowStartIdxAndCount) {
		return findByProperty(FLIGHT_NUM, flightNum, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByComments(Object comments, int... rowStartIdxAndCount) {
		return findByProperty(COMMENTS, comments, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByBookingType(Object bookingType, int... rowStartIdxAndCount) {
		return findByProperty(BOOKING_TYPE, bookingType, rowStartIdxAndCount);
	}

	public List<TaxiBooking> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

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
	@SuppressWarnings("unchecked")
	public List<TaxiBooking> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiBooking instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiBooking model";
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