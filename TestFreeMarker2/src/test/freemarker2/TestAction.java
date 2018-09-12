package test.freemarker2;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	private String companyName="AC";
	
	public String execute() throws Exception {
		System.out.println("TestAction.execute()");
		return SUCCESS;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
}
