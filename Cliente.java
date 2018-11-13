
package jrmi;

import java.rmi.Naming;
import java.util.Scanner;


public class Cliente {
    
    public static void main(String[] args) throws Exception {
        InterfaceRMI objr=(InterfaceRMI) Naming.lookup("//10.117.14.114/obj");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println(objr.cump(nome));
    }
}
