package MP3;

//Tip: ���ڹ������Ͱ�����һ��������ִ�ҪäĿ����

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;
/***
- ���ֲ�������
- @author lt
- time 2016-7-5
*/
public class demo2{
  Player player;
  File music;
  
  public static void main(String agrs[]) {
	  demo2 d=new demo2(new File("./source/music/ӹ������.mp3"));
	  try {
		d.play();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  //���췽��  ������һ��.mp3��Ƶ�ļ�
  public demo2(File file) {
      this.music = file;
  }
  //���ŷ���
  public void play() throws FileNotFoundException, JavaLayerException {
      
          BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(music));
          player = new Player(buffer);
          player.play();
  }
}
