package cn.wlife.base.request;

import lombok.Data;

import java.io.Serializable;


/**
 * 根据id及其类型查询分页
 * @author qunhua.yi
 * @param <T>
 */
@Data
public class CommonSearchIdPageReq<T> extends PageInfoReq implements Serializable {

    /**
     * 需要依据查询的Id
     */
    private T id;
    /**
     * 查询的Id类型
     */
    private Integer type;
}
