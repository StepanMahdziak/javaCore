package homeproject.service;

import homeproject.entity.Car;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CarDealer {
    private String name;
    private final Set<Car> cars = new HashSet<>();


    public Set<Car> getAllByMake(String make) {

        Set<Car> cars1 = new LinkedHashSet<>();
        Iterator<Car> iterator = getCars().iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            if (next.getMake().equals(make)) {
                cars1.add(next);
            }
        }

        if (cars1.isEmpty()) {
            System.out.println("Not cars");
            return cars1;
        }
        for (Car car : cars1) {
            System.out.println(car);
        }
        return cars1;
    }


    public Set<Car> getAllByMake1(String make, int limit) {
        Set<Car> cars2 = new LinkedHashSet<>();
        Iterator<Car> iterator = getCars().iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            for (limit = 0; limit < 5; limit++) {
                limit++;
            }
            if (next.getMake().equals(make)) {
                cars2.add(next);
            }
        }
        if (cars2.isEmpty()) {
            System.out.println("Not cars");
        }
        for (Car limitmakes : cars2) {
            System.out.println(limitmakes);
        }
        return cars2;

    }

    public boolean remove(Car car) {
        Iterator<Car> iterator = getCars().iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            if (next.equals(car)) {
                iterator.remove();
            }
        }
        for (Car removed : getCars()) {
            System.out.println(removed);
        }
        return cars.remove(car);
    }

    public boolean removeAllByMake(String make) {
        Iterator<Car> iterator = getCars().iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            if (next.equals(make)) {
                iterator.remove();
            }
        }
        for (Car removed1 : getCars()) {
            System.out.println(removed1);
        }
        return cars.removeAll(cars);
    }


    public Set<Car> getAllByVolume(double from, double to){
        Set<Car> cars3 = new HashSet<>();
        Iterator<Car> iterator = getCars().iterator();
        while (iterator.hasNext()){
            Car next = iterator.next();
            if (next.getVolume() > from && next.getVolume() <= to){
                cars3.add(next);

            }
        }
        if (cars3.isEmpty()){
            System.out.println("Not cars");
        }
        for (Car volums : cars3){
            System.out.println(volums);
        }
        return cars3;
    }

    public Set<Car> getAllByPrice(int from, int to) {
        Set<Car> cars4 = new HashSet<>();
        Iterator<Car> iterator = getCars().iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            if (next.getPrice() > from && next.getPrice() <= to) {
                cars4.add(next);

            }
        }
        if (cars4.isEmpty()) {
            System.out.println("Not cars");
        }
        for (Car prices : cars4) {
            System.out.println(prices);
        }
        return cars4;

    } public Set<Car> getAllByYear(int from, int to) {
        Set<Car> cars5 = new HashSet<>();
        Iterator<Car> iterator = getCars().iterator();
        while (iterator.hasNext()) {
            Car next = iterator.next();
            if (next.getYear() > from && next.getYear() <= to) {
                cars5.add(next);
            }
        }
        if (cars5.isEmpty()) {
            System.out.println("Not cars");
        }
        for (Car years : cars5) {
            System.out.println(years);
        }
        return cars5;

    }



    public String getName() {
        return name;
    }



    public CarDealer(String name) {
        this.name = name;
    }

    public boolean addCar(Car car) {
        return cars.add(car);
    }

    public Set<Car> getCars() {
        return cars;
    }

}
