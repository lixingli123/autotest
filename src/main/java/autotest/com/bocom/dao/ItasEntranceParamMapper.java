package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasEntranceParam;
import autotest.com.bocom.entity.ItasEntranceParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasEntranceParamMapper {
    long countByExample(ItasEntranceParamExample example);

    int deleteByExample(ItasEntranceParamExample example);

    int deleteByPrimaryKey(Integer entranceParamId);

    int insert(ItasEntranceParam record);

    int insertSelective(ItasEntranceParam record);

    List<ItasEntranceParam> selectByExample(ItasEntranceParamExample example);

    ItasEntranceParam selectByPrimaryKey(Integer entranceParamId);

    int updateByExampleSelective(@Param("record") ItasEntranceParam record, @Param("example") ItasEntranceParamExample example);

    int updateByExample(@Param("record") ItasEntranceParam record, @Param("example") ItasEntranceParamExample example);

    int updateByPrimaryKeySelective(ItasEntranceParam record);

    int updateByPrimaryKey(ItasEntranceParam record);
}