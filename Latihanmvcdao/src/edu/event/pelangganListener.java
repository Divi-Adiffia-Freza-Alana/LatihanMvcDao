/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.event;

import edu.entity.Pelanggan;
import edu.model.pelangganModel;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
 */
public interface pelangganListener {
    public void onChange(pelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelate();
    public void onUpdate(Pelanggan pelanggan);

   
    
}
