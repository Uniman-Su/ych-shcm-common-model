package com.ych.shcm.o2o.openinf;

import com.fasterxml.jackson.core.type.TypeReference;

/**
 * 请求的命令类型
 */
public enum RequestAction {

    /**
     * 车辆参加延保服务
     */
    Guarantee(new TypeReference<Request<GuaranteeRequestPayload>>() {
    });

    private TypeReference requestTypeReference;

    RequestAction(TypeReference requestTypeReference) {
        this.requestTypeReference = requestTypeReference;
    }

    public TypeReference getRequestTypeReference() {
        return requestTypeReference;
    }
}
