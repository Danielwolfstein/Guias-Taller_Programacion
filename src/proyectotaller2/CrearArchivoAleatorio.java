package proyectotaller2;

// Fig. 17.13: CrearArchivoAleatorio.java
// Crea un archivo de acceso aleatorio, escribiendo 100 registros vac�os en el disco.
import java.io.*;
import javax.swing.*;

//import com.deitel.cpej5.cap17.RegistroCuentasAccesoAleatorio;

public class CrearArchivoAleatorio {
    
    private static final int NUMERO_REGISTROS = 100;

   // permitir al usuario seleccionar el archivo a abrir
   private void crearArchivo()
   {
      // mostrar cuadro de di�logo para que el usuario pueda seleccionar el archivo
      JFileChooser selectorArchivo = new JFileChooser();
      selectorArchivo.setFileSelectionMode( JFileChooser.FILES_ONLY );

      int resultado = selectorArchivo.showSaveDialog( null );
   
      // si el usuario hizo clic en el bot�n Cancelar del cuadro de di�logo, regresar
      if ( resultado == JFileChooser.CANCEL_OPTION )
         return;

      // obtener el archivo seleccionado
      File nombreArchivo = selectorArchivo.getSelectedFile(); 

      // mostrar error si el nombre del archivo es inv�lido
      if ( nombreArchivo == null || nombreArchivo.getName().equals( "" ) )
         JOptionPane.showMessageDialog( null, "Nombre de archivo incorrecto", 
            "Nombre de archivo incorrecto", JOptionPane.ERROR_MESSAGE );

      else {

         // abrir el archivo
         try {           
            RandomAccessFile archivo = 
               new RandomAccessFile( nombreArchivo, "rw" );

            RegistroCuentasAccesoAleatorio registroEnBlanco = 
               new RegistroCuentasAccesoAleatorio();

            // escribir 100 registros en blanco
            for ( int cuenta = 0; cuenta < NUMERO_REGISTROS; cuenta++ )
               registroEnBlanco.escribir( archivo );

            archivo.close(); // cerrar el archivo

            // mostrar mensaje indicando que el archivo se cre�
            JOptionPane.showMessageDialog( null, "Se cre� el archivo " + 
               nombreArchivo, "Estado", JOptionPane.INFORMATION_MESSAGE );

            System.exit( 0 );  // terminar el programa

         } // fin del bloque try

         // procesar excepciones durante operaciones de apertura, escritura o cierre del archivo
         catch ( IOException excepcionES ) {
            JOptionPane.showMessageDialog( null, "Error al procesar el archivo",
               "Error al procesar el archivo", JOptionPane.ERROR_MESSAGE );

            System.exit( 1 );
         }

      } // fin de instrucci�n else

   } // fin del m�todo crearArchivo

   public static void main( String args[] )
   {
      CrearArchivoAleatorio aplicacion = new CrearArchivoAleatorio();
      aplicacion.crearArchivo();
   }   

} // fin de la clase CrearArchivoAleatorio


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
