package test.freemarker;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class Test1 {
	public static void main(String[] args) throws Exception{
		Configuration cfg = new Configuration();
		cfg.setDirectoryForTemplateLoading(new File("templates"));
		
		Map root = new HashMap();
		root.put("user", "李大爷");
		root.put("random", new Random().nextInt(100));
		
		List list = new ArrayList();
		list.add(new Address("中国","北京"));
		list.add(new Address("中国","上海"));
		list.add(new Address("美国","纽约"));
		root.put("list", list);
		root.put("date1", new Date());
		
		Template t1 = cfg.getTemplate("a.ftl");
		Writer out = new OutputStreamWriter(System.out);
		t1.process(root,out);
		out.flush();
		out.close();
	}
}
