package com.company;

public class Main {

    public static void main(String[] args) {

        Sportsman<Integer, Double> sportsman1 = new Sportsman<>(18, 58.4);
        Sportsman<Integer, Double> sportsman2 = new Sportsman<>(22, 68.5);
        Sportsman<Integer, Double> sportsman3 = new Sportsman<>(35, 82.1);

        System.out.println("Cпортсмен №1 "+sportsman1.age + "-" + sportsman1.weight);
        System.out.println("Cпортсмен №2 "+sportsman2.age + "-" + sportsman2.weight);
        System.out.println("Cпортсмен №3 "+sportsman3.age + "-" + sportsman3.weight);

    }
}