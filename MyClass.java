package com.example;


    public class MyClass {

        public static void main(String args[]) {
            StringBuffer binary = new StringBuffer("011101");
            binary.reverse();
            System.out.println(binary);

            // we want to create a counter that will take 2^x (x being the position of the binary ie position 0 is 2^0 * whatever number position 0 is)
//        int b = (2^binary.charAt(0)) * binary.charAt(0) + (2^binary.charAt(1)) * binary.charAt(1) + (2^binary.charAt(2)) * binary.charAt(2);
            int b = (2^0) * binary.charAt(0);
            System.out.print(b);


        }
    }




//        String s = "11000";
//        s.length() -1;
//        for(int i = 0; i < s.length() ; i++);
//
//
//            char[] reverseBinary = new char[binary.length()];
//            int forCounter = binary.length() - 1;
//            for (int i = 0; i < binary.length(); i++) {
//        reverseBinary[i] = binary.charAt(forCounter);
//        forCounter--;