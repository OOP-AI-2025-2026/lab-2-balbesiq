package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Олексій",3);
        student1.addCourse("Математика");
        student1.addCourse("Фізика");
        student1.addCourse("Хімія");
        System.out.println(student1.getName()+": кількість вивчаємих дисциплін - "+student1.getCourseCount());
        System.out.println(student1.getName()+": рік навчання - "+student1.getYear());
        System.out.println(student1.getName()+": заплатив за навчання - "+student1.getTuition());

        System.out.println("\nДисципліни:"); // у тз цього не було, але для наглядності додав вивід дисциплін
        for (int i = 0; i < student1.getCourseCount(); i++) {
            System.out.println("- " + student1.disciplines[i]);
        }
 
    }
}
