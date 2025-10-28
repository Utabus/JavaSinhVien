package com.mycompany.maven_jdbc;

import database.DatabaseConnection;
import database.SinhVienDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import Model.SinhVien;

/**
 *
 * @author SV
 */
public class Maven_JDBC {

    public static void main(String[] args) {
        String sql = "SELECT id, FullName, Email FROM SinhVien";

        try (Connection conn = DatabaseConnection.getConnection()) {

            System.out.println("✅ Kết nối thành công! Đang truy vấn dữ liệu...");
            System.out.println("----------------------------------------");

//            while (rs.next()) {
//                int id = rs.getInt("Id");
//                String fullName = rs.getString("FullName");
//                String email = rs.getString("Email");
//                System.out.println("ID: " + id + ", Họ Tên: " + fullName + ", Email: " + email);
//            }
            SinhVienDB context = new SinhVienDB();
            List<SinhVien> data = context.GetAllSinhVien(conn);
            for (int i = 0; i < data.size(); i++) {
                SinhVien sv = data.get(i);
              System.out.println(sv.toString())  ;
            }

        } catch (SQLException e) {
            System.err.println("Lỗi cơ sở dữ liệu: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
