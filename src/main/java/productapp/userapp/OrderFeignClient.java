package productapp.userapp;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "order-microservice", url = "http://localhost:8082")
public interface OrderFeignClient {

    @GetMapping("/orders/{orderId}")
    String getOrderDetails(@PathVariable Long orderId);
}

