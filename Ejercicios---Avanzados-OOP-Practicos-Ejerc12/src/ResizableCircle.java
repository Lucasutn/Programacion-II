public class ResizableCircle extends Circle implements Resizable{


    public ResizableCircle(double radius) {
        super(radius);
    }


    @Override
    public double resize(int percent) {

        return this.radius=this.radius-(this.radius*percent)/100;

    }
}
