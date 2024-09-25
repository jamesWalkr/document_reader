package com.example.demo.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeId")
    private Integer employeeId;
    private String lastName;
    private String firstName;
    private String title;
    private LocalDate birthDate;
    private LocalDate hiredDate;
    private String address;
    private String city;
    private  String state;
    private String country;
    private String postalCode;
    private String phoneNumber;
    private String faxNumber;
    private  String email;
    //@OneToOne(mappedBy = "employee")
    //private Customer customer;

    public Employee() {
    }

    public Employee(Integer employeeId, String lastName, String firstName, String title, LocalDate birthDate, LocalDate hiredDate, String address, String city, String state, String country, String postalCode, String phoneNumber, String faxNumber, String email) {
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.title = title;
        this.birthDate = birthDate;
        this.hiredDate = hiredDate;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.faxNumber = faxNumber;
        this.email = email;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(LocalDate hiredDate) {
        this.hiredDate = hiredDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", title='" + title + '\'' +
                ", birthDate=" + birthDate +
                ", hiredDate=" + hiredDate +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faxNumber='" + faxNumber + '\'' +
                ", email='" + email + '\'' + '}';
    }
}
