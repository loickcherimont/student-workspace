/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.forms;

import jakarta.servlet.http.HttpServletRequest;

/**
 *
 * @author loickcherimont
 */
public class ConnectionForm {

    private String result;

    public void checkLogins(HttpServletRequest request) {
        String login = request.getParameter("login");
        String password = request.getParameter("pass");
        if (login.equals("admin") && password.equals("admin123")) {
            result = "You're connected!";
        } else {
            result = "Wrong login/password!";
        }
        
        System.out.println(result);
    }
    
    public String getResult() {
        return result;
    }
}
