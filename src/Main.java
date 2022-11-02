public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        int sayi = topla(4, 7);
        System.out.println(sayi);
        int toplam = topla2(2, 3, 5, 5);
        System.out.println(toplam);
        System.out.println("--------------------------Ders28 = Bir Class Naıl Çalışır");
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Uptade();

        System.out.println("--------------------------Ders29 = Değer ve referans Tipleri");
        int[] sayilar1 = new int[]{1, 2, 3};
        int[] sayilar2 = new int[]{4, 5, 6};
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
        System.out.println("--------------------------Ders30= ReCap Demo Classlarla Çalışmak");

        DortIslem dortIslem = new DortIslem();
        int sonuc = dortIslem.Carp(6, 7);
        System.out.println(sonuc);

        System.out.println("--------------------------Ders31= Field ve Attribute ile Çalışmak");
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDestription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getKod());
        System.out.println("--------------------------Ders33= Getter and Setter ");
        System.out.println("--------------------------Ders34= Constructor ");
        System.out.println("--------------------------Ders35= Method Overloading ");
        System.out.println("--------------------------Ders36= Inheritance Yapısını Anlamak ");

        Customer customer = new Customer();
        Employee employee= new Employee();

        System.out.println("--------------------------Ders37= Inheritance Demo");
        KrediUI krediUI= new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());





    }

    public static void sayiBulmaca() {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer("sayı mevcuttur : " + aranacak);
        } else {
            mesajVer("sayı mevcut değildir : " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

}