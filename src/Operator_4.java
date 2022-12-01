public class Operator_4 {

    public static void main(String[] args) {

    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    float distance = (float) Math.sqrt(x*x + y*y);

        System.out.println("Euclidean distance from the point ("+ x +","+ y +" )to(0,0) y " + distance);
}
}
