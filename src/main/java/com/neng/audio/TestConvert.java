package com.neng.audio;

import java.io.File;

/**
 * @author liu neng
 */
public class TestConvert {
    public static void main(String[] args) throws Exception {
        String testFilePath = TestConvert.class.getResource("/").getPath().replace("classes","resources");
        File mp3File = new File(testFilePath+"test.mp3");
        File amrFile = new File(testFilePath+"test.amr");
        AudioConvertHelper.convertMp3ToAmr(mp3File,amrFile);
        System.out.println("create amr file：" + testFilePath +"test.amr");
    }
}
