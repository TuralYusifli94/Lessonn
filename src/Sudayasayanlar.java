public class Sudayasayanlar extends Heyvan {
    public Sudayasayanlar(String heyvan,String heyvaninAdi, int heyaninYasi) {
        super(heyvan,heyvaninAdi,heyaninYasi);
    }

    @Override
    public void yemek() {
        super.yemek();
        System.out.println("deniz mehsularin yeyiler: yosun ve ya baliqlar ");
    }
}
