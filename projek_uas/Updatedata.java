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
public class Updatedata {
     koneksidatabase konek = new koneksidatabase();

    public void update(String namaanak,String namaorangtua,String pekerjaan,String alamat,String notlp) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_namaanak = "update dataorangtua set nama_anak = '" + namaanak + "'where nama_anak = '" + namaanak + "'";
            String sql_namaorangtua = "update dataorangtua set nama_orangtua = '" + namaorangtua + "'where nama_anak = '" + namaanak + "'";
            String sql_pekerjaan = "update dataorangtua set pekerjaan = '" + pekerjaan + "'where nama_anak = '" + namaanak + "'";
            String sql_alamat = "update dataorangtua set alamat = '" + alamat + "'where nama_anak = '" + namaanak + "'";
            String sql_notlp = "update dataorangtua set no_tlp = '" + notlp + "'where nama_anak = '" + namaanak + "'";
            
            statement.executeUpdate(sql_namaanak);
            statement.executeUpdate(sql_namaorangtua);
            statement.executeUpdate(sql_pekerjaan);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_notlp);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
