package com.superOOP.generic;

import org.junit.Test;

import java.util.*;

/**
 * @author mzm
 * @version 1.0
 */
public class GenericHomework {
    public static void main(String[] args) {

    }
    @Test
    public void testList() {
        DAO<User> dao = new DAO<>();
        dao.save("001", new User(1, 10, "aa"));
        dao.save("002", new User(2, 20, "bb"));
        dao.save("003", new User(3, 30, "cc"));

        List<User> list = dao.list();
        System.out.println(list);

        dao.update("003", new User(3, 40, "cc"));

        list = dao.list();
        System.out.println(list);

        dao.delete("001");

        list = dao.list();
        System.out.println(list);

        System.out.println(dao.get("003"));

    }
}
class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();
    public T get(String id) {
        return map.get(id);
    }
    public void update(String id, T entity) {
        map.put(id, entity);
    }
    public List<T> list() {
        List<T> list = new ArrayList<>();

        Set<String> keyset = map.keySet();
        for (String key :keyset) {
            list.add(get(key));
        }
        return list;
    }
    public void delete(String id) {
        map.remove(id);
    }
    public void save(String id, T entity) {
        map.put(id, entity);
    }
}
