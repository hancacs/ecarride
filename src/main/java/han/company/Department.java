package han.company;

import org.hibernate.mapping.Collection;

import javax.persistence.*;
import java.util.List;

/**
 * Created by hanmei on 10/11/16.
 */
@Entity
public class Department {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    @Column(name = "depId", nullable = false)
    private int depId;

    @Column(name = "depName")
    private String depName;

    @OneToMany( cascade=CascadeType.ALL, mappedBy="department", targetEntity=Employee.class, fetch=FetchType.EAGER, orphanRemoval = true )
    private List<Employee> employees;

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    public String getDepName( ) {
        return depName;
    }

    public void setDepName( String deptName ) {
        this.depName = deptName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}