package gof_exercises.builder_user;

public class BuilderTest {
    public static void main(String[] args) {
        User.Builder builder = new User.Builder(); //instantiating Builder object
        //setting fields we like & in order we wantS
        builder.setAge(23);
        builder.setUserName("Gal");
        builder.setPassword("Aa123456");
        builder.setEmail("eee@ggg.asd");

        User gal = builder.build(); //creating User object from our builder

        System.out.println(gal);
    }
}
