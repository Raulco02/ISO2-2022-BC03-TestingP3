package ISOFT2.Pr03;

//import java.util.InputMismatchException;
//import java.util.Scanner;

public class Cliente {
		//static Scanner sn = new Scanner(System.in);
	
        protected int edad;
        protected boolean estudiando;
        protected boolean casaPadres;

        public Cliente(int edad, boolean estudiando, boolean casaPadres) throws ErrorException {
            this.setEdad(edad);
            this.setEstudiando(estudiando);
            this.setCasaPadres(casaPadres);
            
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) throws ErrorException {
            
            if (edad > 0 && edad < 120 ) {
                this.edad = edad;
            } else {
                throw new ErrorException("No has introducido una edad válida.");
            }

            
        }

        public boolean isEstudiando() {
            return estudiando;
        }

        public void setEstudiando(boolean estudiando) {
            this.estudiando = estudiando;
        }

        public boolean isCasaPadres() {
            return casaPadres;
        }

        public void setCasaPadres(boolean casaPadres) {
            this.casaPadres = casaPadres;
        }
        
        /*
        static Cliente crearCliente() throws ErrorException{

            Cliente c1 = null;
            int edad = 0;

            try {
                System.out.println("Dime una edad");
                edad = sn.nextInt();
                System.out.println("¿Estudias? (true or false)");
                boolean estudiar = sn.nextBoolean();
                System.out.println("¿Vives con tus padres? (true or false");
                boolean padres = sn.nextBoolean();
                c1 = new Cliente(edad, estudiar, padres);

            } catch (InputMismatchException e){
                System.out.println("No has introducido un valor válido");
            }
                
           
            

            return c1;
        }
		*/
        
        public String asignarCuenta() 
        {
            String cuenta = "";
            try {
                if (getEdad() < 18 && isEstudiando() && isCasaPadres())
            {
                cuenta = "Cuenta confort";
            }
            if (getEdad() < 25 && getEdad() >= 18 && isEstudiando() && !isCasaPadres())
            {
                cuenta = "Cuenta Vamos que tu puedes";
            }
            if (getEdad() >= 18 && getEdad() < 25 && !isEstudiando() && isCasaPadres()){
                cuenta = "Cuenta Ahorra ahora que puedes";
            } else if (getEdad() > 18 && !isEstudiando() && !isCasaPadres()){
                cuenta = "Cuenta Saltando del nido";
            } 
            if (getEdad() >= 25 && !isEstudiando() && isCasaPadres()){
                cuenta = "Cuenta Independizate que va siendo hora";
            }
            if (getEdad() >= 25 && !isEstudiando() && !isCasaPadres()) {
                cuenta = "Cuenta Bienvenido a la vida adulta";
            }
            if (cuenta == "")
            {
                cuenta = "No hay ninguna cuenta para ti :(";
            }



            
            } catch (NullPointerException e){
                System.out.println("No se puede crear el cliente con datos no válidos.");

            }
            return cuenta;
        }

        

       @SuppressWarnings("serial")
	class ErrorException extends Exception{
            public ErrorException(String msg){
                super(msg);
            }
       } 

}
