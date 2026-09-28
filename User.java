import java.math.BigDecimal;
public class User{
    private String name;
    private String password;
    private BigDecimal wallet;
    private String address;
    public User(String Name, String password,BigDecimal wallet, String address){
        this.name = name;
        this.password = password;
        this.wallet = wallet;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
        
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public BigDecimal getWallet(){
        return wallet;
    }
    public void setWallet(BigDecimal wallet){
        this.wallet = wallet;  
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}