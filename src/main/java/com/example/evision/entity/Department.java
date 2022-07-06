package com.example.evision.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="department_id")
    private long departmentId;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name="department_address")
    private String departmentAddresse;
    @Column(name="department_code")
    private String departmentCode;

    public Department(String departmentName, String departmentAddresse, String departmentCode) {
        this.departmentName = departmentName;
        this.departmentAddresse = departmentAddresse;
        this.departmentCode = departmentCode;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddresse() {
        return departmentAddresse;
    }

    public void setDepartmentAddresse(String departmentAddresse) {
        this.departmentAddresse = departmentAddresse;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentAddresse='" + departmentAddresse + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }

}
