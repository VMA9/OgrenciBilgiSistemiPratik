public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int verbNote;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.branch)) {
            this.teacher = teacher;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(teacher.name + "Akademisyeni bu dersi veremez. ");
        }
    }

    void printTeacher() {
        if (teacher != null) {
            System.out.println(this.name + "dersin Akademisyeni : " + teacher.name);
        } else {
            System.out.println(this.name + "dersine Akademisyen atanmamıştır. ");
        }
    }

}
