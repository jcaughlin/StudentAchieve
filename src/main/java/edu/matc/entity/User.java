package edu.matc.entity;

import lombok.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 * The User Entity.
 * @author JS Caughlin
 */
@Data
public class User implements java.io.Serializable{

    private int userId;
    private UserRoles userRole;
    private String firstName;
    private String lastName;
    private String userName;
    private String userPassword;
    private String streetAddress;
    private String cityName;
    private String stateName;
    private String userZipCode;
    private String linkToUserProfilePhoto;
    private LocalDate userBirthDate;
    private int userPhoneNumber;
    private String userEmail;
    private LocalDate userCreatedDate;
    private LocalDate userLastUpdated;


}

