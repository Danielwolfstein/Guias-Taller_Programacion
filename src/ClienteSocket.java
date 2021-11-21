
import java.io.*;
import java.net.Socket;

public class ClienteSocket {

    public static void main(String[] args) {
        Socket s = null;
        PrintWriter textoAlServidor;

        BufferedReader textoDelTeclado;

        DataInputStream textoDelServidor;
        String tecleado;

        try{
            s=new Socket("127.0.0.1",5432);
            
            System.out.println("Conectado al Servidor");
         textoDelTeclado=new BufferedReader(new InputStreamReader(System.in));
        textoAlServidor=new PrintWriter(s.getOutputStream(),true);
        textoDelServidor=new DataInputStream(s.getInputStream());
       int cantidad=1;
        do{     
            System.out.println("Servidor Listo,Digite el numero "+cantidad+" = ");
         
            
        tecleado = textoDelTeclado.readLine();
        textoAlServidor.println(tecleado);
            System.out.println(textoDelServidor.readUTF());
       cantidad++;
 
   
        
        }while(cantidad<=10);
            System.out.println(textoDelServidor.readUTF());
              System.out.println(textoDelServidor.readUTF());
              System.out.println(textoDelServidor.readUTF());
              textoDelServidor.close();
              textoDelTeclado.close();
              textoAlServidor.close();
              s.close();
        }       
        catch(IOException e){
            e.printStackTrace();
        
        }
       
       
    
    }
}
    

