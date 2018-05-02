package edu.matc.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "CreateUserNameServlet", urlPatterns = "/signUpNewUser")
public class CreateUserNameServlet extends HttpServlet {

    // TODO DAO user getUserByUser to check if exists so no duplicates
    private final Logger logger = LogManager.getLogger(this.getClass());
    private UserDao userDao;


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        String mismatchError = "Password Entries don't match. Try again";
        String userAlreadyExistsMessage = "User Name Already Exists. Please Choose Another";


        String username = request.getParameter("username");
        logger.info(username);


        List<User> userList = userDao.getUserByProperty(username,"user_name");

        if(userList.size() > 0) {
            request.setAttribute("usernameAlreadyExists", userAlreadyExistsMessage);
            response.sendRedirect("/index.jsp");
        }

        String password = request.getParameter("password");
        logger.info(password);
        String passwordConfirm = request.getParameter("passwordConfirm");
        logger.info(passwordConfirm);


        if (!password.equals(passwordConfirm)) {
            request.setAttribute("passwordmismatch", mismatchError);
            response.sendRedirect("/index.jsp");
        } else {


            request.setAttribute("username", username);
            request.setAttribute("password", password);

            String url = "/user-signup.jsp";

            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }

    }

}
    
    
    
    
    
