public class WallArea {
    private double width;
    private double height;

    public WallArea(double width, double height) {
        if (width < 0) {
            width = 0;
        }
        if (height < 0) {
            height = 0;
        }
        this.width = width;
        this.height = height;
    }

    public WallArea(){
        this(00.0, 00.0);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public void setWidth(double width) {
        this.width = width;
        if (this.width > 0) {
            return;
        } else {
            this.width = 0;
        }
    }

    public void setHeight(double height) {
        this.height = height;
        if (this.height > 0) {
            return;
        } else {
            this.height = 0;
        }
    }
}
