package org.geekster;
public class Post {



    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Post{" +
                "value='" + value + '\'' +
                '}';
    }
}