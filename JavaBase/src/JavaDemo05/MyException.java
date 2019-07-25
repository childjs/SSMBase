package JavaDemo05;
/**
 *自定义异常 
 **/
public class MyException extends Exception{
	public String message;
	public MyException(String ErrorMessage){
		message = ErrorMessage;
	}
	public String getMessage(){
		return message;
	}
}
