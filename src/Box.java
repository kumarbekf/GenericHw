public class Box<I> {
    private I name;

    public Box(I name) {
        this.name = name;
    }

    public I getItem() {
        return name;
    }

    public void setItem(I name) {
        this.name = name;
    }

    public static <I> Box<I> generic(I name) {
        return new Box<I>(name);
    }
}
