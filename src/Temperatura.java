public class Temperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 18.5;
        double temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;
        int temperaturaInteira = (int) temperaturaFahrenheit;
        System.out.println("Temperatura em Fahrenheit: " + temperaturaInteira);

    }
}
