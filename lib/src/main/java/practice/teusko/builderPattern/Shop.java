package practice.teusko.builderPattern;

public class Shop {

    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOs("jhdgj")
                                    .setRam(1)
                                    .getPhone();
        System.out.println(p);

    }

}
