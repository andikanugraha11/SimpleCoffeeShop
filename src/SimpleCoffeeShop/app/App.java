package SimpleCoffeeShop.app;

import SimpleCoffeeShop.model.Buku;
import SimpleCoffeeShop.service.BukuService;
import SimpleCoffeeShop.view.BukuView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private static ApplicationContext applicationContext;
    public static void main(String[] args){
        applicationContext= new ClassPathXmlApplicationContext("spring-configuration.xml");
        new BukuView().setVisible(true);
    }
    
    public static BukuService getBukuService(){
        return (BukuService) applicationContext.getBean("BukuService");
    }
}
