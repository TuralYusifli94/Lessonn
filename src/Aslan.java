public class Aslan extends Qurudayasayanlar implements Yirticilar,Qacanlar {
    public Aslan(String heyvaninAdi, int heyaninYasi) {
        super("aslan",heyvaninAdi,heyaninYasi);
    }

    @Override
    public void tehlukelidir() {
        System.out.println("Yirtici heyvan olduqunan tehlukelidir");
    }

    @Override
    public void qacir() {
        System.out.println("qacir");
    }
    @Override
    public void yemek() {
        super.yemek();
        System.out.println("antilop yeyir");
    }
}
