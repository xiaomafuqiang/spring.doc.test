package net.htmlonline.bean.property.editor;

import org.springframework.stereotype.Component;

@Component
public class Telephone {

    /* 区号 */
    private String areaCode;
    /* 号码 */
    private String phone;

    public Telephone() {
    }

    public Telephone(String areaCode, String phone) {
        this.areaCode = areaCode;
        this.phone = phone;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Telephone{" +
                "areaCode='" + areaCode + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}