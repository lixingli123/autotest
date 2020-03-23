package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasMethod;
import autotest.com.bocom.entity.ItasMethodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasMethodMapper {
    long countByExample(ItasMethodExample example);

    int deleteByExample(ItasMethodExample example);

    int deleteByPrimaryKey(Integer methodId);

    int insert(ItasMethod record);

    int insertSelective(ItasMethod record);

    List<ItasMethod> selectByExampleWithBLOBs(ItasMethodExample example);

    List<ItasMethod> selectByExample(ItasMethodExample example);

    ItasMethod selectByPrimaryKey(Integer methodId);

    int updateByExampleSelective(@Param("record") ItasMethod record, @Param("example") ItasMethodExample example);

    int updateByExampleWithBLOBs(@Param("record") ItasMethod record, @Param("example") ItasMethodExample example);

    int updateByExample(@Param("record") ItasMethod record, @Param("example") ItasMethodExample example);

    int updateByPrimaryKeySelective(ItasMethod record);

    int updateByPrimaryKeyWithBLOBs(ItasMethod record);

    int updateByPrimaryKey(ItasMethod record);
}