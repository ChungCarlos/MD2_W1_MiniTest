
public class Ex4 {
    public static void main(String[] args) {

        class Student {
            private String name;
            private int age;
            private String classs;

            public Student(String name, int age, String classs) {
                this.name = name;
                this.age = age;
                this.classs = classs;
            }

            public String getName() {
                return name;
            }
            public int getAge() {
                return age;
            }
            public String getClasss() {
                return classs;
            }

            public void setName(String name) {
                this.name = name;
            }
            public void setAge(int age) {
                this.age = age;
            }
            public void setClasss(String classs) {
                this.classs = classs;
            }
        }
    }
}