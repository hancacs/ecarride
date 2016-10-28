package dev.controllers;

import dev.interfaces.ITaxiDriverDAO;
import dev.interfaces.ITaxiUsersDAO;
import dev.models.TaxiCompany;
import dev.models.TaxiDriver;
import dev.models.TaxiUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A class to han.test interactions with the MySQL database using the DriverDao class.
 *
 * @author han
 */
@RestController
@RequestMapping("/test/")
public class MyController {

    // ------------------------
    // PUBLIC METHODS
    // ------------------------


//    @RequestMapping("/get_driver_by_id")
//    public List<TaxiDriver> findDriverById(@RequestParam("tripId") int id) {
//        return driverDao.findById();
//    }

    @RequestMapping(value = "/get_drivers", method = RequestMethod.GET, produces = "application/json")
    public
    Node foo() {
        return new Node(1, "haha");
    }

    class Node implements java.io.Serializable {
        int id;
        String name;

        public Node(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

//
//    @RequestMapping("/get_driver_by_username")
//    public List<TaxiDriver> getByUsername(String username) {
//        return driverDao.findByUsername(username);
//    }
//
//    //Find by Id
//    @RequestMapping("/get_driver_by_id")
//    public TaxiDriver getById(int id) {
//        return driverDao.findById(id);
//    }
//
//    public boolean isUsernameExist(String username) {
//        return driverDao.findByUsername(username) != null;
//    }
//
//    public boolean isEmailExist(String email) {
//        return driverDao.findByEmail(email) != null;
//    }

    // ------------------------
    // PRIVATE FIELDS
    // ------------------------
    @Autowired
    private ITaxiUsersDAO userDao;

} // class DriverController
