package user;

import lombok.Getter;

@Getter
public class Sender extends User{
    private int id;
    public Sender(){
        this.id = User.id++;
    }
    @Override
    public void update(boolean status) {
        if (status) System.out.println("Updated");
    }

    @Override
    public int getId() {
        return this.id;
    }

}
