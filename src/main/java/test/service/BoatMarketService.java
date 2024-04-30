package test.service;


import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import test.domain.BoatMarket;

import java.util.List;

public interface BoatMarketService {

    List<BoatMarket> messageImport(@RequestPart("file") MultipartFile file);

}
