package com.zibowh.tools.pageable;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.data.domain.Pageable;

import java.util.function.Function;

public class PageUtil {

    /**
     * 根据PageEntity准备PageHelper
     * 页码数从第1页开始 page=1,2,3...,totalPages
     * PageHelper::startPage安全调用相关 参考
     * @link: https://github.com/pagehelper/Mybatis-PageHelper/blob/master/wikis/en/HowToUse.md#3-pagehelper-%E5%AE%89%E5%85%A8%E8%B0%83%E7%94%A8
     * @param pageEntity
     */
    public static void pageHelper(PageEntity pageEntity) {
        PageHelper.startPage(pageEntity.getPageNum(), pageEntity.getPageSize());
    }

    /**
     * 根据 SpringBoot Pageable准备PageHelper
     * 页码数从第0页开始 page=0,1,2,3,...,totalPages-1
     *
     * @param pageable
     */
    public static void pageHelper(Pageable pageable) {
        PageHelper.startPage(pageable.getPageNumber() + 1, pageable.getPageSize());
    }

    /**
     * com.github.pagehelper.Page map操作
     *
     * @param iPage
     * @param converter
     * @param <I>
     * @param <O>
     * @return
     */
    public static <I, O> Page<O> map(Page<I> iPage, Function<? super I, ? extends O> converter) {
        Page<O> oPage = new Page<O>(iPage.getPageNum(), iPage.getPageSize());
        oPage.setTotal(iPage.getTotal());
        oPage.setStartRow(iPage.getStartRow());
        oPage.setEndRow(iPage.getEndRow());
        oPage.setPages(iPage.getPages());
        iPage.forEach(it -> oPage.add(converter.apply(it)));
        return oPage;
    }
}
