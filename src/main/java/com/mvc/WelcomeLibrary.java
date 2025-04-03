package com.mvc;


public class WelcomeLibrary {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void printWelcomeMessage() {
        String asciiArt = ANSI_CYAN + """
                             ______
                            /     /\\
                           /     /##\\
                          /     /####\\
                         /     /######\\
                        /     /########\\
                       /     /##########\\
                      /     /############\\
                     (_____(##############|
                     \\###################|
                      \\##################|
                       \\#################|
                         \\_______________|
""" + ANSI_RESET;

    String welcomeMessage = ANSI_PURPLE + """
══════════════════════════════════════════════════════════════════════════════
          🌟 ¡Bienvenide a la Biblioteca Sabiduría Infinita! 🌟
          Aquí, cada página es una puerta hacia lo desconocido.      
══════════════════════════════════════════════════════════════════════════════
""" + ANSI_RESET;

    System.out.println(asciiArt);
    System.out.println(welcomeMessage);
    }
}
