package com.example.demo.dtos;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public class PaymentInfoDto {

    @NotEmpty
    @Length(min = 16, max = 16, message = "Card number should 16 digits")
    private String cardNumber;

    @NotEmpty
    @Pattern(regexp = "^(0[1-9]|1[0-2])/(\\d{2})$", message = "expiry date format in MM/YY")
    private String expiryDate;

    @NotNull
    @Digits(integer = 3, fraction = 0, message = "cvv number is the 3 digit number on the back of your card")
    private Integer cvv;

    @NotEmpty
    @Pattern(regexp = "[a-zA-Z]+$")
    private String firstName;

    @NotEmpty
    @Pattern(regexp = "[a-zA-Z]+$")
    private String lastName;

    @NotEmpty
    @Pattern(regexp = "^\\d{5}(?:[-\\s]\\d{4})?$", message = "please enter 5 digit zip code")
    private String zipCode;

    public PaymentInfoDto() {
    }

    public PaymentInfoDto(String cardNumber, String expiryDate, Integer cvv, String firstName, String lastName, String zipCode) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "PaymentInfoDto{" +
                "cardNumber='" + cardNumber + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", cvv=" + cvv +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
