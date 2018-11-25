package net.htmlonline.util;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class MyScope implements Scope {
    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        System.out.println(s + "'[[[[[[[[[[[[[[[[[['");
        return objectFactory.getObject();
    }

    @Override
    public Object remove(String s) {
        System.out.println(s + "'[[[[[[[[[[[[[[[[[['");
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {
        System.out.println(s + "'[[[[[[[[[[[[[[[[[['");

    }

    @Override
    public Object resolveContextualObject(String s) {
        System.out.println(s + "'[[[[[[[[[[[[[[[[[['");

        return null;
    }

    @Override
    public String getConversationId() {
        System.out.println(999);
        return null;
    }
}
