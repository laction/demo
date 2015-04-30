public class Exercise8_9 {
	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
	}
	@SuppressWarnings("serial")
	static class UnsupportedFuctionException extends RuntimeException{
		private final int ERR_CODE;
		private final String ERR_MSG;
		
		public UnsupportedFuctionException(String errMsg) {	this(errMsg,100);	}
		UnsupportedFuctionException(String errMsg,int errCode){
			this.ERR_CODE = errCode;
			this.ERR_MSG = errMsg;
		}
		int getErrorCode(){	return ERR_CODE;	}		
		@Override	public String getMessage() {		return "["+ERR_CODE+"]"+ERR_MSG + " 전산실 연락 요망.";	}
	}
}