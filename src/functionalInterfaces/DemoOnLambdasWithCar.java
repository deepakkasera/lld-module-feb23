package functionalInterfaces;

import java.util.*;

public class DemoOnLambdasWithCar {
    static class Car {
        int speed;
        int price;
        String brand;

        Car(int speed, int price, String brand) {
            this.speed = speed;
            this.price = price;
            this.brand = brand;
        }

        @Override
        public String toString() {
            return "[Speed: " + this.speed + " Price:" + this.price + " Brand: " + this.brand + "]\n";
        }

//        @Override
//        public int compareTo(Car other) {
//            // compare this & other object
//            return this.price - other.price;
//        }
    }


    public static void main(String[] args) {
        Car c1 = new Car(100, 10, "A");
        Car c2 = new Car(200, 20, "B");
        Car c3 = new Car(500, 15, "C");
        Car c4 = new Car(50, 8, "D");
        Car c5 = new Car(20, 13, "E");
        Car c6 = new Car(90, 18, "F");

        List<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);

        System.out.println(list);

//        Collections.sort(list, new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o1.speed - o2.speed;
//            }
//        });

//        Comparator<Car> speedComparator = (car1, car2) -> {
//            return car1.speed - car2.speed;
//        };
//        Collections.sort(list, speedComparator);

        Collections.sort(list, (car1, car2) -> car1.speed - car2.speed);
        System.out.println(list);
    }
}
