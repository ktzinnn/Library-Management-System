import java.math.BigDecimal;

public class User {
    private int idUser;
    private String email;
    private String name;
    private String password;
    private BigDecimal wallet;
    private String address;

    public User() {

    }

    public User(String address, String email, int idUser, String name, String password, BigDecimal wallet) {
        this.address = address;
        this.email = email;
        this.idUser = idUser;
        this.name = name;
        this.password = password;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getWallet() {
        return wallet;
    }

    public void setWallet(BigDecimal wallet) {
        this.wallet = wallet;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return idUser;
    }

    public void setId(int idUser) {
        this.idUser = idUser;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}