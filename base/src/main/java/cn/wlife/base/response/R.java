package cn.wlife.base.response;

import java.io.Serializable;

/**
 * 结果返回体
 * @param <T>
 */
public class R<T> implements Serializable {

    /**
     *返回结果代码
     */
    private String code;
    /**
     * 返回消息
     */
    private String msg;
    /**
     * 返回数据
     */
    private T data;

    public R() {
        this.code = ReturnMsgEnum.SUCCESS.getCode();
        this.msg = ReturnMsgEnum.SUCCESS.getMsg();
    }

    public R(ReturnMsgEnum returnMsgEnum) {
        this.code = returnMsgEnum.getCode();
        this.msg = returnMsgEnum.getMsg();
    }

    public R(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    public R(T data) {
        this.code = ReturnMsgEnum.SUCCESS.getCode();
        this.msg = ReturnMsgEnum.SUCCESS.getMsg();
        this.data = data;
    }

}
