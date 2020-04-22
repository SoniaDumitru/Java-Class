public class Main {
    public static void main(String[] args) {
        WallArea wallArea = new WallArea(5,4);
        System.out.println("Area = " + wallArea.getArea());

        wallArea.setHeight(-1.5);
        System.out.println("width = " + wallArea.getWidth());
        System.out.println("width = " + wallArea.getHeight());
        System.out.println("area = " + wallArea.getArea());
    }
}
