
package SimpleCoffeeShop.dao;

import SimpleCoffeeShop.model.Coffee;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoffeeDaoImpl implements CoffeeDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveBuku(Coffee buku) {
        sessionFactory.getCurrentSession().save(buku);
    }

    @Override
    public List<Coffee> getDaftarBuku() {
        return sessionFactory.getCurrentSession().createCriteria(Coffee.class).list();
    }

    @Override
    public void updateBuku(Coffee buku) {
        sessionFactory.getCurrentSession().update(buku);
        
    }

    @Override
    public void deleteBuku(Coffee buku) {
        sessionFactory.getCurrentSession().delete(buku);
    }
    
}
