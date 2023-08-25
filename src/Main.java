public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = Box.generic(2009);
        System.out.println(integerBox.getItem());


        Box<String> stringBox = Box.generic("Datkaiym");
        System.out.println(stringBox.getItem());
    }
}