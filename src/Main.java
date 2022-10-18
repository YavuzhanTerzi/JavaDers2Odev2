public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean varMi = false;

        for (int sayi23 : sayilar) {
            if (sayi23 == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("sayı mevcuttur");
        } else {
            System.out.println("sayı mevcut değildir");
        }




    }
}