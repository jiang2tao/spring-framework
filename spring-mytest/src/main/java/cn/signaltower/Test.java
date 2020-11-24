package cn.signaltower;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author : William Jiang
 * @Date : 2020-11-24 10:18
 * @Description :
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User)context.getBean("user");
		System.out.println(user.toString());

	}
}
