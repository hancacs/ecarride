package dev.implementations;

import dev.interfaces.ITaxiDriverFilterDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiDriverFilter;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiDriverFilter entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see dev.models.TaxiDriverFilter
 * @author MyEclipse Persistence Tools
 */
public class TaxiDriverFilterDAO implements ITaxiDriverFilterDAO {
	// property constants
	public static final String DRIVER_ID = "driverId";
	public static final String LAT = "lat";
	public static final String LNG = "lng";
	public static final String DIRECTION = "direction";
	public static final String GENDER = "gender";
	public static final String LANGUAGE = "language";
	public static final String RESERVED_ZIPCODE = "reservedZipcode";
	public static final String DRIVING_EXPERIENCE = "drivingExperience";
	public static final String NATIONALITY = "nationality";
	public static final String VEHICLE_BRAND = "vehicleBrand";
	public static final String DUTY_STATUS = "dutyStatus";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiDriverFilter entity.
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
	 * TaxiDriverFilterDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriverFilter entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiDriverFilter entity) {
		EntityManagerHelper.log("saving TaxiDriverFilter instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiDriverFilter entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiDriverFilterDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriverFilter entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiDriverFilter entity) {
		EntityManagerHelper.log("deleting TaxiDriverFilter instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiDriverFilter.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiDriverFilter entity and return it or a
	 * copy of it to the sender. A copy of the TaxiDriverFilter entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiDriverFilterDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiDriverFilter entity to update
	 * @return TaxiDriverFilter the persisted TaxiDriverFilter entity instance,
	 *         may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiDriverFilter update(TaxiDriverFilter entity) {
		EntityManagerHelper.log("updating TaxiDriverFilter instance", Level.INFO, null);
		try {
			TaxiDriverFilter result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiDriverFilter findById(Integer id) {
		EntityManagerHelper.log("finding TaxiDriverFilter instance with id: " + id, Level.INFO, null);
		try {
			TaxiDriverFilter instance = getEntityManager().find(TaxiDriverFilter.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiDriverFilter entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiDriverFilter property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiDriverFilter> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiDriverFilter> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log(
				"finding TaxiDriverFilter instance with property: " + propertyName + ", value: " + value, Level.INFO,
				null);
		try {
			final String queryString = "select model from TaxiDriverFilter model where model." + propertyName
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

	public List<TaxiDriverFilter> findByDriverId(Object driverId, int... rowStartIdxAndCount) {
		return findByProperty(DRIVER_ID, driverId, rowStartIdxAndCount);
	}

	public List<TaxiDriverFilter> findByLat(Object lat, int... rowStartIdxAndCount) {
		return findByProperty(LAT, lat, rowStartIdxAndCount);
	}

	public List<TaxiDriverFilter> findByLng(Object lng, int... rowStartIdxAndCount) {
		return findByProperty(LNG, lng, rowStartIdxAndCount);
	}

	public List<TaxiDriverFilter> findByDirection(Object direction, int... rowStartIdxAndCount) {
		return findByProperty(DIRECTION, direction, rowStartIdxAndCount);
	}

	public List<TaxiDriverFilter> findByGender(Object gender, int... rowStartIdxAndCount) {
		return findByProperty(GENDER, gender, rowStartIdxAndCount);
	}

	public List<TaxiDriverFilter> findByLanguage(Object language, int... rowStartIdxAndCount) {
		return findByProperty(LANGUAGE, language, rowStartIdxAndCount);
	}

	public List<TaxiDriverFilter> findByReservedZipcode(Object reservedZipcode, int... rowStartIdxAndCount) {
		return findByProperty(RESERVED_ZIPCODE, reservedZipcode, rowStartIdxAndCount);
	}

	public List<TaxiDriverFilter> findByDrivingExperience(Object drivingExperience, int... rowStartIdxAndCount) {
		return findByProperty(DRIVING_EXPERIENCE, drivingExperience, rowStartIdxAndCount);
	}

	public List<TaxiDriverFilter> findByNationality(Object nationality, int... rowStartIdxAndCount) {
		return findByProperty(NATIONALITY, nationality, rowStartIdxAndCount);
	}

	public List<TaxiDriverFilter> findByVehicleBrand(Object vehicleBrand, int... rowStartIdxAndCount) {
		return findByProperty(VEHICLE_BRAND, vehicleBrand, rowStartIdxAndCount);
	}

	public List<TaxiDriverFilter> findByDutyStatus(Object dutyStatus, int... rowStartIdxAndCount) {
		return findByProperty(DUTY_STATUS, dutyStatus, rowStartIdxAndCount);
	}

	public List<TaxiDriverFilter> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiDriverFilter entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiDriverFilter> all TaxiDriverFilter entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiDriverFilter> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiDriverFilter instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiDriverFilter model";
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