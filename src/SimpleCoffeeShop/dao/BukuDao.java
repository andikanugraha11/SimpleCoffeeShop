package SimpleCoffeeShop.dao;


import SimpleCoffeeShop.model.Buku;
import java.util.List;


/**
 *
 * @author adrianfaisal
 */
public interface BukuDao {
    public void saveBuku(Buku buku);
    public void deleteBuku(Buku buku);
    public List<Buku> getDaftarBuku();
    public void updateBuku(Buku buku);
}

