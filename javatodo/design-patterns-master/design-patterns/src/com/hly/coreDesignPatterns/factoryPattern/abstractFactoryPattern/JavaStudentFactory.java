package com.hly.coreDesignPatterns.factoryPattern.abstractFactoryPattern;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/7/26
 * @QQ :1136513099
 * @desc :
 */
public class JavaStudentFactory implements StudyFactory {
    @Override
    public IReading reading() {
        return new JavaReading();
    }

    @Override
    public IVideo video() {
        return new JavaVideo();
    }
}
