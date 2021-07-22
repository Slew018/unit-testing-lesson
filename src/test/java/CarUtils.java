public class CarUtils {
    public static String getCarDetails(Car car) {
        String make = car.getMake();
        String model = car.getModel();
        String year = car.getYear();
        String color = car.getColors();
        if (make == null || model == null || year == null || color == null) {
            return "Not able to provide details";
        }
        return color + " " + year + " " + make + " " + model;
    }
    public static void addToMileage(Car car, double mileageToAdd) {
        car.setMileage(car.getMileage() + mileageToAdd);
    }
    public static void convertToElectric(Car car, String engineType){
    }

//    In CarUtils, write a static void method called convertToElectric. It takes in a car object and a String 'engineType.' If the string includes the word 'electric' anywhere inside, then set the car's isElectric value to be true. You will use setElectric() to do that.
//    Then, write a test following Arrange/Act/Assert which tests convertToElectric on whether the car's isElectric field was set when 'electric' is present in the engineType string.
//    Then, write a test to make sure that convertToElectric will set the car's isElectric field regardless of how the string with 'electric' is capitalized.
//    For BOTH of these tests, you will use assertTrue or assertFalse to see if car.isElectric is true or false. Be sure to look at the curriculum on how to use those methods!
}