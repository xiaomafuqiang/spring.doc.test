package net.htmlonline.init;

import net.htmlonline.beans.InitClassBean;
import net.htmlonline.util.BaseJunit4Test;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class InitUnit extends BaseJunit4Test {

    @Autowired
    private InitClassBean initClassBean2;
    @Test
    public void runWith(){
//        System.out.println(initClassBean2);
    }

}