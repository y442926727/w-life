package cn.wlife.base.response.node;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * 节点树
 * @param <T> 节点Id数据类型
 * @author  qunhua.yi
 * @since 0.1
 */
@Data
public class TreeNodeRes<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 4708246994428855194L;
    /**
     * 节点Id
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
     * 是否选中
     */
    private Boolean isChecked;
    /**
     * 同级节点排序
     */
    private Integer sort;
    /**
     * 子节点
     */
    private List<TreeNodeRes<T>> children;

    /**
     * 新增子节点
     * @param res  子树类节点对象列表
     */
    public void addChildren(List<TreeNodeRes<T>> res) {
        //当子节点属性未创建，则需要new一个用于新增子节点
        if (children == null) {
            children = new ArrayList<>();
        }
        children.addAll(res);
    }


}
