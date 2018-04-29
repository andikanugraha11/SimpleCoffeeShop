/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCoffeeShop.controller;

import SimpleCoffeeShop.app.App;
import SimpleCoffeeShop.config.CoffeeTableModel;
import SimpleCoffeeShop.model.Coffee;
import SimpleCoffeeShop.view.CoffeeView;
import java.util.List;
import javax.swing.JOptionPane;
import SimpleCoffeeShop.dao.CoffeeDao;

/**
 *
 * @author p14055
 */
public class CoffeeController {
    private final CoffeeView bukuView;
    private CoffeeTableModel bukuTableModel;
    private List<Coffee> daftarBuku;
    
    public CoffeeController(CoffeeView bukuView){
        this.bukuView = bukuView;
    }
    
    public void tampilData(){
        //daftarBuku = bukuDao.getDaftarBuku();
        daftarBuku = App.getBukuService().getDaftarBuku();
        bukuTableModel = new CoffeeTableModel(daftarBuku);
        this.bukuView.getTblBuku().setModel(bukuTableModel);

    }
    
    public void simpanBuku(){
        Coffee buku = new Coffee();
        
        buku.setOrderId(this.bukuView.getTxtOrderId().getText());
        buku.setCustomer(this.bukuView.getTxtCustomer().getText());
        buku.setOrder(this.bukuView.getOrderMenu());
        buku.setStyle(this.bukuView.getStyleTxt());
        buku.setPrice(this.bukuView.getHargaTotal());
        
        App.getBukuService().saveBuku(buku);
        
        JOptionPane.showMessageDialog(null, "Order diproses","info",
                JOptionPane.INFORMATION_MESSAGE);
        tampilData();
    }
    public void updateBuku(){
        Coffee buku = new Coffee();
        
        buku.setOrderId(this.bukuView.getTxtOrderId().getText());
        buku.setCustomer(this.bukuView.getTxtCustomer().getText());
        buku.setOrder(this.bukuView.getOrderMenu());
        buku.setStyle(this.bukuView.getStyleTxt());
        buku.setPrice(this.bukuView.getHargaTotal());
        
        //bukuDao.updateBuku(buku);
        
        App.getBukuService().updateBuku(buku);
        
        JOptionPane.showMessageDialog(null, "Data Berhasil diupdate","info",
                JOptionPane.INFORMATION_MESSAGE);
        tampilData();
    }
    
    public void cekBuku(){
        int index = this.bukuView.getTblBuku().getSelectedRow();
        this.bukuView.getTxtOrderId().setText(String.valueOf(this.bukuView.getTblBuku().getValueAt(index, 0)));
        this.bukuView.getTxtCustomer().setText(String.valueOf(this.bukuView.getTblBuku().getValueAt(index, 1)));
    }
}
