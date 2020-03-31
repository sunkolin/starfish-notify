package com.starfish.notify.exception;

import com.starfish.notify.enums.ResultEnum;

/**
 * @author sunny
 * @version 1.0.0
 * @since 2013-5-7
 */
@SuppressWarnings(value = "serial,unused")
public class CustomException extends RuntimeException {

    /**
     * code
     */
    private int code;

    /**
     * message
     */
    private String message = "";

    /**
     * desc
     */
    private String description = "";

    public CustomException() {
        super();
    }

    /**
     * construct method
     *
     * @param code    code
     * @param message message
     */
    public CustomException(int code, String message) {
        this(code, message, "");
    }

    /**
     * 构造方法
     *
     * @param code        code
     * @param message     message
     * @param description description
     */
    public CustomException(int code, String message, String description) {
        super(message);
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public CustomException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
