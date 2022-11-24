package com.crabgeek.pattern.create.prototype;

import java.util.Random;

public class ClientDemo {
    // 发送账单的数量，这个值是从数据库中获得的
    private static int MAX_COUNT = 6;
    public static void main(String[] args) {
        // 模拟发送邮件
        int i = 0;
        // 定义一个邮件对象
        Mail mail = new Mail("某商场五一抽奖活动",
                "五一抽奖活动通知：凡在五一期间在本商场购物满100元的客户都有获得抽奖机会！...");
        mail.setTail("解释权归某商场所有");
        mail.setReceiver("Haaaa");
        while (i < MAX_COUNT) {
            //克隆邮件
            Mail cloneMail = mail.clone();
            // 以下是每封邮件不同的地方
            cloneMail.setAppellation(getRandString(5) + " 先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8)
                    + ".com");
            // 发送邮件
            sendMail(cloneMail);
            i++;
        }
        Mail testMail = mail.clone();
        System.out.println(String.format("finally------Receiver: [%s]", testMail.getReceiver() == mail.getReceiver()));
    }
    // 发送邮件
    private static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人："
                + mail.getReceiver() + "\t....发送成功！");
    }
    // 获得指定长度的随机字符串
    private static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
