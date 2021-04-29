package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		if(function.equals("음악")) {
			playDown();
			return;
		} else if(function.equals("앱")) {
			playApp();
			return;
		}
		super.execute(function);
	}

	private void playDown() {
		System.out.println("다운로드해서 음악재생");
	}
	
	private void playApp() {
		System.out.println("앱실행");
	}
}
