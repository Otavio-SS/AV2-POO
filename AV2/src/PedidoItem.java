public class PedidoItem extends Evento {
    private int qtdeIngresso;
    private double precoIngresso;

    public PedidoItem(String nomeEvento, int qtdeIngresso, double precoIngresso, Evento evento) {
        super(nomeEvento, evento.getDataEvento(), evento.getPrecoEvento(), evento.getDescEvento(), qtdeIngresso, evento);
        this.qtdeIngresso = qtdeIngresso;
        this.precoIngresso = precoIngresso;
    }

    @Override
    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    @Override
    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }

    public double getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        this.precoIngresso = precoIngresso;
    }
}