package han.models.ecarrideDaos;

/**
 * Created by hanmei on 10/3/16.
 */

import han.models.ecarrideModels.TaxiBookingEntity;
import han.models.ecarrideModels.TaxiDriverEntity;
import han.models.ecarrideModels.TaxiTripEntity;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

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
@Component
@Repository
public interface BookingDao extends CrudRepository<TaxiBookingEntity, Integer> {

    /**
     * Return the user having the passed email or null if no user is found.
     *
     * @param id the user email.
     */

    public TaxiBookingEntity findById(int id);
    public TaxiBookingEntity findByTripId(int tripId);
    public List<TaxiBookingEntity> findAll();

} // class TripDao
