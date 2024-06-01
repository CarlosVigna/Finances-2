package view;
import java.util.InputMismatchException;

import java.util.Scanner;


/**
 * Essa classe representa um menu para interagir com a classe Controlador.
 * Ela fornece métodos para exibir o menu principal e o menu de relatório.
 */
public class Menu {
    private Scanner teclado = new Scanner(System.in);
    private Controlador controlador;

    /**
     * Construtor da classe Menu.
     * @param controlador Uma instância da classe Controlador.
     */
    public Menu(Controlador controlador) {

        this.controlador = controlador;
    }

    /**
     * Esse método é usado para exibir o menu principal e tratar a entrada do usuário.
     */
    public void exibirMenuPrincipal() {
        int escolha = 0;
        do {
            System.out.println("\nEscolha uma das opções abaixo:");
            System.out.println("1 - Cadastrar um novo Credor");
            System.out.println("2 - Cadastrar tipo de Recebimento");
            System.out.println("3 - Cadastrar Título à Receber");
            System.out.println("4 - Cadastrar novo Fornecedor");
            System.out.println("5 - Cadastrar tipo de Despesa");
            System.out.println("6 - Cadastrar Título à Pagar");
            System.out.println("7 - Lançar um Recebimento");
            System.out.println("8 - Lançar um Pagamento");
            System.out.println("9 - Gerar Relatório");
            System.out.println("10 - Sair");

            System.out.print("\nDigite aqui a sua opção: ");

            try {
                escolha = teclado.nextInt();
                teclado.nextLine();

                switch (escolha) {
                    case 1:
                        controlador.cadastrarCredor();
                        break;
                    case 2:
                        controlador.cadastrarTipoDeRecebimento();
                        break;
                    case 3:
                        controlador.cadastrarTituloReceber();
                        break;
                    case 4:
                        controlador.cadastrarFornecedor();
                        break;
                    case 5:
                        controlador.cadastrarTipoDeDespesa();
                        break;
                    case 6:
                        controlador.cadastrarTituloPagar();
                        break;
                    case 7:
                        controlador.lancarRecebimento();
                        break;

                    case 8:
                        //controlador.lancarPagamento();
                        break;

                    case 9:
                        exibirMenuRelatorio();
                        break;
                    case 10:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                teclado.next();
            }
        } while (escolha != 10);
    }

    /**
     * Esse método é usado para exibir o menu do relatório e tratar a entrada do usuário.
     */
    private void exibirMenuRelatorio() {
        int escolha;
        do {
            System.out.println("\nEscolha o relatório que deseja gerar:");
            //System.out.println("1 - Relatório de Pagamentos por Período");
           // System.out.println("2 - Relatório de Recebimentos por Período");
            System.out.println("3 - Saldo Atual");
            System.out.println("4 - Voltar ao Menu Principal");

            System.out.print("\nDigite aqui a sua opção: ");

            try {
                escolha = teclado.nextInt();
                teclado.nextLine();
                switch (escolha) {
//                    case 1:
//                        controlador.gerarRelatorioDespesasPorPeriodo();
//                        break;
//                    case 2:
//                        controlador.gerarRelatorioRecebimentosPorPeriodo();
//                        break;
                    case 3:
                        controlador.exibirSaldo();
                        break;
                    case 4:
                        return; // Volta pro menu principal
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                teclado.next();
            }
        } while (true);
    }
}