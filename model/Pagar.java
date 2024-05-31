package view;

import java.util.Date;

/**
 * Esta classe representa uma conta a pagar.
 * Ela se estende da classe TipoDePagamento e fornece métodos para criar e gerenciar pagamentos.
 */
public class Pagar extends TipoDePagamento {

  private int id;
  private String situacao;
  private Date dtVenc;
  private String historico;
  private double valor;
  Fornecedor fornecedor;
  TipoDePagamento tipoDePagamento;

  private static ContaMovimento contaMovimento = new ContaMovimento();

  /**
   * Construtor para a classe Pagar.
   * @param id O ID do pagamento.
   * @param situacao A situação do pagamento.
   * @param dtVenc A data de vencimento do pagamento.
   * @param historico O histórico do pagamento.
   * @param valor O valor do pagamento.
   * @param tipoDePagamento O tipo de pagamento.
   */
  public Pagar(int id, String situacao, Date dtVenc, String historico, double valor, TipoDePagamento tipoDePagamento) {
    this.id = id;
    this.situacao = situacao;
    this.dtVenc = dtVenc;
    this.historico = historico;
    this.valor = valor;

    this.tipoDePagamento = tipoDePagamento;
  }

  /**
   * Construtor padrão para a classe Pagar.
   */
  public Pagar() {

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

  public TipoDePagamento getTipoDeDespesa() {
    return tipoDePagamento;
  }

  public void setTipoDeDespesa(TipoDePagamento tipoDePagamento) {
    this.tipoDePagamento = tipoDePagamento;
  }

  /**
   * Esse método é usado para registrar um pagamento.
   * @param fornecedor O fornecedor do pagamento.
   * @param tipoDePagamento O tipo de pagamento.
   */
  public void cadastrar(Fornecedor fornecedor, TipoDePagamento tipoDePagamento) {

    this.fornecedor = fornecedor;
    this.tipoDePagamento = tipoDePagamento;
    teclado.nextLine();
    System.out.println("Informe o ID do título à PAGAR: ");
    id = teclado.nextInt();
    teclado.nextLine();
    System.out.println("Informe o Histórico: ");
    historico = teclado.nextLine();
    System.out.println("Informe o Valor: ");
    valor = teclado.nextDouble();
    System.out.println("Informe a Data de Vencimento (yyyy-MM-dd): ");
    dtVenc = java.sql.Date.valueOf(teclado.nextLine());
    System.out.println("Informe a Situação: ");
    situacao = teclado.nextLine();

    contaMovimento.adicionarPagamento(valor);
  }

  /**
   * Esse método é usado para obter a movimentação da conta.
   * @return Uma instância da classe ContaMovimento.
   */
  public static ContaMovimento getContaMovimento() {
    return contaMovimento;
  }

  /**
   * Esse método é usado para obter uma representação em string do pagamento.
   * @return Uma representação em string do pagamento.
   */
  public String toString(){
    return "Fornecedor: " + fornecedor.getNome() + "\n Valor do Título: R$" + valor + "\n Data de vencimento: " + dtVenc;
  }


}