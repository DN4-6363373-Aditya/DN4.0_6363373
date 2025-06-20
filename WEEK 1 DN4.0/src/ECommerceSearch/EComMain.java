package ECommerceSearch;


import java.util.Arrays;
import java.util.Comparator;

public class EComMain {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Book", "Education"),
            new Product(4, "Phone", "Electronics")
        };

        
        Product foundLinear = LinSearch.linearSearch(products, "Book");
        System.out.println("Linear Search Result: " + (foundLinear != null ? foundLinear : "Not found"));

      
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

      
        Product foundBinary = BinSearch.binarySearch(products, "Laptop");
        System.out.println("Binary Search Result: " + (foundBinary != null ? foundBinary : "Not found"));
    }
}
