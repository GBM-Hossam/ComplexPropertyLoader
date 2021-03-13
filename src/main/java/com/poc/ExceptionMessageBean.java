package com.poc;

public class ExceptionMessageBean {
    private int code;
    private String arMessage;
    private String enMessage;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getArMessage() {
        return arMessage;
    }

    public void setArMessage(String arMessage) {
        this.arMessage = arMessage;
    }

    public String getEnMessage() {
        return enMessage;
    }

    public void setEnMessage(String enMessage) {
        this.enMessage = enMessage;
    }

    @Override
    public String toString() {
        return "ExceptionMessageBean{" +
                "code=" + code +
                ", arMessage='" + arMessage + '\'' +
                ", enMessage='" + enMessage + '\'' +
                '}';
    }
}
