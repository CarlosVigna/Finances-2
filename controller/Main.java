package controller;

import view.Controlador;
import view.Menu;

public class Main {
    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Menu menu = new Menu(controlador);
        menu.exibirMenuPrincipal();
    }
}