package user;

import lombok.Getter;

@Getter
public class Receiver extends User{
    private int id;
    public Receiver(){
        this.id = User.id++;
    }
    @Override
    public void update(boolean status) {
        if (status) System.out.printf("Updated receiver %s", getId());
    }

}
