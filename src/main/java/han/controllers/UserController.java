package han.controllers;

import han.models.ecarrideDaos.BookingDao;
import han.models.ecarrideDaos.TripDao;
import han.models.ecarrideDaos.TripDetailDao;
import han.models.ecarrideModels.*;
import han.models.ecarrideDaos.UserDao;
import han.models.ecarrideModels.TaxiUsersEntity;
import han.varification.MD5Hash;


import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A class to test interactions with the MySQL database using the UserDao class.
 *
 * @author han
 */

@RestController
@RequestMapping("/user/")
public class UserController {

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------

//  @Autowired
//  private UserDao userDao;
//
//  @Autowired
//  private TripDao tripDao;
//
//  @Autowired
//  private BookingDao bookingDao;

//   ------------------------
//   PUBLIC METHODS
//   ------------------------
//

//  @RequestMapping(value = "/login", method = RequestMethod.GET)
//  public String login(Model model, String error, String logout) {
//    if (error != null)
//      model.addAttribute("error", "Your username and password is invalid.");
//
//    if (logout != null)
//      model.addAttribute("message", "You have been logged out successfully.");
//
//    return "login";
//  }
//
//  @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
//  public String welcome(Model model) {
//    return "welcome";
//  }


//
//  @RequestMapping (method = RequestMethod.GET, value = "get_trip_by_id")
//  HttpEntity<Resource<User>> loadUser(@PathVariable Long user) {
//    Resource&lt;User&gt; resource = this.userResourceAssembler.toResource(crmService.
//            findById(user));
//    return new ResponseEntity&lt;Resource&lt;User&gt;&gt;(resource, HttpStatus.OK);
//  }
//
//
//
//  @RequestMapping(value = "/login", method = RequestMethod.GET)
//  public String login(Model model, String error, String logout) {
//    if (error != null)
//      model.addAttribute("error", "Your username and password is invalid.");
//
//    if (logout != null)
//      model.addAttribute("message", "You have been logged out successfully.");
//
//    return "login";
//  }
//
//  @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
//  public String welcome(Model model) {
//    return "welcome";
//  }
//
//  @RequestMapping("/get_all_users")
//  public List<TaxiUsersEntity> findAll() {
//    return userDao.findAll();
//  }
//

//
//  /**
//   * /create  --> Create a new user and save it in the database.
//   *
//   * @param email User's email
//   * @param username User's name
//   * @return A string describing if the user is successfully created or not.
//   */
//
//  @RequestMapping("/create")
//  @ResponseBody
//  public String create(String username, String password, String email) {
//    TaxiUsersEntity user = null;
//    try {
//      password = MD5Hash.encriptInMD5(password);
//      user = new TaxiUsersEntity(username, password, email);
//      if(isEmailExist(email)) {
//          return "email: " + email + " already exists !!!!!!";
//      }
//      if(isUsernameExist(username)) {
//          return "username: " + username + " already exists";
//      }
//      userDao.save(user);
//    }
//    catch (Exception ex) {
//      return "Error creating the user: " + ex.toString();
//    }
//    return "User successfully created! (id = " + user.getId() + ")";
//  }

  //validate user login info
//    @RequestMapping("/validate")
//    public String validate(String username, String password) throws Exception {
//        if(!isUsernameExist(username)) {
//            return ""
//        }
//      TaxiUsersEntity user = userDao.findByUsername(username);
//        if (user.getPassword().equals(MD5Hash.encriptInMD5(password)))
//            return "login succeed";
//        else
//            return "password is not correct";
//    }
//
//


//
//  //delete by username
//  @RequestMapping("/delete-by-username")
//  @ResponseBody
//  public String delete(String username) {
//      try {
//        TaxiUsersEntity user = userDao.findByUsername(username);
//          userDao.delete(user);
//      }
//      catch (Exception ex) {
//          return "Error deleting the user: " + ex.toString();
//      }
//      return "User successfully deleted!";
//  }
  
  /**
   * /get-by-email  --> Return the id for the user having the passed email.
   * 
   * @param email The email to search in the database.
   * @return The user id or a message error if the user is not found.
   */
//  @RequestMapping("/get_user_by_email")
//  public TaxiUsersEntity getByEmail(String email) {
//    return userDao.findByEmail(email);
//  }
//
//  @RequestMapping("/get_user_by_username")
//  public TaxiUsersEntity getByUsername(String username) {
//    return userDao.findByUsername(username);
//  }
//
//  //Find by Id
//  @RequestMapping("/get_user_by_id")
//  public TaxiUsersEntity getById(int id) {
//    return userDao.findById(id);
//  }

//  /**
//   * /update  --> Update the email and the name for the user in the database
//   * having the passed id.
//   *
//   * @param id The id for the user to update.
//   * @param email The new email.
//   * @param name The new name.
//   * @return A string describing if the user is successfully updated or not.
//   */
//
//  @RequestMapping("/update")
//  @ResponseBody
//  public String updateUser(long id, String email, String name) {
//    try {
//      TaxiUsersEntity user = userDao.findOne(id);
//      user.setEmail(email);
//      user.setName(name);
//      userDao.save(user);
//    }
//    catch (Exception ex) {
//      return "Error updating the user: " + ex.toString();
//    }
//    return "User successfully updated!";
//  }

//  public boolean isUsernameExist(String username) {
//      return userDao.findByUsername(username) != null;
//  }
//
//  public boolean isEmailExist(String email) {
//      return userDao.findByEmail(email) != null;
//  }
//


} // class UserController
