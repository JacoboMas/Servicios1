
package Servicios1ª;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MetodosInetAddress {

    public static void main(String[] args) {
        InetAddress dir = null;
        System.out.println("==============================");
        System.out.println("SALIDA PARA LOCALHOST");
        try {
            // LOCALHOST de mi equipo

            dir = InetAddress.getByName("EQUIPO-1406");
            pruebaMetodos(dir);//

            // URL www.google.es
            System.out.println("=============================");
            System.out.println("SALIDA PARA UNA URL");
            dir = InetAddress.getByName("www.cebem.net");
            pruebaMetodos(dir);

            // Array de tipo inetAddress con todas las direcciones IP
            // Asignadas a google.es
            System.out.println("\tDIRRECIONES IP PARA: " + dir.getHostAddress());
            InetAddress[] direcciones = InetAddress.getAllByName(dir.getHostName());
            for (int i = 0; i < direcciones.length; i++)
                System.out.println("\t\t" + direcciones[i].toString());

            System.out.println("========================================");
        } catch (UnknownHostException e1) {
            e1.printStackTrace();
        }
    }// main
     //

    private static void pruebaMetodos(InetAddress dir) {

        System.out.println("\tMetodo getByName(): " + dir);
        InetAddress dir2;
        try {
            dir2 = InetAddress.getLocalHost();
            System.out.println("\tMetodo getLocalHost(): " + dir2);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        // USAMOS METODOS DE LA CLASE
        System.out.println("\tMetodo getHostName(): " + dir.getHostName());
        System.out.println("\tMetodo getHostAddress(): " + dir.getHostAddress());
        System.out.println("\tMetodo toString(): " + dir.toString());
        System.out.println("\tMetodo getCanonicalHostName(): " + dir.getCanonicalHostName());
    }// pruebaMetodos
}