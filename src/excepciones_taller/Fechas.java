package excepciones_taller;

import javax.swing.JOptionPane;



/**
 *
 * @author User
 */
public class Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dd = 0, mm=0, aa =0;
       Fecha F =new Fecha();
       do{
           dd = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite Día: "));
           mm= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Mes"));
           do{
                mm= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Año desde 1963:"));
           }while(aa < 1963);
           
           try{
               F.comprobar(dd, mm, aa);
           }
           catch(ExceptoFecha e){
               JOptionPane.showMessageDialog(null, e.getMessage());
               dd=mm=aa=0;
           }
       
       
       }while(dd == 0 && mm ==0 && aa == 0);
       System.exit(0);
    }
    
}
