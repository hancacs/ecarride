package han.company;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by hanmei on 10/11/16.
 */
@Entity
@Table(name="department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @OneToMany(mappedBy="department", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Employee> employees;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    //Other properties,constructors, getters and setters and so on
}