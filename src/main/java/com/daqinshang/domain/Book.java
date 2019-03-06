package com.daqinshang.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @Auther: jacobzheng
 * @Date: 2019/2/14 15:29
 * @Description:
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Book {

    private String title;
    private String authorName;
}
