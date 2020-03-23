package autotest.com.bocom.dao;

import autotest.com.bocom.entity.DataFactor;
import autotest.com.bocom.entity.DataFactorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataFactorMapper {
    long countByExample(DataFactorExample example);

    int deleteByExample(DataFactorExample example);

    int deleteByPrimaryKey(Integer elementId);

    int insert(DataFactor record);

    int insertSelective(DataFactor record);

    List<DataFactor> selectByExample(DataFactorExample example);

    DataFactor selectByPrimaryKey(Integer elementId);

    int updateByExampleSelective(@Param("record") DataFactor record, @Param("example") DataFactorExample example);

    int updateByExample(@Param("record") DataFactor record, @Param("example") DataFactorExample example);

    int updateByPrimaryKeySelective(DataFactor record);

    int updateByPrimaryKey(DataFactor record);
}