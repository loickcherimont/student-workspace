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

    private String username, password, error;

    public ConnectionForm(HttpServletRequest request) {
        username = request.getParameter("username");
        password = request.getParameter("password");
    }

    public String getUsername() {
        return username;
    }

    // ???? Maybe avoid to do that
    public String getPassword() {
        return password;
    }
    
    public String getError() {
        return error;
    }
    
    public void setError(String text) {
        error = text;
    }
    
    public boolean isCorrect() {
        boolean invalidCredentials = username.equals("admin") && password.equals("admin123");
        return invalidCredentials;
    }
}