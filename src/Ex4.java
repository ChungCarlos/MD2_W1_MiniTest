import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập Lớp: ");
        String classN = scanner.nextLine();
        System.out.print("Nhập Tuổi: ");
        int age = scanner.nextInt();
        Student student = new Student(name, age, classN);
        System.out.println("Tên: " + student.getName() + " Lớp: " + student.getClassN() + " Tuổi: " + student.getAge());
    }
}
    class Student {
        private String name;
        private int age;
        private String classN;

        public Student(String name, int age, String classN) {
            this.name = name;
            this.age = age;
            this.classN = classN;
        }

        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getClassN() {
            return classN;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public void setClassN(String classN) {
            this.classN = classN;
        }
    }
