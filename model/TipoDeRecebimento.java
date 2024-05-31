package view;

import java.util.Scanner;

/**
 * Esta classe representa um tipo de recebimento.
 * Ela fornece métodos para criar e gerenciar tipos de recebimentos.
 */
public class TipoDeRecebimento {

  private int id;
  private String nome;


  Scanner teclado = new Scanner(System.in);

  /**
   * Construtor padrão para a classe TipoDeRecebimento.
   */
  public TipoDeRecebimento() {
  }

  /**
   * Construtor para a classe TipoDeRecebimento.
   * @param id O ID do tipo de recebimento.
   * @param nome O nome do tipo de recebimento.
   * @param credor O credor do tipo de recebimento.
   */
  public TipoDeRecebimento(int id, String nome, Credor credor) {
    this.id = id;
    this.nome = nome;

  }

  /**
   * Construtor para a classe TipoDeRecebimento.
   * @param id O ID do tipo de recebimento.
   * @param nome O nome do tipo de recebimento.
   */
  public TipoDeRecebimento(int id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  /**
   * Esse método é usado para obter (get) a ID do tipo de recebimento.
   * @return O ID do tipo de recebimento.
   */
  public int getId() {
    return id;
  }

  /**
   * Esse método é usado para definir (set) a ID do tipo de recebimento.
   * @param id O ID do tipo de recebimento.
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Esse método é usado para obter (get) o nome do tipo de recebimento.
   * @return O nome do tipo de recebimento.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Esse método é usado para definir (set) o nome do tipo de recebimento.
   * @param nome O nome do tipo de recebimento.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Esse método é usado para registrar um tipo de recebimento.
   */
  public void cadastrar()
  {
    System.out.println("Informe o ID do tipo de Recebimento: ");
    id = teclado.nextInt();
    System.out.println("Informe o tipo de Recebimento: ");
    nome = teclado.nextLine();
    teclado.nextLine();
     }

  /**
   * Esse método é usado para obter uma representação de string do tipo de recebimento.
   * @return Uma representação em string do tipo de recibo.
   */
  @Override
  public String toString() {
    return "Tipo de Recebimento: " + getNome();
  }

  }
