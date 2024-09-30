package cn.wlife.base.response;

/**
 * 返回结果体代码枚举
 */
public enum ReturnMsgEnum {

    SUCCESS("000000", "成功"),
    FAIL("100001", "请求失败"),
    NEED_LOGIN("-1", "请重新登录");

    private String code;
    private String msg;

    ReturnMsgEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
