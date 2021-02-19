package Clase3Ej7;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
import java.util.Scanner;

public class EjScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String name = sc.nextLine();

        System.out.println("Ingrese su signo del sodiaco: ");
        String zodiac = sc.next();

        System.out.println("Ingrese su peso (kg): ");
        double weight = sc.nextDouble();

        System.out.println("Ingrese su numero de la suerte: ");
        int luckyNum = sc.nextInt();

        System.out.println("Hola, " + name + ".");
        System.out.println("Tu numero de la suerte es el " + luckyNum + ".");
        System.out.println("Tu peso es de " + weight + " kg.");
        System.out.println(zodiac + " es tu signo del zodiaco" + ".");
    }
}
