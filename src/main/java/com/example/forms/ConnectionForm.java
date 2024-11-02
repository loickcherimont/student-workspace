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

    private String username, password;

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
    
    public boolean isCorrect() {
        return username.equals("admin") && password.equals("admin123");
    }
}


/*
        <form method="POST" action="form">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" />
            <br/>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" />
            
            <input type="submit" />
        </form>
 */
