package view;

import java.util.Scanner;

/**
 * Esta classe representa um fornecedor.
 * Ela fornece métodos para criar e gerenciar fornecedores.
 */
public class Fornecedor {

  private int id;
  private String telefone;
  private String nome;

  Scanner teclado = new Scanner(System.in);


  /**
   * Construtor padrão para a classe Fornecedor.
   */
  public Fornecedor() { };

  /**
   * Construtor para a classe Fornecedor.
   * @param id A ID do fornecedor.
   * @param nome O nome do fornecedor.
   * @param telefone O número de telefone do fornecedor.
   */
  public Fornecedor(int id, String nome, String telefone) {
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
  }

  /**
   * Esse método é usado para obter (get) a ID do fornecedor.
   * @return A ID do fornecedor.
   */
  public int getId() {
    return id;
  }

  /**
   * Esse método é usado para definir (set) a ID do fornecedor.
   * @param id A ID do fornecedor.
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Esse método é usado para obter (get) o nome do fornecedor.
   * @return O nome do fornecedor.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Esse método é usado para definir (set) o nome do fornecedor.
   * @param nome O nome do fornecedor.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Esse método é usado para obter (get) o número de telefone do fornecedor.
   * @return O número de telefone do fornecedor.
   */
  public String getTelefone() {
    return telefone;
  }

  /**
   * Esse método é usado para definir (set) o número de telefone do fornecedor.
   * @param telefone O número de telefone do fornecedor.
   */
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  /**
   * Esse método é usado para registrar um fornecedor.
   */
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

  /**
   * Esse método é usado para obter uma representação de string do fornecedor.
   * @return Uma representação em string do fornecedor.
   */
  @Override
  public String toString() {
    return "Fornecedor: " + getNome();
  }

  }

