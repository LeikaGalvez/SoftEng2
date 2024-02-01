import java.util.*;

public class Car {
        protected final String brand;
        protected final String enginetype;
        protected final String transmission;
        protected final List<String> carInfo;

        private Car(CarBuilder carBuilder){
            this.brand = carBuilder.brand;
            this.enginetype = carBuilder.enginetype;
            this.transmission = carBuilder.transmission;
            this.carInfo = carBuilder.carInfo;
        }

        protected static class CarBuilder{
            private String brand;
            private String enginetype;
            private String transmission;
            private List<String> carInfo = new ArrayList<>();

            public CarBuilder brand (String brand){
                this.brand = brand;
                return this;
            }

            public CarBuilder enginetype (String enginetype){
                this.enginetype = enginetype;
                return this;
            }

            public CarBuilder transmission (String transmission){
                this.transmission = transmission;
                return this;
            }

            public CarBuilder carInfo (List <String> carInfo){
                this.carInfo=carInfo;
                return this;
            }

            public Car build(){
                return new Car(this);
            }
        }

}
