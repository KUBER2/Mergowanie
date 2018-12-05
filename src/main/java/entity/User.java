package entity;

public class User {

    private int ID;
    private String name,lastName;
    private String status;

    public User (int id, String name,String lastName, String status){
        super();
        this.ID=id;
        this.name=name;
        this.lastName=lastName;
        this.status=status;
    }

}
