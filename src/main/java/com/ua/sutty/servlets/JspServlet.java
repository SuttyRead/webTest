package com.ua.sutty.servlets;

import com.ua.sutty.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/jsp")
public class JspServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User("Ivan", "Ivanov", 16);
        List<User> users = Arrays.asList(new User("Ivan", "Ivanov", 20), new User("Andey", "Alexandrov", 15));
        req.setAttribute("users", users);
        req.getServletContext().getRequestDispatcher("/WEB-INF/jsp/Hello.jsp").forward(req, resp);
    }

}
