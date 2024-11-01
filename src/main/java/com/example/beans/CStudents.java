/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.beans;

import jakarta.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author loickcherimont
 */
public class CStudents {

    private List<Student> all = new ArrayList<>();

    public CStudents() {
        all.add(
                new Student(1, "Théo", "Martins", "theo.martin@hotmail.fr", "0123456789", "22"));
        all.add(
                new Student(2, "Lionel", "Techer", "lionel.techer@gmail.com", "0987654321", "27"));
        all.add(
                new Student(3, "Benjamin", "Doe", "doe-benjamin@outlook.fr", "001122334455", "24"));
    }

    public List<Student> getAll() {
        return all;
    }

    public void addNewStudent(HttpServletRequest request) {
        int id = all.size() + 1;
        String fn = request.getParameter("firstName");
        String ln = request.getParameter("lastName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phoneNumber");
        String age = request.getParameter("age");

        Student student = new Student(id, fn, ln, email, phone, age);

        all.add(student);
    }

    // Add students
}
