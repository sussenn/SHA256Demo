package com.itcodes.myhub.sha256test;

import com.itcodes.myhub.sha256encode.Sha256EncodeApplication;
import com.itcodes.myhub.util.SHA256Util;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName Sha256Test
 * @Author sussen
 * @Version 1.0
 * @Data 2019/12/31
 */
@SpringBootTest(classes = Sha256EncodeApplication.class)
@RunWith(value = SpringRunner.class)
@Slf4j
public class Sha256Test {

    @Test
    public void test00(){
        String text = "123456";

        //生成公钥私钥
        String keypriStr = SHA256Util.getKeypriStr();
        System.err.println("私钥:" + keypriStr);
        String keypubStr = SHA256Util.getKeypubStr();
        System.err.println("公钥:" + keypubStr);

        //私钥加密
        String textEn = SHA256Util.EncodeSig(text, keypriStr);
        System.err.println("加密文本:" + textEn);

        //公钥比对校验
        boolean succ = SHA256Util.verify(text, keypubStr, textEn);
        System.err.println("验证结果:" + succ);
    }
}
