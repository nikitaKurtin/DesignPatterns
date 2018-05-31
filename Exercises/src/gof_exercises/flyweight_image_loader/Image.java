package gof_exercises.flyweight_image_loader;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

class Image {
    private String path;
    private byte[] data;

    private Image(String path) {
        try {
            System.out.println("\nLoading image from server..");
            Thread.sleep(1000);
            var in = new FileInputStream(path);
            var out = new ByteArrayOutputStream();
            in.transferTo(out);
            data = out.toByteArray();
            this.path = path;
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

    }

    void showImage() {
        System.out.println("Showing image in path: " + path + "size: " + data.length);
    }


    private static final HashMap<String, Image> CACHE = new HashMap<>();

    //static Factory method with flyweight
    static Image fetchImage(String path) {
//        Image img;
//        if (CACHE.containsKey(path)) {
//            img = CACHE.get(path);
//        } else {
//            img = new Image(path);
//            CACHE.put(path, img);
//        }
//        return img;
        if (!CACHE.containsKey(path)) {
            CACHE.put(path, new Image(path));
        }
        return CACHE.get(path);
    }
}
