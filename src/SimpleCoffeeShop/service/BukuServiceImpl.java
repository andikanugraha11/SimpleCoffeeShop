/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCoffeeShop.service;

import SimpleCoffeeShop.dao.BukuDao;
import SimpleCoffeeShop.model.Buku;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author p14055
 */
@Service("BukuService")
@Transactional(readOnly = true)
public class BukuServiceImpl implements BukuService{
    @Autowired
    private BukuDao bukuDao;

    @Override
    @Transactional
    public void saveBuku(Buku buku) {
        bukuDao.saveBuku(buku);
    }

    @Override
    public List<Buku> getDaftarBuku() {
        return bukuDao.getDaftarBuku();
    }

    @Override
    @Transactional
    public void updateBuku(Buku buku) {
        bukuDao.updateBuku(buku);
    }

    @Override
    public void deleteBuku(Buku buku) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
