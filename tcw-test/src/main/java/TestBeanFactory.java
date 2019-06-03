import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @description:
 * @author: Tanchaowen
 * @create: 2019-06-03 09:44
 **/
public class TestBeanFactory {

	public static void main(String[] args){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println(context.getBean("userInfo"));
	}

}
