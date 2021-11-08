package user;

import lombok.Getter;


public abstract class User {
    static int id = 1;
    public abstract void update(boolean status);
    public abstract  int getId();
}
