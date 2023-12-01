import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private Date dataHoraPedido;
    private double precoTotal;
    private int statusPedido;
    private ArrayList<PedidoItem> itensPedido;

    public Pedido(int numeroPedido, Date dataHoraPedido, double precoTotal, int statusPedido) {
        this.numeroPedido = numeroPedido;
        this.dataHoraPedido = dataHoraPedido;
        this.precoTotal = precoTotal;
        this.statusPedido = statusPedido;
        this.itensPedido = new ArrayList<>();
    }

    public boolean consultarPedido(Pedido pedido) {
        return this.numeroPedido == pedido.getNumeroPedido();
    }

    public void inserirItensPedido(PedidoItem item) {
        this.itensPedido.add(item);
    }

    public void excluirItensPedido(PedidoItem item) {
        this.itensPedido.remove(item);
    }

    public double calculaTotalPagar() {
        double total = 0.0;
        for (PedidoItem item : itensPedido) {
            total += item.getPrecoIngresso() * item.getQtdeIngresso();
        }
        return total;
    }

    public void alterarStatus(int novoStatus) {
        this.statusPedido = novoStatus;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getDataHoraPedido() {
        return dataHoraPedido;
    }

    public void setDataHoraPedido(Date dataHoraPedido) {
        this.dataHoraPedido = dataHoraPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public int getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

    public ArrayList<PedidoItem> getItensPedido() {
        return itensPedido;
    }

    public void setItensPedido(ArrayList<PedidoItem> itensPedido) {
        this.itensPedido = itensPedido;
    }
}