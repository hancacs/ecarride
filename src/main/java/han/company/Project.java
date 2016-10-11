package han.company;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by hanmei on 10/11/16.
 */
@Entity
@Table(name="project")
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToMany(mappedBy="projects")
    private List<Employee> employees;
    //Other properties,constructors, getters and setters and so on

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}