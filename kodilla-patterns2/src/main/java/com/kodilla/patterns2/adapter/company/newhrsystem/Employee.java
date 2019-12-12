package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Employee {
    final private String peselId;
    final private String firstname;
    final private String lasname;
    final private BigDecimal baseSalary;

    public Employee(String peselId, String firstname, String lasname, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.firstname = firstname;
        this.lasname = lasname;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLasname() {
        return lasname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        return peselId.equals(employee.peselId);
    }

    @Override
    public int hashCode() {
        return peselId.hashCode();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lasname='" + lasname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
