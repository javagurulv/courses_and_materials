package student_artjom_vakhromeev.lesson_3.task_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Car {

    String model;

    Car(String newModel) {
        this.model = newModel;
    }

    String getModel() {
        return this.model;
    }

}