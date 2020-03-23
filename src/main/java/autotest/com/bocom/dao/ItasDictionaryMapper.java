package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasDictionary;
import autotest.com.bocom.entity.ItasDictionaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasDictionaryMapper {
    long countByExample(ItasDictionaryExample example);

    int deleteByExample(ItasDictionaryExample example);

    int deleteByPrimaryKey(Integer dictId);

    int insert(ItasDictionary record);

    int insertSelective(ItasDictionary record);

    List<ItasDictionary> selectByExampleWithBLOBs(ItasDictionaryExample example);

    List<ItasDictionary> selectByExample(ItasDictionaryExample example);

    ItasDictionary selectByPrimaryKey(Integer dictId);

    int updateByExampleSelective(@Param("record") ItasDictionary record, @Param("example") ItasDictionaryExample example);

    int updateByExampleWithBLOBs(@Param("record") ItasDictionary record, @Param("example") ItasDictionaryExample example);

    int updateByExample(@Param("record") ItasDictionary record, @Param("example") ItasDictionaryExample example);

    int updateByPrimaryKeySelective(ItasDictionary record);

    int updateByPrimaryKeyWithBLOBs(ItasDictionary record);

    int updateByPrimaryKey(ItasDictionary record);
}