package ua.opnu;


public class TimeSpan {

    public int hours;
    public int minutes;

    TimeSpan(int hours, int minutes) {
        if (hours < 0 || minutes < 0 || minutes > 59) {
            this.hours = 0;
            this.minutes = 0;
        } else {
            this.hours = hours;
            this.minutes = minutes;
        }
    }

    int getHours() {
        return hours;
    }

    int getMinutes() {
        return minutes;
    }

    void add(int hours, int minutes) {

        if (hours < 0 || minutes < 0 || minutes > 59) {
            return;
        }

        this.hours+=hours;
        this.minutes+=minutes;

        if (this.minutes>=60) {
            this.hours+=this.minutes/60;
            this.minutes%=60;
        }
    }

    void addTimeSpan(TimeSpan timespan) {
        add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
        return hours+minutes/60.0;
    }

    int getTotalMinutes() {
        return minutes+hours*60;
    }

    void subtract(TimeSpan span) {
        int result = getTotalMinutes()-span.getTotalMinutes();
        if (result < 0)
            return;
        hours=result/60;
        minutes=result%60;
    }

    void scale(int factor) {
        if(factor<=0)
            return;
        this.hours*=factor;
        this.minutes*=factor;
        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes %= 60;
        }
    }
}