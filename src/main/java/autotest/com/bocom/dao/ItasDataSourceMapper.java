package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasDataSource;
import autotest.com.bocom.entity.ItasDataSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasDataSourceMapper {
    long countByExample(ItasDataSourceExample example);

    int deleteByExample(ItasDataSourceExample example);

    int deleteByPrimaryKey(Integer sourceId);

    int insert(ItasDataSource record);

    int insertSelective(ItasDataSource record);

    List<ItasDataSource> selectByExample(ItasDataSourceExample example);

    ItasDataSource selectByPrimaryKey(Integer sourceId);

    int updateByExampleSelective(@Param("record") ItasDataSource record, @Param("example") ItasDataSourceExample example);

    int updateByExample(@Param("record") ItasDataSource record, @Param("example") ItasDataSourceExample example);

    int updateByPrimaryKeySelective(ItasDataSource record);

    int updateByPrimaryKey(ItasDataSource record);
}