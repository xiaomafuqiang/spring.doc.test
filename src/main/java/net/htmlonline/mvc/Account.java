package net.htmlonline.mvc;

import javax.validation.constraints.NotNull;

public class Account {
    private int count;

    @NotNull
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Account(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Account{" +
                "count=" + count +
                '}';
    }
}
