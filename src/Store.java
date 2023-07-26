import com.Workitech.ProductForSale;
import com.Workitech.Bread;
import com.Workitech.Chocolate;
import com.Workitech.Coke;

public class Store {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("Milka", 10, true, "Tasty");
        Bread bread = new Bread("White", 5, true, "The G.O.A.T.");
        Coke coke = new Coke("Coca-Cola", 5, 20, "Gives you cancer");

        ProductForSale[] products = { chocolate, bread, coke };
        listProducts(products);
        /*
         * Output:
         * Class Name: Chocolate
         * Type: Milka
         * Price: 10
         * Is it Dard: true
         * Description: Tasty
         * Class Name: Bread
         * Type: White
         * Price: 5
         * Is it healty: true
         * Description: The G.O.A.T.
         * Class Name: Coke
         * Type: Coca-Cola
         * Price: 5
         * Sugar Per Liter: 20
         * Description: Gives you cancer
         */
    }

    public static void listProducts(ProductForSale[] products) {
        for (int i = 0; i < products.length; i++) {
            products[i].showDetails();
        }
    }
}