
class Product 
{
    int productId;
    String productName;
    double price;

    static int count;

    Product() 
    {
        productName = null;
    }

    Product(int productId, String productName, double price)
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        count++;
    }

    double discount(double price, double discountPercentage) 
    {
        return ((100 - discountPercentage) / 100) * price;
    }

    void displayProductInfo()
    {
        System.out.println("Product Id : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Product Price : " + price);
    }
}

public class Practical2 {
    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 999.99);
        Product product2 = new Product(202, "Smart Phone", 499.95);
        Product product3 = new Product(303, "Tablet", 299.50);
        Product calcDiscount = new Product();
    
        product1.displayProductInfo();
        product2.displayProductInfo();
        product3.displayProductInfo();

        double discountedPrice = calcDiscount.discount(product1.price, 10);
        System.out.println("Discounted Price : " + discountedPrice);

        System.out.println(Product.count);
    }
}