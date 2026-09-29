import java.math.BigDecimal;

public class User {
    private int id;
    private String email;
    private String name;
    private String password;
    private BigDecimal wallet;
    private String address;

    public User(String address, String email, int id, String name, String password, BigDecimal wallet) {
        this.address = address;
        this.email = email;
        this.id = id;
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
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}