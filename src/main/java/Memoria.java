public class Memoria extends ItemPc {

    private static Memoria memoria = new Memoria();

    private Memoria() {};

    public static Memoria getInstancia() {
        return memoria;
    }
}
