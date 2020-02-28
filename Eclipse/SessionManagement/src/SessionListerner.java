import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
@WebListener
public class SessionListerner implements HttpSessionListener{
	int count = 0;
	@Override
	public void sessionCreated(HttpSessionEvent he) {
		System.out.println(he.getSession().getId());
		count++;
		System.out.println("Session Count -> "+count);
		
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent he) {
		count--;
		System.out.println("Session Count -> "+count);
		
	}
}
