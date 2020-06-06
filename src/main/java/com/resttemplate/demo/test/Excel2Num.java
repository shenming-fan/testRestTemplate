package com.resttemplate.demo.test;

public class Excel2Num {
    public static int excelStr2Num(String str,int length){
        int num =0;
        int res =0;
        for (int i=0;i<length;i++){
            char ch = str.charAt(length-i-1);
            num = (int)(ch-'A'+1);
            num*=Math.pow(26,i);
            res += num;
        }
        return res;
    }

    public static String num2Str(int num){
        if(num <= 0){
            return null;
        }
        String colStr ="";
        num--;
        do{
            if(colStr.length()>0){
                num--;
            }
            colStr = (char)(num % 26+'A') + colStr;
            num = (int)((num - num % 26)/26);
        }while (num > 0);
        return colStr;
    }

    public static void main(String[] args) {
        String a = "AB";
        int num = excelStr2Num(a,a.length());
        System.out.println(num);
        System.out.println(num2Str(26));

        int[] qq = {1,3,5,7,8};
        for (int i = 0;i< qq.length;i++){
            for (int j =qq.length-1;j > i ; j--) {
                if(qq[i]+qq[j]==6){
                    System.out.println("下标："+i+"和"+j);
                }
            }
        }
    }
}
