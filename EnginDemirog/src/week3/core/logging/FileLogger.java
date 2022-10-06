package week3.core.logging;

public class FileLogger implements Logger{
	public void log(String data) {
		System.out.println("FileLogger ile "+data+" eklendi");
		
	}
}
