package com.example.fpoly;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.*;

@WebServlet({
        "/crud/index",
        "/crud/edit/2024",
        "/crud/update",
        "/crud/delete",
        "/crud/create"})
public class CrudServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String uri = req.getRequestURI();

        if (uri.contains("index")) {
            Map<String, Double > diems = new HashMap<>();
            diems.put("toan",10.0);
            diems.put("ly",8.0);

            List<String> tens = new ArrayList<>();
            tens.add("Cu");
            tens.add("Huy");

            req.setAttribute("map", diems);
            req.setAttribute("list", tens);

            req.getRequestDispatcher("/diem.jsp").forward(req,resp);

            System.out.println("index");
        } else if (uri.contains("create")) {
            System.out.println("create");
        } else if (uri.contains("update")) {
            System.out.println("update");
        } else if (uri.contains("delete")) {
            System.out.println("delete");
        } else if (uri.contains("edit/2024")) {
            System.out.println("edit/2024");
        }
//    req.getRequestDispatcher()
    }
}