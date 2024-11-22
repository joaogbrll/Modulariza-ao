import java.util.ArrayList;
import java.util.List;

public class CarteiraDigital {
    private double saldo;
    private List<String> historicoTransacoes;

    public CarteiraDigital() {
        this.saldo = 0.0;
        this.historicoTransacoes = new ArrayList<>();
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
            historicoTransacoes.add("Adição de saldo: R$" + valor);
            System.out.println("Saldo adicionado com sucesso!");
        } else {
            System.out.println("Valor de adição inválido. O valor deve ser positivo.");
        }
    }

    public void realizarPagamento(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            historicoTransacoes.add("Pagamento realizado: R$" + valor);
            System.out.println("Pagamento realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar o pagamento.");
        }
    }

    public double verificarSaldo() {
        return saldo;
    }

    public void exibirHistorico() {
        if (historicoTransacoes.isEmpty()) {
            System.out.println("Nenhuma transação realizada até o momento.");
        } else {
            System.out.println("Histórico de Transações:");
            for (String transacao : historicoTransacoes) {
                System.out.println(transacao);
            }
        }
    }
}

