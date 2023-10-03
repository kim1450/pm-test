
public class MyException extends Exception{

	private static final long serialVersionUID = 7718828512143294558L;
	
	private final int ERR_CODE;
	
	MyException(String msg, int errCode){ //ERR 내용이랑 ERRCODE까지 받는다.
		super(msg);
		ERR_CODE = errCode;
		
	}
	MyException(String msg){ // errCode 없이.
		this(msg,100);
	}
	public int getErrCode() {
		return ERR_CODE;
	}
}
