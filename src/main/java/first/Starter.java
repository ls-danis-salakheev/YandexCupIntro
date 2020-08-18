package first;

import lombok.extern.java.Log;

import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.Callable;

/**
 * @author dan on 8/18/20
 */
@Log
public class Starter {
    private final Random random = new Random();
    private final Scanner in = new Scanner(System.in);

    private List<Alarm> alarms = Collections.emptyList();

    private int alarmCount;
    private int shift;

    public Starter(int alarmCount, int shift) {
        this.alarmCount = alarmCount;
        this.shift = shift;
    }

    public void start() {
        alarms = new ArrayList<>(alarmCount);
        for (int i = 0; i < alarmCount; i++) {
            alarms.add(new Alarm(LocalTime.of(7, 0), i * shift));
        }

        log.info("Alarms set for:");
        alarms.forEach(t -> log.info(t.toString()));

        boolean iAmAwake = false;

        for (Alarm alarm : alarms) {
            if (!iAmAwake) {
                alarm.toAlarm();
                iAmAwake = random.nextBoolean();
                log.info("Please just a minute...");
            } else {
                log.info("I am awake!");
                log.info("My today wakeup time is " + alarm.getTime().toString());
            }
        }
    }

    public LocalTime getEarliestTime() {
        return alarms.get(1).getTime();
    }
}