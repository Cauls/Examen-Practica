import java.util.HashMap;

public class ShoppingCart {
    private final HashMap<String, Integer> cart;
    private final HashMap<String, Double> prices;

    public ShoppingCart() {
        this.cart = new HashMap<>();
        this.prices = new HashMap<>();

        this . prices . put("manzana", 0.50) ;
        this . prices . put("platano", 0.30) ;
        this . prices . put("naranja", 0.60) ;
        this . prices . put("leche", 2.50) ;
        this . prices . put("pan", 1.50) ;
    }

    public void addProduct(String prod, int cant){
        prod = prod.toLowerCase();
        if (prices.containsKey(prod)){
            if (cart.containsKey(prod)){
                cart.put(prod, cart.get(prod) + cant);
                System.out.println("Se han añadido " + cant + " unidades del producto " + prod + " (total:" + cart.get(prod)+ ")");
            }else{
                cart.put(prod, cant);
                System.out.println("Se han añadido " + cant + " unidades del producto " + prod);
            }
        }else{
            System.out.println("El producto " + prod + " no existe");
        }
    }

    public void displayCart(){
        double total = 0.00;
        System.out.println("\nContenido del carrito:\n__________________");
        cart.forEach((p,c) -> System.out.println(p + " - Cantidad: " + c + " - Precio: " + (prices.get(p) * c)));
        for(String p : cart.keySet()){
            total+=cart.get(p) * prices.get(p);
        }
        System.out.println("\nTotal: " + total);
    }

    public void updateCantidad(String producto, int cantidad){
        producto = producto.toLowerCase();
        if (cart.containsKey(producto)){
            cart.put(producto, cantidad);
            System.out.println("Actualizada cantidad de " + producto + " a " + cantidad);
        }else{
            System.out.println("No se ha encontrado el producto " + producto);
        }

    }

    public void eliminarProducto(String producto){
        producto = producto.toLowerCase();
        if(cart.containsKey(producto)){
            cart.remove(producto);
            System.out.println("Se ha eliminado " + producto);
        }else{
            System.out.println("Producto " + producto + "no encontrado");
        }
    }
}
