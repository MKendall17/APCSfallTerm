public class UserOfStudent {

	public static void main(String[] args) {

		//lets make a student Martha
		Student s0 = new Student("Martha");

		//info
		System.out.println(s0);

		//augment Martha's sleepHours
		s0.augmentSleepHours(15);

		System.out.println(s0);

		//attempt to take away sleepHours
		s0.augmentSleepHours(-1);

		//attempt to make SleepHours better
		s0.augmentSleepHours(14);
		System.out.println(s0);
		s0.augmentSleepHours(10);
		System.out.println(s0);
		s0.augmentSleepHours(10);
		System.out.println(s0);
	}
}