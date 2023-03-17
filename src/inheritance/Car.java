package inheritance;

public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void describeCar(){
        System.out.println(doors+"-Door "+"Make "+make+" Model "+model+" Color "+getColor());
    }
}
