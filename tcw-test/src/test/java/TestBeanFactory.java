import controler.UserControler;
import dto.UserInfo;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestBeanFactory {

	@Test
	public void testClassPathXmlApplicationContext(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(context.getBean("userControler"));
	}

	@Test
	public void testXrnlBeanFactory(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		UserControler userControler = (UserControler) bf.getBean("userControler");
		UserInfo userInfo = new UserInfo();
		userInfo.setAddr("四川");
		userInfo.setAge(23);
		userInfo.setName("谭朝文");
		userControler.save(userInfo);
	}

}