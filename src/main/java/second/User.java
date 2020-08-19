package second;

import lombok.Data;

@Data
public class User {
    private Levels levels;
    private double force;


    public User(Levels levels, double force) {
        this.levels = levels;
        this.force = force;
    }
}
