package view;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Comparator.comparing;

/**
 * Esta classe representa um controlador para gerenciamento de contas, credores, fornecedores, pagamentos e recebimentos.
 * Ela fornece métodos para criar e gerenciar essas entidades.
 */
public class Controlador {

    Scanner teclado = new Scanner(System.in);

    private ContaMovimento contaMovimento = new ContaMovimento();
    private Relatorio relatorio = new Relatorio(contaMovimento);

    //Listagem de contas a RECEBER
    ArrayList<Credor> ListaDeCredores = new ArrayList<>();
    ArrayList<TipoDeRecebimento> ListaDeTipoDeRecebimento = new ArrayList<>();
    ArrayList<Receber> listaDeTitulosReceber = new ArrayList<>();
    //Listagem de contas a PAGAR
    ArrayList<Fornecedor> ListaDeFornecedores = new ArrayList<>();
    ArrayList<TipoDePagamento> listaDeTipoDePagamento = new ArrayList<>();
    ArrayList<Pagar> LisaDeTitulosPagar = new ArrayList<>();
    //Listagem de LANÇAMENTOS
    ArrayList<Credito>ListaDeLancamentosCreditos = new ArrayList<>();
    ArrayList<Debito>ListaDeLancamentosDebitos = new ArrayList<>();
    //Instanciação dos objetos de classes (CONTAS a RECEBER)
    Credor credor = new Credor(0, null, null);
    TipoDeRecebimento tipoRecebimento = new TipoDeRecebimento(0,null);

    //Objetos criados para armazenar as informações que vão para o título a receber que está sendo criado no momento
    Credor ultimoCredor = new Credor();
    TipoDeRecebimento ultimoTipoDeRecebimento = new TipoDeRecebimento();
    Receber ultimoRecebimento = new Receber();

    //Instanciação dos objetos de classes (CONTAS a PAGAR)
    Fornecedor fornecedor = new Fornecedor();
    TipoDePagamento tipoDePagamento = new TipoDePagamento();

    //Objetos criados para armazenar as informações que vão para o título a pagar que está sendo criado no momento
    Fornecedor ultimoFornecedor = new Fornecedor();
    TipoDePagamento ultimoTipoDePagamento = new TipoDePagamento();
    Pagar ultimoPagamento = new Pagar();

    /**
     * Esse método é usado para registrar um novo credor.
     */
    public void cadastrarCredor() {

        credor = new Credor();

        credor.cadastrar();
        ListaDeCredores.add(credor);

        System.out.println("*----------------------------*");
        System.out.println("Credor Cadastrado com sucesso! ");
        System.out.println("*----------------------------*");
    }

    /**
     * Esse método é usado para registrar um novo tipo de recebimento.
     */
    public void cadastrarTipoDeRecebimento() {

        tipoRecebimento = new TipoDeRecebimento();

        tipoRecebimento.cadastrar();
        ListaDeTipoDeRecebimento.add(tipoRecebimento);

        System.out.println("*-----------------------------------------*");
        System.out.println("Tipo de Recebimento Cadastrado com sucesso! ");
        System.out.println("*-----------------------------------------*");
    }

