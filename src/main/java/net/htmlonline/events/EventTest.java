package net.htmlonline.events;

import net.htmlonline.events.custom.DemoEvent;
import net.htmlonline.events.custom.DemoEventPublisher;
import net.htmlonline.util.BaseJunit4Test;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventTest extends BaseJunit4Test {
    private ApplicationContext context = getContext(); // using it first should add config to xml config

    @Test
    // buildInEventBean
    public void buildInEventBean() {
        // BuildInEventBean eventBean = context.getBean("buildInEventBean", BuildInEventBean.class);
    }


    @Test
    // customer event
    public void customEvent() {
        DemoEventPublisher demoEventPublisher = context.getBean("demoEventPublisher", DemoEventPublisher.class);

        // 创建发布类 易于管理
        // demoEventPublisher.pushList("张三1", "565792147@qq.com");
        // demoEventPublisher.pushList("张三2", "565792147@qq.com");
        // demoEventPublisher.pushList("张三3", "565792147@qq.com");
        // demoEventPublisher.pushList("张三4", "565792147@qq.com");
        // demoEventPublisher.pushList("张三5", "565792147@qq.com");

        // 实际有效
        context.publishEvent(new DemoEvent(this, "张三1", "565792147@qq.com"));

    }
}
