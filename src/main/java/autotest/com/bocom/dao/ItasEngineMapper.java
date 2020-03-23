package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasEngine;
import autotest.com.bocom.entity.ItasEngineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasEngineMapper {
    long countByExample(ItasEngineExample example);

    int deleteByExample(ItasEngineExample example);

    int deleteByPrimaryKey(Integer engineId);

    int insert(ItasEngine record);

    int insertSelective(ItasEngine record);

    List<ItasEngine> selectByExample(ItasEngineExample example);

    ItasEngine selectByPrimaryKey(Integer engineId);

    int updateByExampleSelective(@Param("record") ItasEngine record, @Param("example") ItasEngineExample example);

    int updateByExample(@Param("record") ItasEngine record, @Param("example") ItasEngineExample example);

    int updateByPrimaryKeySelective(ItasEngine record);

    int updateByPrimaryKey(ItasEngine record);
}