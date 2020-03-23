package autotest.com.bocom.dao;

import autotest.com.bocom.entity.ItasTransfer;
import autotest.com.bocom.entity.ItasTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItasTransferMapper {
    long countByExample(ItasTransferExample example);

    int deleteByExample(ItasTransferExample example);

    int deleteByPrimaryKey(Integer transferId);

    int insert(ItasTransfer record);

    int insertSelective(ItasTransfer record);

    List<ItasTransfer> selectByExampleWithBLOBs(ItasTransferExample example);

    List<ItasTransfer> selectByExample(ItasTransferExample example);

    ItasTransfer selectByPrimaryKey(Integer transferId);

    int updateByExampleSelective(@Param("record") ItasTransfer record, @Param("example") ItasTransferExample example);

    int updateByExampleWithBLOBs(@Param("record") ItasTransfer record, @Param("example") ItasTransferExample example);

    int updateByExample(@Param("record") ItasTransfer record, @Param("example") ItasTransferExample example);

    int updateByPrimaryKeySelective(ItasTransfer record);

    int updateByPrimaryKeyWithBLOBs(ItasTransfer record);

    int updateByPrimaryKey(ItasTransfer record);
}