    /**
     * Esse método é usado para registrar um novo título para receber.
     */
    public void cadastrarTituloReceber() {
        int escolhaReceber; // variável para essa situação de escolher um cadastrado ou cadastrar um novo.

        Receber tituloReceber = new Receber();

        System.out.println("Vamos Cadastrar um título à Receber!");
        System.out.println("*------------------------------------*");
        System.out.println("1 - Informar um Credor já cadastrado.");
        System.out.println("2 - Cadastrar um novo Credor.");
        System.out.println("Digite aqui a sua opção: ");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

        escolhaReceber = teclado.nextInt();
        teclado.nextLine();

        int escolhaCadastrarCredor = 0;
        // isEmpty é pra ver se tá vazio viu
        if (escolhaReceber == 1) {

            if (ListaDeCredores.isEmpty()) {
                System.out.println("Não há credores cadastrados!! ;(");
                System.out.println("Deseja cadastrar um novo Credor? \n1-Sim, 2-Não");
                System.out.println();
                escolhaCadastrarCredor = teclado.nextInt();

                if (escolhaCadastrarCredor == 1) {
                    credor = new Credor();
                    credor.cadastrar();
                    ListaDeCredores.add(credor);
                    ultimoCredor = ListaDeCredores.getLast();

                } else {
                        if (escolhaCadastrarCredor == 2) {
                        return;
                    }
                }

            } else {
                Collections.sort(ListaDeCredores, comparing(Credor::getNome));
                System.out.println("Escolha um CREDOR da lista:");
                int i = 1;
                for (Credor x : ListaDeCredores) {
                    System.out.println(i + " - " + x);
                    i++;
                }
                //boolean que determina se o do while continua ou nem
                boolean escolhaValida = false;

                //"do" valida a escolha do usuário, caso ele escolha algum número que não esteja na lista, o sistema pede novamente
                do {
                    int credorEscolhido = 0;
                    System.out.print("Digite o número do credor: ");
                    credorEscolhido = teclado.nextInt();
                    teclado.nextLine();

                    //Aqui ele verifica se o número informado é maior que zero e menor que o último da lista
                    if (credorEscolhido > 0 && credorEscolhido <= ListaDeCredores.size()) {
                        Credor credorSelecionado = ListaDeCredores.get(credorEscolhido - 1);
                        System.out.println("Credor selecionado: " + credorSelecionado);
                        //Armazeno o credor selecionado em uma variável que será vinculada ao título a receber
                        ultimoCredor = credorSelecionado;
                        //Validação dessa ação, caso não seja validado ele informa o else e refaz o do while
                        escolhaValida = true;

                    } else {
                        System.out.println("Opção inválida.");
                    }

                } while (!escolhaValida);
            }
        }

        else if (escolhaReceber == 2) {

            credor = new Credor();
            credor.cadastrar();
            ListaDeCredores.add(credor);
            System.out.println("*---------------------------------*");
            System.out.println("Novo CREDOR cadastrado com sucesso!");
            System.out.println("*---------------------------------*");
            ultimoCredor = ListaDeCredores.getLast();

        } else {
            System.out.println("Opção inválida.");
        }

        int escolhaTipoTituloReceber;

        System.out.println("Próximo passo: ");
        System.out.println("1 - Adicionar um Tipo de Recebimento já cadastrado.");
        System.out.println("2 - Cadastrar um novo Tipo de Recebimento.");
        System.out.println("Digite aqui a sua opção: ");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

        escolhaTipoTituloReceber = teclado.nextInt();
        teclado.nextLine();

        int escolhaCadastrarTipoRecebimento = 0;


        if (escolhaReceber == 1) {

            if (ListaDeTipoDeRecebimento.isEmpty()) {
                System.out.println("Não há Tipo de Recebimento cadastrado!!.");
                System.out.println("Deseja cadastrar um novo Tipo de Recebimento? \n1-Sim, 2-Não");
                System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

                escolhaCadastrarTipoRecebimento = teclado.nextInt();

                if (escolhaCadastrarTipoRecebimento == 1) {

                    tipoRecebimento = new TipoDeRecebimento();
                    tipoRecebimento.cadastrar();
                    ListaDeTipoDeRecebimento.add(tipoRecebimento);
                    ultimoTipoDeRecebimento = ListaDeTipoDeRecebimento.getLast();

                    System.out.println("*-----------------------------------------*");
                    System.out.println("Tipo de Recebimento Cadastrado com sucesso! ");
                    System.out.println("*-----------------------------------------*");

                } else {
                    if (escolhaCadastrarTipoRecebimento == 2) {
                        tipoRecebimento.cadastrar();
                    }
                }

            } else {

                boolean escolhaValida = false;
                do {


                    Collections.sort(ListaDeTipoDeRecebimento, comparing(TipoDeRecebimento::getId));
                    System.out.println("Escolha o Tipo Recebimento da lista abaixo:");
                    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                    int i = 1;
                    for (TipoDeRecebimento y : ListaDeTipoDeRecebimento) {
                        System.out.println(i + " - " + y);
                        i++;
                    }

                    System.out.print("Digite o número do Tipo de Recebimento: ");
                    int tipoRecebimentoEscolhido = teclado.nextInt();
                    teclado.nextLine();

                    if (tipoRecebimentoEscolhido > 0 && tipoRecebimentoEscolhido <= ListaDeTipoDeRecebimento.size()) {
                        TipoDeRecebimento tipoRecebimentoSelecionado = ListaDeTipoDeRecebimento.get(tipoRecebimentoEscolhido - 1);
                        System.out.println("Tipo de Recebimento selecionado: " + tipoRecebimentoSelecionado);
                        ultimoTipoDeRecebimento = ListaDeTipoDeRecebimento.get(tipoRecebimentoEscolhido - 1);
                        escolhaValida = true;

                    } else {
                        System.out.println("Opção inválida.");

                    }
                } while (!escolhaValida);
            }
        } else if (escolhaReceber == 2) {

            tipoRecebimento = new TipoDeRecebimento();
            tipoRecebimento.cadastrar();
            ListaDeTipoDeRecebimento.add(tipoRecebimento);
            ultimoTipoDeRecebimento = ListaDeTipoDeRecebimento.getLast();

            System.out.println("*-----------------------------------------*");
            System.out.println("Tipo de Recebimento Cadastrado com sucesso! ");
            System.out.println("*-----------------------------------------*");

        } else {
            System.out.println("Opção inválida.");
        }

        tituloReceber.cadastrar(ultimoCredor, ultimoTipoDeRecebimento);
        listaDeTitulosReceber.add(tituloReceber);


        System.out.println("*--------------------------------------*");
        System.out.println("Título Á RECEBER Cadastrado com sucesso!");
        System.out.println("*--------------------------------------*");

        System.out.println(tituloReceber);
        contaMovimento.adicionarRecebimento(tituloReceber.getValor());

    }

