package com.example.fpoly.controller;

import com.example.fpoly.entity.User;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "FormServlet", value = "/form/update")
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User bean = new User();
        bean.setFullname("Nguyễn Văn A");
        bean.setGender(false);
        bean.setCountry("CN");
        request.setAttribute("user", bean);

//        Map<String, Object> map = new HashMap<>();
//        map.put("fullname", "Nguyễn Văn Tèo");
//        map.put("gender", false);
//        map.put("country", "US");
//        request.setAttribute("user", map);
        request.setAttribute("editabled", false);
        request.getRequestDispatcher("/lab2/form.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullname = request.getParameter("fullname");
        System.out.println(fullname);
        request.getRequestDispatcher("/lab2/form.jsp").forward(request, response);
    }
}