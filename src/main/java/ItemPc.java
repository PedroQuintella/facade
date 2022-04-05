public abstract class ItemPc {

    private boolean itemComDefeito = false;

    public void setItemComDefeito(boolean itemComDefeito) {
        this.itemComDefeito = itemComDefeito;
    }

    public boolean verificarItemComDefeito() {
        return this.itemComDefeito;
    }
}