package autotest.com.bocom.dao;

import autotest.com.bocom.entity.DataServiceCmc;
import autotest.com.bocom.entity.DataServiceCmcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataServiceCmcMapper {
    long countByExample(DataServiceCmcExample example);

    int deleteByExample(DataServiceCmcExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DataServiceCmc record);

    int insertSelective(DataServiceCmc record);

    List<DataServiceCmc> selectByExample(DataServiceCmcExample example);

    DataServiceCmc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DataServiceCmc record, @Param("example") DataServiceCmcExample example);

    int updateByExample(@Param("record") DataServiceCmc record, @Param("example") DataServiceCmcExample example);

    int updateByPrimaryKeySelective(DataServiceCmc record);

    int updateByPrimaryKey(DataServiceCmc record);
}