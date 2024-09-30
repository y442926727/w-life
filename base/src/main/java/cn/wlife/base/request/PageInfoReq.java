package cn.wlife.base.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import java.io.Serializable;


/**
 * 分页查询入参
 * @author qunhua.yi
 * @since 0.1
 */
@Data
public class PageInfoReq implements Serializable {
    /**
     * 当前页数
     */
    @NotNull(message = "当前页数不能为空")
    private Integer pageNum;
    /**
     * 每页显示条数
     * <pre>
     *     值为-1，mybatis-plus则查询所有数据
     * </pre>
     */
    @NotNull(message = "每页显示条数不能为空")
    @Range(min = -1, max = 100, message = "每页条数必须在-1到100之间")
    private Integer pageSize;

    /**
     * 查询关键字
     */
    private String keywords;
}
