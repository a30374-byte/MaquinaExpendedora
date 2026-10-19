import java.util.Scanner;

public class MaquinaExpendedora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        byte programa = 0;
        int conteo = 0;

        double dPrecioChocolatina = 1.50;
        double dPrecioPatatasFritas = 1.20;
        double dPrecioAgua = 0.80;
        double dSaldo = 5;

        while (programa != 5) {
            System.out.println("==== MÁQUINA EXPENDEDORA ====");
            System.out.println("Saldo Actual: " + dSaldo + "€");
            System.out.println("1. Comprar Chocolatinas (" + dPrecioChocolatina + "€)");
            System.out.println("2. Comprar Patatas Fritas (" + dPrecioPatatasFritas + "€)");
            System.out.println("3. Comprar Agua (" + dPrecioAgua + "€)");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Salir");
            programa = sc.nextByte();

            switch (programa){
                case 1:
                    System.out.println("Comprobando saldo...");

                    if (dSaldo < dPrecioChocolatina) {
                        System.out.println("No tienes suficiente saldo");

                        System.out.println("Pulsa ENTER para continuar");
                        scanner.nextLine();
                        break;
                    }
                    else {
                        System.out.println("Comprando chocolatina");

                        dSaldo = dSaldo - dPrecioChocolatina;

                        System.out.println("Compra confirmada!");
                        conteo = conteo + 1;

                        System.out.println("Pulsa ENTER para continuar");
                        scanner.nextLine();

                        if ((conteo % 3) == 0) {
                            System.out.println("¡ENHORABUENA!");
                            System.out.println("Has realizado 3 compras");
                            System.out.println("¡La máquina te regala una botella de agua!");

                            System.out.println("Pulsa ENTER para continuar");
                            scanner.nextLine();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Comprobando saldo...");

                    if (dSaldo < dPrecioPatatasFritas) {
                        System.out.println("No tienes suficiente saldo");

                        System.out.println("Pulsa ENTER para continuar");
                        scanner.nextLine();
                        break;
                    }
                    else {
                        System.out.println("Comprando patatas fritas");

                        dSaldo = dSaldo - dPrecioPatatasFritas;

                        System.out.println("Compra confirmada!");
                        conteo = conteo + 1;

                        System.out.println("Pulsa ENTER para continuar");
                        scanner.nextLine();

                        if ((conteo % 3) == 0) {
                            System.out.println("¡ENHORABUENA!");
                            System.out.println("Has realizado 3 compras");
                            System.out.println("¡La máquina te regala una botella de agua!");

                            System.out.println("Pulsa ENTER para continuar");
                            scanner.nextLine();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Comprobando saldo...");

                    if (dSaldo < dPrecioAgua) {
                        System.out.println("No tienes suficiente saldo");

                        System.out.println("Pulsa ENTER para continuar");
                        scanner.nextLine();
                        break;
                    }
                    else {
                        System.out.println("Comprando agua");

                        dSaldo = dSaldo - dPrecioAgua;

                        System.out.println("Compra confirmada!");
                        conteo = conteo + 1;

                        System.out.println("Pulsa ENTER para continuar");
                        scanner.nextLine();

                        if ((conteo % 3) == 0) {
                            System.out.println("¡ENHORABUENA!");
                            System.out.println("Has realizado 3 compras");
                            System.out.println("¡La máquina te regala una botella de agua!");

                            System.out.println("Pulsa ENTER para continuar");
                            scanner.nextLine();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saldo Actual: " + dSaldo + "€");

                    System.out.println("Pulsa ENTER para continuar");
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Apagando Máquina");
                    break;
                default:
                    System.out.println("Error.");
                    System.out.println("Esa opción no existe.");

                    System.out.println("Pulsa ENTER para continuar");
                    scanner.nextLine();
                    break;
        }

        }
    }
}
