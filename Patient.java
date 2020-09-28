/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicmanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Patient {
    private int id;
    private String name;
    private String gender;
  
    private int age;
     private String mobileNo;
    private String address;
    private  ArrayList <TreatmentDetails> al=new ArrayList<>();

    public Patient(int id, String name, String gender, int age, String mobileNo, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.mobileNo = mobileNo;
        this.address = address;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<TreatmentDetails> getAl() {
        return al;
    }

    public void setAl(ArrayList<TreatmentDetails> al) {
        this.al = al;
    }
    
    
}
