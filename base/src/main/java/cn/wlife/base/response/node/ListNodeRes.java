package cn.wlife.base.response.node;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;


/**
 * 节点列表
 * @param <T> 节点Id数据类型
 */
@Data
public class ListNodeRes<T> implements Serializable {


    @Serial
    private static final long serialVersionUID = 4708246994428855194L;
    /**
     *  节点Id
     */
    private T id;
    /**
     * 节点名称
     */
    private String name;
    /**
     * 节点类型，如院系专班
     */
    private Integer type;
    /**
     *  父级节点Id
     */
    private T parentId;
    /**
     * 父级节点类型，如院系专班，避免节点Id相同
     */
    private Integer parentType;
    /**
     * 是否选中
     */
    private Boolean isChecked;
    /**
     * 同级节点排序
     */
    private Integer sort;
}
