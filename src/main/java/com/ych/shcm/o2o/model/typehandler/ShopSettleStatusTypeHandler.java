package com.ych.shcm.o2o.model.typehandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.ShopSettleStatus;

@MappedTypes(ShopSettleStatus.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class ShopSettleStatusTypeHandler extends IntValueHolderTypeHandler<ShopSettleStatus> {

	public ShopSettleStatusTypeHandler(Class<ShopSettleStatus> type) {
		super(type);
	}


}
