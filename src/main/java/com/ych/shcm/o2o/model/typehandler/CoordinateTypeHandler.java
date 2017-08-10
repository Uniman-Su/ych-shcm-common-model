package com.ych.shcm.o2o.model.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.CoordinateType;

@MappedTypes(CoordinateType.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class CoordinateTypeHandler extends IntValueHolderTypeHandler<CoordinateType> {

	public CoordinateTypeHandler(Class<CoordinateType> type) {
		super(type);
	}


}
