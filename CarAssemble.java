import java.util.*;

public class CarAssemble {

    public static void main(String[] args){
        List<String> carInfo = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    
        System.out.print("\nEnter brand: ");
        String brand = sc.nextLine();
        carInfo.add(brand);
    
        System.out.print("Select Engine Type\n(1)Diesel\n(2)Gasoline\nPick one:  ");
        String enginetype = sc.nextLine();
    
        if(enginetype.equals("1")){
            enginetype = "Diesel";
            carInfo.add(enginetype);
        } else {
            enginetype = "Gasoline";
            carInfo.add(enginetype);
        }
    
        System.out.print("Select Engine Transmission\n(1)Automatic\n(2)Manual\nPick one:  ");
        String transmission = sc.nextLine();
    
        if(transmission.equals("1")){
            enginetype = "Automatic";
            carInfo.add(enginetype);
        } else {
            enginetype = "Manual";
            carInfo.add(enginetype);
        }
    
        System.out.print("Enter color: ");
        String color = sc.nextLine();
        carInfo.add(color);
    
        System.out.print("Enter passenger capacity: ");
        int capacity = sc.nextInt();
        carInfo.add(String.valueOf(capacity));
    
        Car myCar = new Car.CarBuilder()
            .enginetype(enginetype)
            .carInfo(carInfo)
            .transmission(transmission)
            .brand(brand)
            .build();
        System.out.println("\nThe car information is listed below:");
        for(String i : myCar.carInfo){
            System.out.println(i);
            }
        }
    }
