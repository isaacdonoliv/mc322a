package pt.c02oo.s03relacionamento.s04restaum;

public class AppRestaUm {

   public static void main(String[] args) {
      AppRestaUm.executaJogo(null, null);
   }
   
   public static void executaJogo(String arquivoEntrada, String arquivoSaida) {
      Toolkit tk = Toolkit.start(arquivoEntrada, arquivoSaida);
      
      char board[][] = {
         {' ', ' ', 'P', 'P', 'P', ' ', ' '},
         {' ', ' ', 'P', 'P', 'P', ' ', ' '},
         {'P', 'P', 'P', 'P', 'P', 'P', 'P'},
         {'P', 'P', 'P', '-', 'P', 'P', 'P'},
         {'P', 'P', 'P', 'P', 'P', 'P', 'P'},
         {' ', ' ', 'P', 'P', 'P', ' ', ' '},
         {' ', ' ', 'P', 'P', 'P', ' ', ' '}
      };
      tk.writeBoard("Tabuleiro inicial", board);
      
      Tabuleiro tab = new Tabuleiro(board);
      String commands[] = tk.retrieveCommands();
      String command[] = new String[2];
      String title;
      
      for (int l = 0; l < commands.length; l++) {
    	  command = commands[l].split(":");
    	  tab.mover(command[0], command[1]);
    	  title = String.format("source: %s; target: %s", command[0], command[1]);
    	  tk.writeBoard(title, tab.board);
      }
      
      tk.stop();
   }

}