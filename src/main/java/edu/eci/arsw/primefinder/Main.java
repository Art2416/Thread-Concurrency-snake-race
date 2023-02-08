package edu.eci.arsw.primefinder;
import java.util.Scanner;
import java.util.Objects;

import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Control control = Control.newControl();

        control.start();
        while (true) {
            long startTime = System.nanoTime();
            TimeUnit.SECONDS.sleep(5);
            long endTime = System.nanoTime();
            long timeElapse = endTime - startTime;
            control.pausarEjecucion();
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter");
            String input = scanner.nextLine();
            if (Objects.equals(input, "")) {
                control.reanudarEjecucion();
            }


        }

    }

}
