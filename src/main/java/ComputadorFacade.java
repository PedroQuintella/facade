public class ComputadorFacade {

    public static boolean ligarComputador() {
        if (PlacaMae.getInstancia().verificarItemComDefeito()) {
            return false;
        }
        if (Cpu.getInstancia().verificarItemComDefeito()) {
            return false;
        }
        if (DiscoRigido.getInstancia().verificarItemComDefeito()) {
            return false;
        }
        if (Memoria.getInstancia().verificarItemComDefeito()) {
            return false;
        }
        return true;
    }
}
