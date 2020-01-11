
public class Hiekkalaatikko {

    public static void main(String[] args) {
        // Ari aloittaa Java-ohjelmointia
        Lintu bubi = new Lintu("Bubi", 172);
        System.out.println(bubi);
        bubi.lenna();
        System.out.println(bubi.equals(new Lintu("Bubbi", 12)));
    }
}
