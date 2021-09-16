public class Qartal extends Qurudayasayanlar implements Ucanlar,Yirticilar{
    public Qartal(String heyvaninAdi, int heyaninYasi) {

        super("qartal",heyvaninAdi,heyaninYasi);
    }

    @Override
    public void ucur() {
        System.out.println("qush olduqunan uca bilir");
    }

    @Override
    public void tehlukelidir() {
        System.out.println("Yirtici heyvan olduqunan tehlukelidir");
    }
    @Override
    public void yemek() {
        super.yemek();
        System.out.println("balaca qushlari yeyir");
    }
}
