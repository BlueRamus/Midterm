/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pd3_26.midterm_project;

import java.util.List;

/**
 *
 * @author DELL
 */
public class Employee {
    private String Name;
    private String Email;
    private String Password;
    private String Contact;
    private String ID;
    private List<Request> ReqList;
    
    public boolean Login(String NEmail, String NPass)
    {
        return NEmail.equals(Email) && NPass.equals(Password);
    }
    
    public void addReq(Request Req)
    {
        ReqList.add(Req);
    }
    
    
    
    //GETTER METHODS

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public String getContact() {
        return Contact;
    }

    public String getID() {
        return ID;
    }

    public List<Request> getReqList() {
        return ReqList;
    }
    
    //SETTER METHODS

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setReqList(List<Request> ReqList) {
        this.ReqList = ReqList;
    }
    
    
    
}
