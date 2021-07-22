import org.junit.Assert;
import org.junit.Test;
public class CarDetailsTests {
    @Test
    public void getCarDetails_GivenValidCar_ReturnsExpectedString(){
        // Arrange
        Car car = new Car();
        car.setColors("Red");
        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear("2019");
        // Act
        String details = CarUtils.getCarDetails(car);
        // Assert
        Assert.assertEquals("Red 2019 Ford Mustang", details);
    }
    @Test
    public void getCarDetails_GivenNullValues_ReturnsErrorString() {
        Car car = new Car();
//        car.setMake("Ford");
//        car.setModel("Mustang");
//        car.setYear("2019");
        // Act
        String details = CarUtils.getCarDetails(car);
        Assert.assertEquals("Not able to provide details", details);
    }
    public void getCarDetails_GivenOneNullValue_ReturnsErrorString() {
        Car car = new Car();
        car.setMake("Ford");
        car.setModel("Mustang");
//        car.setYear("2019"); DID NOT SET YEAR
        String details = CarUtils.getCarDetails(car);
        Assert.assertEquals("Not able to provide details", details);
    }
    @Test
    public void addToMileage_ReturnCorrectMileage(){
        Car car = new Car();
        car.setMileage(50000);
        CarUtils.addToMileage(car, 5000);
        Assert.assertEquals(55000,car.getMileage(),0);
    }
}