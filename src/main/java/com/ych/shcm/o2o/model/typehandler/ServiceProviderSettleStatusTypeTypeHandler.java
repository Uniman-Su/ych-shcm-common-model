package com.ych.shcm.o2o.model.typehandler;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.ServiceProviderSettleStatus;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes(ServiceProviderSettleStatus.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class ServiceProviderSettleStatusTypeTypeHandler extends IntValueHolderTypeHandler<ServiceProviderSettleStatus> {

    public ServiceProviderSettleStatusTypeTypeHandler(Class<ServiceProviderSettleStatus> type) {
        super(type);
    }

}
