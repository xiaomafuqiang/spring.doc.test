package net.htmlonline.events.custom;
import org.springframework.context.ApplicationEvent;

/**
 * 自定义一个事件
 *
 */
public class DemoEvent extends ApplicationEvent{

    private String msg;

    private String email;

    public DemoEvent(Object source,String msg,String email) {
        super(source);
        this.msg=msg;
        this.email=email;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}