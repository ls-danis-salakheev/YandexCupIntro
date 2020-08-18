package first;

import lombok.extern.java.Log;

import java.time.LocalTime;

@Log
public class Alarm {

    private LocalTime time;
    private int shift;

    public Alarm(LocalTime time, int shift) {
        this.shift = shift;
        addShift(shift, time);
    }

    public Alarm() {
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public void toAlarm() {

    }

    private void addShift(int shift, LocalTime time) {
        if (shift != 0) {
            this.time = time.plusMinutes(shift);
        }
        else this.time = time;
    }

    @Override
    public String toString() {
        return "Alarm{" +
                "time=" + time +
                ", shift=" + shift +
                '}';
    }
}
