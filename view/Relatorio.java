package view;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Essa classe representa um relatório que exibe o saldo da movimentação da conta.
 * Ela fornece métodos para exibir o saldo.
 */
public class Relatorio {
    private ContaMovimento contaMovimento;
    private Scanner teclado = new Scanner(System.in);
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    /**
     * Construtor para a classe Relatorio.
     * @param contaMovimento Uma instância da classe ContaMovimento.
     */
    public Relatorio(ContaMovimento contaMovimento) {
        this.contaMovimento = contaMovimento;
    }

<<<<<<< HEAD
//    public void exibirSaldo() {
//        contaMovimento.calcularSaldoLiquido();
//    }
=======
    /**
     * Esse método é usado para exibir o saldo da movimentação da conta.
     */
    public void exibirSaldo() {
        contaMovimento.calcularSaldoLiquido();
    }
>>>>>>> 38da0cec54b8926f5d9b3b4e100a6e9091da9856
}