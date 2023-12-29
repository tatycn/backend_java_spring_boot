package earth.tiangong.backend.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user")
public class User implements Serializable {

    @TableId(value = "id")
    private String id;

    private String name;

    private String email;

    private String phone;

    private String password;

    private Boolean isDeleted;

    private Boolean isRegistered;

    private String registerCode;

    private Timestamp createTime;

    private Timestamp loginTime;

    private String tokenKey;

    private Timestamp tokenExpireTime;

    private String description;

    private String apiLoginCode;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Boolean getIsRegistered() {
        return isRegistered;
    }

    public void setIsRegistered(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTokenKey() {
        return tokenKey;
    }

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    public Timestamp getTokenExpireTime() {
        return tokenExpireTime;
    }

    public void setTokenExpireTime(Timestamp tokenExpireTime) {
        this.tokenExpireTime = tokenExpireTime;
    }

    public String getApiLoginCode() {
        return apiLoginCode;
    }

    public void setApiLoginCode(String apiLoginCode) {
        this.apiLoginCode = apiLoginCode;
    }

    public boolean isAdmin() {
        return isAdmin(this.name);
    }

    public static boolean isAdmin(String userName) {
        return userName.equals("admin");
    }
}