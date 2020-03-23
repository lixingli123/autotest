package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasApi;
import autotest.com.bocom.entity.ItasApiExample;
import autotest.com.bocom.entity.ItasApiWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasApiMapper {
    long countByExample(ItasApiExample example);

    int deleteByExample(ItasApiExample example);

    int deleteByPrimaryKey(Integer apiId);

    int insert(ItasApiWithBLOBs record);

    int insertSelective(ItasApiWithBLOBs record);

    List<ItasApiWithBLOBs> selectByExampleWithBLOBs(ItasApiExample example);

    List<ItasApi> selectByExample(ItasApiExample example);

    ItasApiWithBLOBs selectByPrimaryKey(Integer apiId);

    int updateByExampleSelective(@Param("record") ItasApiWithBLOBs record, @Param("example") ItasApiExample example);

    int updateByExampleWithBLOBs(@Param("record") ItasApiWithBLOBs record, @Param("example") ItasApiExample example);

    int updateByExample(@Param("record") ItasApi record, @Param("example") ItasApiExample example);

    int updateByPrimaryKeySelective(ItasApiWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ItasApiWithBLOBs record);

    int updateByPrimaryKey(ItasApi record);
}