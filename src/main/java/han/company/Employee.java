package han.company;

import javax.persistence.*;

/**
 * Created by hanmei on 10/11/16.
 */
@Entity
@Table(name="empoyee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name="department_id", referencedColumnName="id")
    private Department department;
    @ManyToOne
    @JoinColumn(name="project_id", referencedColumnName="id")
    private Project projects;
    @OneToOne(mappedBy="employee")
    private ParkingLot parkingLot;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Project getProjects() {
        return projects;
    }

    public void setProjects(Project projects) {
        this.projects = projects;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
    //Other properties,constructors, getters and setters and so on
}