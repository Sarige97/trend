package top.sarige.trend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.sarige.trend.pojo.Index;
import top.sarige.trend.service.IndexService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class IndexController {
    @Resource
    IndexService indexService;

//    @GetMapping("getCodes")
//    public List<Index> get() throws Exception {
//        return indexService.fetch_indexes_from_third_part();
//    }

    @GetMapping("/freshCodes")
    public List<Index> fresh() throws Exception {
        return indexService.fresh();
    }
    @GetMapping("/getCodes")
    public List<Index> get() throws Exception {
        return indexService.get();
    }
    @GetMapping("/removeCodes")
    public String remove() throws Exception {
        indexService.remove();
        return "remove codes successfully";
    }

}
