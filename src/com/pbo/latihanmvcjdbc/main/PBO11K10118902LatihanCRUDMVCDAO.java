/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.latihanmvcjdbc.main;

import com.pbo.latihanmvcjdbc.database.KingsBarberShopDatabase;
import java.sql.SQLException;

/**
 *
 * @author AGUNGSEPRULOH
 */
public class PBO11K10118902LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        KingsBarberShopDatabase.getConnection();
    }
    
}
