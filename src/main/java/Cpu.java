public class Cpu extends ItemPc {

    private static Cpu cpu = new Cpu();

    private Cpu() {};

    public static Cpu getInstancia() {
        return cpu;
    }
}
