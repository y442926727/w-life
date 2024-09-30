package cn.wlife.base.request;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


/**
 * 多id公共请求基类
 * @param <T>
 * @author  qunhua.yi
 */
@Data
public class CommonIdsReq<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 5283749414670622101L;

    @NotEmpty(message = "ids不能为空")
    private List<T> ids;
}
