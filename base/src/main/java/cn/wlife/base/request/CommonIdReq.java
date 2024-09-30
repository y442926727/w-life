package cn.wlife.base.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


/**
 * 单id公共请求基类
 * @param <T>
 * @author  qunhua.yi
 */
@Data
public class CommonIdReq<T> implements Serializable {


    @Serial
    private static final long serialVersionUID = -8919306164417544359L;

    @NotNull(message = "ids不能为空")
    private  T is;
}
