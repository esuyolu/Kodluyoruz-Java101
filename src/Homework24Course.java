public class Homework24Course {

    Homework24Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    double notePer;
    int viva;
    double vivaPer;

    public Homework24Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.viva = 0;
        this.notePer = 0;
        this.vivaPer = 0;
    }

    public void addTeacher(Homework24Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}
