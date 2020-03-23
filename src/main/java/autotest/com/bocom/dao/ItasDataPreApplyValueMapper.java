package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasDataPreApplyValue;
import autotest.com.bocom.entity.ItasDataPreApplyValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasDataPreApplyValueMapper {
    long countByExample(ItasDataPreApplyValueExample example);

    int deleteByExample(ItasDataPreApplyValueExample example);

    int deleteByPrimaryKey(Integer elementId);

    int insert(ItasDataPreApplyValue record);

    int insertSelective(ItasDataPreApplyValue record);

    List<ItasDataPreApplyValue> selectByExample(ItasDataPreApplyValueExample example);

    ItasDataPreApplyValue selectByPrimaryKey(Integer elementId);

    int updateByExampleSelective(@Param("record") ItasDataPreApplyValue record, @Param("example") ItasDataPreApplyValueExample example);

    int updateByExample(@Param("record") ItasDataPreApplyValue record, @Param("example") ItasDataPreApplyValueExample example);

    int updateByPrimaryKeySelective(ItasDataPreApplyValue record);

    int updateByPrimaryKey(ItasDataPreApplyValue record);
}