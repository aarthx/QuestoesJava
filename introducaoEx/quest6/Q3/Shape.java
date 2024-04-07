package Q3;

abstract class Shape {
    private String name;
    public String DESCRIPTION;

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public abstract double getArea();

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
