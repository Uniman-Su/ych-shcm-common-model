package com.ych.shcm.o2o.model.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.ThirdAuthType;

@MappedTypes(ThirdAuthType.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class ThirdAuthTypeHandler extends IntValueHolderTypeHandler<ThirdAuthType> {

	public ThirdAuthTypeHandler(Class<ThirdAuthType> type) {
		super(type);
	}


}
