import java.util.ArrayList;
import java.util.Date;

public class Evento extends Categoria {
    private String nomeEvento;
    private Date dataEvento;
    private double precoEvento;
    private String descEvento;
    private int qtdeIngresso;

    public Evento(String nomeEvento, Date dataEvento, double precoEvento, String descEvento, int qtdeIngresso, Categoria categoria) {
        super(categoria.getDescCategoria());
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.precoEvento = precoEvento;
        this.descEvento = descEvento;
        this.qtdeIngresso = qtdeIngresso;
    }

    public boolean buscarEvento(Evento evento) {
        return this.nomeEvento.equals(evento.getNomeEvento());
    }

    public void atualizaEstoque(PedidoItem pedidoItem) {
        // Lógica para atualizar o estoque do evento com base no PedidoItem
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public double getPrecoEvento() {
        return precoEvento;
    }

    public void setPrecoEvento(double precoEvento) {
        this.precoEvento = precoEvento;
    }

    public String getDescEvento() {
        return descEvento;
    }

    public void setDescEvento(String descEvento) {
        this.descEvento = descEvento;
    }

    public int getQtdeIngresso() {
        return qtdeIngresso;
    }

    public void setQtdeIngresso(int qtdeIngresso) {
        this.qtdeIngresso = qtdeIngresso;
    }
}