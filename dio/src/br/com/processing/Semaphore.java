package br.com.processing;

import static java.lang.System.out;

public class Semaphore {
    public static void main(String[] args) {
        Green green = new Green();
        green.start();

        Yellow yellow = new Yellow();
        yellow.start();

        Red red = new Red();
        red.start();
    }
}


class Green extends Thread{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[42m";


    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.println(ANSI_GREEN +"   [●]   "+ ANSI_RESET+ " GO!");
    }
}

class Yellow extends Thread{
    public static final String ANSI_YELLOW = "\u001B[43m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.println(ANSI_YELLOW +"   [●]   "+ ANSI_RESET+ " ATTENTION");
    }
}

class Red extends Thread{
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.println(ANSI_RED_BACKGROUND +"   [●]   "+ ANSI_RESET+ " STOP!");
    }
}