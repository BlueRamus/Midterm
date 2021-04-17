/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pd3_26.midterm_project;

import java.util.List;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 *
 * @author DELL
 */
public class Request {
    private List<Objects> ObjList;
    private String Reason;
    private String Status;
    private String Time;
    private String ID;
    
    public Request(String ID, String Reason)
    {
        DateTimeFormatter Format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Time = Format.format(now);
    }
    
    //GETTER METHODS

    public List<Objects> getObjList() {
        return ObjList;
    }

    public String getReason() {
        return Reason;
    }

    public String getStatus() {
        return Status;
    }

    public String getTime() {
        return Time;
    }

    public String getID() {
        return ID;
    }
    
    //SETTER METHODS

    public void setObjList(List<Objects> ObjList) {
        this.ObjList = ObjList;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
}
