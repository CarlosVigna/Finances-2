package view;

import java.util.Date;
import java.util.Scanner;

/**
 * Esta classe representa uma conta a receber.
 * Ela fornece métodos para criar e gerenciar contas a receber.
 */
public class Receber {

    private int id;
    private Date dtVenc;
    private String historico;
    private double valor;
    private String situacao;
    private static double totalAReceber;
    Credor credor;
    TipoDeRecebimento tipoDeRecebimento;

    Scanner teclado = new Scanner(System.in);

    private static ContaMovimento contaMovimento = new ContaMovimento();

    /**
     * Construtor padrão para a classe Receber.
     */
    public Receber() {
    }

    /**
     * Construtor para a classe Receber.
     *
     * @param id                O ID da conta a receber.
     * @param tipoDeRecebimento O tipo de recebimento para a conta a receber.
     * @param situacao          A situação da conta a receber.
     * @param liquidado         O valor liquidado da conta a receber.
     * @param valor             O valor da conta a receber.
     * @param historico         O histórico da conta a receber.
     * @param dtVenc            A data de vencimento da conta a receber.
     */
    public Receber(int id, TipoDeRecebimento tipoDeRecebimento, String situacao, double liquidado, double valor, String historico, Date dtVenc) {
        this.id = id;
        this.tipoDeRecebimento = tipoDeRecebimento;
        this.situacao = situacao;
        this.valor = valor;
        this.historico = historico;
        this.dtVenc = dtVenc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDtVenc() {
        return dtVenc;
    }

    public void setDtVenc(Date dtVenc) {
        this.dtVenc = dtVenc;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public TipoDeRecebimento getTipoDeReceita() {
        return tipoDeRecebimento;
    }

    public void setTipoDeReceita(TipoDeRecebimento tipoDeRecebimento) {
        this.tipoDeRecebimento = tipoDeRecebimento;
    }

    /**
     * Esse método é usado para registrar uma conta a receber.
     *
     * @param credor            O credor da conta a receber.
     * @param tipoDeRecebimento O tipo de recebimento para a conta a receber.
     */
    public void cadastrar(Credor credor, TipoDeRecebimento tipoDeRecebimento) {
        this.credor = credor;
        this.tipoDeRecebimento = tipoDeRecebimento;
        System.out.println("Informe o ID do título a Receber: ");
        id = teclado.nextInt();
        System.out.println("Informe o Histórico: ");
        historico = teclado.nextLine();
        System.out.println("Informe o Valor: ");
        valor = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Informe a Data de Vencimento (yyyy-MM-dd): ");
        dtVenc = java.sql.Date.valueOf(teclado.nextLine());
        System.out.println("Informe a Situação: ");
        situacao = teclado.nextLine();

    }

    /**
     * Esse método é usado para obter uma representação em string da conta a receber.
     *
     * @return Uma representação em string da conta a receber.
     */
    public String toString() {
        return "Credor: " + credor.getNome() + "\n Valor do Título: R$" + valor + "\n Data de vencimento: " + dtVenc;
    }

//<<<<<<< HEAD
//=======

    /**
     * Esse método é usado para obter a movimentação da conta.
     *
     * @return Uma instância da classe ContaMovimento.
     */
    public static ContaMovimento getContaMovimento() {

        return contaMovimento;
    }
}

//>>>>>>> 38da0cec54b8926f5d9b3b4e100a6e9091da9856
//    }




