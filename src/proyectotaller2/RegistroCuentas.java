// Fig. 17.7: RegistroCuentas.java
// Una clase que representa un registro de informaci�n.
package proyectotaller2;

import java.io.Serializable;

public class RegistroCuentas implements Serializable {
   private int cuenta;
   private String primerNombre;
   private String apellidoPaterno;
   private double saldo;
   
   // el constructor sin argumentos llama al otro constructor con valores predeterminados
   public RegistroCuentas() 
   {
      this( 0, "", "", 0.0 );
   }
  
   // inicializar un registro
   public RegistroCuentas( int cta, String nombre, String apellido, double sald )
   {
      establecerCuenta( cta );
      establecerPrimerNombre( nombre );
      establecerApellidoPaterno( apellido );
      establecerSaldo( sald );
   }

   // establecer n�mero de cuenta   
   public void establecerCuenta( int cta )
   {
      cuenta = cta;
   }

   // obtener n�mero de cuenta
   public int obtenerCuenta() 
   { 
      return cuenta; 
   }
   
   // establecer primer nombre   
   public void establecerPrimerNombre( String nombre )
   {
      primerNombre = nombre;
   }

   // obtener primer nombre 
   public String obtenerPrimerNombre() 
   { 
      return primerNombre; 
   }
   
   // establecer apellido paterno
   public void establecerApellidoPaterno( String apellido )
   {
      apellidoPaterno = apellido;
   }

   // obtener apellido paterno
   public String obtenerApellidoPaterno() 
   {
      return apellidoPaterno; 
   }
   
   // establecer saldo  
   public void establecerSaldo( double sald )
   {
      saldo = sald;
   }

   // obtener saldo   
   public double obtenerSaldo() 
   { 
      return saldo; 
   }

} // fin de la clase RegistroCuentas


/**************************************************************************
 * (C) Copyright 1992-2003 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
