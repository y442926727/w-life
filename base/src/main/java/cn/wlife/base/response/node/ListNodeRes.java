package cn.wlife.base.response.node;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class ListNodeRes<T> implements Serializable {


    @Serial
    private static final long serialVersionUID = 4708246994428855194L;
    private T id;
    private String name;
    private Integer type;
    private T parentId;
    private Integer parentType;
    private Boolean isChecked;
    private Integer sort;
}
