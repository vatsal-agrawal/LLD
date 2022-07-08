package lld.AmazonWebsite;

import java.util.Date;
import java.util.List;

public class Customer {

    ShoppingCart cart;
    Search searchObj;
    int customerId;

    public ShoppingCart getShoppingCart(int customerId){return null;};
    public void addItemsToShoppingCart(Item item){};
    public void updateItemFromShoppingCart(Item item){};
    public void removeItemFromShoppingCart(Item item){};
}

class Guest extends Customer {

    public Account createNewAccount(){return null;};

}

class User extends Customer {

    Account account;

}

class Seller extends User {

    public void addProduct(Product product){};
}

class Buyer extends User {

    Order orderObj;

    public void addReview(ProductReview review){};
    public OrderStatus placeOrder(ShoppingCart cart){return null;};

}

class Account {

    String name;
    String email;
    String phoneNumber;
    String userName;
    String password;

    List<Address> shippingAdresses;

    AccountStatus accountStatus;
}

class Address {

    int pinCode; //ZipCode
    String street;
    String city;
    String state;
    String country;
}

enum AccountStatus {

    ACTVE,BLOCKED,INACTIVE;
}

class ShoppingCart {

    List<Item> items;
    double cartValue;

    //peripheral apis
    public void addItem(Item item){};
    public void updateItem(Item item){};
    public void deleteItem(Item item){};
    public void checkoutItems(){};
    public List<Item> getItems(){return null;};
    public double getCartValue(){return 0.0;};
}

class Item {

    Product product;
    int qty;

}

class Product {
    // also have list of images
    int productId;
    String productDescription;
    String name;
    ProductCategory productCategory;
    Seller seller;
    double cost;

    List<ProductReview> productReviews;

}

enum ProductCategory {

    ELECTRONICS,FURNITURE,GROCERY,MOBILE;
}

class ProductReview {

    String details;
    Buyer reviewer;
    int rating;

}

class Search {

    public List<Product> searchByName(String name){return null;};
    public List<Product> searchByCategory(ProductCategory productCategory){return null;};
}

class Order {

    int orderId;
    List<Item> orderItem;
    double orderValue;
    Buyer buyer;
    Date orderDate;
    NotificationService notificationService;

    List<OrderLog> orderLog;

    public OrderStatus placeOrder(){return null;};
    public OrderStatus trackOrder(){return null;};
    public void addOrderLogs(){};
    public PaymentStatus makePayment(PaymentType paymentType){return null;};

}

enum OrderStatus {

    PACKED, SHIPPED, ENROUTE, OUT_FOR_DELIVERY, DELIVERED, CANCELLED;
}

enum PaymentStatus {

    SUCCESS, ERROR, CANCELLED, REFUND_INITIATED, REFUNDED;

}

enum PaymentType {

    CREDIT_CARD, DEBIT_CARD, NET_BANKING, UPI;
}

class OrderLog {

    String orderDetail;
    Date createdDate;
    OrderStatus status;
}

class NotificationDomain {

    String notificationID;
    NotificationType notificationType;
    User user;

}

class NotificationService {

    public boolean sendNotification(NotificationDomain notificationDomain) {

        Notification notificationObject;
        MessageAttribute messageAttribute;

        switch(notificationDomain.getNotificationType()) {


            case NotificationType.EMAIL:
                notificationObject = new EmailNotification();
                //from add,to address, data to send
                messageAttribute = new MessageAttribute("abc@abc.com", notificationDomain.getUser().getAccount().getEmail(),"Order Detail ...");
                break;
            case NotificationType.WHATSAPP:
                notificationObject = new WhatsappNotification();
                messageAttribute = new MessageAttribute("9888888888", notificationDomain.getUser().getAccount().getPhoneNumber(),"Order Detail ...");
                break;
            default:
                notificationObject = new SMSNotification();
                messageAttribute = new MessageAttribute("988888888", notificationDomain.getUser().getAccount().getPhoneNumber(),"Order Detail ...");
                break;
        }

        return notificationObject.sendNotification(messageAttribute);
    }

}

class MessageAttribute {

    String to;
    String from;
    String message;

}

interface Notification {

    boolean sendNotification(MessageAttribute meesageAttribute);

}

class EmailNotification implements Notification {

    boolean sendNotification(MessageAttribute meesageAttribute);
}

class WhatsappNotification implements Notification {

    boolean sendNotification(MessageAttribute meesageAttribute);
}

class SMSNotification implements Notification {

    boolean sendNotification(MessageAttribute meesageAttribute);

}
