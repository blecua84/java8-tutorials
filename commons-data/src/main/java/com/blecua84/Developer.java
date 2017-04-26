package com.blecua84;

import java.math.BigDecimal;

/**
 * Developer class developed with TDD Methodology.
 *
 * @author blecua84
 */
public class Developer {

    private String name;

    private BigDecimal salary;

    private Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Developer [name=" + this.name + ", salary=" + this.salary + ", age=" + this.age + "]";
    }
}
