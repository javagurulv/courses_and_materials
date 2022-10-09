package teacher.lesson_x.unwanted_tasks.lesson_7_encapsulation;

import teacher.lesson_x.unwanted_tasks.lesson_7_encapsulation.lessoncode.DogFerma;

public class DogFermaDemo {

	public static void main(String[] args) {
		DogFerma ferma = new DogFerma();

		ferma.addDog();

		ferma.removeDog();
		ferma.removeDog();

		System.out.println(ferma.countDogs());
	}

}
