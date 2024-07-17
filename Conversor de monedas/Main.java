
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Seleccione una opción de conversión:");
            System.out.println("1. De dolar a peso argentino");
            System.out.println("2. Peso argentino a dolar");
            System.out.println("3. De dolar a real brasilero");
            System.out.println("4. Real brasilero a dolar");
            System.out.println("5. Peso colombiano a dolar");
            System.out.println("6. Dolar a peso colombiano");
            System.out.println("7. Salir");
            System.out.print("Ingrese su opción: ");
            int option = scanner.nextInt();

            try {
                switch (option) {
                    case 1:
                        System.out.print("Ingrese la cantidad en USD: ");
                        double usdToArsAmount = scanner.nextDouble();
                        double usdToArs = CurrencyConverter.convert("USD", "ARS", usdToArsAmount);
                        System.out.println(usdToArsAmount + " USD a ARS: " + usdToArs);
                        break;
                    case 2:
                        System.out.print("Ingrese la cantidad en ARS: ");
                        double arsToUsdAmount = scanner.nextDouble();
                        double arsToUsd = CurrencyConverter.convert("ARS", "USD", arsToUsdAmount);
                        System.out.println(arsToUsdAmount + " ARS a USD: " + arsToUsd);
                        break;
                    case 3:
                        System.out.print("Ingrese la cantidad en USD: ");
                        double usdToBrlAmount = scanner.nextDouble();
                        double usdToBrl = CurrencyConverter.convert("USD", "BRL", usdToBrlAmount);
                        System.out.println(usdToBrlAmount + " USD a BRL: " + usdToBrl);
                        break;
                    case 4:
                        System.out.print("Ingrese la cantidad en BRL: ");
                        double brlToUsdAmount = scanner.nextDouble();
                        double brlToUsd = CurrencyConverter.convert("BRL", "USD", brlToUsdAmount);
                        System.out.println(brlToUsdAmount + " BRL a USD: " + brlToUsd);
                        break;
                    case 5:
                        System.out.print("Ingrese la cantidad en COP: ");
                        double copToUsdAmount = scanner.nextDouble();
                        double copToUsd = CurrencyConverter.convert("COP", "USD", copToUsdAmount);
                        System.out.println(copToUsdAmount + " COP a USD: " + copToUsd);
                        break;
                    case 6:
                        System.out.print("Ingrese la cantidad en USD: ");
                        double usdToCopAmount = scanner.nextDouble();
                        double usdToCop = CurrencyConverter.convert("USD", "COP", usdToCopAmount);
                        System.out.println(usdToCopAmount + " USD a COP: " + usdToCop);
                        break;
                    case 7:
                        exit = true;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, intente nuevamente.");
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error en la conversión de monedas. Por favor, intente nuevamente.");
            }
        }
        scanner.close();
    }
}
