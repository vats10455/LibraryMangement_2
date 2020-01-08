package in.edu.charusat.cspit.it.librarymangement;

public class adduser {
    String name;
    String id;
    String pass;
    String mail;
    String number;
    String type;

    public adduser() {
    }

    public adduser(String name, String id, String pass, String mail, String number ,String type) {
        this.name = name;
        this.id = id;
        this.pass = pass;
        this.mail = mail;
        this.number = number;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }

    public String getMail() {
        return mail;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(String type) {
        this.type = type;
    }
}
