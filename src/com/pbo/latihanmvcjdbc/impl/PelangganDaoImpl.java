/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pbo.latihanmvcjdbc.impl;

import com.pbo.latihanmvcjdbc.entity.Pelanggan;
import com.pbo.latihanmvcjdbc.error.PelangganException;
import com.pbo.latihanmvcjdbc.service.PelangganDao;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author AGUNGSEPRULOH
 */
public class PelangganDaoImpl implements PelangganDao{
    
    private Connection connection;

    public PelangganDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletePelanggan(Integer id) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pelanggan getPelanggan(Integer id) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pelanggan getPelanggan(String email) throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pelanggan> selectAllPelanggan() throws PelangganException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
