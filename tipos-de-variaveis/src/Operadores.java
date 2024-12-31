public class Operadores {
    public static void main(String[] args) {
        //Utilizamos o "equals" nesse caso, para sabermos se o conteúdo(o valor dado a variavel e a nova classe)-
        //- conferem um com outro;
        String nome = "Pedro";
        String nome2 = new String("Pedro");
       
        System.out.println(nome.equals(nome2));
  int numero1 = 1;
  int numero2 = 2;
  boolean simNao = numero1 == numero2;
  
   System.out.println(" Minha condição é: " + simNao);
   String resultado = "";
   if(numero1 < numero2)
   resultado = "Verdadeiro";
   System.out.println(resultado);

    numero1 = 1;
    numero2 = 2;
    simNao = numero1 != numero2;
    System.out.println(" O numeroUm é diferente ao numeroDois? " + simNao);
    
    numero1 = 1;
    numero2 = 2;
    simNao = numero1 < numero2;
    System.out.println(" O numeroUm é menor que o numeroDois? " + simNao);
    


  
        
    }
}
