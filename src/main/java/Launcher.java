public class Launcher {
    public static void main(String[] args){
        inicializador();
    }

    private static void inicializador() {
        Tienda tienda;
        GestorTienda gestorTienda;
        Cliente cliente = new Cliente("Jose","Rodriguez","jose.rodriguez@gamil.com","+56912345678","Soltero","Temuco");
        Pantalla pantalla = new Pantalla("Lenovo","modelo1",2022);
        Computador computador = new Computador("Lenovo","8GB","250GB","Intel core i9","Lenovo tab M10",2022,199990,20,"aaa","bbb","ccc",pantalla);
        System.out.println(computador.toString());
    }
}
