class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff() {
		// (1) isPowerOn�� ���� true�� false��, false�� true�� �ٲ۴�.
		isPowerOn = !isPowerOn;
	}

	void volumeUp() {
		// (2) volume�� ���� MAX_VOLUME���� ���� ���� ���� 1������Ų��.
		volume = (volume<MAX_VOLUME)?(volume+1):(volume);
	}

	void volumeDown() {
		// (3) volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1���ҽ�Ų��.
		volume = (volume>MIN_VOLUME)?(volume-1):(volume);
	}

	void channelUp() {
		// (4) channel�� ���� 1������Ų��.
		// ���� channel�� MAX_CHANNEL�̸�, channel�� ���� MIN_CHANNEL�� �ٲ۴�.
		channel = (channel>=MAX_CHANNEL)?(MIN_CHANNEL):(channel+1);
	}

	void channelDown() {
		// (5) channel�� ���� 1���ҽ�Ų��.
		// ���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ۴�.
		channel = (channel<=MIN_CHANNEL)?(MAX_CHANNEL):(channel-1);
	}
} // class MyTv

public class Exercise6_21 {
	public static void main(String args[]) {
		MyTv t = new MyTv();
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
	}
}