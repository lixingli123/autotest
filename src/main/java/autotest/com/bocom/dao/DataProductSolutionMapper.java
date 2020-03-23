package autotest.com.bocom.dao;

import autotest.com.bocom.entity.DataProductSolution;
import autotest.com.bocom.entity.DataProductSolutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataProductSolutionMapper {
    long countByExample(DataProductSolutionExample example);

    int deleteByExample(DataProductSolutionExample example);

    int deleteByPrimaryKey(Integer solutionId);

    int insert(DataProductSolution record);

    int insertSelective(DataProductSolution record);

    List<DataProductSolution> selectByExample(DataProductSolutionExample example);

    DataProductSolution selectByPrimaryKey(Integer solutionId);

    int updateByExampleSelective(@Param("record") DataProductSolution record, @Param("example") DataProductSolutionExample example);

    int updateByExample(@Param("record") DataProductSolution record, @Param("example") DataProductSolutionExample example);

    int updateByPrimaryKeySelective(DataProductSolution record);

    int updateByPrimaryKey(DataProductSolution record);
}