package com.johndomnicgeorge.projects.controller;

import com.johndomnicgeorge.projects.dao.UserDAO;
import com.johndomnicgeorge.projects.model.User;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/register")
public class UserController extends HttpServlet {
    private UserDAO userDAO;
    private String registerURL = "register/register.jsp";

    public void init() {
        userDAO = new UserDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect(registerURL);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        register(req, resp);
    }

    private void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User(firstName, lastName, username, password);

        try {
            int result = userDAO.register(user);
            if(result == 1) {
                req.setAttribute("NOTI", "Registered successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        RequestDispatcher requestDispatcher = req.getRequestDispatcher(registerURL);
        requestDispatcher.forward(req, resp);
    }
}
