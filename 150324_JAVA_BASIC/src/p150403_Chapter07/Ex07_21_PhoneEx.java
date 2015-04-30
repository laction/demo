package p150403_Chapter07;

public class Ex07_21_PhoneEx {
	
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("010-123-4567");
		if(sp instanceof PhoneInterface){
			System.out.println("(PhoneInterface) 전화기 처럼 생겼다.");
		}
	}		
	public static class PitcherPhone implements PhoneInterface {
		@Override		public void receiveSMS() {			}
		@Override		public void recievCall() {				}
		@Override		public void sendCall() {					}
		@Override		public void sendSMS() {				}	
	}
	public static class SmartPhone extends Phone implements MP3Interface,MobilePhoneInterface{
		public SmartPhone(String name) {			super(name);		}
		@Override			public void camera() {			}
		@Override			public void draw() {				}
		@Override			public void play() {					}			
		@Override			public void receiveSMS() {	}
		@Override			public void recievCall() {		}
		@Override			public void sendCall() {			}
		@Override			public void sendSMS() {		}
		@Override			public void stop() {					}
	}
	// 모바일
	public static interface MobilePhoneInterface extends PhoneInterface {
		public abstract void draw();
		public abstract void camera();
	}
	// MP3
	public static interface MP3Interface {
		public abstract void play();
		public abstract void stop();		
	}
	public static class Phone implements PhoneInterface{
		private String phoneNumber;		
		public Phone(String phoneNumber){		this.phoneNumber = phoneNumber;	}		
		@Override		public void sendCall() {	}
		@Override		public void recievCall() {}
		@Override		public void sendSMS() {}
		@Override		public void receiveSMS() {}		
	}
	public static interface PhoneInterface{
		int BUTTONS = 20;
		void sendCall();
		void recievCall();
		void sendSMS();
		void receiveSMS();
	}	
}
// (PhoneInterface) 전화기 처럼 생겼다.

