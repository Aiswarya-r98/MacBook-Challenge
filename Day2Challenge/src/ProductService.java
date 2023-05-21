import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public List<Product> getAllProductsByName(String name) {
        return productList.stream().filter(product -> product.getName().equals(name)).collect(Collectors.toList());
    }

    public List<Product> getAllProductsContainsName(String name) {
        return productList.stream().filter(product -> product.getName().contains(name)).collect(Collectors.toList());
    }

    public List<Product> getAllProductsOutOfWarranty() {
        return productList.stream().filter(product -> product.getWarrantyExpriyDate().before(new Date())).collect(Collectors.toList());
    }

    public List<Product> getAllProductsByType(ProductType productType) {
        return productList.stream().filter(product -> product.getType() == productType).collect(Collectors.toList());
    }

    public void deleteProductByName(String name) {
        productList.removeIf(product -> product.getName().contains(name));
    }

    public List<Product> getAllProductsBetweenPriceRange(double priceStartRange, double priceENdRange) {
        return productList.stream().filter(product -> product.getPrice()>=priceStartRange && product.getPrice()<=priceENdRange).collect(Collectors.toList());
    }
}
