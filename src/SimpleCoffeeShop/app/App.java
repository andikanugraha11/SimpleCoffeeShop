package SimpleCoffeeShop.app;

import SimpleCoffeeShop.model.Coffee;
import SimpleCoffeeShop.view.CoffeeView;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import SimpleCoffeeShop.service.CoffeeService;

public class App {
    private static ApplicationContext applicationContext;
    public static void main(String[] args){
        applicationContext= new ClassPathXmlApplicationContext("spring-configuration.xml");
        new CoffeeView().setVisible(true);
    }
    
    public static CoffeeService getBukuService(){
        return (CoffeeService) applicationContext.getBean("BukuService");
    }
}
