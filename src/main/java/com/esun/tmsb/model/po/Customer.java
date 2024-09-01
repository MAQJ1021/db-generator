package com.esun.tmsb.model.po;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author MAQJ
 */
@Data
@TableName("customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * T24客户号
     */
    private String customterId;

    /**
     * 顾客名称
     */
    private String name;

    /**
     * 证件号码
     */
    private String documentId;

    /**
     * 证件类型
     */
    private String documentType;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


}
