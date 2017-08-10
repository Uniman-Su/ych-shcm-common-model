package com.ych.shcm.o2o.model.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.RefundOrderStatus;

@MappedTypes(RefundOrderStatus.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class RefundOrderStatusTypeHandler extends IntValueHolderTypeHandler<RefundOrderStatus> {

	public RefundOrderStatusTypeHandler(Class<RefundOrderStatus> type) {
		super(type);
	}


}
