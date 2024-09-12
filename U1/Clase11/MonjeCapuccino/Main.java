//package U1.Clase11.MonjeCapuccino;

public class Main {
    public static void main(String[] args) {
            
        Cafe producto1 = new Cafe("000001", "Juan Valdez", "Cafe de grano Colombia", 12000, 2, "Arabica", "Colombia", "frutal", 5, "fina", "tarrito", 100);
        Cafe producto2 = new Cafe("000002", "Juan Valdez", "Cafe de grano Colombia", 12000, 2, "Arabica", "Colombia", "frutal", 5, "en grano", "tarrito", 100);

        Insumo producto3 = new Insumo("000003", "Cafetera Francesa", "Cafetera Francesa Clasica", 6000, 1, "Cafetera", 1);
        Insumo producto4 = new Insumo("000004", "Cafetera Italiana", "Cafetera Italiana Moka Clasica", 6500, 2, "Cafetera", 1);

        Cliente cliente1 = new Cliente("112345678-9", "Yenifer", "yeni@fe.r", new CarritoCompra());

        cliente1.agregarProductoAlCarrito(producto4);
        cliente1.agregarProductoAlCarrito(producto2);

        cliente1.comprar();

    }
}
