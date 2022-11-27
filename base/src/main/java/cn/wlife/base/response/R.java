package cn.wlife.base.response;

import java.io.Serializable;

public class R<T> implements Serializable {

    private String code;
    private String msg;
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
