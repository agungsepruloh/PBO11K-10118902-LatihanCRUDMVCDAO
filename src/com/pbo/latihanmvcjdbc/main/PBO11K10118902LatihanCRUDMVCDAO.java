/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.latihanmvcjdbc.main;

import com.pbo.latihanmvcjdbc.database.KingsBarberShopDatabase;
import com.pbo.latihanmvcjdbc.entity.Pelanggan;
import com.pbo.latihanmvcjdbc.error.PelangganException;
import com.pbo.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author AGUNGSEPRULOH
 */
public class PBO11K10118902LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        
        PelangganDao dao = KingsBarberShopDatabase.getPelangganDao();
        List<Pelanggan> list = dao.selectAllPelanggan();
        
        for (Pelanggan pelanggan : list) {
            System.out.println("Nama " + pelanggan.getNama());
            System.out.println("Alamat " + pelanggan.getAlamat());
            System.out.println("Telepon " + pelanggan.getTelepon());
            System.out.println("Email " + pelanggan.getEmail());
        }
        
    }
    
}
