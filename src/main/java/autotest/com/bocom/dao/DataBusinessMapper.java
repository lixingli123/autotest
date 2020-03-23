package autotest.com.bocom.dao;

import autotest.com.bocom.entity.DataBusiness;
import autotest.com.bocom.entity.DataBusinessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataBusinessMapper {
    long countByExample(DataBusinessExample example);

    int deleteByExample(DataBusinessExample example);

    int deleteByPrimaryKey(Integer businessId);

    int insert(DataBusiness record);

    int insertSelective(DataBusiness record);

    List<DataBusiness> selectByExample(DataBusinessExample example);

    DataBusiness selectByPrimaryKey(Integer businessId);

    int updateByExampleSelective(@Param("record") DataBusiness record, @Param("example") DataBusinessExample example);

    int updateByExample(@Param("record") DataBusiness record, @Param("example") DataBusinessExample example);

    int updateByPrimaryKeySelective(DataBusiness record);

    int updateByPrimaryKey(DataBusiness record);
}