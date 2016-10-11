package han.company;

import javax.persistence.*;

/**
 * Created by hanmei on 10/11/16.
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    @Column(name = "eid", nullable = false)
    private int eid;

    @Column(name = "ename")
    private String ename;

    @Column(name = "salary")
    private double salary;

//    @Column(name = "depId", insertable = false, updatable = false)
//    private int depId;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "depId", referencedColumnName = "depId")
    private Department department;

//    public int getDepId() {
//        return depId;
//    }
//
//    public void setDepId(int depId) {
//        this.depId = depId;
//    }

    public Employee(int eid, String ename, double salary, Department department) {
        super( );
        this.eid = eid;
        this.ename = ename;
        this.salary = salary;
        this.department = department;
    }

    public Employee( ) {
        super();
    }

    public int getEid( ) {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname( ) {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSalary( ) {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment( ) {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}