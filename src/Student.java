public class Student {
    String name;
    int classes;
    String stuNo;
    Course mat;
    Course fzk;
    Course kmy;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fzk, Course kmy) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fzk = fzk;
        this.kmy = kmy;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkVerbalNote(int verbMat, int verbFzk, int verbKmy) {
        if (verbMat >= 0 && verbMat <= 100) {
            this.mat.verbNote = verbMat;
        }
        if (verbFzk >= 0 && verbFzk <= 100) {
            this.fzk.verbNote = verbFzk;
        }
        if (verbKmy >= 0 && verbKmy <= 100) {
            this.kmy.verbNote = verbKmy;
        }
    }

    void addBulkExamNote(int mat, int fzk, int kmy) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fzk >= 0 && fzk <= 100) {
            this.fzk.note = fzk;
        }
        if (kmy >= 0 && kmy <= 100) {
            this.kmy.note = kmy;
        }
    }

    void isPass() {
        if (this.mat.note == 0 || this.fzk.note == 0 || this.kmy.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı. ");
            }
        }
    }

    void calcAvarage() {
        double avaMat = (this.mat.note * 0.7) + (this.mat.verbNote * 0.3);
        double avaFzk = (this.fzk.note * 0.7) + (this.fzk.verbNote * 0.3);
        double avaKmy = (this.kmy.note * 0.7) + (this.kmy.verbNote * 0.3);
        double vAvarage = (avaMat + avaFzk + avaKmy) / 3;
        this.avarage = Math.round(vAvarage * 100) / 100d;
    }

    boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + " , Sözlü notu : " + this.mat.verbNote);
        System.out.println("Fizik Notu : " + this.fzk.note + " , Sözlü notu : " + this.fzk.verbNote);
        System.out.println("Kimya Notu : " + this.kmy.note + " , Sözlü notu : " + this.kmy.verbNote);
    }
}
