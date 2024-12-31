public class Operadores {
    public static void main(String[] args) {
        //Simbolo de "="
        String nomeCompleto = "Pedro ";
        int numero = 15;
        double numeroo = 15.8;
        boolean fezOexame = false;
        //A variavel "char", é escrita co uma aspa e apenas um caracter
        char sexo = 'M';
        // Isso serve para criar um novo objeto dentro de uma classe
        Date dataDeNascimento = new Date() ;
        // Simbolos de "+", "/", "-", "*"(soma, divisão, subtração e multiplicação)
        int soma = 12 + 15;
        int subtracao = 22 - 58;
        double multiplicacao = 22.5 * 12;
        double divisao = 25.5 / 12;
        // Serve para mostrar o resto de uma divisão
        int modulo =18 % 3 ;
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+"1"+1;
        
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;
        
        System.out.println(concatenacao);
        
        concatenacao = (1+1+1)+"1";
        
        System.out.println(concatenacao);

    
}
