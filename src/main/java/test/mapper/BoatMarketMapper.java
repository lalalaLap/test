package test.mapper;

import org.apache.ibatis.annotations.Mapper;
import test.domain.BoatMarket;

@Mapper
public interface BoatMarketMapper {
    void insert(BoatMarket boatMarket);
}
