package autotest.com.bocom.dao;

import autotest.com.bocom.entity.CmcConfigCode;
import autotest.com.bocom.entity.CmcConfigCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmcConfigCodeMapper {
    long countByExample(CmcConfigCodeExample example);

    int deleteByExample(CmcConfigCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmcConfigCode record);

    int insertSelective(CmcConfigCode record);

    List<CmcConfigCode> selectByExample(CmcConfigCodeExample example);

    CmcConfigCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmcConfigCode record, @Param("example") CmcConfigCodeExample example);

    int updateByExample(@Param("record") CmcConfigCode record, @Param("example") CmcConfigCodeExample example);

    int updateByPrimaryKeySelective(CmcConfigCode record);

    int updateByPrimaryKey(CmcConfigCode record);
}