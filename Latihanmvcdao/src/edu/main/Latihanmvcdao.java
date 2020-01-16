/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.main;

import edu.database.kingdatabase;
import edu.entity.Pelanggan;
import edu.eror.pelangganex;
import edu.servis.pelanggandao;
import edu.view.MainViewPelanggan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
 */
public class Latihanmvcdao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws SQLException, pelangganex{
        // TODO code application logic here
      
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
               try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException e) {
                } catch (pelangganex ex) {
                    Logger.getLogger(Latihanmvcdao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}  
    
    

