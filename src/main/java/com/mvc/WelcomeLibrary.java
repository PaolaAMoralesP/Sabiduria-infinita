package com.mvc;


public class WelcomeLibrary {
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";

    public static void printWelcomeMessage() {
        String asciiArt =  ANSI_CYAN  + """
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
     Sumérgete en historias, conocimientos y aventuras que cambiarán tu mundo.
══════════════════════════════════════════════════════════════════════════════
""" + ANSI_RESET;

    System.out.println(asciiArt);
    System.out.println(welcomeMessage);
    }
}
