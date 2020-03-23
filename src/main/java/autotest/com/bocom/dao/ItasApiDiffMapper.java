package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasApiDiff;
import autotest.com.bocom.entity.ItasApiDiffExample;
import autotest.com.bocom.entity.ItasApiDiffWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasApiDiffMapper {
    long countByExample(ItasApiDiffExample example);

    int deleteByExample(ItasApiDiffExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItasApiDiffWithBLOBs record);

    int insertSelective(ItasApiDiffWithBLOBs record);

    List<ItasApiDiffWithBLOBs> selectByExampleWithBLOBs(ItasApiDiffExample example);

    List<ItasApiDiff> selectByExample(ItasApiDiffExample example);

    ItasApiDiffWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItasApiDiffWithBLOBs record, @Param("example") ItasApiDiffExample example);

    int updateByExampleWithBLOBs(@Param("record") ItasApiDiffWithBLOBs record, @Param("example") ItasApiDiffExample example);

    int updateByExample(@Param("record") ItasApiDiff record, @Param("example") ItasApiDiffExample example);

    int updateByPrimaryKeySelective(ItasApiDiffWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ItasApiDiffWithBLOBs record);

    int updateByPrimaryKey(ItasApiDiff record);
}