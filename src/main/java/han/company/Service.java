package han.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by hanmei on 10/11/16.
 */
@RestController
public class Service {

    // ------------------------
    // PUBLIC METHODS
    // ------------------------

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