package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasCaseRun;
import autotest.com.bocom.entity.ItasCaseRunExample;
import autotest.com.bocom.entity.ItasCaseRunWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasCaseRunMapper {
    long countByExample(ItasCaseRunExample example);

    int deleteByExample(ItasCaseRunExample example);

    int deleteByPrimaryKey(Integer runId);

    int insert(ItasCaseRunWithBLOBs record);

    int insertSelective(ItasCaseRunWithBLOBs record);

    List<ItasCaseRunWithBLOBs> selectByExampleWithBLOBs(ItasCaseRunExample example);

    List<ItasCaseRun> selectByExample(ItasCaseRunExample example);

    ItasCaseRunWithBLOBs selectByPrimaryKey(Integer runId);

    int updateByExampleSelective(@Param("record") ItasCaseRunWithBLOBs record, @Param("example") ItasCaseRunExample example);

    int updateByExampleWithBLOBs(@Param("record") ItasCaseRunWithBLOBs record, @Param("example") ItasCaseRunExample example);

    int updateByExample(@Param("record") ItasCaseRun record, @Param("example") ItasCaseRunExample example);

    int updateByPrimaryKeySelective(ItasCaseRunWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ItasCaseRunWithBLOBs record);

    int updateByPrimaryKey(ItasCaseRun record);
}