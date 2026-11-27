public class Duration {
    private int hours, minutes, seconds;

    public Duration(int hours, int minutes, int seconds) {
        this.seconds = seconds % 60;
        this.minutes = seconds / 60 + minutes % 60;
        this.hours = hours + minutes / 60;
    }

    public Duration(int totalSeconds) {
        seconds = totalSeconds % 60;
        int m = totalSeconds / 60;
        minutes = m % 60;
        int h = m / 60;
        hours = h;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getTotalSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public Duration add(Duration other) {
        int ha = other.getHours();
        int ma = other.getMinutes();
        int sa = other.getSeconds();
        Duration ans = new Duration(hours + ha, minutes + ma, seconds + sa);
        return ans;
    }

    public void increment(int secs) {
        seconds += secs;
        int m = seconds / 60;
        seconds = seconds % 60;
        minutes += m % 60;
        int h = m / 60;
        hours += h;
    }

    public boolean equals(Duration other) {
        if (other.getTotalSeconds() == (hours * 3600 + minutes * 60 + seconds)) {
            return true;
        }
        return false;
    }

    public String toString() {
		return hours+":"+twoDigits(minutes)+":"+twoDigits(seconds);
		}
		
		private String twoDigits(int n){
			if(n/10==0){
				return "0" + n;
			} else return ""+n;
		}
}
