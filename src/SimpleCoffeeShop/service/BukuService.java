/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCoffeeShop.service;

import SimpleCoffeeShop.model.Buku;
import java.util.List;

/**
 *
 * @author p14055
 */
public interface BukuService {
    public void saveBuku(Buku buku);
    public List<Buku> getDaftarBuku();
    public void deleteBuku(Buku buku);
    public void updateBuku(Buku buku);
    
}
