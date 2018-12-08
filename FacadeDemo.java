interface MediaPlayer
{
	public void play();
	public void pause();
	public void stop();	
}
class MediaPlayerFacade implements MediaPlayer
{
	FileLoader fl = null;
	Decoder dr = null;
	Sound sd = null;

	public void play()
	{
		fl = new FileLoader();
		fl.loadFile();
		dr = new Decoder();
		dr.decode();
		sd = new Sound();
		sd.on();		
	}
	public void pause()
	{
		sd.off();
	}
	public void stop()
	{
		sd.off();
		fl.unloadFile();
	}
}
class FileLoader
{
	public void loadFile()
	{
		System.out.println("Loading File......");
	}
	public void unloadFile()
	{
		System.out.println("Unloading File......");
	}
}
class Decoder
{
	public void decode()
	{
		System.out.println("Decoding file.....");
	}
}
class Sound
{
	public void on()
	{
		System.out.println("Sound is coming.....");
	}
	public void off()
	{
		System.out.println("Its silent now.....");
	}
}

public class FacadeDemo
{
	public static void main(String args[])
	{
		MediaPlayer mp = new MediaPlayerFacade();
		mp.play();
		mp.stop();
	}
}














