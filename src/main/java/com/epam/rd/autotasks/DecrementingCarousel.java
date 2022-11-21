package com.epam.rd.autotasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DecrementingCarousel {
    boolean isRunning;
    static int[] carrousel;
    int addOperations;
    int decreaseOperation;
    int maxOperation;
    int addIndex;

    public DecrementingCarousel(int capacity) {
        carrousel = new int[capacity];
        System.out.println(Arrays.toString(carrousel));
    }

    public boolean addElement(int element){
        if (isRunning){
            return false;
        }else if(element<1){
            return false;
        }else if(carrousel.length == addOperations){
            return false;
        }else{
            carrousel[addIndex] = element;
            addIndex++;
            System.out.println(Arrays.toString(carrousel));
        }
        return true;
    }

    public CarouselRun run(){
        isRunning = true;
        return new CarouselRun( );
    }
}
