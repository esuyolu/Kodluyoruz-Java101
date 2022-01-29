import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        String username, password, newPassword;
        int value;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        username = scanner.nextLine();
        System.out.print("Şifreniz: ");
        password = scanner.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!!");
        }
        else {
            System.out.println("Bilgileriniz Yanlış!!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("Evet: 1 / Hayır: 0");
            value = scanner.nextInt();
            if (value == 1) {
                System.out.println("Şifrenizi Giriniz");
                newPassword = scanner.next();
                if (newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }
    }
}
