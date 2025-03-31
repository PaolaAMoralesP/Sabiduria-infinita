package com.mvc.view;

import java.util.Scanner;

public class MenuView {
    public static void showMenu(BookView bookView) {
    System.out.println(
        "Aquí irá nuestro menú. Seleciona:\n1. Crear un libro\n2. Buscar un libro\n3. Editar un libro\n4. Eliminar un libro\nEscribe tu repsuesta:");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        switch(answer){
            case 1:
                System.out.println("Has elegido la opción 1");
                bookView.createBook();
                break;
            case 2:
                System.out.println("Has elegido la opción 2");
                break;
            case 3:
                System.out.println("Has elegido la opción 3");
                break;
            case 4:
                System.out.println("Has elegido la opción 4");
                break;
            default:
                System.out.println("Error");
        }
        scanner.close();
    //Create, view (+filter/search), edit, delete
    }
}
