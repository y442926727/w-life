package cn.wlife.base.response.node;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
public class TreeNodeRes<T> implements Serializable {


    @Serial
    private static final long serialVersionUID = 4708246994428855194L;
    private T id;
    private String name;
    private Integer type;
    private Boolean isChecked;
    private Integer sort;
    private List<TreeNodeRes> children;

    public void addChildren(TreeNodeRes res) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(res);
    }


}
