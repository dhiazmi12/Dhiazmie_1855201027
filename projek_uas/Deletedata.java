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
public class Deletedata {
     koneksidatabase konek = new koneksidatabase();

    public void delete(String namaanak) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();
            String sql = "delete from dataorangtua where nama_anak = '" + namaanak + "'";

            statement.executeUpdate(sql);
            statement.close();
            
            int hps = 0;
            //JOptionPane.showConfirmDialog(null,"Apakah anda ingin menghapus data tersebut?");
            if(hps == JOptionPane.YES_OPTION){
                //JOptionPane.showMessageDialog(null, "Berhasil dihapus");
            }else{
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
