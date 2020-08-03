package MP3;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class demo1 {
    public static void main(String[] p_args){
//        程序外的本地文件应该使用URI地址
        File f = new File("./source/music/庸人自扰.mp3");
        Media _media = new Media(f.toURI().toString());
        // 必须有这一行，并且要在MediaPlayer创建之前
        final JFXPanel fxPanel = new JFXPanel();
        MediaPlayer _mediaPlayer = new MediaPlayer(_media);
        _mediaPlayer.play();
    }
}