
package jrmi;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor extends UnicastRemoteObject implements InterfaceRMI{
    public static void main(String[] args) {
        try{
            System.setProperty("java.rmi.server.hostname","10.117.14.113");
            LocateRegistry.createRegistry(1099);
            Naming.rebind("//10.117.14.113/obj", new Servidor());
            System.out.println("O servidor está pronto!!");
        
            
        }catch(Exception e){
            System.err.println("Falha ao iniciar o servidor");
        }
    }
    
    public Servidor() throws Exception{
        
    }
    
    @Override
    public String cump(String nome ) throws Exception{
        System.out.println(nome+ "está entrando em contato!");
        return "Olá" + nome + ".Aqui é o servidor!";
    }
}
