public class Qurudayasayanlar extends Heyvan {


    public Qurudayasayanlar(String heyvan,String heyvaninAdi, int heyaninYasi) {
        super(heyvan,heyvaninAdi,heyaninYasi);
    }

    @Override
    public void yemek() {
        super.yemek();
        System.out.println("esasen quruda biten bitki ve ya et yeyiler");
    }
}
