
package Video14EntradaKev;

import java.util.*;

public class Entrada {
    
    public void ingreso(){
        
        Scanner entrada = new Scanner(System.in);
        String nombre;
        
        System.out.println("Tu nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println();
        int edad;
        
        System.out.println("Tu edad: ");
        
        edad= entrada.nextInt();
         System.out.println();
        
        System.out.println("Hola "+ nombre + " el proximo año tendrás " + (edad+1) + " años" );
        
    }    
}
