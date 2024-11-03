/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.example.servlets;

import com.example.beans.CStudents;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author loickcherimont
 */
@WebServlet(name = "Students", urlPatterns = {"/students"})
public class Students extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false); // Set false to use an existing session
        String sessionName = (String) session.getAttribute("sessionName");

        if (sessionName != null) {

            // Create 3 students and add them to an array list
            CStudents students = new CStudents();
//        List<Student> students = new ArrayList<>();
//
//        students.add(new Student(1, "Théo", "Martins", "theo.martin@hotmail.fr", "0123456789", 22));
//        students.add(new Student(2, "Lionel", "Techer", "lionel.techer@gmail.com", "0987654321", 27));
//        students.add(new Student(3, "Benjamin", "Doe", "doe-benjamin@outlook.fr", "001122334455", 24));
            // Execute admin about.jsp if OK
            request.setAttribute("students", students);

            request.getRequestDispatcher("/WEB-INF/jsp/students.jsp").forward(request, response);
            return;
        } else {
            // Redirect user to connection page if session is null
            response.sendRedirect("/StudentWorkspace/form");
            return;
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CStudents students = new CStudents();
        students.addNewStudent(request);

        request.setAttribute("students", students);

        request.getRequestDispatcher("/WEB-INF/jsp/students.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
