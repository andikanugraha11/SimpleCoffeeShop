/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCoffeeShop.service;

import SimpleCoffeeShop.model.Coffee;
import java.util.List;

/**
 *
 * @author p14055
 */
public interface CoffeeService {
    public void saveBuku(Coffee buku);
    public List<Coffee> getDaftarBuku();
    public void deleteBuku(Coffee buku);
    public void updateBuku(Coffee buku);
    
}
