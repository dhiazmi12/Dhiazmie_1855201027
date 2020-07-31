/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek_uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Dhiazmi <dhiazmie@gmail.com>
 */
public class koneksidatabase {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        koneksidatabase teskoneksi = new koneksidatabase();
        teskoneksi.koneksi();
    }

    com.mysql.jdbc.Connection con = null;

    String statuskoneksi;
    String statuskone0ksi;
    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost/dataorangtuamurid";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(connectionURL, username, password);
            //JOptionPane.showMessageDialog(null, "Sukses Koneksi");
            statuskoneksi = "Berhasil";
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, e);
             statuskoneksi = "Gagal";
            System.exit(0);
        }
    }

    }
    

