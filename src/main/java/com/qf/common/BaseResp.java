package com.qf.common;

import lombok.Data;

@Data
public class BaseResp {

    private Integer code;

    private String message;

    private Object myjs;

    private Long total;
}
