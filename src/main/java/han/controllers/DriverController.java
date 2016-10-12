package han.controllers;
import java.util.List;
import han.models.ecarrideDaos.*;
import han.models.ecarrideModels.TaxiDriverEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * A class to han.test interactions with the MySQL database using the DriverDao class.
 *
 * @author han
 */
@RestController
@RequestMapping("/driver/")
public class DriverController {

    // ------------------------
    // PUBLIC METHODS
    // ------------------------


    @RequestMapping("/get_all_drivers")
    public List<TaxiDriverEntity> findAll() {
        return driverDao.findAll();
    }

    @RequestMapping("/get_driver_by_username")
    public TaxiDriverEntity getByUsername(String username) {
        return driverDao.findByUsername(username);
    }

    //Find by Id
    @RequestMapping("/get_driver_by_id")
    public TaxiDriverEntity getById(int id) {
        return driverDao.findById(id);
    }

    public boolean isUsernameExist(String username) {
        return driverDao.findByUsername(username) != null;
    }

    public boolean isEmailExist(String email) {
        return driverDao.findByEmail(email) != null;
    }

    // ------------------------
    // PRIVATE FIELDS
    // ------------------------
    @Autowired
    private DriverDao driverDao;

} // class DriverController
