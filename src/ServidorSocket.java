
import java.io.*;
import java.net.*;

public class ServidorSocket {

    public static void main(String[] args) {
        ServerSocket ss = null;

        Socket s = null;
        BufferedReader textCliente;

        DataOutputStream textEnviar;

        String mensaje;

        int numero, mayor = 0, menor=0, suma=0;

        try {
            ss = new ServerSocket(5432);
            System.out.println("Servidor Escuchando");

            s = ss.accept();

            System.out.println("Ya se conecto el cliente");

            textCliente = new BufferedReader(new InputStreamReader(s.getInputStream()));

            textEnviar = new DataOutputStream(s.getOutputStream());
            int cantidad = 1;
          
            do {
                mensaje = textCliente.readLine();
                numero = Integer.parseInt(mensaje);
                System.out.println("LLego el Numero=" + numero);

                textEnviar.writeUTF("Enviaste:" + numero);

                if (cantidad == 1) {
                    menor = numero;
                    mayor = numero;
                }
                if (numero > mayor) {
                    mayor = numero;
               
                }
                if (numero < menor) {
                    menor = numero;
                
   
                }
              
                cantidad++;
            
            } while (cantidad <= 10);
       
            suma=mayor+menor;
            textEnviar.writeUTF("El Número Mayor es:" + mayor);
            textEnviar.writeUTF("El Número Menor es:" + menor);
            textEnviar.writeUTF("La suma es:  "+ suma );
            System.out.println("Cerrando Conexión");
            textEnviar.close();
            textCliente.close();
            s.close();
            ss.close(); 
               
         

        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }   
        
    }


}
