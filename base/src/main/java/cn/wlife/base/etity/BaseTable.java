package cn.wlife.base.etity;

import lombok.Data;

import java.io.Serializable;

/**
 * 基表类
 * @author qunhua.yi
 * @since 0.1
 * @param <T>
 */
@Data
public class BaseTable<T> implements Serializable {

    /**
     * 主键
     */
    private T id;

    /**
     * 创建时间
     */
    private String createdTime;
    /**
     * 创建人ID
     */
    private T createdBy;
    /**
     * 修改时间
     */
    private String updatedTime;
    /**
     * 修改人ID
     */
    private T updatedBy;

    /**
     * 是否逻辑删除，true已删除,false未删除
     */
    private Boolean deleted;
}
