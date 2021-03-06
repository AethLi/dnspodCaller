package cn.aethli.dnspod.feign;

import cn.aethli.dnspod.config.FeignConfig;
import cn.aethli.dnspod.config.FeignSSLConfig;
import cn.aethli.dnspod.config.TencentFeignRequestInterceptor;
import cn.aethli.dnspod.model.feign.parameter.RecordParameters;
import cn.aethli.dnspod.model.feign.result.RecordResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
    value = "tencent",
    url = "https://cns.api.qcloud.com",
    configuration = {TencentFeignRequestInterceptor.class, FeignConfig.class, FeignSSLConfig.class})
public interface TencentFeign {
  @GetMapping(value = "/v2/index.php")
  RecordResult request(@RequestBody RecordParameters params);
}
