package com.leyou.search.client;

import com.leyou.api.SpecificationApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("leyou-item-service")
public interface SpecificationClient extends SpecificationApi {
}
