package com.epam.rd.autotasks;

import static com.epam.rd.autotasks.DecrementingCarousel.carrousel;

public class CarouselRun {

    int decreaseOperation;

    int maxOperations;

    int position = 0;

    public int next() {
        int count = 0;
        while (count < carrousel.length && carrousel[position %= carrousel.length] <= 0) {
            position++;
            count++;
        }
        if (count == carrousel.length) return -1;
        return carrousel[position++]--;
    }

    public boolean isFinished() {
        for (int var: carrousel) {
            if (var > 0) return false;
        }
        return true;    }

}
