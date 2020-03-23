package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasInterfaceTask;
import autotest.com.bocom.entity.ItasInterfaceTaskExample;
import autotest.com.bocom.entity.ItasInterfaceTaskWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasInterfaceTaskMapper {
    long countByExample(ItasInterfaceTaskExample example);

    int deleteByExample(ItasInterfaceTaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(ItasInterfaceTaskWithBLOBs record);

    int insertSelective(ItasInterfaceTaskWithBLOBs record);

    List<ItasInterfaceTaskWithBLOBs> selectByExampleWithBLOBs(ItasInterfaceTaskExample example);

    List<ItasInterfaceTask> selectByExample(ItasInterfaceTaskExample example);

    ItasInterfaceTaskWithBLOBs selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") ItasInterfaceTaskWithBLOBs record, @Param("example") ItasInterfaceTaskExample example);

    int updateByExampleWithBLOBs(@Param("record") ItasInterfaceTaskWithBLOBs record, @Param("example") ItasInterfaceTaskExample example);

    int updateByExample(@Param("record") ItasInterfaceTask record, @Param("example") ItasInterfaceTaskExample example);

    int updateByPrimaryKeySelective(ItasInterfaceTaskWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ItasInterfaceTaskWithBLOBs record);

    int updateByPrimaryKey(ItasInterfaceTask record);
}