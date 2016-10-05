package han.controllers;
import java.util.*;

import han.models.ecarrideDaos.*;
import han.models.ecarrideModels.*;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * A class to test interactions with the MySQL database using the TriprDao class.
 *
 * @author han
 */
@RestController
public class AdminController {

    // ------------------------
    // PUBLIC METHODS
    // ------------------------

    @RequestMapping(value = "/admin_login", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getTripById(@RequestParam("username") String username, @RequestParam(value = "password") String password) {
        Map<String, Object> data = new HashMap<>();
        if(!isUsernameExist(username)) {
            data.put("Error: ", "username not exist");
            return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
        }
        TaxiAdminEntity admin = adminDao.findByUsername(username);
        String encryptedPassword = admin.getPassword();
        //System.out.println(BCrypt.hashpw("123456",BCrypt.gensalt()));
        if(!BCrypt.checkpw(password, encryptedPassword)) {
            data.put("Error: ", "wrong password");
            return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
        } else {
            data.put("admin info: ", admin);
            return new ResponseEntity<>(data, HttpStatus.OK);
        }
    }

    public boolean isUsernameExist(String username) {
        return adminDao.findByUsername(username) != null;
    }


    // ------------------------
    // PRIVATE FIELDS
    // ------------------------

    @Autowired
    private AdminDao adminDao;

} // class DriverController
