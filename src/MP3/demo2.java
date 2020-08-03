package MP3;

//Tip: 由于工程名和包名不一样，最好手打不要盲目复制

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;
/***
- 音乐播放器类
- @author lt
- time 2016-7-5
*/
public class demo2{
  Player player;
  File music;
  
  public static void main(String agrs[]) {
	  demo2 d=new demo2(new File("./source/music/庸人自扰.mp3"));
	  try {
		d.play();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  //构造方法  参数是一个.mp3音频文件
  public demo2(File file) {
      this.music = file;
  }
  //播放方法
  public void play() throws FileNotFoundException, JavaLayerException {
      
          BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(music));
          player = new Player(buffer);
          player.play();
  }
}
