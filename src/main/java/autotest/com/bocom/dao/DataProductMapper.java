package autotest.com.bocom.dao;

import autotest.com.bocom.entity.DataProduct;
import autotest.com.bocom.entity.DataProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataProductMapper {
    long countByExample(DataProductExample example);

    int deleteByExample(DataProductExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(DataProduct record);

    int insertSelective(DataProduct record);

    List<DataProduct> selectByExample(DataProductExample example);

    DataProduct selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") DataProduct record, @Param("example") DataProductExample example);

    int updateByExample(@Param("record") DataProduct record, @Param("example") DataProductExample example);

    int updateByPrimaryKeySelective(DataProduct record);

    int updateByPrimaryKey(DataProduct record);
}