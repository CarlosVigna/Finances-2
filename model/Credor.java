package view;

import java.util.Scanner;

public class Credor {

  private int id;
  private String nome;
  private String telefone;

  Scanner teclado = new Scanner(System.in);
  
  public Credor () { };

  public Credor(int id, String nome, String telefone) {
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
    System.out.println("Informe o nome do Credor: ");
    nome = teclado.nextLine();
    System.out.println("Informe o telefone do Credor: ");
    telefone = teclado.nextLine();

  }

  @Override
  public String toString() {
    return "Credor: " + getNome();
  }


  public void imprimirLista()
  {

  }


}
