package musicsystem.exception;

public class ServiceRuntimeException extends RuntimeException {

	public ServiceRuntimeException(){
		
	}
	public ServiceRuntimeException(String msg){
		super(msg);
	}
	public ServiceRuntimeException(String msg, Throwable e){
		super(msg,e);
	}
	public ServiceRuntimeException(Throwable e){
		super(e);
	}

}
