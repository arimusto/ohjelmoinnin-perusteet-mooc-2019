
public class KonekoeTehtava3 {

    public static void main(String[] args) {

        Muusikko matti = new Muusikko("Matti", "Tuuba");
        Muusikko teppo = new Muusikko("Teppo", "Banjo");

        Orkesteri orkesteri = new Orkesteri();
        orkesteri.lisaaMuusikko(matti);
        orkesteri.lisaaMuusikko(teppo);

        System.out.println(orkesteri);

        orkesteri.soita();

        System.out.println();
        System.out.println(orkesteri);

        matti.soita();

        System.out.println();
        System.out.println(orkesteri);

        Muusikko madonna = new Muusikko("Madonna", "Piano");
        orkesteri.lisaaMuusikko(madonna);
        orkesteri.soita();

        System.out.println();
        System.out.println(orkesteri);
    }
}
