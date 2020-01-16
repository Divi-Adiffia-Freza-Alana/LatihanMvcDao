/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.servis;

import edu.entity.Pelanggan;
import edu.eror.pelangganex;
import java.util.List;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
 */
public interface pelanggandao {
    public void insertpelanggan(Pelanggan pelanggan)throws pelangganex;
    public void updatepelanggan(Pelanggan pelanggan)throws pelangganex;
    public void delatepelanggan(Integer ID)throws pelangganex;
    public Pelanggan getpelanggan(Integer ID)throws pelangganex;
    public Pelanggan getpelanggan(String email)throws pelangganex;
    public List<Pelanggan>selectAllPelanggan() throws pelangganex;
}
