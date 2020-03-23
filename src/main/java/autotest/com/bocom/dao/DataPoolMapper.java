package autotest.com.bocom.dao;

import autotest.com.bocom.entity.DataPool;
import autotest.com.bocom.entity.DataPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataPoolMapper {
    long countByExample(DataPoolExample example);

    int deleteByExample(DataPoolExample example);

    int deleteByPrimaryKey(Integer poolId);

    int insert(DataPool record);

    int insertSelective(DataPool record);

    List<DataPool> selectByExample(DataPoolExample example);

    DataPool selectByPrimaryKey(Integer poolId);

    int updateByExampleSelective(@Param("record") DataPool record, @Param("example") DataPoolExample example);

    int updateByExample(@Param("record") DataPool record, @Param("example") DataPoolExample example);

    int updateByPrimaryKeySelective(DataPool record);

    int updateByPrimaryKey(DataPool record);
}