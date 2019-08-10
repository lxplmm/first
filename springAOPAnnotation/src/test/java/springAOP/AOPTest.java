package springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dzkj.biz.UserBiz;



public class AOPTest {
	public static void main(String[] args) {
		ApplicationContext aContext= new ClassPathXmlApplicationContext("applicationContext.xml");
		UserBiz userBiz =aContext.getBean(UserBiz.class);
		userBiz.findAll();
		userBiz.delete(888);
		
	}
}
