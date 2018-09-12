package test.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

	public static void main(String[] args) {
		ResourceBundle res = ResourceBundle.getBundle("test.i18n.app",Locale.CHINA);
		System.out.println(res.getString("welcome.msg"));

	}

}
