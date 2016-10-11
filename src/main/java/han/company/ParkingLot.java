package han.company;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by hanmei on 10/11/16.
 */
@Entity
@Table(name="parking_lot")
public class ParkingLot implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToOne
    @JoinColumn(name="employee_id",referencedColumnName="id")
    private Employee employee;
//Other properties,constructors, getters and setters and so on

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}