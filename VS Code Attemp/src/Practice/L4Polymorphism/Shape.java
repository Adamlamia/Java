package Practice.L4Polymorphism;

public class Shape { 
    private Double volume, area;
    private final double PI = 3.14159;

    public Shape() {

    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

}
