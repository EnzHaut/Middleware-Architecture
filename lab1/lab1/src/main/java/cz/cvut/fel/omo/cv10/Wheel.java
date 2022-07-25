package cz.cvut.fel.omo.cv10;

import java.util.*;



public class Wheel extends CarPart {
    private int diameter=0;

    public Wheel(int diameter) {
        this.diameter = diameter;
    }

    public getDiameter() {
        return diameter;
    }
}

/////

public class Car extends CarPart {
    private char color;
    private int makeYear;
    private List<Wheel>wheels = new ArrayList<>();

    public Car(int wheelsNb, int wheelDiameter, int makeYear, char color) {

        this.color = color;
        this.makeYear = makeYear;
                for (int i =0; i<wheelsNb; i++) {
            wheels.add(new Wheel(wheelDiameter));
        }
    }
}

public List<Transaction> findAllTransactionsIn2011AndSortByValueAsc(){
        List<Transaction> newList = transactions.stream()
                .filter(x->x.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        return newList;
    }

}


