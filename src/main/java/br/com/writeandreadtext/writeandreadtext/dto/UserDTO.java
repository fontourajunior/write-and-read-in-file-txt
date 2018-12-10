package br.com.writeandreadtext.writeandreadtext.dto;

public class UserDTO {

    private String id;
    private String name;
    private String nickName;
    private String password;

    public UserDTO(String id, String name, String nickName, String password) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.password = password;
    }

    public UserDTO(String name, String nickName, String password) {
        this.name = name;
        this.nickName = nickName;
        this.password = password;
    }

    public UserDTO() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
