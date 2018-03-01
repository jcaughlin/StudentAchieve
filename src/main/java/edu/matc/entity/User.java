package edu.matc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.time.LocalDate;
import java.util.List;


/*
 * The User Entity.
 * @author JS Caughlin
 */
@ToString
@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter private int id;

   /*@Column(name = "user_roles")
    @Getter @Setter private List userRoles;*/

    @Column(name = "first_name")
    @Getter @Setter private String firstName;

    @Column(name = "last_name")
    @Getter @Setter private String lastName;

    @Column(name = "user_name")
    @Getter @Setter private String userName;

    @Column(name = "user_pass")
    @Getter @Setter private String userPassword;

    @Column(name = "address")
    @Getter @Setter private String streetAddress;

    @Column(name = "city")
    @Getter @Setter private String cityName;

    @Column(name = "state")
    @Getter @Setter private String stateName;

    @Column(name = "zipcode")
    @Getter @Setter private String zipCode;

    @Column(name = "areacode")
    @Getter @Setter private String areaCode;

    @Column(name = "phone")
    @Getter @Setter private String userPhoneNumber;

    @Column(name = "email")
    @Getter @Setter private String userEmail;

    @Column(name = "registered_date")
    @Getter @Setter private LocalDate userCreatedDate;

    @Column(name = "last_updated")
    @Getter @Setter private LocalDate userLastUpdated;

    @Column(name = "birthday")
    @Getter @Setter private LocalDate userBirthDate;



    public User() {

    }

    public User(String firstName, String lastName, String userName, String userPassword, String userEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }



}

