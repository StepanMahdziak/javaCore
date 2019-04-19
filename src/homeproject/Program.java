package homeproject;

import homeproject.entity.Car;
import homeproject.service.CarDealer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 public class Program {
            private static final CarDealer DEALER = new CarDealer("MyDealer");
            private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

            public static void main(String[] args) throws IOException {
                System.out.println("MENU:");
                System.out.println(1 + "." + "Add car");
                System.out.println(2 + "." + "Show all cars");
                System.out.println(3 + "." + "Show all cars by make ");
                System.out.println(4 + "." + "Show all cars by make by limit ");
                System.out.println(5 + "." + "Remove car ");
                System.out.println(6 + "." + "Remove all car by make ");
                System.out.println(7 + "." + "Choose a car in the range of motor volume ");
                System.out.println(8 + "." + "Choose a car in the price range ");
                System.out.println(9 + "." + "Choose a car in the year range ");
                System.out.println();
                System.out.println("Select an action:");
                System.out.println();




                while (true) {

                    switch (READER.readLine()) {
                        case "1":
                            addCar();
                       //     System.out.println("Add car:");
                            break;
                        case "2":
                            printAll();
                           // System.out.println("Show all cars:");
                            break;
                        case "3":
                            getAllByMake();
                         //   System.out.println("Show all cars by make: ");
                            break;
                        case "4":
                            getAllByMake1();
                         //   System.out.println("Show all cars by make by limit: ");
                            break;
                        case "5":
                            remove();
                         //   System.out.println("Remove car: ");
                            break;
                        case "6":
                            removegetAllByMake();
                          //  System.out.println( "Remove all car by make: ");
                            break;
                        case "7":
                            getAllByVolume();
                          //  System.out.println("Choose a car in the range of motor volume :");
                            break;
                        case "8":
                            getAllByPrice();
                          //  System.out.println("Choose a car in the price range :");
                            break;
                        case "9":
                            getAllByYear();
                          //  System.out.println("Choose a car in the year range :");
                        case "exit":
                            System.out.println("bye");
                            return;
                        default:
                            System.out.println("There is no such option");
                            break;
                    }
                }
            }





            public static void addCar () throws IOException {
                System.out.println("Enter make: ");
                String make = READER.readLine();
                System.out.println("Enter model: ");
                String model = READER.readLine();
                System.out.println("Enter year: ");
                Integer year = Integer.valueOf(READER.readLine());
                System.out.println("Enter volume: ");
                Double volume = Double.valueOf(READER.readLine());
                System.out.println("Enter price: ");
                Integer price = Integer.valueOf(READER.readLine());
                Car car = new Car(make, model, year, price, volume);
                System.out.println(car);
                if (DEALER.addCar(car)) {
                    System.out.println("car added");
                } else {
                    System.out.println("car " + car + " already exists");
                }
            }

            public static void remove() throws IOException {
                System.out.println("Enter make: ");
                String make = READER.readLine();
                System.out.println("Enter model: ");
                String model = READER.readLine();
                System.out.println("Enter year: ");
                Integer year = Integer.valueOf(READER.readLine());
                System.out.println("Enter volume: ");
                Double volume = Double.valueOf(READER.readLine());
                System.out.println("Enter price: ");
                Integer price = Integer.valueOf(READER.readLine());
                Car car = new Car(make, model, year, price, volume);
                System.out.println(car);
                if (DEALER.remove(car)) {
                    System.out.println("car removed");
                } else {
                    System.out.println("car " + car + " already removed");
                }
            }



            public static void printAll () {
                int num = 1;
                if (DEALER.getCars().isEmpty()) {
                    System.out.println("There is no cars");
                    return;
                }
                for (Car car : DEALER.getCars()) {
                    System.out.println(num + "." + car);
                    System.out.println();
                    num++;
                }



            }
            public static void removegetAllByMake() throws IOException{
                DEALER.removeAllByMake(READER.readLine());
            }

            public static void getAllByVolume() throws IOException{
                DEALER.getAllByVolume(Double.valueOf(READER.readLine()),Double.valueOf(READER.readLine()));
            }
            public static void getAllByPrice() throws IOException{
                DEALER.getAllByPrice(Integer.valueOf(READER.readLine()),Integer.valueOf(READER.readLine()));
            }
            public static void getAllByYear() throws IOException{
                DEALER.getAllByYear(Integer.valueOf(READER.readLine()),Integer.valueOf(READER.readLine()));
            }
            public static void getAllByMake() throws IOException{
                DEALER.getAllByMake(READER.readLine());
            }
            public static  void getAllByMake1()throws IOException{
                DEALER.getAllByMake1(READER.readLine(), Integer.valueOf(READER.readLine()));
            }


        }

