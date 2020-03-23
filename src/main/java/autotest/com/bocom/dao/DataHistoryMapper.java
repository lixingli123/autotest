package autotest.com.bocom.dao;

import autotest.com.bocom.entity.DataHistory;
import autotest.com.bocom.entity.DataHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataHistoryMapper {
    long countByExample(DataHistoryExample example);

    int deleteByExample(DataHistoryExample example);

    int deleteByPrimaryKey(Integer historyId);

    int insert(DataHistory record);

    int insertSelective(DataHistory record);

    List<DataHistory> selectByExample(DataHistoryExample example);

    DataHistory selectByPrimaryKey(Integer historyId);

    int updateByExampleSelective(@Param("record") DataHistory record, @Param("example") DataHistoryExample example);

    int updateByExample(@Param("record") DataHistory record, @Param("example") DataHistoryExample example);

    int updateByPrimaryKeySelective(DataHistory record);

    int updateByPrimaryKey(DataHistory record);
}