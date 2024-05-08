public class Main {
    public static void main(String[] args) {
        double celsius = 34;
        double fahrenheit = (celsius * 1.8) + 32;
        String mensagem = String.format("A temperatura %f em Celsius equivale a %f Fahrenheit.", celsius, fahrenheit);
        System.out.println(mensagem);

        int fahrenheitInteira = (int) fahrenheit;
        int celsiusInteira = (int) celsius;
        String mensagem2 = String.format("A a conversão da temperatura %d em Celsius equivale a %d Fahrenheit.", celsiusInteira, fahrenheitInteira);
        System.out.println(mensagem2);
    }
}
