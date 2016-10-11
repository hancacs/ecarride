package han.company;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hanmei on 10/11/16.
 */
@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    public Employee findByEid(int eid);


    public List<Employee> findAll();

} // class DriverDao
