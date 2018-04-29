/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCoffeeShop.service;

import SimpleCoffeeShop.model.Coffee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import SimpleCoffeeShop.dao.CoffeeDao;

/**
 *
 * @author p14055
 */
@Service("BukuService")
@Transactional(readOnly = true)
public class CoffeeServiceImpl implements CoffeeService{
    @Autowired
    private CoffeeDao bukuDao;

    @Override
    @Transactional
    public void saveBuku(Coffee buku) {
        bukuDao.saveBuku(buku);
    }

    @Override
    public List<Coffee> getDaftarBuku() {
        return bukuDao.getDaftarBuku();
    }

    @Override
    @Transactional
    public void updateBuku(Coffee buku) {
        bukuDao.updateBuku(buku);
    }

    @Override
    public void deleteBuku(Coffee buku) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
