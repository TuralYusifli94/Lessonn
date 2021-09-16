public class Delfin extends Sudayasayanlar implements Uzenler{
    public Delfin(String heyvaninAdi, int heyaninYasi) {

        super("delfin",heyvaninAdi,heyaninYasi);
    }

    @Override
    public void uzur() {
        System.out.println("suda uzendir");
    }
    @Override
    public void yemek() {
        super.yemek();
        System.out.println("balaca baliqlari yeyir");
    }
}
