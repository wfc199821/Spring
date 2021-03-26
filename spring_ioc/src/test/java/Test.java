import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.Fc.service.UserService;

import java.util.Arrays;

/**
 * @Author 吴富潮
 * @Date 2021/3/25 20:53
 * @Version 1.0
 */
public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = app.getBean(UserService.class);
        userService.service();
    }

}
