public class Homework24 {
    public static void main(String[] args) {

        Homework24Course mat = new Homework24Course("Matematik", "MAT101", "MAT");
        Homework24Course fizik = new Homework24Course("Fizik", "FZK101", "FZK");
        Homework24Course kimya = new Homework24Course("Kimya", "KMY101", "KMY");

        Homework24Teacher t1 = new Homework24Teacher("Mahmut Hoca", "90550000000", "MAT");
        Homework24Teacher t2 = new Homework24Teacher("Fatma Ayşe", "90550000001", "FZK");
        Homework24Teacher t3 = new Homework24Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Homework24Student s1 = new Homework24Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkOralExamination(50, 90, 100);
        s1.isPass();

        Homework24Student s2 = new Homework24Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkOralExamination(100, 90, 90);
        s2.isPass();

        Homework24Student s3 = new Homework24Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkOralExamination(0, 0, 0);
        s3.isPass();

    }
}
