package br.com.processing;

import static java.lang.String.format;
import static java.lang.System.out;

public class ThreadUse {

    public static void main(String[] args) {
        GeneratePDF generatePDF = new GeneratePDF();
        Processing processing = new Processing(generatePDF);
        generatePDF.start();
        processing.run();


        Processing.Green g = new Processing.Green();
        g.run();
    }
}

class GeneratePDF extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.printf("PDF done!");
    }
}

class Processing extends Thread {
    private Thread pdfGenerator;

    public Processing(Thread operation) {
        this.pdfGenerator = operation;
    }

    @Override
    public void run() {
        Integer time = 0;
        while (pdfGenerator.isAlive()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!pdfGenerator.isAlive()) {
                break;
            }else {
                out.println(time.toString().concat("%"));
                out.println("Loading. . .");
                out.println(this.getName());
                out.println(pdfGenerator.getName());

            }
            time = time + 33;
        }
    }

    class Status extends Thread {
        @Override
        public void run() {
            out.print(format(" [Running %s]", this.getName()));
        }
    }


    static class Green extends Thread{
        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_YELLOW = "\u001B[33m";


        @Override
        public void run() {
            out.println(ANSI_YELLOW+" DONE!"+ ANSI_RESET);
        }
    }

    class Yellow extends Thread{
        @Override
        public void run() {
            out.println("yellow");
        }
    }

    class Red extends Thread{
        @Override
        public void run() {
            out.println("Red");
        }
    }
}
