class Record<E> {
    private E record;
    public void display(E item){
        System.out.println(item);
    }
}

class Student {
    private int studentId;
    private String studentName;
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }
    public String toString() {
        return "Student ID: "+studentId+" Student Name: "+studentName;
    }
}

class Generics {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Om");
        Record<Integer> integerRecord = new Record<Integer>();
        integerRecord.display(12);

        Record<Student> studentRecord = new Record <>();
        studentRecord.display(s1);
    }
}