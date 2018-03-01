package edu.matc.controller;

import java.io.IOException;
import java.time.LocalDate;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "NewUser", urlPatterns = "/signup")
public class NewUser extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = new User();
        UserDao userDao = new UserDao();

        String firstName = request.getParameter("firstName");
        logger.debug("User First Name: " + firstName);
        String lastName = request.getParameter("lastName");
        logger.debug("User Last Name: " + lastName);
        String userName = request.getParameter("username");
        logger.debug("User's user name: " + userName);
        String password = request.getParameter("password");
        logger.debug("User's Password: " + password);
        String address = request.getParameter("address");
        logger.debug("User's Street Address: " + address);
        String cityName = request.getParameter("city");
        logger.debug("User's City: " + cityName);
        String state = request.getParameter("state");
        logger.debug("User's State: " + state);
        String zipcode = request.getParameter("zipCode");
        logger.debug("User Zip Code: " + zipcode);
        String email = request.getParameter("email");
        logger.debug("User's Email: " + email);
        String areaCode = request.getParameter("areacode");
        logger.debug("User's Area Code: " + areaCode);
        String phone = request.getParameter("phone");
        logger.debug("User's Phone: " + phone);
        String userBirthday = request.getParameter("birthday");
        logger.debug("User's String Birthday: "+ userBirthday);
        LocalDate birthday = LocalDate.parse(userBirthday);
        logger.debug("User's LocalDate Birthday: " + birthday);


        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setUserPassword(password);
        user.setStreetAddress(address);
        user.setCityName(cityName);
        user.setStateName(state);
        user.setZipCode(zipcode);
        user.setUserEmail(email);
        user.setAreaCode(areaCode);
        user.setUserPhoneNumber(phone);
        user.setUserBirthDate(birthday);

        int userId = userDao.insert(user);
        logger.debug("My new user has an ID of " + userId);

        request.setAttribute("user", user);

        String url = "/success.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

   /* private String processImageFile(Part imageFilePart) {
        //TODO Decide where images will be stored
        //TODO Validate maximum image size
        //TODO Use Google API
        String userPhotoFilePath = "../Test";

        String fileName = getFileName(imageFilePart);
        String userPhotoLink = userPhotoFilePath + fileName;
        return userPhotoLink;
    }



    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }*/

}
    
    
    
    
    
