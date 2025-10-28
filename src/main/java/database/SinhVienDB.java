/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import Model.SinhVien;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList; 
import java.util.List;
import java.sql.*;
/**
 *
 * @author SV
 */
public class SinhVienDB {
   
    
    
    public List<SinhVien> GetAllSinhVien(Connection con) throws SQLException
    {
         String sql = "SELECT id, FullName, Email FROM SinhVien";
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery(sql);
         
        List<SinhVien> data = new ArrayList<>();
        while(rs.next())
        {
            int id = rs.getInt("id");
            String fullname = rs.getString("FullName");
            String email = rs.getString("Email");
            SinhVien sv = new SinhVien();
            sv.setEmail(email);
            sv.setFullName(fullname);
            sv.setId(id);
            data.add(sv);
            
        }
        return data;
    }
    
    public  void AddSV(Connection con,SinhVien sv) throws SQLException
    {
          String sql = "INSERT INTO SinhVien (StudentCode, FullName, DateOfBirth, Gender, Email, PhoneNumber, Address, ClassName, Major, GPA, EnrollmentDate, Status) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

          PreparedStatement pram = con.prepareStatement(sql);
          pram.setString(1, sv.getStudentCode());
          pram.setString(2, sv.getFullName());
          pram.setTime(3, sv.getDateOfBirth());
          pram.setString(4, sv.getStudentCode());
           int rows = pram.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Thêm sinh viên thành công!");
            }

    }
    
}
