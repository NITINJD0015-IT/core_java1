package exception;
public class LowBalanceException extends Exception
{
	String msg;
                 LowBalanceException()
                 {
                	 super("Low balance exception");
                	 msg="Low balance exception";
                 }
                 
                 LowBalanceException(String msg)
                 {
                	 super(msg);
                	 this.msg=msg; 
                 }

				@Override
				public String toString() {
					return  msg  ;
				}
                 
                 
}
