package com.ych.shcm.o2o.model.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.PayOrderStatus;

@MappedTypes(PayOrderStatus.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class PayOrderStatusTypeHandler extends IntValueHolderTypeHandler<PayOrderStatus> {

	public PayOrderStatusTypeHandler(Class<PayOrderStatus> type) {
		super(type);
	}


}
