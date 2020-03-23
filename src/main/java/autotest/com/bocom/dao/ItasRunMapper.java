package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasRun;
import autotest.com.bocom.entity.ItasRunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasRunMapper {
    long countByExample(ItasRunExample example);

    int deleteByExample(ItasRunExample example);

    int deleteByPrimaryKey(Integer runId);

    int insert(ItasRun record);

    int insertSelective(ItasRun record);

    List<ItasRun> selectByExample(ItasRunExample example);

    ItasRun selectByPrimaryKey(Integer runId);

    int updateByExampleSelective(@Param("record") ItasRun record, @Param("example") ItasRunExample example);

    int updateByExample(@Param("record") ItasRun record, @Param("example") ItasRunExample example);

    int updateByPrimaryKeySelective(ItasRun record);

    int updateByPrimaryKey(ItasRun record);
}