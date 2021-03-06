package com.pts.mds.common.dynamicdatasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MdsDynamicDataSourceAdvisorFactory {

    @Bean
    public MdsDynamicDataSourceAdvisor dynamicDatasourceAnnotationAdvisor() {
        return new MdsDynamicDataSourceAdvisor(new MdsDynamicDataSourceMethodInterceptor());
    }

}
