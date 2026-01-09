package com.saki.date4u;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

// Example 1: includeFilters
//@Configuration
//@ComponentScan(
//        basePackages = "com.saki.date4u",
//        useDefaultFilters = true,
//        includeFilters = @ComponentScan.Filter(
//                type = FilterType.ASSIGNABLE_TYPE,
//                classes = Thumbnail.class )
//)
// Example 2: excludeFilters
//@Configuration
//@ComponentScan(
//        basePackages = "com.saki.date4u",
//        excludeFilters = @ComponentScan.Filter(
//                type = FilterType.ASSIGNABLE_TYPE,
//                classes = AwtBicubicThumbnail.class )
//)
public class ThumbnailScanner {
}
