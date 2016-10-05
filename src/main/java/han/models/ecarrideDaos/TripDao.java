package han.models.ecarrideDaos;

/**
 * Created by hanmei on 10/3/16.
 */

import han.models.ecarrideModels.TaxiDriverEntity;
import han.models.ecarrideModels.TaxiTripEntity;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * A DAO for the entity Driver is simply created by extending the CrudRepository
 * interface provided by spring. The following methods are some of the ones
 * available from such interface: save, delete, deleteAll, findOne and findAll.
 * The magic is that such methods must not be implemented, and moreover it is
 * possible create new query methods working only by defining their signature!
 *
 * @author han
 */
@Transactional
public interface TripDao extends CrudRepository<TaxiTripEntity, Integer> {

    /**
     * Return the user having the passed email or null if no user is found.
     *
     * @param id the user email.
     */

    public TaxiTripEntity findById(int id);

    public List<TaxiTripEntity> findAll();

} // class TripDao
