package StringBuilder;
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

public class RemoverLetra {

    public static void main(String[] args) {
        Scanner Dato = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        StringBuilder Frase = new StringBuilder(Dato.nextLine());
        Scanner Letra = new Scanner(System.in);
        System.out.println("Ingrese una letra a remover: ");
        StringBuilder Caracter = new StringBuilder(Letra.nextLine());
        int i = 0;
        while (i < Frase.length()) {
            if (Frase.charAt(i) == Caracter.charAt(0)) {
                Frase.deleteCharAt(i);
            } else {
                i++;
            }
        }
        System.out.println("El resultado es: ");
        System.out.println(Frase);
    }
}
