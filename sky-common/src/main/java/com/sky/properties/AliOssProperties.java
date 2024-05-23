package com.sky.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.alioss")
@Data
public class AliOssProperties {
    // 阿里云导入配置参数，直接形成bean对象进入ioc容器中，使用时直接注入
    private String endpoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;

}
