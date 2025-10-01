public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("manzana", 3);
        cart.addProduct("leche", 2);
        cart.addProduct("pan", 1);
        cart.displayCart();
        cart.updateCantidad("manzana", 5);
        cart.eliminarProducto("pan");
        cart.displayCart();
        cart.addProduct("pescado", 3);
        cart.addProduct("naranja", 10);
        cart.displayCart();
    }
}