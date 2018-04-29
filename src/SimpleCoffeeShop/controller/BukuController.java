/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCoffeeShop.controller;

import SimpleCoffeeShop.app.App;
import SimpleCoffeeShop.config.CoffeeTableModel;
import SimpleCoffeeShop.dao.BukuDao;
import SimpleCoffeeShop.model.Buku;
import SimpleCoffeeShop.view.BukuView;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author p14055
 */
public class BukuController {
    private final BukuView bukuView;
    private CoffeeTableModel bukuTableModel;
    private List<Buku> daftarBuku;
    
    public BukuController(BukuView bukuView){
        this.bukuView = bukuView;
    }
    
    public void tampilData(){
        //daftarBuku = bukuDao.getDaftarBuku();
        daftarBuku = App.getBukuService().getDaftarBuku();
        bukuTableModel = new CoffeeTableModel(daftarBuku);
        this.bukuView.getTblBuku().setModel(bukuTableModel);

    }
    
    public void simpanBuku(){
        Buku buku = new Buku();
        
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
        Buku buku = new Buku();
        
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
