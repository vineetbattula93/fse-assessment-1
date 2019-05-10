package TestUtils;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.assessment.model.Product;

public class TestProducts {


    public List<Product> getProducts(){
        List<Product> prods = new ArrayList<Product>();
        prods.add(new Product(1,"Mobile", 10.0,8.0));
        prods.add(new Product(2,"Laptop", 500.0,450.0));
        prods.add(new Product(3,"Tablet", 300.0,250.0));

        return prods;
    }
}
