public class OnlineMarketPlace {

        public static void main(String[] args) {

                // TODO Auto-generated method stub

                Product<BookCategory> book = new Product("25", "Harry Potter", 25.5, new BookCategory("Horror"));
                Discount.getDiscount(book, 5);
                MarketCatalog catalog = new MarketCatalog();
                catalog.add(book);

                // Create a clothes product
                Product<ClothesCategory> shirt = new Product<>("C101", "Cotton Shirt", 1200.0,
                                new ClothesCategory("Men Wear"));

                // Apply discount
                Discount.getDiscount(shirt, 10);

                // Add to catalog

                catalog.add(shirt);

                // Display products
                catalog.display();

        }

}
