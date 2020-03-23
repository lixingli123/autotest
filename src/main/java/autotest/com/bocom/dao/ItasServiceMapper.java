package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasService;
import autotest.com.bocom.entity.ItasServiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasServiceMapper {
    long countByExample(ItasServiceExample example);

    int deleteByExample(ItasServiceExample example);

    int deleteByPrimaryKey(Integer svcId);

    int insert(ItasService record);

    int insertSelective(ItasService record);

    List<ItasService> selectByExample(ItasServiceExample example);

    ItasService selectByPrimaryKey(Integer svcId);

    int updateByExampleSelective(@Param("record") ItasService record, @Param("example") ItasServiceExample example);

    int updateByExample(@Param("record") ItasService record, @Param("example") ItasServiceExample example);

    int updateByPrimaryKeySelective(ItasService record);

    int updateByPrimaryKey(ItasService record);
}