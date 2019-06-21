package com.bitcamp.web.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Customer
 */

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@ToString
@Table(name = "CUSTOMERS")
public class Customer implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) 
    private Long  id;
    @Column(name="CUSTOMER_ID") private String      customerId;
    @Column(name="CUSTOMER_NAME") private String      customerName;
    @Column(name="PASSWORD") private String      password;
    @Column(name="SSN") private String      ssn ;
    @Column(name="PHONE") private String      phone;
    @Column(name="CITY") private String      city;
    @Column(name="ADDRESS") private String      address;
    @Column(name="POSTALCODE") private String      postalcode;
    @Column(name="PHOTO") private String      photo;  

    @Override
    public String  toString() {
        return String.format("고객정보 No: %d\n" +"ID: %s", id, customerId);

    }

    @Builder
    private Customer(String costomerId, String customerName,String password, String ssn,String phone,String city,String address,String postalcode,String photo){

        this.customerId = customerId;
        this.customerName = customerName;
        this.password = password;
        this.ssn = ssn;
        this.phone = phone;
        this.city = city;
        this.address = address;
        this.postalcode = postalcode;
        this.photo = photo;
        
    }

}