package com.dhineshDeveloper;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")

public class EmployeeEntity { // Renamed class to Employee
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY) // Assuming auto-generated ID
    @Column(name = "eId")
    private int eId;
    
    @Column(name= "eName")
    private String eName;
    
    @Column(name= "eDesig")
    private String eDesig;
    
    @Column(name= "eSalary")
    private int eSalary;
    
    @Column(name= "eEmail")
    private String eEmail;
    
    @Column(name= "ePasswd")
    private String ePasswd;

    // Default constructor
    public EmployeeEntity() {
        super();
    }

    // Constructor without eId
    public EmployeeEntity(String eName, String eDesig, int eSalary, String eEmail, String ePasswd) {
        this.eName = eName;
        this.eDesig = eDesig;
        this.eSalary = eSalary;
        this.eEmail = eEmail;
        this.ePasswd = ePasswd;
    }

    // Constructor with eId
    public EmployeeEntity(int eId, String eName, String eDesig, int eSalary, String eEmail, String ePasswd) {
        this.eId = eId;
        this.eName = eName;
        this.eDesig = eDesig;
        this.eSalary = eSalary;
        this.eEmail = eEmail;
        this.ePasswd = ePasswd;
    }

    // Getters and Setters
    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteDesig() {
        return eDesig;
    }

    public void seteDesig(String eDesig) {
        this.eDesig = eDesig;
    }

    public int geteSalary() {
        return eSalary;
    }

    public void seteSalary(int eSalary) {
        this.eSalary = eSalary;
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail;
    }

    public String getePasswd() {
        return ePasswd;
    }

    public void setePasswd(String ePasswd) {
        this.ePasswd = ePasswd;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Employee [eId=" + eId + ", eName=" + eName + ", eDesig=" + eDesig + ", eSalary=" + eSalary + ", eEmail="
                + eEmail + ", ePasswd=" + ePasswd + "]";
    }
}
