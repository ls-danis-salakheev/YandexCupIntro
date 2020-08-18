package first;

import lombok.SneakyThrows;
import lombok.extern.java.Log;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;

@Log
public class Main {

    private static final Random random = new Random();
    private static final Scanner in = new Scanner(System.in);
    private static volatile Integer yes;

    public static void main(String[] args) throws Exception {

        List<Starter> starters = new ArrayList<>();
        starters.add(new Starter(5, 4));
        starters.add(new Starter(4, 3));
        starters.add(new Starter(3, 2));

        for (Starter starter : starters) {
            LocalTime earliestTime = starter.getEarliestTime();
        }

//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//
//        final Future<String> submit = executorService.submit(() -> new Starter().call());
//        final Future<String> submit1 = executorService.submit(() -> new Starter().call());
//        final Future<String> submit2 = executorService.submit(() -> new Starter().call());
//
//        if(submit.get().equals("DONE") && submit1.get().equals("DONE") && submit2.get().equals("DONE"))
//            executorService.shutdownNow();


//        Thread thread1 = new Thread(()-> {
//            try {
//                Starter starter = new Starter();
//                String call = starter.call();
//                if (call.isEmpty())
//                    Thread.sleep(100000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//        Thread thread2 = new Thread(()-> {
//            try {
//                Starter starter = new Starter();
//                String call = starter.call();
//                if (call.isEmpty())
//                    Thread.sleep(1000000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//        Thread thread3 = new Thread(()-> {
//            try {
//                Starter starter = new Starter();
//                String call = starter.call();
//                if (call.isEmpty())
//                    Thread.sleep(1000000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        });
//        thread1.start();
//        thread2.start();
//        thread3.start();


//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        List<Future<Integer>> futures = new ArrayList<>();
//
//        Callable<Integer> callable = new Starter();
//
//        for (int i = 0; i<3; i++) {
//            Future<Integer> future = executorService.submit(callable);
//            futures.add(future);
//        }
//
//        for (Future<Integer> futureTask :futures) {
//            if(futureTask.get() == -1) {
//               executorService.shutdown();
//
    }
}