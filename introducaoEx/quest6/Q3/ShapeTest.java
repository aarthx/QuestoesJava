package Q3;

public class ShapeTest {
    public static void main(String[] args) {
        
        Shape[] formas = new Shape[6];
        formas[0] = new Circle("Círculo", 5);
        formas[1] = new Square("Quadrado", 5);
        formas[2] = new Triangle("Triângulo", 5, 3);
        formas[3] = new Sphere("Esfera", 5);
        formas[4] = new Cube("Cubo", 5);
        formas[5] = new Tetrahedron("Tetraedro", 5);

        for(int i = 0; i < formas.length; i++) {
          if(formas[i] instanceof TwoDimensionalShape) {
            TwoDimensionalShape figura2D = (TwoDimensionalShape) formas[i];
            System.out.println("Nome: " + figura2D.getName());
            System.out.println("Descrição: " + figura2D.getDESCRIPTION());
            System.out.println("Área: " + figura2D.getArea() + "cm²");
            System.out.println("-------------------------------------");
          }
          else if(formas[i] instanceof ThreeDimensionalShape) {
            ThreeDimensionalShape objeto3D = (ThreeDimensionalShape) formas[i];
            System.out.println("Nome: " + objeto3D.getName());
            System.out.println("Descrição: " + objeto3D.getDESCRIPTION());
            System.out.println("Área: " + objeto3D.getArea() + "cm²");
            System.out.println("Volume: " + objeto3D.getVolume() + "cm³");
            System.out.println("-------------------------------------");

          }
        }
    }
}
