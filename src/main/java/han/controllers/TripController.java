//package han.controllers;
//import java.util.*;
//
//import han.models.ecarrideDaos.*;
//import han.models.ecarrideModels.TaxiBookingEntity;
//import han.models.ecarrideModels.TaxiDriverEntity;
//import han.models.ecarrideModels.TaxiTripEntity;
//import han.models.ecarrideModels.TaxiUsersEntity;
//import org.apache.poi.openxml4j.opc.internal.ContentType;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//
///**
// * A class to test interactions with the MySQL database using the TriprDao class.
// *
// * @author han
// */
//@RestController
//public class TripController {
//
//    // ------------------------
//    // PUBLIC METHODS
//    // ------------------------
//
//    @RequestMapping(value = "/get_trip_by_id", method = RequestMethod.POST)
//    public ResponseEntity<Map<String, Object>> getTripById(@RequestParam("tripId") int id, @RequestParam(value = "myName", required = false) String myName) {
//        Map<String, Object> data = new HashMap<>();
//        TaxiTripEntity trip = tripDao.findById(id);
//        int tripId = trip.getId();
//        int userId = trip.getUserId();
//        TaxiUsersEntity user = userDao.findById(userId);
//        TaxiBookingEntity booking = bookingDao.findByTripId(tripId);
//        String insuranceCompanyName = booking.getInsuranceCompanyName();
//        String insuranceCompanyId = booking.getInsuranceId();
//        data.put("my name is: ", myName);
//        data.put("result: ", HttpStatus.OK);
//        data.put("trip info: ", trip);
//        data.put("user info: ", user);
//        Map<String, Object> insuranceinfo = new HashMap<>();
//        insuranceinfo.put("insurance company name: ", insuranceCompanyName);
//        insuranceinfo.put("insurance company id: ", insuranceCompanyId);
//        data.put("insurance info: ", insuranceinfo);
//        return new ResponseEntity<>(data, HttpStatus.OK);
//    }
//
//
//    // ------------------------
//    // PRIVATE FIELDS
//    // ------------------------
//
//    @Autowired
//    private TripDao tripDao;
//    @Autowired
//    //@Qualifier("UserDao")
//    private UserDao userDao;
//    @Autowired
//    private BookingDao bookingDao;
//
//} // class DriverController
