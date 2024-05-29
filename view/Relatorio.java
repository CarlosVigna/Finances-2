package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Relatorio {
    private ContaMovimento contaMovimento;
    private Scanner teclado = new Scanner(System.in);
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Relatorio(ContaMovimento contaMovimento) {
        this.contaMovimento = contaMovimento;
    }

//    public void gerarRelatorioDespesasPorPeriodo() {
//        System.out.println("Digite a data de início (dd/MM/yyyy):");
//        LocalDate inicio = LocalDate.parse(teclado.nextLine(), formatter);
//        System.out.println("Digite a data de fim (dd/MM/yyyy):");
//        LocalDate fim = LocalDate.parse(teclado.nextLine(), formatter);
//
//        contaMovimento.gerarRelatorioDespesasPorPeriodo(inicio, fim);
//    }

   // public void gerarRelatorioRecebimentosPorPeriodo() {
//System.out.println("Digite a data de início (dd/MM/yyyy):");
    //    LocalDate inicio = LocalDate.parse(teclado.nextLine(), formatter);
//        System.out.println("Digite a data de fim (dd/MM/yyyy):");
//        LocalDate fim = LocalDate.parse(teclado.nextLine(), formatter);
//
//        contaMovimento.gerarRelatorioRecebimentosPorPeriodo(inicio, fim);
//    }

    public void exibirSaldo() {
        contaMovimento.exibirSaldo();
    }
}