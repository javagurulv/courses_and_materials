package student_artjom_vakhromeev.lesson_3.task_18;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DogDemo {
    public static void main(String[] args) {

        Dog bobik = new Dog("Bobik" ,15,"Red");
        bobik.voice();
        bobik.celebrateHappyBirthday();
        bobik.changeColor("Black");
        bobik.voice();


    }
}