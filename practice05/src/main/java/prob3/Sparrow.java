package prob3;

public class Sparrow extends Bird{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fly() {
		System.out.println("참새(짹짹)가 날아 다닙니다.");
	}
	
	public void sing() {
		System.out.println("참새(짹짹)가 소리내어 웁니다.");
	}

	@Override
	public String toString() {
		return "참새의 이름은 " + name + " 입니다.";
	}
	
	
}
