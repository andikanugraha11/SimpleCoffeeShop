
package SimpleCoffeeShop.config;


import SimpleCoffeeShop.model.Coffee;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class CoffeeTableModel extends AbstractTableModel{

    private List<Coffee> daftarBuku = new ArrayList<>();
    private final String HEADER[] = {"Order Id", "Customer", "Order", "Style","Price"};
    
    public CoffeeTableModel(List<Coffee> daftarBuku){
        this.daftarBuku = daftarBuku;
    }
    
    @Override
    public int getRowCount() {
        return daftarBuku.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return HEADER[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Coffee buku = daftarBuku.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return buku.getOrderId();
            case 1:
                return buku.getCustomer();
            case 2:
                return buku.getOrder();
            case 3:
                return buku.getStyle();
            case 4:
                return buku.getPrice();
            default:
                return null;
            
        }
    }
    
}
