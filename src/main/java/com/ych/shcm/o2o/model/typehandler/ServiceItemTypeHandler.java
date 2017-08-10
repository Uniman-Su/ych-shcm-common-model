package com.ych.shcm.o2o.model.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.ServiceItemType;

@MappedTypes(ServiceItemType.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class ServiceItemTypeHandler extends IntValueHolderTypeHandler<ServiceItemType> {

	public ServiceItemTypeHandler(Class<ServiceItemType> type) {
		super(type);
	}


}
