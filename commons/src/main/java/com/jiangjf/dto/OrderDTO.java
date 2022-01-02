package com.jiangjf.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author jiangjf
 * @date 2021/12/26
 */
@Data
public class OrderDTO implements Serializable {
    private int id;
    @NotBlank(message = "number不能为空")
    private String number;
}
