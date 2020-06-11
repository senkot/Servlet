package app.model;

import app.entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    public static Model instance = new Model();

    private List<User> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void addUser(User user) {
        model.add(user);
    }

    public List<String> list() {
        return model.stream().map(User::getName).collect(Collectors.toList());
    }

    public List<Integer> idList() {
        return model.stream().map(User::getId).collect(Collectors.toList());
    }
}
