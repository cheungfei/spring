import com.cnos.springboot.service.OrderService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-30 12:07
 */
//@RunWith(SpringRunner.class)
public class Test {
    @Resource
    private OrderService orderService;

//    @org.junit.Test
    public void testSpringEvent() {
        orderService.order();
    }

    public static void main(String[] args) {

    }
}
