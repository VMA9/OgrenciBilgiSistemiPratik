public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca","905500000000","MAT");
        Teacher t2 = new Teacher("Ali Hoca","905500000001","FZK");
        Teacher t3 = new Teacher("Kadir Hoca","905500000002","KMY");

        Course mat = new Course("Matematik", "MAT101","MAT");
        Course fzk = new Course("Fizik", "FZK101","FZK");
        Course kmy = new Course("Kimya", "KMY101","KMY");

        mat.addTeacher(t1);
        fzk.addTeacher(t2);
        kmy.addTeacher(t3);

        Student student1 = new Student("Hasan",11,"2210210",mat,fzk,kmy);
        student1.addBulkExamNote(50,20,40);
        student1.addBulkVerbalNote(60,70,30);
        student1.isPass();

        Student student2 = new Student("İbrahim",9,"2210211",mat,fzk,kmy);
        student2.addBulkExamNote(100,40,50);
        student2.addBulkVerbalNote(90,51,94);
        student2.isPass();

        Student student3 = new Student("Ahmet",10,"2210212",mat,fzk,kmy);
        student3.addBulkExamNote(50,20,40);
        student3.addBulkVerbalNote(50,100,90);
        student3.isPass();


    }
}