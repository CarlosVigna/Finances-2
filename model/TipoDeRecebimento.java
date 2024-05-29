package view;

import java.util.Scanner;

public class TipoDeRecebimento {

  private int id;
  private String nome;


  Scanner teclado = new Scanner(System.in);

  public TipoDeRecebimento() {
  }

  public TipoDeRecebimento(int id, String nome, Credor credor) {
    this.id = id;
    this.nome = nome;

  }

  public TipoDeRecebimento(int id, String nome) {
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
    System.out.println("Informe o ID do tipo de Receita: ");
    id = teclado.nextInt();
    System.out.println("Qual é o tipo de Receita: ");
    nome = teclado.nextLine();
    teclado.nextLine();
     }

  @Override
  public String toString() {
    return "Tipo de Recebimento: " + getNome();
  }

  }
