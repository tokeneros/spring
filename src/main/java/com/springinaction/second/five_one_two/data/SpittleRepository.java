package com.springinaction.second.five_one_two.data;

import com.springinaction.second.five_one_two.entity.Spittle;

import java.util.List;

/**
 * @Auther: eros
 * @Date: 2019/2/15 14:14
 * @Description:
 */
public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);

}
