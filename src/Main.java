public class Main {
    public static void main(String[] args) {
        CafeFactory factory = new CafeCarameloFactory();
        Cafe cafe = factory.crearCafe();
        System.out.println(cafe.getDescripcion() + " - Precio: $" + cafe.getCosto());
    }
}