package com.pts.mds.common.dynamicdatasource;

import com.pts.mds.common.WebLogAspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 数据源路由实现类
 */
public class MdsDynamicDataSource extends AbstractRoutingDataSource {

    private static final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    @Override
    protected Object determineCurrentLookupKey() {
        MdsDataSourceNames dataSource = MdsDataSourceContextHolder.getDataSource();
        if (dataSource == null) {
            logger.info("当前数据源为[primary]");
        } else {
            logger.info("当前数据源为[{}]", dataSource.name());
        }
        return dataSource;
    }

}