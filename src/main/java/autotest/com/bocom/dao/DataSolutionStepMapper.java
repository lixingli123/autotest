package autotest.com.bocom.dao;

import autotest.com.bocom.entity.DataSolutionStep;
import autotest.com.bocom.entity.DataSolutionStepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataSolutionStepMapper {
    long countByExample(DataSolutionStepExample example);

    int deleteByExample(DataSolutionStepExample example);

    int deleteByPrimaryKey(Integer stepId);

    int insert(DataSolutionStep record);

    int insertSelective(DataSolutionStep record);

    List<DataSolutionStep> selectByExample(DataSolutionStepExample example);

    DataSolutionStep selectByPrimaryKey(Integer stepId);

    int updateByExampleSelective(@Param("record") DataSolutionStep record, @Param("example") DataSolutionStepExample example);

    int updateByExample(@Param("record") DataSolutionStep record, @Param("example") DataSolutionStepExample example);

    int updateByPrimaryKeySelective(DataSolutionStep record);

    int updateByPrimaryKey(DataSolutionStep record);
}