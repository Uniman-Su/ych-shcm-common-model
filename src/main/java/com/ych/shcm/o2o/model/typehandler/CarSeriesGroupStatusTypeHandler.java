package com.ych.shcm.o2o.model.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.CarSeriesGroupStatus;

@MappedTypes(CarSeriesGroupStatus.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class CarSeriesGroupStatusTypeHandler extends IntValueHolderTypeHandler<CarSeriesGroupStatus> {

	public CarSeriesGroupStatusTypeHandler(Class<CarSeriesGroupStatus> type) {
		super(type);
	}


}
