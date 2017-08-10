package com.ych.shcm.o2o.model.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.ServiceStatus;

@MappedTypes(ServiceStatus.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class ServiceStatusTypeHandler extends IntValueHolderTypeHandler<ServiceStatus> {

	public ServiceStatusTypeHandler(Class<ServiceStatus> type) {
		super(type);
	}


}
