package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasVariable;
import autotest.com.bocom.entity.ItasVariableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasVariableMapper {
    long countByExample(ItasVariableExample example);

    int deleteByExample(ItasVariableExample example);

    int deleteByPrimaryKey(Integer varId);

    int insert(ItasVariable record);

    int insertSelective(ItasVariable record);

    List<ItasVariable> selectByExample(ItasVariableExample example);

    ItasVariable selectByPrimaryKey(Integer varId);

    int updateByExampleSelective(@Param("record") ItasVariable record, @Param("example") ItasVariableExample example);

    int updateByExample(@Param("record") ItasVariable record, @Param("example") ItasVariableExample example);

    int updateByPrimaryKeySelective(ItasVariable record);

    int updateByPrimaryKey(ItasVariable record);
}