package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasEntrance;
import autotest.com.bocom.entity.ItasEntranceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasEntranceMapper {
    long countByExample(ItasEntranceExample example);

    int deleteByExample(ItasEntranceExample example);

    int deleteByPrimaryKey(Integer entranceId);

    int insert(ItasEntrance record);

    int insertSelective(ItasEntrance record);

    List<ItasEntrance> selectByExample(ItasEntranceExample example);

    ItasEntrance selectByPrimaryKey(Integer entranceId);

    int updateByExampleSelective(@Param("record") ItasEntrance record, @Param("example") ItasEntranceExample example);

    int updateByExample(@Param("record") ItasEntrance record, @Param("example") ItasEntranceExample example);

    int updateByPrimaryKeySelective(ItasEntrance record);

    int updateByPrimaryKey(ItasEntrance record);
}