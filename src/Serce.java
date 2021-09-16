public class Serce extends Qurudayasayanlar implements Ucanlar{
    public Serce(String heyvaninAdi, int heyaninYasi) {
        super("serce",heyvaninAdi,heyaninYasi);
    }

    @Override
    public void ucur() {
        System.out.println("qush olduqunan uca bilir ");
    }
    @Override
    public void yemek() {
        super.yemek();
        System.out.println("bocey yeyir");
    }
}
