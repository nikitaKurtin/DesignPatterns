package gof_exercises.bridge_tv;

public class FavRemote implements AbsRemote {

    private int[] favorites = new int[10];
    private TV implementor;

    public FavRemote(TV implementor) {
        this.implementor = implementor;
    }

    public void setFavChannel(int favorite, int channel) {
        favorites[favorite] = channel;
    }

    public void goToChannel(int favorite) {
        getImplementor().tuneChannel(favorites[favorite]);
    }

    @Override
    public TV getImplementor() {
        return implementor;
    }
}
