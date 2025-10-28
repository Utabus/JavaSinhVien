/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Time;
import java.time.OffsetDateTime;

/**
 *
 * @author SV
 */
public class SinhVien {
    private int Id;
    private String StudentCode;
    private String FullName;
    private Time dateOfBirth;
    private String Gender;
    private String Email;

    public SinhVien() {
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "Id=" + Id + ", StudentCode=" + StudentCode + ", FullName=" + FullName + ", dateOfBirth=" + dateOfBirth + ", Gender=" + Gender + ", Email=" + Email + '}';
    }

    public void setStudentCode(String StudentCode) {
        this.StudentCode = StudentCode;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public void setDateOfBirth(Time dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public SinhVien(int Id, String StudentCode, String FullName, Time dateOfBirth, String Gender, String Email) {
        this.Id = Id;
        this.StudentCode = StudentCode;
        this.FullName = FullName;
        this.dateOfBirth = dateOfBirth;
        this.Gender = Gender;
        this.Email = Email;
    }

    public int getId() {
        return Id;
    }

    public String getStudentCode() {
        return StudentCode;
    }

    public String getFullName() {
        return FullName;
    }

    public Time getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }

    public String getEmail() {
        return Email;
    }
    
    
}
