public class TiposDeVariaveis {
    public static void main(String[] args) throws Exception {
        //O tipos de variaveis com numeros são:
        byte idade = 123;
        short ano = 2024;
        int cep = 53375812;// se começar com 0, o tipo de variavel será outro (se torna uma string)
        long cpf = 13112322810L;// se começar com 0, o tipo de variavel será outro (se torna uma string)- 
        //-e deve sempre terminar com "L".
        float pi = 3.14F; // Sempre terminará com "F"
        double salario = 1550.50;// a função double, para determinarmos um numero que esteja an casa dos milhares-
        //-, o ponto será oque determinará tal feito ex: double salario = 2.500(está na casa decimal)-
        // double salario = 2500(está na casa milhar).
        //exemplo de atribuição de valores dentro de outros valores
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        //Usamos o termo "final", escrevemos em caixa alta e colocamos "_" quando quisermos que o - 
        //- valor de uma variavel não seja alterada:
        final double VALOR_DO_DOLAR = 6.0;
        System.out.println("Quanto que Lulinha deixou o valor do dolar?" + VALOR_DO_DOLAR);
    }
}
