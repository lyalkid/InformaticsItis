package ru.itis.lab13;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        IStack stack = new StackImplList();

        int i, border = 1000000;
        Random rand = new Random();

        long start = System.nanoTime();
        for(i = 0; i<border;i++){
            int o  = rand.nextInt();
            stack.push(o);
        }
        for(i = 0; i<border;i++){
            int o  = rand.nextInt();
            stack.pop();
        }

        long end = System.nanoTime();
        long timeList  = end - start;


        IStack stak = new StackImpl();

        start = System.nanoTime();
        for(i = 0; i<border;i++){
            int o  = rand.nextInt();
            stak.push(o);
        }
        for(i = 0; i<border;i++){
            int o  = rand.nextInt();
            stak.pop();
        }
        end = System.nanoTime();
        long time = end - start;

        if (time > timeList){
            System.out.println("StackImplList быстрее. Время выполнения программы StackImplList - "+ timeList  + " наносекунд(-а),\n а StackImpl - "+ time + " наносекунд(-а)");
        }
        else if (time < timeList){
            System.out.println("StackImpl быстрее. Время выполнения программы StackImpl - "+ time  + " наносекунд(-а),\n а StackImplList - "+ timeList + " наносекунд(-а)");
        }
        else {
            System.out.println("время выполнения программ совпадают" +" ("+ time +" наносекунд)");
        }

    }
}
