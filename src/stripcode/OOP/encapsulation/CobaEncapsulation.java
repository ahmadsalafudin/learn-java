package pertemuan4.encapsulation;

/**
 *
 * @author ahmad
 */
public class CobaEncapsulation {

    //atribut
    private String username;
    private int password;

    protected String getUsername() {
        return username;
    }

    protected void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

}
