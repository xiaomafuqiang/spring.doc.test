package net.htmlonline.beans.di;

public class LazyInit {
    public LazyInit() {
        System.out.println("init: >>" + getClass().getName() + "hashCode:" + hashCode());
    }
}
