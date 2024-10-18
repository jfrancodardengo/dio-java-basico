public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int idade;
        int anoFabricacao = 2024;
        double salario = 5000; /*aqui temos o valor de 5000,00. A representação de valor em milhares, é escrita sem as casas decimais*/
        double salarioMinimo = 1700.50; /* aqui temos o valor de 1700,50. Usa-se as casas decimais representadas pelo ponto(.) */

        final double VALOR_DE_PI = 3.14;
        System.out.print("Valor de pi:" + VALOR_DE_PI);

        /*aqui eu tenho um erro pois a variável é do tipo
        constante e portanto não pode ter seu valor alterado */
        // VALOR_DE_PI = 3.90; 

        idade = 29;
        System.out.print(idade);
    }
}
