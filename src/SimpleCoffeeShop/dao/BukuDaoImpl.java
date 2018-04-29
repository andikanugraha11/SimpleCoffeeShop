
package SimpleCoffeeShop.dao;

import SimpleCoffeeShop.model.Buku;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BukuDaoImpl implements BukuDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveBuku(Buku buku) {
        sessionFactory.getCurrentSession().save(buku);
    }

    @Override
    public List<Buku> getDaftarBuku() {
        return sessionFactory.getCurrentSession().createCriteria(Buku.class).list();
    }

    @Override
    public void updateBuku(Buku buku) {
        sessionFactory.getCurrentSession().update(buku);
        
    }

    @Override
    public void deleteBuku(Buku buku) {
        sessionFactory.getCurrentSession().delete(buku);
    }
    
}
