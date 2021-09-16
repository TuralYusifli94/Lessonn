public  class Heyvan {
    private String heyvan;
    private String heyvaninAdi;
    private int heyaninYasi;


    public Heyvan(String heyvan,String heyvaninAdi, int heyaninYasi) {
    this.heyvan = heyvan;
    this.heyvaninAdi = heyvaninAdi;
    this.heyaninYasi = heyaninYasi;

    }
    public  void heyvanNovu(){

        System.out.println("heyvan novu: "+heyvan+" , heyvanin adi: "+heyvaninAdi+" , heyvanin yasi: "+heyaninYasi);
    }
    public  void yemek(){

        System.out.println("yemek yeyiler");
    };


}
