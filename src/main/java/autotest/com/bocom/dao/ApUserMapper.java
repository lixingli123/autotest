package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ApUser;
import autotest.com.bocom.entity.ApUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApUserMapper {
    long countByExample(ApUserExample example);

    int deleteByExample(ApUserExample example);

    int deleteByPrimaryKey(Integer appId);

    int insert(ApUser record);

    int insertSelective(ApUser record);

    List<ApUser> selectByExample(ApUserExample example);

    ApUser selectByPrimaryKey(Integer appId);

    int updateByExampleSelective(@Param("record") ApUser record, @Param("example") ApUserExample example);

    int updateByExample(@Param("record") ApUser record, @Param("example") ApUserExample example);

    int updateByPrimaryKeySelective(ApUser record);

    int updateByPrimaryKey(ApUser record);
}