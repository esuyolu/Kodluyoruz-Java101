import java.util.Scanner;

public class Homework24Student {

    String name,stuNo;
    int classes;
    Homework24Course mat;
    Homework24Course fizik;
    Homework24Course kimya;
    double avarage;
    boolean isPass;


    Homework24Student(String name, int classes, String stuNo, Homework24Course mat, Homework24Course fizik, Homework24Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkOralExamination(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.viva = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.viva = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.viva = kimya;
        }

    }


    public void isPass() {
        Scanner scanner = new Scanner(System.in);
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.viva == 0 || this.fizik.viva== 0 || this.kimya.viva == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            System.out.println("Matematik Sözlü Sınavının Ortalamaya Etkisi: ");
            this.mat.vivaPer = scanner.nextDouble();
            this.mat.notePer = (1.0 - this.mat.vivaPer);
            System.out.println("Fizik Sözlü Sınavının Ortalamaya Etkisi: ");
            this.fizik.vivaPer = scanner.nextDouble();
            this.fizik.notePer = (1.0 - this.fizik.vivaPer);
            System.out.println("Kimya Sözlü Sınavının Ortalamaya Etkisi: ");
            this.kimya.vivaPer = scanner.nextDouble();
            this.kimya.notePer = (1.0 - this.kimya.vivaPer);
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note * this.fizik.notePer + this.fizik.viva * this.fizik.vivaPer)
                     + (this.kimya.note * this.kimya.notePer + this.kimya.viva * this.kimya.vivaPer)
                     + (this.mat.note * this.mat.notePer + this.mat.viva * this.mat.vivaPer)) / 3.0;

    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Yazılı Notu : " + this.mat.note);
        System.out.println("Fizik Yazılı Notu : " + this.fizik.note);
        System.out.println("Kimya Yazılı Notu : " + this.kimya.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.viva);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.viva);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.viva);
    }
}
