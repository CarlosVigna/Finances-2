package view;

/**
 * Essa classe representa um movimento de conta com o total de recebimentos, pagamentos, créditos e débitos.
 * Ela fornece métodos para adicionar recebimentos, pagamentos, créditos e débitos e para calcular e exibir saldos.
 */
public class ContaMovimento {

  private double totalRecebimentos = 0;
  private double totalPagamentos = 0;
  private double totalCreditos = 0;
  private double totalDebitos = 0;
  private Receber receber;


  /**
   * Construtor padrão para a classe ContaMovimento.
   */
  public ContaMovimento() {
  }

  /**
   * Construtor da classe ContaMovimento.
   *
   * @param totalRecebimentos Total de recebimentos.
   * @param totalPagamentos   Total de pagamentos.
   * @param totalDebitos      Total de débitos.
   * @param totalCreditos     Total de créditos.
   */
  public ContaMovimento(double totalRecebimentos, double totalPagamentos, double totalDebitos, double totalCreditos) {
    this.totalRecebimentos = totalRecebimentos;
    this.totalPagamentos = totalPagamentos;
    this.totalDebitos = totalDebitos;
    this.totalCreditos = totalCreditos;
  }

  /**
   * Esse método é usado para obter o total de recebimentos.
   *
   * @return Total de recebimentos como uma string.
   */
  public String getTotalRecebimentos() {
    return String.valueOf(totalRecebimentos);
  }

  /**
   * Esse método é usado para obter o total de pagamentos.
   *
   * @return Total de pagamentos.
   */
  public double getTotalPagamentos() {
    return totalPagamentos;
  }

  /**
   * Esse método é usado para obter o total de créditos.
   *
   * @return Total de créditos.
   */
  public double getTotalCreditos() {
    return totalCreditos;
  }

  /**
   * Esse método é usado para obter o total de débitos.
   *
   * @return Total de débitos.
   */
  public double getTotalDebitos() {
    return totalDebitos;
  }

  /**
   * Esse método é usado para adicionar um recebimento.
   *
   * @param valor O valor do recebimento.
   */
  public void adicionarRecebimento(double valor) {
    this.totalRecebimentos += valor;
  }

  /**
   * Esse método é usado para adicionar um pagamento.
   *
   * @param valor O valor do pagamento.
   */
  public void adicionarPagamento(double valor) {
    this.totalPagamentos += valor;
  }

  /**
   * Esse método é usado para adicionar um crédito.
   *
   * @param valor O valor do crédito.
   */
  public void adicionarCredito(double valor) {
    this.totalCreditos += valor;
  }

  /**
   * Esse método é usado para adicionar um débito.
   *
   * @param valor O valor do débito.
   */
  public void adicionarDebito(double valor) {
    this.totalDebitos += valor;
  }

//<<<<<<< HEAD
//  @Override
//  public String toString() {
//    return  "TOTAL RECEBIMENTO" + totalRecebimentos;
//  }

//  public void imprimeSaldos() {
//    System.out.println("Total de Recebimentos: " + this.totalRecebimentos);
//    System.out.println("Total de Pagamentos: " + this.totalPagamentos);
//    System.out.println("Total de Créditos: " + this.totalCreditos);
//    System.out.println("Total de Débitos: " + this.totalDebitos);
//    System.out.println("SHOW ");
//  }
//
//  public void calcularSaldoLiquido() {
//    double saldoLiquido = totalCreditos - totalDebitos;
//    System.out.printf("Saldo líquido = R$" + saldoLiquido);
//  }
//
//  public void calcularSaldoBruto(){
//    double saldoBruto = totalRecebimentos - totalPagamentos;
//    System.out.println("Saldo Bruto = R$" + saldoBruto);
//  }
//
//  public void exibeCreditos(){
//    double totalCreditos = getTotalCreditos();


//=======

  /**
   * Esse método é usado para obter uma representação em string da movimentação da conta.
   *
   * @return Uma representação em string da movimentação da conta.
   */
  @Override
  public String toString() {
    return "ContaMovimento{" +
            "totalRecebimentos=" + totalRecebimentos +
            ", totalPagamentos=" + totalPagamentos +
            ", totalCreditos=" + totalCreditos +
            ", totalDebitos=" + totalDebitos +
            '}';
  }

  /**
   * Esse método é usado para imprimir os saldos.
   */
  public void imprimeSaldos() {
    System.out.println("Total de Recebimentos: " + this.totalRecebimentos);
    System.out.println("Total de Pagamentos: " + this.totalPagamentos);
    System.out.println("Total de Créditos: " + this.totalCreditos);
    System.out.println("Total de Débitos: " + this.totalDebitos);
    System.out.println("SHOW ");
  }

  /**
   * Esse método é usado para calcular e imprimir o saldo líquido.
   */
  public void calcularSaldoLiquido() {
    double saldoLiquido = totalCreditos - totalDebitos;
    System.out.printf("Saldo líquido = R$" + saldoLiquido);
  }

  /**
   * Esse método é usado para calcular e imprimir o saldo bruto.
   */
  public void calcularSaldoBruto() {
    double saldoBruto = totalRecebimentos - totalPagamentos;
    System.out.println("Saldo Bruto = R$" + saldoBruto);
  }

  /**
   * Esse método é usado para exibir o total de créditos.
   */
  public void exibeCreditos() {
    double totalCreditos = getTotalCreditos();
  }
}

