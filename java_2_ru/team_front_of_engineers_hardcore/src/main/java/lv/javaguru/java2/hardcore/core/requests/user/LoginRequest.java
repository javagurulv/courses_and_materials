package lv.javaguru.java2.hardcore.core.requests.user;

public class LoginRequest {
    private String name;
    private String password;

    public LoginRequest() {
    }

    public LoginRequest(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
