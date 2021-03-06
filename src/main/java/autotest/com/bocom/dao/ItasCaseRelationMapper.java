package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasCaseRelation;
import autotest.com.bocom.entity.ItasCaseRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasCaseRelationMapper {
    long countByExample(ItasCaseRelationExample example);

    int deleteByExample(ItasCaseRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ItasCaseRelation record);

    int insertSelective(ItasCaseRelation record);

    List<ItasCaseRelation> selectByExample(ItasCaseRelationExample example);

    ItasCaseRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ItasCaseRelation record, @Param("example") ItasCaseRelationExample example);

    int updateByExample(@Param("record") ItasCaseRelation record, @Param("example") ItasCaseRelationExample example);

    int updateByPrimaryKeySelective(ItasCaseRelation record);

    int updateByPrimaryKey(ItasCaseRelation record);
}