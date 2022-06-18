package juego_ahorcado;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {
    
    //Variables que tomaran el texto de los label
    String l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l="L_Letra", nuevo="";
    //varibales que se usan como contadores para hacer rrecorridos
    int recorrido=1, contador = 0, contador2=1, error=0, mal=0;
    
    //se llama el evento de la clase sonidos
    sonidos reproduce = new sonidos();
    
    //Declaración de cada id de los botones presentes en el juego
    @FXML
    private Button btnRECORRE,boton1,boton2,boton3,boton4,boton5,boton6,
            boton8,boton9,boton10,boton11,boton12,boton13,boton14,boton15,
            boton16,boton17,boton18,boton19,boton20,boton21,boton22,boton23,
            boton24,boton25,boton26,boton27, instrucciones,juego, info;
    
     //se invocan las imagenes del FXML 
    @FXML
    private ImageView imga1,imga2,imga3,imga4,
            imga5,imga6, imge1, imge2, imge3, 
            imge4, imge5, imge6, imga11, imga111;

    //se invocan los label del FXML
    @FXML
    private Label L_Letra1,L_Letra2,L_Letra3,L_Letra4,L_Letra5,
            L_Letra6,L_Letra7,L_Letra8,L_Letra9,L_Letra10, 
            LabelMostrarPalabra;
    
    //instrucciones
    @FXML
    private void btnPLAY (ActionEvent event){
        Concepto_Juego();
    }
    
    //informacion
    @FXML
    private void btnINFO (ActionEvent event){
        Acerca_de();
    }
    
    @FXML
    private void btnSALIR (ActionEvent event){
        System.exit(0);
    }
    
    /**metodo para saber cuando el usuario da respuestas erroneas*/
     public void fallar(){      
     error=error+1;  //se incrementa de a uno
     //va haciendo el recorrido sumando error para decidir que imagenes volver visibles
     if (error==1){imga1.setVisible(true);imge1.setVisible(true);reproduce.sonido();}
     if (error==2){imga2.setVisible(true);imge2.setVisible(true);reproduce.sonido();}
     if (error==3){imga3.setVisible(true);imge3.setVisible(true);imga11.setVisible(true);imga1.setVisible(false);reproduce.sonido();}//cambia la imagen correspondiente a la cara del dibujo
     if (error==4){imga4.setVisible(true);imge4.setVisible(true);reproduce.sonido();}
     if (error==5){imga5.setVisible(true);imge5.setVisible(true);imga111.setVisible(true);imga11.setVisible(false);reproduce.sonido();}//cambia la imagen correspondiente a la cara del dibujo
     if (error==6){imga6.setVisible(true);imge6.setVisible(true);reproduce.sonido();}
     if(error>6){JOptionPane.showMessageDialog(null,"AHORCADO");System.exit(0);}//al completar los fallos determinados sale del juego
     }

     //metodo que vuelve las imagenes en invisibles
     public void mostrar(){
      error=0;//variable error vuelve a 0
      imga1.setVisible(false);
      imga2.setVisible(false);
      imga3.setVisible(false);
      imga4.setVisible(false);
      imga5.setVisible(false);
      imga6.setVisible(false);
      imge1.setVisible(false);
      imge2.setVisible(false);
      imge3.setVisible(false);
      imge4.setVisible(false);
      imge5.setVisible(false);
      imge6.setVisible(false);
     }
     
      /*Este método se encarga de que cuando el usuario cambie de palabra, los label de la palabra anterior se muestren sin el texto que imprimieron
     botones de la palabra anterior*/
     public void limpiar(){
        L_Letra1.setText("_");
        L_Letra2.setText("_");
        L_Letra3.setText("_");
        L_Letra4.setText("_");
        L_Letra5.setText("_");
        L_Letra6.setText("_");
        L_Letra7.setText("_");
        L_Letra8.setText("_");
        L_Letra9.setText("_");
        L_Letra10.setText("_"); 
        L_Letra1.setVisible(false);
        L_Letra2.setVisible(false);
        L_Letra3.setVisible(false);
        L_Letra4.setVisible(false);
        L_Letra5.setVisible(false);
        L_Letra6.setVisible(false);
        L_Letra7.setVisible(false);
        L_Letra8.setVisible(false);
        L_Letra9.setVisible(false);
        L_Letra10.setVisible(false);
    }
     
    @FXML
    private void btnA (ActionEvent event) {
        //se comprueba que los label sean visibles y que el texto de los label sea "A"       
        
        mal=0;//La variable toma el valor de cero
         if(L_Letra1.isVisible()) {if(l1.equals("A")){ L_Letra1.setText("A");mal=1;}}//los label toman el  texto "A" y la variable "mal" toma el valor de 1
         if(L_Letra2.isVisible()) {if(l2.equals("A")){ L_Letra2.setText("A");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("A")){ L_Letra3.setText("A");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("A")){ L_Letra4.setText("A");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("A")){ L_Letra5.setText("A");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("A")){ L_Letra6.setText("A");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("A")){ L_Letra7.setText("A");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("A")){ L_Letra8.setText("A");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("A")){ L_Letra9.setText("A");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("A")){ L_Letra10.setText("A");mal=1;}}
         if(mal<1){//comprueba que el valor de mal sea inferior a 1
           fallar();  //se ejecuta el metodo fallar 
         }    
    }
    
    @FXML
    private void btnB(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("B")){ L_Letra1.setText("B");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("B")){ L_Letra2.setText("B");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("B")){ L_Letra3.setText("B");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("B")){ L_Letra4.setText("B");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("B")){ L_Letra5.setText("B");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("B")){ L_Letra6.setText("B");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("B")){ L_Letra7.setText("B");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("B")){ L_Letra8.setText("B");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("B")){ L_Letra9.setText("B");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("B")){ L_Letra10.setText("B");mal=1;}}
         if(mal<1){
           fallar();
         } 
    }
    
    @FXML
    private void btnC(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("C")){ L_Letra1.setText("C");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("C")){ L_Letra2.setText("C");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("C")){ L_Letra3.setText("C");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("C")){ L_Letra4.setText("C");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("C")){ L_Letra5.setText("C");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("C")){ L_Letra6.setText("C");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("C")){ L_Letra7.setText("C");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("C")){ L_Letra8.setText("C");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("C")){ L_Letra9.setText("C");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("C")){ L_Letra10.setText("C");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnD(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("D")){ L_Letra1.setText("D");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("D")){ L_Letra2.setText("D");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("D")){ L_Letra3.setText("D");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("D")){ L_Letra4.setText("D");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("D")){ L_Letra5.setText("D");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("D")){ L_Letra6.setText("D");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("D")){ L_Letra7.setText("D");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("D")){ L_Letra8.setText("D");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("D")){ L_Letra9.setText("D");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("D")){ L_Letra10.setText("D");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnE(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("E")){ L_Letra1.setText("E");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("E")){ L_Letra2.setText("E");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("E")){ L_Letra3.setText("E");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("E")){ L_Letra4.setText("E");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("E")){ L_Letra5.setText("E");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("E")){ L_Letra6.setText("E");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("E")){ L_Letra7.setText("E");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("E")){ L_Letra8.setText("E");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("E")){ L_Letra9.setText("E");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("E")){ L_Letra10.setText("E");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnF(ActionEvent event) {
         mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("F")){ L_Letra1.setText("F");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("F")){ L_Letra2.setText("F");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("F")){ L_Letra3.setText("F");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("F")){ L_Letra4.setText("F");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("F")){ L_Letra5.setText("F");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("F")){ L_Letra6.setText("F");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("F")){ L_Letra7.setText("F");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("F")){ L_Letra8.setText("F");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("F")){ L_Letra9.setText("F");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("F")){ L_Letra10.setText("F");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnG(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("G")){ L_Letra1.setText("G");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("G")){ L_Letra2.setText("G");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("G")){ L_Letra3.setText("G");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("G")){ L_Letra4.setText("G");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("G")){ L_Letra5.setText("G");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("G")){ L_Letra6.setText("G");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("G")){ L_Letra7.setText("G");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("G")){ L_Letra8.setText("G");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("G")){ L_Letra9.setText("G");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("G")){ L_Letra10.setText("G");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnH(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("H")){ L_Letra1.setText("H");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("H")){ L_Letra2.setText("H");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("H")){ L_Letra3.setText("H");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("H")){ L_Letra4.setText("H");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("H")){ L_Letra5.setText("H");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("H")){ L_Letra6.setText("H");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("H")){ L_Letra7.setText("H");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("H")){ L_Letra8.setText("H");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("H")){ L_Letra9.setText("H");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("H")){ L_Letra10.setText("H");mal=1;}}
         if(mal<1){
           fallar();   
         }         
    }
    
    @FXML
    private void btnI(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("I")){ L_Letra1.setText("I");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("I")){ L_Letra2.setText("I");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("I")){ L_Letra3.setText("I");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("I")){ L_Letra4.setText("I");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("I")){ L_Letra5.setText("I");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("I")){ L_Letra6.setText("I");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("I")){ L_Letra7.setText("I");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("I")){ L_Letra8.setText("I");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("I")){ L_Letra9.setText("I");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("I")){ L_Letra10.setText("I");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnJ(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("J")){ L_Letra1.setText("J");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("J")){ L_Letra2.setText("J");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("J")){ L_Letra3.setText("J");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("J")){ L_Letra4.setText("J");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("J")){ L_Letra5.setText("J");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("J")){ L_Letra6.setText("J");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("J")){ L_Letra7.setText("J");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("J")){ L_Letra8.setText("J");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("J")){ L_Letra9.setText("J");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("J")){ L_Letra10.setText("J");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnK(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("K")){ L_Letra1.setText("K");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("K")){ L_Letra2.setText("K");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("K")){ L_Letra3.setText("K");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("K")){ L_Letra4.setText("K");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("K")){ L_Letra5.setText("K");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("K")){ L_Letra6.setText("K");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("K")){ L_Letra7.setText("K");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("K")){ L_Letra8.setText("K");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("K")){ L_Letra9.setText("K");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("K")){ L_Letra10.setText("K");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnL(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("L")){ L_Letra1.setText("L");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("L")){ L_Letra2.setText("L");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("L")){ L_Letra3.setText("L");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("L")){ L_Letra4.setText("L");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("L")){ L_Letra5.setText("L");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("L")){ L_Letra6.setText("L");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("L")){ L_Letra7.setText("L");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("L")){ L_Letra8.setText("L");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("L")){ L_Letra9.setText("L");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("L")){ L_Letra10.setText("L");mal=1;}}
         if(mal<1){
           fallar();   
         }    
    }
    
    @FXML
    private void btnM(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("M")){ L_Letra1.setText("M");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("M")){ L_Letra2.setText("M");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("M")){ L_Letra3.setText("M");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("M")){ L_Letra4.setText("M");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("M")){ L_Letra5.setText("M");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("M")){ L_Letra6.setText("M");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("M")){ L_Letra7.setText("M");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("M")){ L_Letra8.setText("M");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("M")){ L_Letra9.setText("M");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("M")){ L_Letra10.setText("M");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnN(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("N")){ L_Letra1.setText("N");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("N")){ L_Letra2.setText("N");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("N")){ L_Letra3.setText("N");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("N")){ L_Letra4.setText("N");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("N")){ L_Letra5.setText("N");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("N")){ L_Letra6.setText("N");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("N")){ L_Letra7.setText("N");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("N")){ L_Letra8.setText("N");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("N")){ L_Letra9.setText("N");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("N")){ L_Letra10.setText("N");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnO(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("O")){ L_Letra1.setText("O");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("O")){ L_Letra2.setText("O");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("O")){ L_Letra3.setText("O");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("O")){ L_Letra4.setText("O");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("O")){ L_Letra5.setText("O");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("O")){ L_Letra6.setText("O");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("O")){ L_Letra7.setText("O");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("O")){ L_Letra8.setText("O");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("O")){ L_Letra9.setText("O");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("O")){ L_Letra10.setText("O");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnP(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("P")){ L_Letra1.setText("P");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("P")){ L_Letra2.setText("P");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("P")){ L_Letra3.setText("P");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("P")){ L_Letra4.setText("P");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("P")){ L_Letra5.setText("P");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("P")){ L_Letra6.setText("P");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("P")){ L_Letra7.setText("P");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("P")){ L_Letra8.setText("P");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("P")){ L_Letra9.setText("P");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("P")){ L_Letra10.setText("P");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnQ(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("Q")){ L_Letra1.setText("Q");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("Q")){ L_Letra2.setText("Q");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("Q")){ L_Letra3.setText("Q");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("Q")){ L_Letra4.setText("Q");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("Q")){ L_Letra5.setText("Q");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("Q")){ L_Letra6.setText("Q");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("Q")){ L_Letra7.setText("Q");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("Q")){ L_Letra8.setText("Q");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("Q")){ L_Letra9.setText("Q");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("Q")){ L_Letra10.setText("Q");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnR(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("R")){ L_Letra1.setText("R");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("R")){ L_Letra2.setText("R");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("R")){ L_Letra3.setText("R");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("R")){ L_Letra4.setText("R");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("R")){ L_Letra5.setText("R");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("R")){ L_Letra6.setText("R");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("R")){ L_Letra7.setText("R");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("R")){ L_Letra8.setText("R");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("R")){ L_Letra9.setText("R");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("R")){ L_Letra10.setText("R");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnS(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("S")){ L_Letra1.setText("S");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("S")){ L_Letra2.setText("S");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("S")){ L_Letra3.setText("S");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("S")){ L_Letra4.setText("S");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("S")){ L_Letra5.setText("S");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("S")){ L_Letra6.setText("S");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("S")){ L_Letra7.setText("S");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("S")){ L_Letra8.setText("S");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("S")){ L_Letra9.setText("S");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("S")){ L_Letra10.setText("S");mal=1;}}
         if(mal<1){
           fallar();   
         }  
    }
    
    @FXML
    private void btnT(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("T")){ L_Letra1.setText("T");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("T")){ L_Letra2.setText("T");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("T")){ L_Letra3.setText("T");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("T")){ L_Letra4.setText("T");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("T")){ L_Letra5.setText("T");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("T")){ L_Letra6.setText("T");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("T")){ L_Letra7.setText("T");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("T")){ L_Letra8.setText("T");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("T")){ L_Letra9.setText("T");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("T")){ L_Letra10.setText("T");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnU(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("U")){ L_Letra1.setText("U");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("U")){ L_Letra2.setText("U");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("U")){ L_Letra3.setText("U");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("U")){ L_Letra4.setText("U");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("U")){ L_Letra5.setText("U");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("U")){ L_Letra6.setText("U");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("U")){ L_Letra7.setText("U");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("U")){ L_Letra8.setText("U");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("U")){ L_Letra9.setText("U");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("U")){ L_Letra10.setText("U");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnV(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("V")){ L_Letra1.setText("V");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("V")){ L_Letra2.setText("V");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("V")){ L_Letra3.setText("V");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("V")){ L_Letra4.setText("V");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("V")){ L_Letra5.setText("V");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("V")){ L_Letra6.setText("V");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("V")){ L_Letra7.setText("V");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("V")){ L_Letra8.setText("V");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("V")){ L_Letra9.setText("V");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("V")){ L_Letra10.setText("V");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnW(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("W")){ L_Letra1.setText("W");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("W")){ L_Letra2.setText("W");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("W")){ L_Letra3.setText("W");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("W")){ L_Letra4.setText("W");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("W")){ L_Letra5.setText("W");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("W")){ L_Letra6.setText("W");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("W")){ L_Letra7.setText("W");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("W")){ L_Letra8.setText("W");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("W")){ L_Letra9.setText("W");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("W")){ L_Letra10.setText("W");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnX(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("X")){ L_Letra1.setText("X");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("X")){ L_Letra2.setText("X");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("X")){ L_Letra3.setText("X");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("X")){ L_Letra4.setText("X");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("X")){ L_Letra5.setText("X");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("X")){ L_Letra6.setText("X");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("X")){ L_Letra7.setText("X");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("X")){ L_Letra8.setText("X");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("X")){ L_Letra9.setText("X");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("X")){ L_Letra10.setText("X");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnY(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("Y")){ L_Letra1.setText("Y");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("Y")){ L_Letra2.setText("Y");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("Y")){ L_Letra3.setText("Y");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("Y")){ L_Letra4.setText("Y");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("Y")){ L_Letra5.setText("Y");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("Y")){ L_Letra6.setText("Y");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("Y")){ L_Letra7.setText("Y");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("Y")){ L_Letra8.setText("Y");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("Y")){ L_Letra9.setText("Y");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("Y")){ L_Letra10.setText("Y");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    @FXML
    private void btnZ(ActionEvent event) {
        mal=0;
         if(L_Letra1.isVisible()) {if(l1.equals("Z")){ L_Letra1.setText("Z");mal=1;}}
         if(L_Letra2.isVisible()) {if(l2.equals("Z")){ L_Letra2.setText("Z");mal=1;}}
         if(L_Letra3.isVisible()) {if(l3.equals("Z")){ L_Letra3.setText("Z");mal=1;}}
         if(L_Letra4.isVisible()) {if(l4.equals("Z")){ L_Letra4.setText("Z");mal=1;}}
         if(L_Letra5.isVisible()) {if(l5.equals("Z")){ L_Letra5.setText("Z");mal=1;}}
         if(L_Letra6.isVisible()) {if(l6.equals("Z")){ L_Letra6.setText("Z");mal=1;}}
         if(L_Letra7.isVisible()) {if(l7.equals("Z")){ L_Letra7.setText("Z");mal=1;}}
         if(L_Letra8.isVisible()) {if(l8.equals("Z")){ L_Letra8.setText("Z");mal=1;}}
         if(L_Letra9.isVisible()) {if(l9.equals("Z")){ L_Letra9.setText("Z");mal=1;}}
         if(L_Letra10.isVisible()) {if(l10.equals("Z")){ L_Letra10.setText("Z");mal=1;}}
         if(mal<1){
           fallar();   
         } 
    }
    
    //Botón para cambiar de palabra
    @FXML
     private void btnRECORRE(ActionEvent event) {
        //se ejecuta el metodo mostrar 
        mostrar();
        contador = contador +1;//se incrementa la variable contador
        if(contador>23){
            contador=0;
        }
        arrayPalabras();//se ejecuta el array con las palabras
    }

    //mostrar mensaje (integrantes)
    public void Acerca_de (){
        JOptionPane.showMessageDialog(null, "Presentado Por: \n"+
        "Nombre: Jorge Andrés Franco Cuadros / Cod: 1811022733 \n");
    }
     
    //mostrar mensaje (concepto)
    public void Concepto_Juego(){
        JOptionPane.showMessageDialog(null, "El ahorcado es un juego de adivinanza para 2 jugadores, \n"+
        "El primero (en este caso el software) lo llamaremos Moderador, se encargará de mostrar \n"+
        "La cantidad de letras de una palabra aleatoria que se encuentra en un listado definido por los \n" +
        "Creadores del juego, el segundo jugador lo llamaremos Usuario, este tendrá que \n"+
        "Adivinar todas y cada una de las letras por las cuales está compuesta la palabra, Si tiene UN (1) Error, \n"+
        "El Software le mostrará el cuerpo de un ser humano dividido en 6 parte, de tal modo qué: \n"+
        "UN (1) ERROR mostrará la cabeza del ser humano \n"+
        "DOS (2) ERRORES mostrará el tronco del ser humano \n"+
        "TRES (3) ERRORES mostrará la mano derecha del ser humano \n"+
        "CUATRO (4) ERRORES mostrará la mano izquierda del ser humano \n"+
        "CINCO (5) ERRORES mostrará la pierna derecha del ser humano \n"+
        "SEIS (6) ERRORES mostrará la pierna izquierda del ser humano y PERDERÁ el juego");
    }

    //metodo para generar las palabras
    public void arrayPalabras(){
        limpiar();//se ejecuta el metodo limpiar
        String [] arreglo= new String[24];//se le da el tamaño al arreglo
        //se le asignan las palabras a cada posicion del arreglo
        arreglo[0]="HTML";
        arreglo[1]="CSS";
        arreglo[2]="JAVASCRIPT";
        arreglo[3]="PHP";
        arreglo[4]="PYTHON";
        arreglo[5]="KOTLIN";
        arreglo[6]="LARAVEL";
        arreglo[7]="ANGULAR";
        arreglo[8]="JQUERY";
        arreglo[9]="BOOTSTRAP";
        arreglo[10]="FLEXBOX";
        arreglo[11]="JAVA";
        arreglo[12]="FRONTEND";
        arreglo[13]="BACKEND";
        arreglo[14]="ANDROID";
        arreglo[15]="WINDOWS";
        arreglo[16]="LINUX";
        arreglo[17]="MAC";
        arreglo[18]="ECLIPSE";
        arreglo[19]="NETBEANS";
        arreglo[20]="INTELLIJ";
        arreglo[21]="SUBLIME";
        arreglo[22]="ATOM";
        arreglo[23]="VISUAL";
        
        //segun la posicion se captura el texto en una variables
        String c = arreglo[contador];
        LabelMostrarPalabra.setText(c);
        
        //se dejan los label visibles segun si cumplen con los respectivos condicionales
        if(c.length()==2){l1 = c.substring(0,1);l2 = c.substring(1,2);
        L_Letra1.setVisible(true);L_Letra2.setVisible(true);
        }
        
        if(c.length()==3){l1 = c.substring(0,1);l2 = c.substring(1,2);l3 = c.substring(2,3);
        L_Letra1.setVisible(true);L_Letra2.setVisible(true);L_Letra3.setVisible(true);
        }
        
        if(c.length()==4){l1 = c.substring(0,1);l2 = c.substring(1,2); l3 = c.substring(2,3); l4 = c.substring(3,4);
        L_Letra1.setVisible(true);L_Letra2.setVisible(true);L_Letra3.setVisible(true);L_Letra4.setVisible(true);
        }
        
        if(c.length()==5){l1 = c.substring(0,1);l2 = c.substring(1,2);l3 = c.substring(2,3);l4 = c.substring(3,4);l5 = c.substring(4,5);
        L_Letra1.setVisible(true);L_Letra2.setVisible(true);L_Letra3.setVisible(true);L_Letra4.setVisible(true);L_Letra5.setVisible(true);
        }
        
        if(c.length()==6){l1 = c.substring(0,1);l2 = c.substring(1,2);l3 = c.substring(2,3);l4 = c.substring(3,4);l5 = c.substring(4,5);l6 = c.substring(5,6);
         L_Letra1.setVisible(true);L_Letra2.setVisible(true);L_Letra3.setVisible(true);L_Letra4.setVisible(true);L_Letra5.setVisible(true);L_Letra6.setVisible(true);
        }
        
        if(c.length()==7){l1 = c.substring(0,1);l2 = c.substring(1,2);l3 = c.substring(2,3);l4 = c.substring(3,4);l5 = c.substring(4,5);l6 = c.substring(5,6);l7 = c.substring(6,7);
        L_Letra1.setVisible(true);L_Letra2.setVisible(true);L_Letra3.setVisible(true);L_Letra4.setVisible(true);L_Letra5.setVisible(true);L_Letra6.setVisible(true);L_Letra7.setVisible(true);
        }
        
        if(c.length()==8){l1 = c.substring(0,1);l2 = c.substring(1,2);l3 = c.substring(2,3);l4 = c.substring(3,4);l5 = c.substring(4,5);l6 = c.substring(5,6); l7 = c.substring(6,7);l8 = c.substring(7,8);
        L_Letra1.setVisible(true);L_Letra2.setVisible(true);L_Letra3.setVisible(true);L_Letra4.setVisible(true);L_Letra5.setVisible(true);L_Letra6.setVisible(true);L_Letra7.setVisible(true);L_Letra8.setVisible(true);
        }
        
        if(c.length()==9){l1 = c.substring(0,1);l2 = c.substring(1,2);l3 = c.substring(2,3);l4 = c.substring(3,4);l5 = c.substring(4,5);l6 = c.substring(5,6);l7 = c.substring(6,7);l8 = c.substring(7,8); l9 = c.substring(8,9);
        L_Letra1.setVisible(true);L_Letra2.setVisible(true);L_Letra3.setVisible(true);L_Letra4.setVisible(true);L_Letra5.setVisible(true);L_Letra6.setVisible(true);L_Letra7.setVisible(true);L_Letra8.setVisible(true);L_Letra9.setVisible(true);
        }
        
        if(c.length()==10){l1 = c.substring(0,1);l2 = c.substring(1,2);l3 = c.substring(2,3);l4 = c.substring(3,4);l5 = c.substring(4,5);l6 = c.substring(5,6);l7 = c.substring(6,7);l8 = c.substring(7,8); l9 = c.substring(8,9);l10 = c.substring(9,10);
        L_Letra1.setVisible(true);L_Letra2.setVisible(true);L_Letra3.setVisible(true);L_Letra4.setVisible(true);L_Letra5.setVisible(true);L_Letra6.setVisible(true);L_Letra7.setVisible(true);L_Letra8.setVisible(true);L_Letra9.setVisible(true);L_Letra10.setVisible(true);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        arrayPalabras();//al inciar la aplicacion se ejecuta el metodo
    }    
}