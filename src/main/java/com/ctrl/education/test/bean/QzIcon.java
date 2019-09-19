package com.ctrl.education.test.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 图标管理表
 * </p>
 *
 * @author wxs
 * @since 2019-08-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="QzIcon对象", description="图标管理表")
public class QzIcon implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "图标标签")
    private String label;

    @ApiModelProperty(value = "图标链接")
    private String url;

    @ApiModelProperty(value = "排序")
    private String sort;

    @ApiModelProperty(value = "状态，1启用，2禁用，0删除。")
    private Integer state;

    @ApiModelProperty(value = "所属顶级机构id")
    private String officeId;


}
