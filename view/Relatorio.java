package view;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Relatorio {
    private ContaMovimento contaMovimento;
    private Scanner teclado = new Scanner(System.in);
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Relatorio(ContaMovimento contaMovimento) {
        this.contaMovimento = contaMovimento;
    }

//    public void exibirSaldo() {
//        contaMovimento.calcularSaldoLiquido();
//    }
}