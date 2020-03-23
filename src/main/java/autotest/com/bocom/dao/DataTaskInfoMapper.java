package autotest.com.bocom.dao;

import autotest.com.bocom.entity.DataTaskInfo;
import autotest.com.bocom.entity.DataTaskInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataTaskInfoMapper {
    long countByExample(DataTaskInfoExample example);

    int deleteByExample(DataTaskInfoExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(DataTaskInfo record);

    int insertSelective(DataTaskInfo record);

    List<DataTaskInfo> selectByExampleWithBLOBs(DataTaskInfoExample example);

    List<DataTaskInfo> selectByExample(DataTaskInfoExample example);

    DataTaskInfo selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") DataTaskInfo record, @Param("example") DataTaskInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") DataTaskInfo record, @Param("example") DataTaskInfoExample example);

    int updateByExample(@Param("record") DataTaskInfo record, @Param("example") DataTaskInfoExample example);

    int updateByPrimaryKeySelective(DataTaskInfo record);

    int updateByPrimaryKeyWithBLOBs(DataTaskInfo record);

    int updateByPrimaryKey(DataTaskInfo record);
}