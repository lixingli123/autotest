package autotest.com.bocom.dao;

import autotest.com.bocom.entity.DataApplyElementValue;
import autotest.com.bocom.entity.DataApplyElementValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataApplyElementValueMapper {
    long countByExample(DataApplyElementValueExample example);

    int deleteByExample(DataApplyElementValueExample example);

    int deleteByPrimaryKey(Integer elementValueId);

    int insert(DataApplyElementValue record);

    int insertSelective(DataApplyElementValue record);

    List<DataApplyElementValue> selectByExample(DataApplyElementValueExample example);

    DataApplyElementValue selectByPrimaryKey(Integer elementValueId);

    int updateByExampleSelective(@Param("record") DataApplyElementValue record, @Param("example") DataApplyElementValueExample example);

    int updateByExample(@Param("record") DataApplyElementValue record, @Param("example") DataApplyElementValueExample example);

    int updateByPrimaryKeySelective(DataApplyElementValue record);

    int updateByPrimaryKey(DataApplyElementValue record);
}