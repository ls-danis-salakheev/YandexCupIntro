package first;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Slf4j
public class Main {

    private static final Random random = new Random();

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        List<Alarm> alarms = new ArrayList<>(K);

        for (int i = 0; i < K - 1; i++) {
            int shift = 5;
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
            }
            else{
                log.error("I'am awake!");
                return;
            }
        }

    }
}
