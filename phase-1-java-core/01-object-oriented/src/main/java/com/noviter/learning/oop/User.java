package com.noviter.learning.oop;

public class User {
    private final long id;
    private final String name;

    public User(long id, String name) {
        if (id <= 0) {
            throw new IllegalArgumentException("用户 id 必须大于 0");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("用户名不能为空");
        }
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
