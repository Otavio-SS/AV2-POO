import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();

        Categoria categoria1 = new Categoria("Esporte");
        Categoria categoria2 = new Categoria("Música");

        // Inserir 5 eventos distintos
        eventos.add(new Evento("Evento1", new Date(), 50.0, "Descrição do Evento 1", 100, categoria1));
        eventos.add(new Evento("Evento2", new Date(), 40.0, "Descrição do Evento 2", 150, categoria2));
        eventos.add(new Evento("Evento3", new Date(), 60.0, "Descrição do Evento 3", 80, categoria1));
        eventos.add(new Evento("Evento4", new Date(), 35.0, "Descrição do Evento 4", 200, categoria2));
        eventos.add(new Evento("Evento5", new Date(), 45.0, "Descrição do Evento 5", 120, categoria1));

        // Inserir 2 pedidos com eventos diferentes
        Pedido pedido1 = new Pedido(1, new Date(), 0.0, 1);
        pedido1.inserirItensPedido(new PedidoItem("Evento1", 2, 50.0, eventos.get(0)));
        pedido1.inserirItensPedido(new PedidoItem("Evento3", 3, 50.0, eventos.get(2)));
        pedido1.inserirItensPedido(new PedidoItem("Evento5", 4, 50.0, eventos.get(4)));
        pedidos.add(pedido1);

        Pedido pedido2 = new Pedido(2, new Date(), 0.0, 1);
        pedido2.inserirItensPedido(new PedidoItem("Evento2", 3, 50.0, eventos.get(1)));
        pedido2.inserirItensPedido(new PedidoItem("Evento4", 4, 50.0, eventos.get(3)));
        pedido2.inserirItensPedido(new PedidoItem("Evento1", 5, 50.0, eventos.get(0)));
        pedidos.add(pedido2);

        // Realizar as validações
        for (Pedido pedido : pedidos) {
            System.out.println("\nPedido: " + pedido.getNumeroPedido());
            for (PedidoItem item : pedido.getItensPedido()) {
                Evento evento = null;
                for (Evento ev : eventos) {
                    if (ev.getNomeEvento().equals(item.getNomeEvento())) {
                        evento = ev;
                        break;
                    }
                }
                if (evento != null) {
                    evento.atualizaEstoque(item);
                    evento.setQtdeIngresso(evento.getQtdeIngresso() - item.getQtdeIngresso());
                } else {
                    System.out.println("PedidoItem não corresponde a um Evento existente: " + item.getNomeEvento());
                }
            }
            pedido.alterarStatus(2);
            double totalPedido = pedido.calculaTotalPagar();
            System.out.println("Valor total a pagar: " + totalPedido);
        }
    }
}