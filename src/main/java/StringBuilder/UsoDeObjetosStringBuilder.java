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
import java.util.*;

public class UsoDeObjetosStringBuilder {

    public static void main(String[] args) {
        Scanner DatoEntrada = new Scanner(System.in);
        StringBuilder mensaje1 = new StringBuilder("Ingrese su nombre: ");
        StringBuilder mensaje2 = new StringBuilder("El nombre ingresado es: '");
        StringBuilder mensaje3 = new StringBuilder("' y la cantidad de caracteres es: ");
        System.out.println(mensaje1);
        StringBuilder nombre = new StringBuilder(DatoEntrada.nextLine());
        int cantCaracteres = nombre.length();
        StringBuilder mensajeFinal = new StringBuilder(mensaje2);
        mensajeFinal.append(nombre);
        mensajeFinal.append(mensaje3);
        mensajeFinal.append(cantCaracteres);
        System.out.println(mensajeFinal);
    }
}
