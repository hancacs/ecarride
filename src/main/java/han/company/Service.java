package han.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hanmei on 10/11/16.
 */
@RestController
@RequestMapping("/service/")
public class Service {

    // ------------------------
    // PUBLIC METHODS
    // ------------------------

    @RequestMapping(value = "/delete_employee_by_id", method = RequestMethod.POST)
    public void deleteByEmployeeId(@RequestParam("id") int id) {
        employeeDao.deleteById(id);
    }


    @RequestMapping("/get_departments")
    public List<Department> findAllDepartments() {
        return departmentDao.findAll();
    }


    @RequestMapping("/get_employees")
    public List<Employee> findAllEmployees() {
        return employeeDao.findAll();
    }

    // ------------------------
    // PRIVATE FIELDS
    // ------------------------

    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private DepartmentDao departmentDao;

} // class DriverController