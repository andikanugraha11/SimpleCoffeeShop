package SimpleCoffeeShop.model;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

import java.io.Serializable;

@Entity
@Table(name = "tbl_order")
public class Coffee implements Serializable{
    
    
    @Column(name = "orderId", length = 13)
    @Id
    private String orderId;
    
    @Column(name = "customer", length = 50)
    private String customer; 
    
    @Column(name = "orderItem", length = 50)
    private String orderItem; 
    
    @Column(name = "style", length = 35)
    private String style;
    
    @Column(name = "price")
    private int price;

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return the orderItem
     */
    public String getOrder() {
        return orderItem;
    }

    /**
     * @param order the orderItem to set
     */
    public void setOrder(String order) {
        this.orderItem = order;
    }

    /**
     * @return the style
     */
    public String getStyle() {
        return style;
    }

    /**
     * @param style the style to set
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    
}
