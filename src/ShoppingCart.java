import java.util.HashMap;

public class ShoppingCart {
    private HashMap<String, Integer> cart;
    private HashMap<String, Double> prices;

    public ShoppingCart(HashMap<String, Integer> cart, HashMap<String, Double> prices) {
        this.cart = cart;
        this.prices = prices;

        this . prices . put(" manzana ", 0.50) ;
        this . prices . put(" platano ", 0.30) ;
        this . prices . put(" naranja ", 0.60) ;
        this . prices . put(" leche ", 2.50) ;
        this . prices . put(" pan", 1.50) ;
    }

    public void addProduct(String prod, int cant){
        prod = prod.toLowerCase();
        if (prices.containsKey(prod)){
            if (cart.containsKey(prod)){
                cart.put(prod, cart.get(prod) + cant);
            }else{
                cart.put(prod, cant);
            }
        }else{
            System.out.println("El producto " + prod + " no existe");
        }
    }


}