    /**
     * Esse método é usado para registrar um novo fornecedor.
     */
    public void cadastrarFornecedor() {
        fornecedor = new Fornecedor();
        fornecedor.cadastrar();
        ListaDeFornecedores.add(fornecedor);

        System.out.println("*-------------------------------------*");
        System.out.println("Novo Fornecedor Cadastrado com sucesso! ");
        System.out.println("*-------------------------------------*");
    }

    /**
     * Esse método é usado para registrar um novo tipo de despesa.
     */
    public void cadastrarTipoDeDespesa() {
        tipoDePagamento = new TipoDePagamento();
        tipoDePagamento.cadastrar();
        listaDeTipoDePagamento.add(tipoDePagamento);

        System.out.println("*------------------------------------------*");
        System.out.println("Novo Tipo de Despesa cadastrado com sucesso! ");
        System.out.println("*------------------------------------------*");
    }

    /**
     * Esse método é usado para registrar um novo título para pagamento.
     */
    public void cadastrarTituloPagar() {
        int escolhaPagar;

        Pagar tituloPagar = new Pagar();

        System.out.println("Vamos Cadastrar um título à Pagar!");
        System.out.println("*------------------------------------*");
        System.out.println("1 - Informar um Fornecedor já cadastrado.");
        System.out.println("2 - Cadastrar um novo Fornecedor.");
        System.out.println("Digite aqui a sua opção: ");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

        escolhaPagar = teclado.nextInt();
        teclado.nextLine();

        int escolhaCadastrarFornecedor = 0;

        if (escolhaPagar == 1) {

            if (ListaDeFornecedores.isEmpty()) {
                System.out.println("Não há Fornecedores cadastrados!! ;( ");
                System.out.println("Deseja cadastrar um novo Fornecedor? \n1-Sim, 2-Não");
                System.out.println();
                escolhaCadastrarFornecedor = teclado.nextInt();

                if (escolhaCadastrarFornecedor == 1) {

                    fornecedor = new Fornecedor();
                    fornecedor.cadastrar();
                    ListaDeFornecedores.add(fornecedor);
                    ultimoFornecedor = ListaDeFornecedores.getLast();

                    System.out.println("*-------------------------------------*");
                    System.out.println("Novo Fornecedor Cadastrado com sucesso! ");
                    System.out.println("*-------------------------------------*");

                } else {

                    if (escolhaCadastrarFornecedor == 2) {
                        return;
                    }
                }

            } else {
                Collections.sort(ListaDeFornecedores, comparing(Fornecedor::getNome));
                System.out.println("Escolha um Fornecedor da lista abaixo:");
                System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

                int i = 1;
                for (Fornecedor x : ListaDeFornecedores) {
                    System.out.println(i + " - " + x);
                    i++;
                }
                //boolean que determina se o do while continua ou nem
                boolean escolhaValida = false;

                //"do" valida a escolha do usuário, caso ele escolha algum número que não esteja na lista, o sistema pede novamente
                do {
                    int fornecedorEscolhido = 0;
                    System.out.print("Digite o número do Fornecedor: ");
                    fornecedorEscolhido = teclado.nextInt();
                    teclado.nextLine();

                    //Aqui ele verifica se o número informado é maior que zero e menor que o último da lista
                    if (fornecedorEscolhido > 0 && fornecedorEscolhido <= ListaDeFornecedores.size()) {
                        Fornecedor fornecedorSelecionado = ListaDeFornecedores.get(fornecedorEscolhido - 1);
                        System.out.println("Fornecedor selecionado: " + fornecedorSelecionado);
                        //Armazeno o fornecedor selecionado em uma variável que será vinculada ao título à pagar
                        ultimoFornecedor = fornecedorSelecionado;
                        //Validação dessa ação, caso não seja validado ele informa o else e refaz o do while
                        escolhaValida = true;

                    } else {
                        System.out.println("Opção inválida.");
                    }

                } while (!escolhaValida);
            }
        }
        //essa é a opção dois lá do primeiro menu
        else if (escolhaPagar == 2) {

            fornecedor = new Fornecedor();
            fornecedor.cadastrar();
            ListaDeFornecedores.add(fornecedor);
            ultimoFornecedor = ListaDeFornecedores.getLast();

            System.out.println("*-------------------------------------*");
            System.out.println("Novo Fornecedor Cadastrado com sucesso! ");
            System.out.println("*-------------------------------------*");

        } else {
            System.out.println("Opção inválida. ☹\uFE0F ");

        }

        int escolhaTipoTituloPagar; // variável para essa situação de escolher um tipo ja cadastrado ou cadastrar um novo.
        System.out.println("Próximo passo: ");
        System.out.println("1 - Informar um Tipo de Pagamento já cadastrado.");
        System.out.println("2 - Cadastrar um novo Tipo de Pagamento.");
        System.out.println("Digite aqui a sua opção: ");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

        escolhaTipoTituloPagar = teclado.nextInt();
        teclado.nextLine();


        int escolhaCadastrarTipoPagamento = 0;

        // isEmpty é pra ver se tá vazio
        if (escolhaTipoTituloPagar == 1) {

            if (listaDeTipoDePagamento.isEmpty()) {
                System.out.println("Nenhum Tipo de Pagamento cadastrado.");
                System.out.println("Deseja cadastrar um novo Tipo de Pagamento? \n1-Sim, 2-Não");
                escolhaCadastrarTipoPagamento = teclado.nextInt();

                if (escolhaCadastrarTipoPagamento == 1) {
                    tipoDePagamento = new TipoDePagamento();
                    tipoDePagamento.cadastrar();
                    listaDeTipoDePagamento.add(tipoDePagamento);
                    ultimoTipoDePagamento = listaDeTipoDePagamento.getLast();

                    System.out.println("*--------------------------------------------*");
                    System.out.println("Novo Tipo de Pagamento cadastrado com sucesso! ");
                    System.out.println("*--------------------------------------------*");

                } else {
                    if (escolhaCadastrarTipoPagamento == 2) {
                        tipoRecebimento.cadastrar();
                    }
                }

            } else {

                boolean escolhaValida = false;
                do {

                    Collections.sort(listaDeTipoDePagamento, comparing(TipoDePagamento::getId));
                    System.out.println("Escolha um Tipo de Pagamento da lista:");
                    int i = 1;
                    for (TipoDePagamento y : listaDeTipoDePagamento) {
                        System.out.println(i + " - " + y);
                        i++;
                    }

                    System.out.print("Digite o número do Tipo de Pagamento escolhido: ");

                    int tipoPagamentoEscolhido = teclado.nextInt();
                    teclado.nextLine();

                    //Verificar se o ID selecionado está entre o zero e o maior da listagem
                    if (tipoPagamentoEscolhido > 0 && tipoPagamentoEscolhido <= listaDeTipoDePagamento.size()) {
                        TipoDePagamento tipoPagamentoSelecionado = listaDeTipoDePagamento.get(tipoPagamentoEscolhido - 1);
                        System.out.println("Tipo de Pagamento selecionado: " + tipoPagamentoSelecionado);
                        ultimoTipoDePagamento = tipoPagamentoSelecionado;
                        escolhaValida = true;


                    } else {
                        System.out.println("Opção inválida.");

                    }
                } while (!escolhaValida);
            }
        } else if (escolhaPagar == 2) {

            tipoDePagamento = new TipoDePagamento();
            tipoDePagamento.cadastrar();
            listaDeTipoDePagamento.add(tipoDePagamento);
            ultimoTipoDePagamento = listaDeTipoDePagamento.getLast();

            System.out.println("*-------------------------------------*");
            System.out.println("Novo Tipo de Pagamento cadastrado com sucesso! ");
            System.out.println("*-------------------------------------*");

        } else {
            System.out.println("Opção inválida. ☹\uFE0F");
        }

        tituloPagar.cadastrar(ultimoFornecedor, ultimoTipoDePagamento);
        LisaDeTitulosPagar.add(tituloPagar);

        System.out.println("*-------------------------------------*");
        System.out.println("Novo Título à PAGAR cadastrado com sucesso! ");
        System.out.println("*-------------------------------------*");

        System.out.println(tituloPagar);
        contaMovimento.adicionarPagamento(tituloPagar.getValor());
    }

