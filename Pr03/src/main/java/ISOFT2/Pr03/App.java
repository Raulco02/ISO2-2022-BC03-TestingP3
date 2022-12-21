package ISOFT2.Pr03;

import ISOFT2.Pr03.Cliente.ErrorException;

public class App {
    public static void main(String[] args) throws ErrorException {
        Cliente c1 = null;
        //c1 = Cliente.crearCliente();
        
        try {
        int edad = 18;
        boolean estudiando = false;
        boolean padres = false;
        
        c1 = new Cliente(edad, estudiando, padres);
        
        String cuenta = c1.asignarCuenta();
        System.out.println(cuenta);
        
        }
        catch(ErrorException e){
        	System.out.println(e.getMessage());
        }
    }

}
