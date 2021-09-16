import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Heyvan> heyvanlar = new ArrayList<>();

        while (true){
        System.out.println("heyvan yaratmaq ucun 1 heyvan sayini gormek ucun 2 reqemin daxil edin");
        Scanner a = new Scanner(System.in);
        int secim1 = a.nextInt();

        if (secim1==1) {
            System.out.println("aslan yaratmaq ucun 1 , serce yaratmaq ucun 2, qoyun yaratmaq ucun 3, delfin yaratmaq ucun 4 , qartal yaratmaq ucun 5 reqemin daxil edin ");
            Scanner b = new Scanner(System.in);
            int secim2 = b.nextInt();
            if (secim2==1){
                System.out.println("aslanin adin daxil edin : ");
                Scanner heyvaninAdi = new Scanner(System.in);
                String secim3 = heyvaninAdi.nextLine();
                System.out.println("aslanin yasin daxil edin : ");
                Scanner heyvaninYasi = new Scanner(System.in);
                int secim4 = heyvaninYasi.nextInt();
                Aslan aslan1 = new Aslan(secim3,secim4);
                heyvanlar.add(aslan1);
            }else if (secim2==2){
                System.out.println("sercenin adin daxil edin : ");
                Scanner heyvaninAdi = new Scanner(System.in);
                String secim3 = heyvaninAdi.nextLine();
                System.out.println("sercenin yasin daxil edin : ");
                Scanner heyvaninYasi = new Scanner(System.in);
                int secim4 = heyvaninYasi.nextInt();
                Serce serce1 = new Serce(secim3,secim4);
                heyvanlar.add(serce1);
            }else if (secim2==3){
                System.out.println("qoyunun adin daxil edin : ");
                Scanner heyvaninAdi = new Scanner(System.in);
                String secim3 = heyvaninAdi.nextLine();
                System.out.println("qoyunun yasin daxil edin : ");
                Scanner heyvaninYasi = new Scanner(System.in);
                int secim4 = heyvaninYasi.nextInt();
                Qoyun qoyun1 = new Qoyun(secim3,secim4);
                heyvanlar.add(qoyun1);
            }else if (secim2==4){
                System.out.println("delfinin adin daxil edin : ");
                Scanner heyvaninAdi = new Scanner(System.in);
                String secim3 = heyvaninAdi.nextLine();
                System.out.println("delfinin yasin daxil edin : ");
                Scanner heyvaninYasi = new Scanner(System.in);
                int secim4 = heyvaninYasi.nextInt();
                Delfin delfin1 = new Delfin(secim3,secim4);
                heyvanlar.add(delfin1);
            }else if (secim2==5){
                System.out.println("qartalin adin daxil edin : ");
                Scanner heyvaninAdi = new Scanner(System.in);
                String secim3 = heyvaninAdi.nextLine();
                System.out.println("qartalin yasin daxil edin : ");
                Scanner heyvaninYasi = new Scanner(System.in);
                int secim4 = heyvaninYasi.nextInt();
                Qartal qartal1 = new Qartal(secim3,secim4);
                heyvanlar.add(qartal1);
            }
        }else if (secim1==2){
            System.out.println(heyvanlar.size());
        }

    }}
}

