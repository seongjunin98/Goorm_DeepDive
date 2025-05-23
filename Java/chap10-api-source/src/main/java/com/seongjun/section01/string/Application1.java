package com.seongjun.section01.string;

public class Application1 {

    public static void main(String[] args){

        /* 목표. String 클래스의 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다. */
		/*  charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다. */

        String str1 = "apple";

        for(int i = 0; i < str1.length(); i++){
            System.out.println("charAt(" + i + ") : " + str1.charAt(i));
        }

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() : " + (str2.compareTo(str3)));          //0
        System.out.println("compareTo() : " + (str2.compareTo(str4)));          //32
        System.out.println("compareTo() : " + (str4.compareTo(str2)));          //-32

        System.out.println("compareTo() : " + (str2.compareTo(str5)));		    //-5
        System.out.println("compareTo() : " + (str5.compareTo(str2)));		    //5

        /* 구체적으로 어떤 값이 나오는지보다 양수인지 음수인지를 판단할 목적으로 주로 사용된다. */

	    /*  concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환한다.
	     *  원본 문자열에는 영향을 주지 않는다.
	     */

        System.out.println("concat() : " + (str2.concat(str5)));                //javaorcale

	    /*  indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
         *  단, 일치하는 문자가 없는 경우 -1을 반환한다.
         * */

        String indextOf = "java orcle";

        System.out.println("indexOf('a') : " + indextOf.indexOf('v'));          //1
        System.out.println("indexOf('z') : " + indextOf.indexOf('z'));          //-1

        /* trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. */
        String trimStr = "   java   ";

        System.out.println("trimStr : " + trimStr + "#");
        System.out.println("trimStr : " + trimStr.trim() + "#");

        /* 원본에 영향을 주지는 않는다. */
        System.out.println("trimStr : #" + trimStr + "#");

        /*  toLowerCase() : 모든 문자를 소문자로 변환시킨다.
         *  toUpperCase() : 모든 문자를 대문자로 변환시킨다.
         *  원본에는 영향을 주지 않는다.
         * */

        String javaOracle = "javaOracle";
        System.out.println("toLowerCase : " + javaOracle.toLowerCase());
        System.out.println("toUpperCase : " + javaOracle.toUpperCase());

        /*  replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환한다.
         *  원본에 영향을 주지 않는다.
         * */

        System.out.println("replace() : " + javaOracle.replace("java", "python"));

        /* length() : 문자열의 길이를 정수형으로 반환한다. */
        System.out.println("length() : " + javaOracle.length());
        System.out.println("빈 문자열 길이 : " + ("".length()));

        /*  isEmpty() : 문자열의 길이가 0이면 true를 반환, 아니면 false를 반환
         *  길이가 0인 문자열은 null과는 다르다.
         * */
        System.out.println("isEmpty() : " + "".isBlank());
        System.out.println("isEmpty() : " + "a".isBlank());

    }
}
