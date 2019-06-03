import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanFactory {

	@Test
	public void testClassPathXmlApplicationContext(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(context.getBean("userInfo"));
	}

}