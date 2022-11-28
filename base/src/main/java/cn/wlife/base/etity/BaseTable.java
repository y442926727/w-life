package cn.wlife.base.etity;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseTable<T> implements Serializable {

    private T id;

    private String createdTime;
    private T createdBy;
    private String updatedTime;
    private T updatedBy;

    private Boolean deleted;
}
