import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductService();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            productService.addProduct(new Product("Epson", 12500.00, ProductType.PRINTER, simpleDateFormat.parse("2024-04-16")));
            productService.addProduct(new Product("Canon PIXMA", 17500.00, ProductType.PRINTER, simpleDateFormat.parse("2024-11-27")));
            productService.addProduct(new Product("HP OfficeJet", 78941.00, ProductType.PRINTER, simpleDateFormat.parse("2023-10-21")));
            productService.addProduct(new Product("iPhone 13 Pro", 160500.00, ProductType.SMARTPHONE, simpleDateFormat.parse("2023-02-15")));
            productService.addProduct(new Product("Samsung Galaxy S21 Ultra", 30500.00, ProductType.SMARTPHONE, simpleDateFormat.parse("2022-04-16")));
            productService.addProduct(new Product("Dell XPS 13", 62500.00, ProductType.LAPTOP, simpleDateFormat.parse("2023-04-16")));
            productService.addProduct(new Product("HP Elitebook", 86500.00, ProductType.LAPTOP, simpleDateFormat.parse("2026-10-17")));
            productService.addProduct(new Product("Apple MacBook Pro", 140500.00, ProductType.LAPTOP, simpleDateFormat.parse("2024-03-01")));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println("################################");
        System.out.println("All Products");
        System.out.println("################################");
        for (Product product : productService.getAllProducts()) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("################################");
        System.out.println("All Products matching the name iPhone 13 Pro");
        System.out.println("################################");
        for (Product product : productService.getAllProductsByName("iPhone 13 Pro")) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("################################");
        System.out.println("All Products containing the name HP");
        System.out.println("################################");
        for (Product product : productService.getAllProductsContainsName("HP")) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("################################");
        System.out.println("All Products out of warranty");
        System.out.println("################################");
        for (Product product : productService.getAllProductsOutOfWarranty()) {
            System.out.println(product);
        }

        System.out.println();
        System.out.println("################################");
        System.out.println("All Products of type laptop");
        System.out.println("################################");
        for (Product product : productService.getAllProductsByType(ProductType.LAPTOP)) {
            System.out.println(product);

        }

        System.out.println();
        System.out.println("################################");
        System.out.println("All Products of type laptop");
        System.out.println("################################");
        for (Product product : productService.getAllProductsBetweenPriceRange(9000.00, 15000.00)) {
            System.out.println(product);

        }

    }
}