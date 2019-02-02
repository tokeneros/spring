package com.springinaction.aop3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @Auther: eros
 * @Date: 2019/2/1 16:31
 * @Description:
 *
 * @DeclareParents 标注静态属性指明了要引入了接口
 *  value 指定是哪种类型的bean要引入该接口（标记符后面的加号表示Performace的所有子类型，而不是Performance本身）
 *  defaultImpl 指定了为引入功能提供实现的类
 */
@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "com.springinaction.aop3.Performance+)",
            defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;

}
