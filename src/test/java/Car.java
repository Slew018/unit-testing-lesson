public class Car {

    private String make;
    private String model;
    private String year;
    private String colors;
    private double mileage;
    private boolean isElectric;

    public Car(String make, String model, String year, String colors, double mileage, boolean isElectric) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colors = colors;
        this.mileage = mileage;
        this.isElectric = isElectric;
    }

    public Car(){};

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
