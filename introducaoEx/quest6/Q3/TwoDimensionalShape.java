package Q3;

abstract class TwoDimensionalShape extends Shape {

    public TwoDimensionalShape(String name) {
        super(name);
    }

    //método getArea ja presente na classe Shape, coloquei aqui apenas para a classe TwoDimensionalShape não ficar vazia
    public abstract double getArea();
}
