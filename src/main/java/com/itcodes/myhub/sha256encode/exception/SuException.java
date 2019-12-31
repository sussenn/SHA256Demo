package com.itcodes.myhub.sha256encode.exception;

/**
 * @ClassName SuException   自定义异常
 * @Author sussen
 * @Version 1.0
 * @Data 2019/12/31
 */
public class SuException extends RuntimeException {

    private static final long serialVersionUID = -4666722615690041175L;
    private String msg;
    private int code = 500;

    public SuException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public SuException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public SuException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public SuException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
