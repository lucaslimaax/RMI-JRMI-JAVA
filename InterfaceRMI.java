
package jrmi;

import java.rmi.Remote;


public interface InterfaceRMI extends Remote {
    public String cump(String nome) throws Exception;
    
}
