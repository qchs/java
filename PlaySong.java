package sound;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class PlaySong {

	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("miss.wav");//The type of the song must be wav,mp3 is not avaliable
			AudioStream as = new AudioStream(fis);

			AudioPlayer.player.start(as);
			
//			fis.close();  There will be no sound if the file be closed.
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
