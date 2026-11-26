public class Duration{
	private int hour, minute, second;
	
	public Duration(int hours, int minutes, int seconds){
		second = seconds%60;
		minute = seconds/60 + minutes%60;
		hour = hours + minutes/60;
	}
	
	public Duration(int totalSeconds){
		second = totalSeconds%60;
		int m = totalSeconds/60;
		minute = totalSeconds/60 + m%60;
		int h = m/60;
		hour = totalSeconds/3600 + m%60;
	}
	
}
