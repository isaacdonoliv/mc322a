package pt.c02oo.s02classe.s03lombriga;

public class AppLombriga {

   public static void main(String[] args) {
      Toolkit tk = Toolkit.start();
      
      String lombrigas[] = tk.recuperaLombrigas();
      
      Animacao animacao;
      for (int l = 0; l < lombrigas.length; l++) {
         animacao = new Animacao(lombrigas[l]);
         System.out.println(lombrigas[l]);
         animacao.apresenta();
         tk.gravaPasso("=====");
         for (int i = 0; i < animacao.n; i++)
            animacao.passo();
            tk.gravaPasso(animacao.apresenta());
      }
      
      tk.stop();
   }

}
