package com.ych.shcm.o2o.model.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.PayChannel;

@MappedTypes(PayChannel.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class PayChannelTypeHandler extends IntValueHolderTypeHandler<PayChannel> {

	public PayChannelTypeHandler(Class<PayChannel> type) {
		super(type);
	}


}
