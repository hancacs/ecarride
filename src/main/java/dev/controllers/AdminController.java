//package dev.controllers;
//import java.util.*;
//
//import han.models.ecarrideDaos.*;
//import han.models.ecarrideModels.*;
//import org.mindrot.jbcrypt.BCrypt;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//
///**
// * A class to han.test interactions with the MySQL database using the TriprDao class.
// *
// * @author han
// */
//@RestController
//public class AdminController {
//
//    // ------------------------
//    // PUBLIC METHODS
//    // ------------------------
//
//    @RequestMapping(value = "/admin_login", method = RequestMethod.GET)
//    public ResponseEntity<Map<String, Object>> getTripById(@RequestParam("username") String username, @RequestParam(value = "password") String password) {
//        Map<String, Object> data = new HashMap<>();
//        if(!isUsernameExist(username)) {
//            data.put("Error: ", "username not exist");
//            return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
//        }
//        TaxiAdminEntity admin = adminDao.findByUsername(username);
//        String encryptedPassword = "$2a$10$113a45d58de69622298c5u2Lr06RH.f28xAEE9GMxExk4xkshEG2W";
//        //System.out.println(tripDao.findDspShareSum());
//        if(!BCrypt.checkpw("123456", encryptedPassword)) {
//            data.put("Error: ", "wrong password");
//            return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
//        } else {
//            data.put("admin info: ", admin);
//            System.out.println("haha");
//            return new ResponseEntity<>(data, HttpStatus.OK);
//        }
//    }
//
//    @RequestMapping(value = "/check", method = RequestMethod.GET)
//    public ResponseEntity<Map<String, Object>> check(@RequestParam(value = "rawPassword") String rawPassword, @RequestParam(value = "encryptedPassword") String encryptedPassword) {
//        Map<String, Object> data = new HashMap<>();
//        String result;
//        if(BCrypt.checkpw(rawPassword, encryptedPassword)) {
//            result = "You got it, Yang";
//            data.put("Result: ", result);
//            return new ResponseEntity<>(data, HttpStatus.OK);
//        } else {
//            result = "no no no";
//            data.put("Result: ", result);
//            return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
//        }
//
//    }
//
//
////    @RequestMapping(value = "/admin_login", method = RequestMethod.GET)
////    public ResponseEntity<Map<String, Object>> getDashboardInfo(@RequestParam("id") int id) {
////        Map<String, Object> data = new HashMap<>();
////        if (!isUsernameExist(id)) {
////            data.put("Error: ", "admin id not exist");
////            return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
////        }
////        TaxiAdminEntity admin = adminDao.findById(id);
////
////        // find total users
////        if (admin.getCompanyId() == 0 && admin.getBaseId() == 0) {
////            int totalUsers = 0;
////            data.put("total_users: ", totalUsers);
////            try {
////                totalUsers = userDao.findAll().size();
////            } catch (Exception e) {
////                String result = "DATABASE_CONNECTION_ERROR";
////                data.put(result, "Connection error");
////                return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
////            }
////            data.put("total_users: ", totalUsers);
////        }
////
////        int totalTrips = 0;
////        int totalDrivers = 0;
////        double driverShare = 0.0;
////        int onDuty = 0;
////        int offDuty = 0;
////        double dspShare = 0.0;
////
////        // count of super admin
////        if (admin.getCompanyId() == 0 && admin.getBaseId() == 0) {
////            double dsp_share = 0.0;
////            try {
////                totalTrips = tripDao.findAll().size();
////                totalDrivers = driverDao.findAll().size();
////                dspShare = tripDao.findDspShareSum();
////                driverShare = tripDao.findDriverShareSum();
////                @Query(value = "select sum(t.driverShare) from TaxiTripEntity t")
////                onDuty =
////                $on_duty = TaxiDriver::where ('duty_status', '=', 1)->count();
////                $off_duty = TaxiDriver::where ('duty_status', '=', 0)->count();
////            } catch (\Exception $e){
////                $result = 'DATABASE_CONNECTION_ERROR';
////                $response = ws_response($result, $data);
////                return $response;
////            }
////            $data['dsp_share'] = $dsp_share;
////
////            return new ResponseEntity<>(data, HttpStatus.OK);
////        }
////    }
//
//    public boolean isUsernameExist(String username) {
//        return adminDao.findByUsername(username) != null;
//    }
//    public boolean isUsernameExist(int id) {
//        return adminDao.findById(id) != null;
//    }
//
//
//    // ------------------------
//    // PRIVATE FIELDS
//    // ------------------------
//
//    @Autowired
//    private AdminDao adminDao;
////    @Autowired
////    private UserDao userDao;
////    @Autowired
////    private TripDao tripDao;
//    @Autowired
//    private DriverDao driverDao;
//
//} // class DriverController
