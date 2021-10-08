import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Heyvan> heyvanlar = new ArrayList<>();

        while (true) {
            System.out.println("heyvan yaratmaq ucun 1 heyvan sayini gormek ucun 2 reqemin daxil edin");
            Scanner sc = new Scanner(System.in);
            int secim1 = sc.nextInt();
            switch (secim1) {
                case 1 -> {
                    System.out.println("aslan yaratmaq ucun 1 ,serce yaratmaq ucun 2, qoyun yaratmaq ucun 3,delfin yaratmaq ucun 4 ,qartal yaratmaq ucun 5 reqemin daxil edin ");
                    Scanner b = new Scanner(System.in);
                    int secim2 = b.nextInt();
                    switch (secim2) {
                        case 1 -> {
                            System.out.println("aslanin adin daxil edin : ");
                            String a1 = sc.next();
                            System.out.println("aslanin yasin daxil edin : ");
                            int a2 = sc.nextInt();
                            Aslan aslan1 = new Aslan(a1, a2);
                            heyvanlar.add(aslan1);
                        }
                        case 2 -> {
                            System.out.println("sercenin adin daxil edin : ");
                            String b1 = sc.next();
                            System.out.println("sercenin yasin daxil edin : ");
                            int b2 = sc.nextInt();
                            Serce serce1 = new Serce(b1, b2);
                            heyvanlar.add(serce1);
                        }
                        case 3 -> {
                            System.out.println("qoyunun adin daxil edin : ");
                            String c1 = sc.next();
                            System.out.println("qoyunun yasin daxil edin : ");
                            int c2 = sc.nextInt();
                            Qoyun qoyun1 = new Qoyun(c1, c2);
                            heyvanlar.add(qoyun1);
                        }
                        case 4 -> {
                            System.out.println("delfinin adin daxil edin : ");
                            String d1 = sc.next();
                            System.out.println("delfinin yasin daxil edin : ");
                            int d2 = sc.nextInt();
                            Delfin delfin1 = new Delfin(d1, d2);
                            heyvanlar.add(delfin1);
                        }
                        case 5 -> {
                            System.out.println("qartalin adin daxil edin : ");
                            String e1 = sc.next();
                            System.out.println("qartalin yasin daxil edin : ");
                            int e2 = sc.nextInt();
                            Qartal qartal1 = new Qartal(e1, e2);
                            heyvanlar.add(qartal1);
                        }
                    }
                }
                case 2 -> System.out.println(heyvanlar.size());
            }
        }
    }
}

