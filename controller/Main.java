
package view;

/**
 * Essa classe representa o ponto de entrada principal do aplicativo.
 * Ela cria instâncias das classes Controlador e Menu e, em seguida, exibe o menu principal.
 */
public class Main {

    /**
     * O método main é o ponto de entrada do aplicativo.
     * Ele cria uma instância das classes Controlador e Menu,
     * e, em seguida, exibe o menu principal.
     * @param args Uma matriz de argumentos de linha de comando para o aplicativo
     */

    public static void main(String[] args) {
        //Cria uma instância da classe Controlador
        Controlador controlador = new Controlador();

        //Cria uma instância da classe Menu, passando a instância do controlador para ela
        Menu menu = new Menu(controlador);

        //Exibi o menu principal
        menu.exibirMenuPrincipal();
    }
}