package MP3;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class demo1 {
    public static void main(String[] p_args){
//        ������ı����ļ�Ӧ��ʹ��URI��ַ
        File f = new File("./source/music/ӹ������.mp3");
        Media _media = new Media(f.toURI().toString());
        // ��������һ�У�����Ҫ��MediaPlayer����֮ǰ
        final JFXPanel fxPanel = new JFXPanel();
        MediaPlayer _mediaPlayer = new MediaPlayer(_media);
        _mediaPlayer.play();
    }
}