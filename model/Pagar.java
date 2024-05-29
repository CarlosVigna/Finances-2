package view;

import java.util.Date;

public class Pagar extends TipoDeDespesa {

  private int id;
  private String situacao;
  private Date dtVenc;
  private String historico;
  private double valor;
  private double liquidado;
  Fornecedor fornecedor;
  TipoDeDespesa tipoDeDespesa;

  private static ContaMovimento contaMovimento = new ContaMovimento();

  public Pagar(int id, String situacao, Date dtVenc, String historico, double valor, double liquidado, TipoDeDespesa tipoDeDespesa) {
    this.id = id;
    this.situacao = situacao;
    this.dtVenc = dtVenc;
    this.historico = historico;
    this.valor = valor;
    this.liquidado = liquidado;
    this.tipoDeDespesa = tipoDeDespesa;
  }

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

  public double getLiquidado() {
    return liquidado;
  }

  public void setLiquidado(double liquidado) {
    this.liquidado = liquidado;
  }

  public String getSituacao() {
    return situacao;
  }

  public void setSituacao(String situacao) {
    this.situacao = situacao;
  }

  public TipoDeDespesa getTipoDeDespesa() {
    return tipoDeDespesa;
  }

  public void setTipoDeDespesa(TipoDeDespesa tipoDeDespesa) {
    this.tipoDeDespesa = tipoDeDespesa;
  }


  public void cadastrar(Fornecedor fornecedor, TipoDeDespesa tipoDeDespesa) {

    this.fornecedor = fornecedor;
    this.tipoDeDespesa = tipoDeDespesa;
    teclado.nextLine();
    System.out.println("Informe o ID do título à PAGAR: ");
    id = teclado.nextInt();
    teclado.nextLine();
    System.out.println("Informe o Histórico: ");
    historico = teclado.nextLine();
    System.out.println("Informe o Valor: ");
    valor = teclado.nextDouble();
    teclado.nextLine();
    System.out.println("Informe a Data de Vencimento (yyyy-MM-dd): ");
    dtVenc = java.sql.Date.valueOf(teclado.nextLine());
    System.out.println("Informe a Situação: ");
    situacao = teclado.nextLine();
    System.out.println("Informe o Valor Liquidado: ");
    liquidado = teclado.nextDouble();
    teclado.nextLine();

    contaMovimento.adicionarPagamento(valor);
  }

  public static ContaMovimento getContaMovimento() {
    return contaMovimento;
  }


  public String toString()
  {
    return  "Nome do Fornecedor: " + fornecedor.getNome() + " Telefone do Fornecedor: " + fornecedor.getTelefone() + " Tipo de Despesa: "
            + tipoDeDespesa.getNome() +  "Valor do título à PAGAR: " + getValor() + "Data de vencimento: " + getDtVenc() + "Situação: " + getSituacao()
            + "Valor liquidado: " + getLiquidado();
  }


}


