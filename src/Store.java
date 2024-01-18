import com.workintech.products.Bread;
import com.workintech.products.Chocolate;
import com.workintech.products.Coke;
import com.workintech.products.ProductForSale;

public class Store {
    public static void main(String[] args) {
        Chocolate chocolate=new Chocolate("bitter",15,"includes %60 cacao",60);
        Coke coke=new Coke("zero",20,"no sugar",0);
        Bread bread=new Bread("whole wheat",10,"whole wheated bread",200);
        ProductForSale[] products=new ProductForSale[]{chocolate,coke,bread};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
for(ProductForSale product:products){
    product.showDetails();
}
    }
}