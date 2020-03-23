package autotest.com.bocom.dao;

import autotest.com.bocom.entity.TestCase;
import autotest.com.bocom.entity.TestCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestCaseMapper {
    long countByExample(TestCaseExample example);

    int deleteByExample(TestCaseExample example);

    int deleteByPrimaryKey(Integer testCaseId);

    int insert(TestCase record);

    int insertSelective(TestCase record);

    List<TestCase> selectByExampleWithBLOBs(TestCaseExample example);

    List<TestCase> selectByExample(TestCaseExample example);

    TestCase selectByPrimaryKey(Integer testCaseId);

    int updateByExampleSelective(@Param("record") TestCase record, @Param("example") TestCaseExample example);

    int updateByExampleWithBLOBs(@Param("record") TestCase record, @Param("example") TestCaseExample example);

    int updateByExample(@Param("record") TestCase record, @Param("example") TestCaseExample example);

    int updateByPrimaryKeySelective(TestCase record);

    int updateByPrimaryKeyWithBLOBs(TestCase record);

    int updateByPrimaryKey(TestCase record);
}