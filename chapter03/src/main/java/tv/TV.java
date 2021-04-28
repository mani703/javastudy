package tv;

public class TV {
	private int channel;	// 1 ~ 255
	private int volume;		// 0 ~ 100
	private boolean power;
	
	public TV() {
		
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void power(boolean on) {
		if(on) {
			power = on;
		} else {
			power = false;
			channel = 0;
			volume = 0;
		}
	}
	
	public void channel(boolean up) {	
		channel++;
		if(channel > 255) {
			channel = 255;
		}
	}
	
	public void channel(int channel) {
		if(channel < 1) {
			this.channel = 1;
		} else if(channel > 255) {
			this.channel = 255;
		} else {
			this.channel = channel;
		}
	}
	
	public void volume(boolean up) {
		volume++;
		if(volume > 100) {
			volume = 100;
		}
	}
	
	public void volume(int volume) {
		if(volume < 0) {
			this.volume = 0;
		} else if(volume > 100) {
			this.volume = 100;
		} else {
			this.volume = volume;
		}
	}
	
	public void status() {
		System.out.println("TV[power= " + power + ", channel= " + channel + ", volume= " + volume + "]");
	}
}
