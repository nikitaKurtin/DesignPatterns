package gof_exercises.flyweight_image_loader;


public class FlyweightTest {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Image currentImg = Image.fetchImage("src\\gof_exercisers\\flyweight_image_loader\\CSharp.png");
            currentImg.showImage();
            Image.fetchImage("src\\gof_exercisers\\flyweight_image_loader\\Capture.png").showImage();

        }
    }
}
