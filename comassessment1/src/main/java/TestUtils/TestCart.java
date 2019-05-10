package TestUtils;
import java.util.ArrayList;
import java.util.List;

import com.vineet.model.Cart;
import com.vineet.model.LineItem;
import com.vineet.model.Product;

public class TestCart {

    private static Cart cart;
    private static ArrayList<LineItem> items = new ArrayList<LineItem>();

    public static List<Product> getProducts(){
        List<Product> prods = new ArrayList<Product>();
        prods.add(new Product(1,"Mobile", 10.0,8.0));
        prods.add(new Product(2,"Laptop", 500.0,450.0));
        prods.add(new Product(3,"Tablet", 300.0,250.0));

        return prods;
    }

    public static Cart getCartItems() {
        Cart cart = new Cart();

        items.add(new LineItem(1,getProducts().get(0),2));
        items.add(new LineItem(2,getProducts().get(1),4));
        items.add(new LineItem(3,getProducts().get(2),1));
        cart.setItems(items);
        return cart;
    }

}