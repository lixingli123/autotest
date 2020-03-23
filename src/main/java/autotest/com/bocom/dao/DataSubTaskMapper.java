package autotest.com.bocom.dao;

import autotest.com.bocom.entity.DataSubTask;
import autotest.com.bocom.entity.DataSubTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataSubTaskMapper {
    long countByExample(DataSubTaskExample example);

    int deleteByExample(DataSubTaskExample example);

    int deleteByPrimaryKey(Integer subTaskId);

    int insert(DataSubTask record);

    int insertSelective(DataSubTask record);

    List<DataSubTask> selectByExample(DataSubTaskExample example);

    DataSubTask selectByPrimaryKey(Integer subTaskId);

    int updateByExampleSelective(@Param("record") DataSubTask record, @Param("example") DataSubTaskExample example);

    int updateByExample(@Param("record") DataSubTask record, @Param("example") DataSubTaskExample example);

    int updateByPrimaryKeySelective(DataSubTask record);

    int updateByPrimaryKey(DataSubTask record);
}