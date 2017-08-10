package com.ych.shcm.o2o.model.typehandler;

import com.ych.core.mybatis.type.IntValueHolderTypeHandler;
import com.ych.shcm.o2o.model.CoordinateType;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

@MappedTypes(CoordinateType.class)
@MappedJdbcTypes(JdbcType.NUMERIC)
public class CoordinateTypeTypeHandler extends IntValueHolderTypeHandler<CoordinateType> {

    public CoordinateTypeTypeHandler(Class<CoordinateType> type) {
        super(type);
    }

}
