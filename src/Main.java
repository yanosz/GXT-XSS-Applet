import java.applet.Applet;
import java.applet.AppletContext;
import java.net.MalformedURLException;
import java.net.URL;


public class Main extends Applet {
	public void start(){
		AppletContext appContext = getAppletContext();
		try {
			appContext.showDocument(new URL("javascript:alert('peng')"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
