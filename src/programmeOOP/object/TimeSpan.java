package programmeOOP.object;

// Represents a time span of hours and minutes elapsed.
// Class invariant: minutes < 60

public class TimeSpan {
	private int hours;
	private int minutes;

	// Constructs a time span with the given interval.
	// pre: hours >= 0 && minutes >= 0
	public TimeSpan(int hours, int minutes) {
		this.hours = 0;
		this.minutes = 0;
		add(hours, minutes);
	}

	// Adds the given interval to this time span.
	// pre: hours >= 0 && minutes >= 0
	public void add(int hours, int minutes) {
		this.hours += hours;
		this.minutes += minutes;

		// convert each 60 minutes into one hour
		this.hours += this.minutes / 60;
		this.minutes = this.minutes % 60;
	}

	// Returns the number of minutes stored in this TimeSpan object.
	public int getHours() {
		return hours;
	}

	// Returns the number of minutes stored in this TimeSpan object.
	public int getMinutes() {
		return minutes;
	}

	// Returns a String for this time span such as "6h15m".
	public String toString() {
		return hours + "h" + minutes + "m";
	}

    // YOUR CODE GOES HERE
    
    /**
     * BJP4 Exercise 8.7: addTimeSpan
     * @param span
     */
    public void add(TimeSpan span){
        hours += span.hours + (this.minutes + span.minutes)/60;
        minutes += (this.minutes + span.minutes)%60;
    }

    /**
     * BJP4 Exercise 8.8: subtractTimeSpan
     */
    public void subract(TimeSpan span){
        hours = hours - 1 - span.hours + (60 + minutes - span.minutes)/60;
        minutes = (60 + minutes - span.minutes) % 60;
    }


    /**
     * BJP4 Exercise 8.9: scaleTimeSpan
     */
    public void scale(int factor){
        hours = hours*factor + (minutes*factor)/60;
        minutes = minutes*factor%60;
    }
}