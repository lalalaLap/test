package test.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import test.domain.BoatMarket;
import test.service.BoatMarketService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/boatMarket")
public class BoatMarketController {
    @Resource
    private BoatMarketService boatMarketService;



    @ApiOperation("导入数据库")
    @PostMapping("/messageImport")
    public List<BoatMarket> messageImport(@RequestPart("file") MultipartFile file){
        return boatMarketService.messageImport(file);
    }
}
