package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasCase;
import autotest.com.bocom.entity.ItasCaseExample;
import autotest.com.bocom.entity.ItasCaseWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasCaseMapper {
    long countByExample(ItasCaseExample example);

    int deleteByExample(ItasCaseExample example);

    int deleteByPrimaryKey(Integer caseId);

    int insert(ItasCaseWithBLOBs record);

    int insertSelective(ItasCaseWithBLOBs record);

    List<ItasCaseWithBLOBs> selectByExampleWithBLOBs(ItasCaseExample example);

    List<ItasCase> selectByExample(ItasCaseExample example);

    ItasCaseWithBLOBs selectByPrimaryKey(Integer caseId);

    int updateByExampleSelective(@Param("record") ItasCaseWithBLOBs record, @Param("example") ItasCaseExample example);

    int updateByExampleWithBLOBs(@Param("record") ItasCaseWithBLOBs record, @Param("example") ItasCaseExample example);

    int updateByExample(@Param("record") ItasCase record, @Param("example") ItasCaseExample example);

    int updateByPrimaryKeySelective(ItasCaseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ItasCaseWithBLOBs record);

    int updateByPrimaryKey(ItasCase record);
}