public class Objects {
    int rollNO;
    String name;

    public static void main(String[] args) {
        Objects o1 = new Objects();
        Objects o2 = new Objects();

        o1.name = "Sahas Singhaniya";
        o1.rollNO = 25;

        o2.name = "Mrunal";
        o2.rollNO = 31;

        System.out.println(o1.name);
        System.out.println(o1.rollNO);
        System.out.println(o2.name);
        System.out.println(o2.rollNO);
    }

}
