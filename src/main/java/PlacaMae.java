public class PlacaMae extends ItemPc {

    private static PlacaMae placaMae = new PlacaMae();

    private PlacaMae() {};

    public static PlacaMae getInstancia() {
        return placaMae;
    }
}
