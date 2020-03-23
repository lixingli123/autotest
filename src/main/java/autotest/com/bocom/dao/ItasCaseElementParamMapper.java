package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasCaseElementParam;
import autotest.com.bocom.entity.ItasCaseElementParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasCaseElementParamMapper {
    long countByExample(ItasCaseElementParamExample example);

    int deleteByExample(ItasCaseElementParamExample example);

    int deleteByPrimaryKey(Integer caseEntranceParamId);

    int insert(ItasCaseElementParam record);

    int insertSelective(ItasCaseElementParam record);

    List<ItasCaseElementParam> selectByExample(ItasCaseElementParamExample example);

    ItasCaseElementParam selectByPrimaryKey(Integer caseEntranceParamId);

    int updateByExampleSelective(@Param("record") ItasCaseElementParam record, @Param("example") ItasCaseElementParamExample example);

    int updateByExample(@Param("record") ItasCaseElementParam record, @Param("example") ItasCaseElementParamExample example);

    int updateByPrimaryKeySelective(ItasCaseElementParam record);

    int updateByPrimaryKey(ItasCaseElementParam record);
}