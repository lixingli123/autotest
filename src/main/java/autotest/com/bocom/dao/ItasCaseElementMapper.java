package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasCaseElement;
import autotest.com.bocom.entity.ItasCaseElementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasCaseElementMapper {
    long countByExample(ItasCaseElementExample example);

    int deleteByExample(ItasCaseElementExample example);

    int insert(ItasCaseElement record);

    int insertSelective(ItasCaseElement record);

    List<ItasCaseElement> selectByExampleWithBLOBs(ItasCaseElementExample example);

    List<ItasCaseElement> selectByExample(ItasCaseElementExample example);

    int updateByExampleSelective(@Param("record") ItasCaseElement record, @Param("example") ItasCaseElementExample example);

    int updateByExampleWithBLOBs(@Param("record") ItasCaseElement record, @Param("example") ItasCaseElementExample example);

    int updateByExample(@Param("record") ItasCaseElement record, @Param("example") ItasCaseElementExample example);
}