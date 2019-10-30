package com.zoe.reflection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zoe
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Inject(name = "反射测试",number = 80)
class User {
    @Tag(limit = 10,TYPE = TagType.ONE)
    private String account;
    @Tag(limit = 20,TYPE = TagType.TWO)
    private String accountPassword;
    @Tag(limit = 30,TYPE = TagType.THREE)
    private String userName;
    @Tag(limit = 40,TYPE = TagType.FORE)
    private String userPhone;
    @Tag(limit = 50,TYPE = TagType.FIVE)
    private String userEmail;
    @Tag(limit = 60,TYPE = TagType.SEX)
    private Long roleId;
    @Tag(limit = 70,TYPE = TagType.SERVER)
    private Long customerId;

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", accountPassword='" + accountPassword + '\'' +
                ", userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", roleId=" + roleId +
                ", customerId=" + customerId +
                '}';
    }
}
