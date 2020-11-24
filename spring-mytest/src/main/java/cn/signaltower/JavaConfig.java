package cn.signaltower;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author : William Jiang
 * @Date : 2020-11-24 10:16
 * @Description :
 */
@Configuration
@ComponentScan
public class JavaConfig {

	@Bean
	public User user() {
	    return new User("jiangtao", "12345678");
	}
}
