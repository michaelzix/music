package musicsystem.exception;

public class ServiceException extends Exception{

	public ServiceException(){
		
	}
	public ServiceException(String msg){
		super(msg);
	}
	public ServiceException(String msg, Throwable e){
		super(msg,e);
	}
	public ServiceException(Throwable e){
		super(e);
	}

}
