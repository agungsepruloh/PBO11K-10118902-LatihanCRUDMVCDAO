/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.latihanmvcjdbc.event;

import com.pbo.latihanmvcjdbc.entity.Pelanggan;
import com.pbo.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author : AGUNGSEPRULOH
 * NIM     : 10118902
 * Kelas   : IF-11K
 * 
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onUpdate(Pelanggan pelanggan);
    public void onDelete();
    
}
