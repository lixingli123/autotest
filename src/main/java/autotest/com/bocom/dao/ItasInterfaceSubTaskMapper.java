package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasInterfaceSubTask;
import autotest.com.bocom.entity.ItasInterfaceSubTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasInterfaceSubTaskMapper {
    long countByExample(ItasInterfaceSubTaskExample example);

    int deleteByExample(ItasInterfaceSubTaskExample example);

    int deleteByPrimaryKey(Integer subTaskId);

    int insert(ItasInterfaceSubTask record);

    int insertSelective(ItasInterfaceSubTask record);

    List<ItasInterfaceSubTask> selectByExample(ItasInterfaceSubTaskExample example);

    ItasInterfaceSubTask selectByPrimaryKey(Integer subTaskId);

    int updateByExampleSelective(@Param("record") ItasInterfaceSubTask record, @Param("example") ItasInterfaceSubTaskExample example);

    int updateByExample(@Param("record") ItasInterfaceSubTask record, @Param("example") ItasInterfaceSubTaskExample example);

    int updateByPrimaryKeySelective(ItasInterfaceSubTask record);

    int updateByPrimaryKey(ItasInterfaceSubTask record);
}