    /**
     * Esse método é usado para registrar um novo recebimento.
     */
    public void lancarRecebimento() {

        System.out.println("Por favor, escolha o título a receber para o qual deseja registrar uma quitação: ");

        Collections.sort(listaDeTitulosReceber, comparing(Receber::getId));

        System.out.println("Títulos À RECEBER: ");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

        int i = 1;
        for (Receber x : listaDeTitulosReceber) {
            System.out.println(i + " - " + x);
            i++;
        }
        //boolean que determina se o do while continua ou nem
        boolean escolhaValida = false;

        //"do" valida a escolha do usuário, caso ele escolha algum número que não esteja na lista, o sistema pede novamente
        do {
            int recebimentoEscolhido = 0;
            System.out.print("Digite o número do Título desejado: ");
            recebimentoEscolhido = teclado.nextInt();
            teclado.nextLine();

            //Aqui ele verifica se o número informado é maior que zero e menor que o último da lista
            if (recebimentoEscolhido > 0 && recebimentoEscolhido <= listaDeTitulosReceber.size()) {
                Receber recebimentoSelecionado = listaDeTitulosReceber.get(recebimentoEscolhido - 1);
                System.out.println("Título selecionado: " + recebimentoSelecionado);
                //Armazeno o credor selecionado em uma variável que será vinculada ao crédito
                ultimoRecebimento = listaDeTitulosReceber.getLast();
                //Validação dessa ação, caso não seja validado ele informa o else e refaz o do while
                escolhaValida = true;

            } else {
                System.out.println("Opção inválida. ☹\uFE0F ");
            }

        } while (!escolhaValida);

        Credito credito = new Credito();
        credito.cadastrar(ultimoRecebimento);
        ListaDeLancamentosCreditos.add(credito);
        System.out.println(credito);
        contaMovimento.adicionarCredito(credito.getValor());
    }

