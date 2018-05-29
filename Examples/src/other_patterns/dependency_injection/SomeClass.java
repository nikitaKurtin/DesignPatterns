package other_patterns.dependency_injection;

/**
 * Created by Gal on 8/25/2017.
 */
class SomeClass {
    private String name;

    public SomeClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Some class with name:" + name;
    }
}
