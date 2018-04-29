package SimpleCoffeeShop.dao;


import SimpleCoffeeShop.model.Coffee;
import java.util.List;


/**
 *
 * @author adrianfaisal
 */
public interface CoffeeDao {
    public void saveBuku(Coffee buku);
    public void deleteBuku(Coffee buku);
    public List<Coffee> getDaftarBuku();
    public void updateBuku(Coffee buku);
}

