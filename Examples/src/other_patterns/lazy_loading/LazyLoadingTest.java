package other_patterns.lazy_loading;

/**
 * Created by Gal on 8/24/2017.
 */
public class LazyLoadingTest {
    private static Object lazyObj;

    static Object getObj() {
        if (lazyObj == null) {
            System.out.println("lazy object created");
            lazyObj = new Object();
        }
        return lazyObj;
    }

    public static void main(String[] args) {
        //breaking lazy loading, this is just for demo
        System.out.println(lazyObj);

        //correct way to lazily load object
        System.out.println(getObj());
        System.out.println(getObj());
    }
}
