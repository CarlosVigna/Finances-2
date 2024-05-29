package view;

import java.util.Scanner;

public class Fornecedor {

  private int id;
  private String telefone;
  private String nome;

  Scanner teclado = new Scanner(System.in);

  public Fornecedor() { };

  public Fornecedor(int id, String nome, String telefone) {
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
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

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public void cadastrar()
  {
    System.out.println("Informe o ID: ");
    id = teclado.nextInt();
    teclado.nextLine();
    System.out.println("Informe o nome do Fornecedor: ");
    nome = teclado.nextLine();
    System.out.println("Informe o telefone do Fornecedor: ");
    telefone = teclado.nextLine();

  }

  @Override
  public String toString() {
    return "Fornecedor: " + getNome();
  }

  }

