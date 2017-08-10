package com.ych.shcm.o2o.model.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.ServiceProviderSettleStatus;

@MappedTypes(ServiceProviderSettleStatus.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class ServiceProviderSettleStatusTypeHandler extends IntValueHolderTypeHandler<ServiceProviderSettleStatus> {

	public ServiceProviderSettleStatusTypeHandler(Class<ServiceProviderSettleStatus> type) {
		super(type);
	}


}
