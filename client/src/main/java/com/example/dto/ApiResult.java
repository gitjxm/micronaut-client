package com.example.dto;

import com.hzon.de.error.DeError;
import lombok.Data;

import java.io.Serializable;

/**
 * 服务层响应封装对象
 * @param <T> 响应数据类型
 */
@Data
public class ApiResult<T> implements Serializable {
    public static final String FAIL = "0";
    public static final String OK = "1";
    public static final String WARNING = "2";
    /**
     * 响应码
     */
    private String code;
    /**
     * 错误信息
     */
    private String msg;
    /**
     * 响应数据
     */
    private T data;

    private ApiResult() {
    }

    /**
     * 成功返回
     * @param data
     * @param <T>
     * @return
     */
    public static <T> ApiResult<T> ok(final T data){
        ApiResult r = new ApiResult();
        r.code = OK;
        r.data = data;
        return r;
    }

    /**
     * 失败返回
     * @param msg
     * @param <T>
     * @return
     */
    public static <T> ApiResult<T> fail(final String msg){
        ApiResult r = new ApiResult();
        r.code = FAIL;
        r.msg = msg;
        return r;
    }

    /**
     * 异常返回
     *
     * @param err
     * @param <T>
     * @return
     */
    public static <T> ApiResult<T> notOk(final DeError err){
        ApiResult r = new ApiResult();
        r.code = err.getErrorCode();
        r.msg =err.getErrorMsg();
        return r;
    }


    /**
     * 判断是否成功返回
     *
     * @return
     */
    public Boolean isSuccess(){
        return OK.equals(code)  || WARNING.equals(code);
    }

}
