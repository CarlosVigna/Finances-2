package view;

import java.util.Scanner;

/**
 * Essa classe representa um tipo de pagamento.
 * Ela fornece métodos para criar e gerenciar tipos de pagamentos.
 */
public class TipoDePagamento {

  private int id;
  private String nome;

  Scanner teclado = new Scanner(System.in);

  /**
   * Construtor padrão para a classe TipoDePagamento.
   */
  public TipoDePagamento() {
  }

  /**
   * Construtor para a classe TipoDePagamento.
   * @param id O ID do tipo de pagamento.
   * @param nome O nome do tipo de pagamento.
   */
  public TipoDePagamento(int id, String nome) {
    this.id = id;
    this.nome = nome;

  }

  /**
   * Esse método é usado para obter (get) o ID do tipo de pagamento.
   * @return O ID do tipo de pagamento.
   */
  public int getId() {
    return id;
  }

  /**
   * Esse método é usado para definir (set) o ID do tipo de pagamento.
   * @param id O ID do tipo de pagamento.
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * Esse método é usado para obter (get) o nome do tipo de pagamento.
   * @return O nome do tipo de pagamento.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Esse método é usado para definir o nome do tipo de pagamento.
   * @param nome O nome do tipo de pagamento.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Esse método é usado para registrar um tipo de pagamento.
   */
  public void cadastrar()
  {
    System.out.println("Informe o ID do tipo de Pagamento: ");
    id = teclado.nextInt();
    System.out.println("Nome do tipo de Pagamento: ");
    nome = teclado.nextLine();
    teclado.nextLine();
  }

  /**
   * Esse método é usado para obter uma representação de string do tipo de pagamento.
   * @return Uma representação em string do tipo de pagamento.
   */
  @Override
  public String toString() {
    return "Tipo de Pagamento: " + getNome();
  }

}

