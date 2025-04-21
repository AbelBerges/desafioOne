
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Your API Key: 165ddcf7c83d7287f469eea8
        float valorConvertido = 0;
        Scanner ingreso = new Scanner(System.in);
        boolean control = false;
        boolean interno;
        do {
            System.out.println("Sistema de conversión de monedas \n");
            System.out.println("Ingrese el número correspondiente a la operación que desea realizar ");
            System.out.println("1- De Dólar a Peso Argentino ");
            System.out.println("2- De Peso Argentino a Dólar ");
            System.out.println("3- De Dólar a Real Brasileño ");
            System.out.println("4- De Real Brasileño a Dólar ");
            System.out.println("5- De Dólar a Peso Colombiano ");
            System.out.println("6- De Peso Colombiano a Dólar ");
            System.out.println("7- Salir ");
            try {
                System.out.println("Ingrese su opción ");
                int eleccion = ingreso.nextInt();
                switch (eleccion) {
                    case 1: {
                        interno = false;
                        do {
                            try{
                                System.out.println("Ingrese la cantidad de dolares que desea convertir ");
                                float valor = ingreso.nextFloat();
                                if (valor > 0) {
                                    float salida = Conversion.convertir("USD", "ARS", valor);
                                    System.out.println("El valor ingresado " + valor + " [USD] corresponde a un total de " + salida + " [ARS] \n");
                                    interno = true;
                                } else {
                                    System.out.println("El valor ingresado debe ser mayor a 0 ");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Debe ingresar un número válido ");
                            }
                        } while (!interno);
                        break;
                    }
                    case 2: {
                        interno = false;
                        do {
                            try{
                                System.out.println("Ingrese la cantidad de pesos argentinos que desea convertir ");
                                float valor = ingreso.nextFloat();
                                if (valor > 0) {
                                    float salida = Conversion.convertir("ARS", "USD", valor);
                                    System.out.println("El valor ingresado " + valor + " [ARS] corresponde a un total de " + salida + " [USD]\n");
                                    interno = true;
                                } else {
                                    System.out.println("El valor ingresado debe ser mayor a 0 ");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Debe ingresar un número válido ");
                            }
                        } while (!interno);
                        break;
                    }
                    case 3: {
                        interno = false;
                        do {
                            try{
                                System.out.println("Ingrese la cantidad de dolares que desea convertir ");
                                float valor = ingreso.nextFloat();
                                if (valor > 0) {
                                    float salida = Conversion.convertir("USD", "BRL", valor);
                                    System.out.println("El valor ingresado " + valor + " [USD] corresponde a un total de " + salida + " [BRL]\n");
                                    interno = true;
                                } else {
                                    System.out.println("El valor ingresado debe ser mayor a 0 ");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Debe ingresar un número válido ");
                            }
                        } while (!interno);
                        break;
                    }
                    case 4: {
                        interno = false;
                        do {
                            try{
                                System.out.println("Ingrese la cantidad de reales que desea convertir ");
                                float valor = ingreso.nextFloat();
                                if (valor > 0) {
                                    float salida = Conversion.convertir("BRL", "USD", valor);
                                    System.out.println("El valor ingresado " + valor + " [BRL] corresponde a un total de " + salida + " [USD]\n");
                                    interno = true;
                                } else {
                                    System.out.println("El valor ingresado debe ser mayor a 0 ");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Debe ingresar un número válido ");
                            }
                        } while (!interno);
                        break;
                    }
                    case 5: {
                        interno = false;
                        do {
                            try{
                                System.out.println("Ingrese la cantidad de dolares que desea convertir ");
                                float valor = ingreso.nextFloat();
                                if (valor > 0) {
                                    float salida = Conversion.convertir("USD", "COP", valor);
                                    System.out.println("El valor ingresado " + valor + " [USD] corresponde a un total de " + salida + " [COP]\n");
                                    interno = true;
                                } else {
                                    System.out.println("El valor ingresado debe ser mayor a 0 ");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Debe ingresar un número válido ");
                            }
                        } while (!interno);
                        break;
                    }
                    case 6: {
                        interno = false;
                        do {
                            try{
                                System.out.println("Ingrese la cantidad de pesos colombianos que desea convertir ");
                                float valor = ingreso.nextFloat();
                                if (valor > 0) {
                                    float salida = Conversion.convertir("COP", "USD", valor);
                                    System.out.println("El valor ingresado " + valor + " [COP] corresponde a un total de " + salida + " [USD]\n");
                                    interno = true;
                                } else {
                                    System.out.println("El valor ingresado debe ser mayor a 0 ");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Debe ingresar un número válido ");
                            }
                        } while (!interno);
                    }
                    case 7: {
                        control = true;
                        break;
                    }
                    default:
                        System.out.println("Debe ingresar un número entre 1 y 7");
                }
            } catch (NumberFormatException e){
                System.out.println("Debe ingresar un número entero ");
            }

        } while (!control);
    }
}