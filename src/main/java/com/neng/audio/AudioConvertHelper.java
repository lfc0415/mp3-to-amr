// Copyright 2019 Alo7 Inc. All rights reserved.

package com.neng.audio;

import ws.schild.jave.AudioAttributes;
import ws.schild.jave.Encoder;
import ws.schild.jave.EncodingAttributes;
import ws.schild.jave.MultimediaObject;

import java.io.File;

/**
 * 执行命令：ffmpeg -i test.mp3 -acodec libopencore_amrnb -ab 12.2k -ar 8000 -ac 1 test.amr
 *
 * @author liu neng
 */
public class AudioConvertHelper {
    /**
     * mp3转amr
     */
    public static void convertMp3ToAmr(File source, File target) throws Exception {
        //Audio Attributes
        AudioAttributes audio = new AudioAttributes();
        audio.setCodec("libopencore_amrnb");
        audio.setBitRate(12200);
        audio.setChannels(1);
        audio.setSamplingRate(8000);

        //Encoding attributes
        EncodingAttributes attrs = new EncodingAttributes();
        attrs.setFormat("amr");
        attrs.setAudioAttributes(audio);

        //Encode
        Encoder encoder = new Encoder();
        encoder.encode(new MultimediaObject(source), target, attrs);
    }
}
