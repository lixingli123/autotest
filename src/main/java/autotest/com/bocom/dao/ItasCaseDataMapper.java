package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasCaseData;
import autotest.com.bocom.entity.ItasCaseDataExample;
import autotest.com.bocom.entity.ItasCaseDataWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasCaseDataMapper {
    long countByExample(ItasCaseDataExample example);

    int deleteByExample(ItasCaseDataExample example);

    int deleteByPrimaryKey(Integer dataId);

    int insert(ItasCaseDataWithBLOBs record);

    int insertSelective(ItasCaseDataWithBLOBs record);

    List<ItasCaseDataWithBLOBs> selectByExampleWithBLOBs(ItasCaseDataExample example);

    List<ItasCaseData> selectByExample(ItasCaseDataExample example);

    ItasCaseDataWithBLOBs selectByPrimaryKey(Integer dataId);

    int updateByExampleSelective(@Param("record") ItasCaseDataWithBLOBs record, @Param("example") ItasCaseDataExample example);

    int updateByExampleWithBLOBs(@Param("record") ItasCaseDataWithBLOBs record, @Param("example") ItasCaseDataExample example);

    int updateByExample(@Param("record") ItasCaseData record, @Param("example") ItasCaseDataExample example);

    int updateByPrimaryKeySelective(ItasCaseDataWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ItasCaseDataWithBLOBs record);

    int updateByPrimaryKey(ItasCaseData record);
}