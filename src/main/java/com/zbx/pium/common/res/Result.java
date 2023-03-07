package com.zbx.pium.common.res;

import lombok.Getter;
import lombok.ToString;

/**
 * @author zbx
 * @date 2023/2/25
 * @description
 **/
@Getter
@ToString
public class Result<T> {
    private final int code;
    private final String msg;
    private final T data;

    private Result(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> Result<T> ofStatus(Status status, T data) {
        return new Result<>(status.getCode(), status.getMsg(), data);
    }

    public static <T> Result<T> ofStatus(Status status) {
        return ofStatus(status, null);
    }

    public static <T> Result<T> success(T data) {
        return ofStatus(Status.SUCCESS, data);
    }

    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> failed(T data) {
        return ofStatus(Status.FAILED, data);
    }

    public static <T> Result<T> failed() {
        return failed(null);
    }

    public static <T> Result<T> error(T data) {
        return ofStatus(Status.ERROR, data);
    }

    public static <T> Result<T> error() {
        return error(null);
    }
}
