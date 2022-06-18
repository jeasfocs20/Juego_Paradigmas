package juego_ahorcado;

import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

    public class sonidos {
        File fondo = new File("musica.mp3");//ubicacion del mp3 (nombre)
        String soundf = "file:///"+fondo.getAbsolutePath();//direccion del ejecutable + el mp3
    
        MediaPlayer mediaplay;//resproductor
    
    //metodo para reproducir sonidos
    public void sonido(){
        soundf = soundf.replace("\\", "/");//se cambia el sentido de los /
        Media music = new Media(soundf);//nueva ruta
        mediaplay= new MediaPlayer(music);
        mediaplay.play();//reproduir audio
    }
}