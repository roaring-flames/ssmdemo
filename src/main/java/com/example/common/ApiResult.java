package com.example.common;

import lombok.Data;

@Data
public class ApiResult {
    private Boolean success = true;

    private Object data="";

    private Integer code=200;

    private String errorCode ="";

    private String dataValue = "";

    private String exception="";

}
