package ordering;

import user.User;
import delivery.Delivery;
import flowerstore.Item;
import lombok.Getter;
import payment.Payment;

import java.util.LinkedList;
import java.util.List;

@Getter
public class Order {
    private List<User> users;
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;
    public Order(){
        this.items = new LinkedList<Item>();
        this.users = new LinkedList<User>();
    }
    public void setPaymentStrategy(Payment payment){
        this.payment = payment;
    }
    public  void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }
    public boolean processOrder(){
        if (this.payment.pay(calculateTotalPrice()) && this.delivery.deliver(items))
            return true;
        return false;
    }

    public  double calculateTotalPrice(){
        double price = 0;
        for (Item item : this.items)
            price +=item.getPrice();
        return price;
    }

    public void addUser(User user){
        this.users.add(user);
    }
    public void removeUser(User user){
        this.users.remove(user);
    }
    public void notifyUsers(){
        for (User user : this.users){
            user.update(true);
        }
    }

    public void order(){
        System.out.println("notifying users...");
        notifyUsers();
    }
}
