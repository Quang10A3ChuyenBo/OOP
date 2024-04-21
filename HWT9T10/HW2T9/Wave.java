import edu.princeton.cs.algs4.Picture;

public class Wave {

    public static void main(String[] args) {
        Picture pic1 = new Picture(args[0]);
        //pic1.show();
        int width  = pic1.width();
        int height = pic1.height();

        Picture pic2 = new Picture(width, height);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int xx = x;
                int yy = (int) (y + 20 * Math.sin(x * 2 * Math.PI / 64));
                if (yy >= 0 && yy < height) {
                    pic2.set(x, y, pic1.get(xx, yy));
                }
            }
        }

        pic2.show();
    }


}