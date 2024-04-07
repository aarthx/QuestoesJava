package Q3;

abstract class ThreeDimensionalShape extends Shape {

    public ThreeDimensionalShape(String name) {
        super(name);
    }

    //getArea abstrato já vem da classe pai
    public abstract double getVolume();
}
