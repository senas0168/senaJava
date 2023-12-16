package homework;

public class Day03HomeworkRunner {
    public static void main(String[] args) {

        Day03HomeworkTeacher myTeacher = new Day03HomeworkTeacher();

        System.out.println("myTeacher.name = " + myTeacher.name);
        System.out.println("myTeacher.age = " + myTeacher.age);
        System.out.println("myTeacher.lessonName = " + myTeacher.lessonName);
        System.out.println("myTeacher.pay = " + myTeacher.pay);

        myTeacher.teach();
        myTeacher.person();

    }

}
