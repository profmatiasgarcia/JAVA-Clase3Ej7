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

public class TransFechaConStringBuilder {

    public static void main(String[] args) {
        Scanner Dato = new Scanner(System.in);
        System.out.println("ingrese las fecha en formato \"dd de mm de aaaa: \"");
        StringBuilder fecha1 = new StringBuilder(Dato.nextLine());
        int terminaDia = fecha1.indexOf("de") - 2;
        StringBuilder dia = new StringBuilder(fecha1.substring(0, terminaDia + 1));
        int nn = fecha1.indexOf("de", terminaDia + 3);
        StringBuilder mes = new StringBuilder(fecha1.substring(terminaDia + 5, nn - 1));
        int len = fecha1.length();
        StringBuilder anio = new StringBuilder(fecha1.substring(len - 4));
        StringBuilder fecha2 = new StringBuilder(anio);
        fecha2.append("-");
        fecha2.append(mes.toString());
        fecha2.append("-");
        fecha2.append(dia.toString());
        System.out.println("la fecha en formato \"aaaa-mm-dd\" es: ");
        System.out.println(fecha2);

    }
}
