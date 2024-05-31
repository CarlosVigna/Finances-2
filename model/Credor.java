package view;

import java.util.Scanner;

/**
 * Essa classe representa um credor.
 * Ela fornece métodos para criar e gerenciar credores.
 */
public class Credor {

  private int id;
  private String nome;
  private String telefone;

  Scanner teclado = new Scanner(System.in);

  /**
   * Construtor padrão para a classe Credor.
   */
  public Credor () { };

  /**
   * Construtor para a classe Credor.
   * @param id O ID do credor.
   * @param nome O nome do credor.
   * @param telefone O número de telefone do credor.
   */
  public Credor(int id, String nome, String telefone) {
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
  }

  /**
   * Esse método é usado para obter (get) a ID do credor.
   * @return O ID do credor.
   */
  public int getId() {
    return id;
  }

  /**
   * Esse método é usado para definir (set) a ID do credor.
   * @param id O ID do credor.
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Esse método é usado para obter (get) o nome do credor.
   * @return O nome do credor.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Esse método é usado para definir (set) o nome do credor.
   * @param nome O nome do credor.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Esse método é usado para obter (get) o número de telefone do credor.
   * @return O número de telefone do credor.
   */
  public String getTelefone() {
    return telefone;
  }

  /**
   * Esse método é usado para definir (set) o número de telefone do credor.
   * @param telefone O número de telefone do credor.
   */
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  /**
   * Esse método é usado para registrar um credor.
   */
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

  /**
   * Esse método é usado para obter uma representação em string do credor.
   * @return Uma representação em string do credor.
   */
  @Override
  public String toString() {

    return "Credor: " + getNome();
  }

  /**
   * Esse método é usado para imprimir a lista de credores.
   */
  public void imprimirLista()
  {

  }


}
