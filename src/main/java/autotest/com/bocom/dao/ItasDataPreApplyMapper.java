package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasDataPreApply;
import autotest.com.bocom.entity.ItasDataPreApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasDataPreApplyMapper {
    long countByExample(ItasDataPreApplyExample example);

    int deleteByExample(ItasDataPreApplyExample example);

    int deleteByPrimaryKey(Integer applyId);

    int insert(ItasDataPreApply record);

    int insertSelective(ItasDataPreApply record);

    List<ItasDataPreApply> selectByExample(ItasDataPreApplyExample example);

    ItasDataPreApply selectByPrimaryKey(Integer applyId);

    int updateByExampleSelective(@Param("record") ItasDataPreApply record, @Param("example") ItasDataPreApplyExample example);

    int updateByExample(@Param("record") ItasDataPreApply record, @Param("example") ItasDataPreApplyExample example);

    int updateByPrimaryKeySelective(ItasDataPreApply record);

    int updateByPrimaryKey(ItasDataPreApply record);
}