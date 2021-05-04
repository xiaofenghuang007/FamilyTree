package com.family.tree.common;

import lombok.Data;

//搜索查询父类（分页，返回查询结果）

@Data
public class Search {

    //每页展示结果条数
    private Long displayLength;

    //开始查询的页数
    private Long displayStart;

}
