package test.service.Impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import test.domain.BoatMarket;
import test.mapper.BoatMarketMapper;
import test.service.BoatMarketService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 20240392
 */
@Service
public class BoatMarketServiceImpl implements BoatMarketService {

    @Resource
    private BoatMarketMapper mapper;
    @Override
    public List<BoatMarket> messageImport(MultipartFile file) {
        List<BoatMarket> list = new ArrayList<>();
        try {
            EasyExcel.read(file.getInputStream(),BoatMarket.class,new PageReadListener<BoatMarket>(datalist -> datalist.forEach(boatMarket -> {
                mapper.insert(boatMarket);
                list.add(boatMarket);
            }))).excelType(ExcelTypeEnum.XLSX).sheet(1).doRead();

        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }
}
