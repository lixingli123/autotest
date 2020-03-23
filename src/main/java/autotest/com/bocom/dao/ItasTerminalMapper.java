package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasTerminal;
import autotest.com.bocom.entity.ItasTerminalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasTerminalMapper {
    long countByExample(ItasTerminalExample example);

    int deleteByExample(ItasTerminalExample example);

    int deleteByPrimaryKey(Integer terminalId);

    int insert(ItasTerminal record);

    int insertSelective(ItasTerminal record);

    List<ItasTerminal> selectByExample(ItasTerminalExample example);

    ItasTerminal selectByPrimaryKey(Integer terminalId);

    int updateByExampleSelective(@Param("record") ItasTerminal record, @Param("example") ItasTerminalExample example);

    int updateByExample(@Param("record") ItasTerminal record, @Param("example") ItasTerminalExample example);

    int updateByPrimaryKeySelective(ItasTerminal record);

    int updateByPrimaryKey(ItasTerminal record);
}