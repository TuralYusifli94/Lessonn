public class Qoyun extends Qurudayasayanlar implements OtYeyenler,Qacanlar{
    public Qoyun(String heyvaninAdi, int heyaninYasi) {

        super("qoyun",heyvaninAdi,heyaninYasi);
    }

    @Override
    public void otYeyir() {
        System.out.println("ot yeyen heyvandi");
    }

    @Override
    public void qacir() {
        System.out.println("qacir");
    }
    @Override
    public void yemek() {
        super.yemek();
        System.out.println("ot yeyir");
    }
}
