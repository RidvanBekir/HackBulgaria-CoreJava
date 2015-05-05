package Matrix;
public class MainClass {

    public static void main(String[] args) {

        Matrix matrix = new Matrix();
        matrix.showMatrix();
        System.out.println("---------------------------------------------------");
        matrix.operate(new Greyscale());
        matrix.showMatrix();
        System.out.println("---------------------------------------------------");
        matrix.operate(new BrightnessReduce());
        matrix.showMatrix();
    }

}