    public void lancarPagamento() {

        System.out.println("Por favor, escolha o título a pagar para o qual deseja registrar um pagamento: ");

        Collections.sort(LisaDeTitulosPagar, comparing(Pagar::getId));

        System.out.println("Títulos À PAGAR: ");
        System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

        int i = 1;
        for (Pagar x : LisaDeTitulosPagar) {
            System.out.println(i + " - " + x);
            i++;
        }
        //boolean que determina se o do while continua ou nem
        boolean escolhaValida = false;

        //"do" valida a escolha do usuário, caso ele escolha algum número que não esteja na lista, o sistema pede novamente
        do {
            int pagamentoEscolhido = 0;
            System.out.print("Digite o número do Título desejado: ");
            pagamentoEscolhido = teclado.nextInt();
            teclado.nextLine();

            //Aqui ele verifica se o número informado é maior que zero e menor que o último da lista
            if (pagamentoEscolhido > 0 && pagamentoEscolhido <= LisaDeTitulosPagar.size()) {
                Pagar pagamentoSelecionado = LisaDeTitulosPagar.get(pagamentoEscolhido - 1);
                System.out.println("Título selecionado: " + pagamentoSelecionado);
                //Armazeno o credor selecionado em uma variável que será vinculada ao crédito
                ultimoPagamento = LisaDeTitulosPagar.getLast();
                //Validação dessa ação, caso não seja validado ele informa o else e refaz o do while
                escolhaValida = true;

            } else {
                System.out.println("Opção inválida. ☹\uFE0F ");
            }

        } while (!escolhaValida);

        Debito debito = new Debito();
        debito.cadastrar(ultimoPagamento);
        ListaDeLancamentosDebitos.add(debito);
        System.out.println(debito);
        contaMovimento.adicionarDebito(debito.getValor());
    }

    public void exibirTotalRecebimento(){
        System.out.println("");
        System.out.println(listaDeTitulosReceber);
        System.out.println("");
        System.out.printf("Total dos títulos a RECEBER R$" + contaMovimento.getTotalRecebimentos());
        System.out.println("---------------------------------------------");
    }

    public void exibirTotalPagamento(){
        System.out.println(LisaDeTitulosPagar);
        System.out.printf("Total dos títulos a PAGAR R$" + contaMovimento.getTotalPagamentos());
    }

    public void exibirSaldoBruto(){
        contaMovimento.calculaSaldoBruto();
        System.out.println("Total de títulos a RECEBER R$" + contaMovimento.getTotalRecebimentos());
        System.out.println("Total de títulos a PAGAR R$" + contaMovimento.getTotalPagamentos());
        System.out.printf("Saldo Bruto R$" + contaMovimento.getSaldoBruto());
    }


    /**
     * Esse método é usado para exibir o saldo da movimentação da conta.
     */

}
