package net.htmlonline.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitClassBean implements InitializingBean, DisposableBean {

    @Override
    public String toString() {

        return getClass().getName();
    }

    // test life cycle implementation mode
    // no use vs init-method or after postConstruct
    // no use vs destroy-method or after preDestroy
    @Override
    public void afterPropertiesSet() throws Exception {
        try {
            throw new Exception("999");
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element :
                    stackTrace) {
                int lineNumber = element.getLineNumber();
                String fileName = element.getFileName();
                String methodName = element.getMethodName();

                String result = "fileName: " + fileName + "," +
                        "methodName: " + methodName + "," +
                        "lineNumber: " + lineNumber + "\n;";
                System.out.println(result);

            }
        }
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}
