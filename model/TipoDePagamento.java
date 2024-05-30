package view;

import java.util.Scanner;

public class TipoDePagamento {

  private int id;
  private String nome;

  Scanner teclado = new Scanner(System.in);

  public TipoDePagamento() {
  }

  public TipoDePagamento(int id, String nome) {
    this.id = id;
    this.nome = nome;

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void cadastrar()
  {
    System.out.println("Informe o ID do tipo de Pagamento: ");
    id = teclado.nextInt();
    System.out.println("Nome do tipo de Pagamento: ");
    nome = teclado.nextLine();
    teclado.nextLine();
  }

  @Override
  public String toString() {
    return "Tipo de Pagamento: " + getNome();
  }

}

