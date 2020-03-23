package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasCaseEntranceParam;
import autotest.com.bocom.entity.ItasCaseEntranceParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasCaseEntranceParamMapper {
    long countByExample(ItasCaseEntranceParamExample example);

    int deleteByExample(ItasCaseEntranceParamExample example);

    int deleteByPrimaryKey(Integer caseEntranceParamId);

    int insert(ItasCaseEntranceParam record);

    int insertSelective(ItasCaseEntranceParam record);

    List<ItasCaseEntranceParam> selectByExample(ItasCaseEntranceParamExample example);

    ItasCaseEntranceParam selectByPrimaryKey(Integer caseEntranceParamId);

    int updateByExampleSelective(@Param("record") ItasCaseEntranceParam record, @Param("example") ItasCaseEntranceParamExample example);

    int updateByExample(@Param("record") ItasCaseEntranceParam record, @Param("example") ItasCaseEntranceParamExample example);

    int updateByPrimaryKeySelective(ItasCaseEntranceParam record);

    int updateByPrimaryKey(ItasCaseEntranceParam record);
}