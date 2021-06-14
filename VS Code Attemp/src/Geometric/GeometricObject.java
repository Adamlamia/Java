package Geometric;

public abstract class GeometricObject {
    private String colour;
    private Boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
    }

    protected GeometricObject(String Colour, Boolean Filled) {
        this.colour = Colour;
        this.filled = Filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject [colour=" + colour + ", dateCreated=" + dateCreated + ", filled=" + filled + "]";
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

