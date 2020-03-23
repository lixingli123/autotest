package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasEngineParam;
import autotest.com.bocom.entity.ItasEngineParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasEngineParamMapper {
    long countByExample(ItasEngineParamExample example);

    int deleteByExample(ItasEngineParamExample example);

    int insert(ItasEngineParam record);

    int insertSelective(ItasEngineParam record);

    List<ItasEngineParam> selectByExample(ItasEngineParamExample example);

    int updateByExampleSelective(@Param("record") ItasEngineParam record, @Param("example") ItasEngineParamExample example);

    int updateByExample(@Param("record") ItasEngineParam record, @Param("example") ItasEngineParamExample example);
}