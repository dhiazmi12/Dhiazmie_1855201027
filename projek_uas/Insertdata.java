/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek_uas;

import javax.swing.JOptionPane;

/**
 *
 * @author Dhiazmi <dhiazmie@gmail.com>
 */
public class Insertdata {
    koneksidatabase konek = new koneksidatabase();

    public void insert(String namaanak, String namaorangtua,String pekerjaan,String alamat,String notlp) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
            String sql = "insert into dataorangtua values('" + namaanak + "','" + namaorangtua + "','" + pekerjaan + "','"+ alamat + "','" + notlp + "')";

            statement.executeUpdate(sql);
            statement.close();

           // JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
