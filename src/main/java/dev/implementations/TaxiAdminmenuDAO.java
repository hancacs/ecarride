package dev.implementations;

import dev.interfaces.ITaxiAdminmenuDAO;
import dev.models.EntityManagerHelper;
import dev.models.TaxiAdminmenu;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TaxiAdminmenu entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see dev.models.TaxiAdminmenu
 * @author MyEclipse Persistence Tools
 */
public class TaxiAdminmenuDAO implements ITaxiAdminmenuDAO {
	// property constants
	public static final String PARENT_ID = "parentId";
	public static final String NAME = "name";
	public static final String URL = "url";
	public static final String ANGULAR_URL = "angularUrl";
	public static final String PAGE = "page";
	public static final String CLASS_ = "class_";
	public static final String IMG_URL = "imgUrl";
	public static final String DISPLAY_ORDER = "displayOrder";
	public static final String STATUS = "status";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TaxiAdminmenu entity. All
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
	 * TaxiAdminmenuDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdminmenu entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TaxiAdminmenu entity) {
		EntityManagerHelper.log("saving TaxiAdminmenu instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TaxiAdminmenu entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TaxiAdminmenuDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdminmenu entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TaxiAdminmenu entity) {
		EntityManagerHelper.log("deleting TaxiAdminmenu instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TaxiAdminmenu.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TaxiAdminmenu entity and return it or a copy
	 * of it to the sender. A copy of the TaxiAdminmenu entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TaxiAdminmenuDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TaxiAdminmenu entity to update
	 * @return TaxiAdminmenu the persisted TaxiAdminmenu entity instance, may
	 *         not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TaxiAdminmenu update(TaxiAdminmenu entity) {
		EntityManagerHelper.log("updating TaxiAdminmenu instance", Level.INFO, null);
		try {
			TaxiAdminmenu result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TaxiAdminmenu findById(Integer id) {
		EntityManagerHelper.log("finding TaxiAdminmenu instance with id: " + id, Level.INFO, null);
		try {
			TaxiAdminmenu instance = getEntityManager().find(TaxiAdminmenu.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TaxiAdminmenu entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TaxiAdminmenu property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            number of results to return.
	 * @return List<TaxiAdminmenu> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiAdminmenu> findByProperty(String propertyName, final Object value,
			final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding TaxiAdminmenu instance with property: " + propertyName + ", value: " + value,
				Level.INFO, null);
		try {
			final String queryString = "select model from TaxiAdminmenu model where model." + propertyName
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

	public List<TaxiAdminmenu> findByParentId(Object parentId, int... rowStartIdxAndCount) {
		return findByProperty(PARENT_ID, parentId, rowStartIdxAndCount);
	}

	public List<TaxiAdminmenu> findByName(Object name, int... rowStartIdxAndCount) {
		return findByProperty(NAME, name, rowStartIdxAndCount);
	}

	public List<TaxiAdminmenu> findByUrl(Object url, int... rowStartIdxAndCount) {
		return findByProperty(URL, url, rowStartIdxAndCount);
	}

	public List<TaxiAdminmenu> findByAngularUrl(Object angularUrl, int... rowStartIdxAndCount) {
		return findByProperty(ANGULAR_URL, angularUrl, rowStartIdxAndCount);
	}

	public List<TaxiAdminmenu> findByPage(Object page, int... rowStartIdxAndCount) {
		return findByProperty(PAGE, page, rowStartIdxAndCount);
	}

	public List<TaxiAdminmenu> findByClass_(Object class_, int... rowStartIdxAndCount) {
		return findByProperty(CLASS_, class_, rowStartIdxAndCount);
	}

	public List<TaxiAdminmenu> findByImgUrl(Object imgUrl, int... rowStartIdxAndCount) {
		return findByProperty(IMG_URL, imgUrl, rowStartIdxAndCount);
	}

	public List<TaxiAdminmenu> findByDisplayOrder(Object displayOrder, int... rowStartIdxAndCount) {
		return findByProperty(DISPLAY_ORDER, displayOrder, rowStartIdxAndCount);
	}

	public List<TaxiAdminmenu> findByStatus(Object status, int... rowStartIdxAndCount) {
		return findByProperty(STATUS, status, rowStartIdxAndCount);
	}

	/**
	 * Find all TaxiAdminmenu entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<TaxiAdminmenu> all TaxiAdminmenu entities
	 */
	@SuppressWarnings("unchecked")
	public List<TaxiAdminmenu> findAll(final int... rowStartIdxAndCount) {
		EntityManagerHelper.log("finding all TaxiAdminmenu instances", Level.INFO, null);
		try {
			final String queryString = "select model from TaxiAdminmenu model";
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