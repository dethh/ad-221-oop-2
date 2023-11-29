package lb5;
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Смит", "Джон", 25);
        Person person2 = new Person("Джонсон", "Эмма", 28);
        Person person3 = new Person("Браун", "Алекс", 35);

        Student student1 = new Student("Тейлор", "Ханна", 22, "Группа А", 1000);
        Student student2 = new Student("Мартинес", "Мигель", 21, "Группа В", 993);

        Lecturer lecturer1 = new Lecturer("Флеминг", "Кэтрин", 45, "Химия", 8000.0);
        Lecturer lecturer2 = new Lecturer("Крауфорд", "Дэвид", 38, "Литература", 7500.0);

        Person[] people = new Person[7];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = student1;
        people[4] = student2;
        people[5] = lecturer1;
        people[6] = lecturer2;

        for (Person person : people) {
            System.out.println(person.printInfo());
        }
    }
    public static class Person {
        private String lastName;
        private String firstName;
        private int age;

        public Person(String lastName, String firstName, int age) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String printInfo() {
            return "Человек " + lastName + " " + firstName + ", возраст: " + age;
        }
    }

    public static class Student extends Person {
        private String group;
        private int studentID;

        public Student(String lastName, String firstName, int age, String group, int studentID) {
            super(lastName, firstName, age);
            this.group = group;
            this.studentID = studentID;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public int getStudentID() {
            return studentID;
        }

        public void setStudentID(int studentID) {
            this.studentID = studentID;
        }

        @Override
        public String printInfo() {
            return "Студент группы " + group + " " + getLastName() + " " + getFirstName() + ", возраст: " + getAge() + ". Номер студенческого билета: " + studentID;
        }
    }


    public static class Lecturer extends Person {
        private String department;
        private double salary;

        public Lecturer(String lastName, String firstName, int age, String department, double salary) {
            super(lastName, firstName, age);
            this.department = department;
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String printInfo() {
            return "Преподаватель кафедры " + department + " " + getLastName() + " " + getFirstName() + ", возраст: " + getAge() + ". Зарплата: " + salary;

        }
    }
}

