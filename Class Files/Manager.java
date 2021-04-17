/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pd3_26.midterm_project;

/**
 *
 * @author DELL
 */
public class Manager {
    private String Email;
    private String Password;

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public boolean Login(String NEmail, String NPass)
    {
        return NEmail.equals(Email) && NPass.equals(Password);
    }
}
