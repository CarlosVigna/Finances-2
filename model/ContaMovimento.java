package view;

public class ContaMovimento {

  private double totalRecebimentos = 0;
  private double totalPagamentos = 0;
  private double totalCreditos = 0;
  private double totalDebitos = 0;

  public ContaMovimento() {
  }

  public ContaMovimento(double totalRecebimentos, double totalPagamentos, double totalDebitos, double totalCreditos) {
    this.totalRecebimentos = totalRecebimentos;
    this.totalPagamentos = totalPagamentos;
    this.totalDebitos = totalDebitos;
    this.totalCreditos = totalCreditos;
  }

  public String getTotalRecebimentos() {
    return String.valueOf(totalRecebimentos);
  }

  public double getTotalPagamentos() {
    return totalPagamentos;
  }

  public double getTotalCreditos() {
    return totalCreditos;
  }

  public double getTotalDebitos() {
    return totalDebitos;
  }

  public void adicionarRecebimento(double valor) {
    this.totalRecebimentos += valor;
  }

  public void adicionarPagamento(double valor) {
    this.totalPagamentos += valor;
  }

  public void adicionarCredito(double valor) {
    this.totalCreditos += valor;
  }

  public void adicionarDebito(double valor) {
    this.totalDebitos += valor;
  }

  @Override
  public String toString() {
    return "ContaMovimento{" +
            "totalRecebimentos=" + totalRecebimentos +
            ", totalPagamentos=" + totalPagamentos +
            ", totalCreditos=" + totalCreditos +
            ", totalDebitos=" + totalDebitos +
            '}';
  }

  public void imprimeSaldos() {
    System.out.println("Total de Recebimentos: " + this.totalRecebimentos);
    System.out.println("Total de Pagamentos: " + this.totalPagamentos);
    System.out.println("Total de Créditos: " + this.totalCreditos);
    System.out.println("Total de Débitos: " + this.totalDebitos);
    System.out.println("SHOW ");
  }

  public void calcularSaldoLiquido() {
    double saldoLiquido = totalCreditos - totalDebitos;
    System.out.printf("Saldo líquido = R$" + saldoLiquido);
  }

  public void calcularSaldoBruto(){
    double saldoBruto = totalRecebimentos - totalPagamentos;
    System.out.println("Saldo Bruto = R$" + saldoBruto);
  }

  public void exibeCreditos(){
    double totalCreditos = getTotalCreditos();
  }
}
