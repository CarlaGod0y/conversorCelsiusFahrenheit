public class Main {
    public static void main(String[] args) {
        //Conversor Celsius em Fahrenheit
        double celsius = 34;
        double fahrenheit = (celsius * 1.8) + 32;
        String mensagem = String.format("A temperatura %f em Celsius equivale a %f Fahrenheit.", celsius, fahrenheit);
        System.out.println(mensagem);

        int fahrenheitInteira = (int) fahrenheit;
        int celsiusInteira = (int) celsius;
        String mensagem2 = String.format("A a conversão da temperatura %d em Celsius equivale a %d Fahrenheit.", celsiusInteira, fahrenheitInteira);
        System.out.println(mensagem2);

        //Média de Notas
        double nota1 = 7.4;
        int nota2 = 6;
        double media = (nota1 + nota2) / 2;
        int mediaFinal = (int) media;
        System.out.println("A média do aluno é de: " + mediaFinal);

        //Média de Notas2 (concatenar String com Char)
        char nota3 = 'A';
        String nota4 = "A+";
        String mensagemMedia = ("A média deste aluno é de "+ nota3 + nota4);
        System.out.println(mensagemMedia);

        //Cálculo de Int com Double
        double precoProduto = 23.50;
        int quantidade = 7;
        double valorTotal = precoProduto * quantidade;
        String valorAPagar = ("O valor da compra é de: R$" + valorTotal);
        System.out.println(valorAPagar);

        //Conversor de dólar em reais
        double valorEmDolares = 23.50;
        double precoDolarEmReal = 4.94;
        double conversaoParaReal = valorEmDolares * precoDolarEmReal;
        String valorConvertido = String.format("US$%f em dólares equivale a  R$%f em reais.", valorEmDolares, conversaoParaReal);
        System.out.println(valorConvertido);

        //Desconto de 10%
        double precoOriginal = 57.80;
        double desconto = 0.1;
        double calculoDesconto = (precoOriginal * desconto);
        double valorComDesconto = precoOriginal - calculoDesconto;
        String mensagemDesconto = String.format("O valor do desconto é de R$%f, sendo assim o preço final é de R%f", calculoDesconto, valorComDesconto);
        System.out.println(mensagemDesconto);
    }
}

