package prob04;

public class Person {
	private static int numberOfPerson;
	private int age;
	private String name;
	
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPerson = getPopulation();
		System.out.println("현재 인구수는 " + numberOfPerson + "명 입니다.");
	}

	public void selfIntroduce() {
		
	}
	
	public int getPopulation() {
		return numberOfPerson += 1;
	}
}
