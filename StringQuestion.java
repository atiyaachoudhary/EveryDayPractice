//package PracticeProblem;
//public class StringQuestion {
//    public static String convertString(String inputString){
//
//        StringBuilder outputString = new StringBuilder();
//
//        for (int i=0; i<inputString.length(); i++){
//            char character = inputString.charAt(i);
//            if (Character.isLetter(character)){
//                int count = Character.getNumericValue(inputString.charAt(i + 1));
//                outputString.append(String.valueOf(character).repeat(count));
//            }
//            Character c = inputString.charAt(inputString.length() - i-1);
//            if (Character.isDigit(c)){
//                outputString.append(String.valueOf(",").repeat(Integer.parseInt(c.toString())));
//            }
//        }
//        return outputString.toString();
//    }
//    public static void main(String[] args) {
//        String input = "x3y2w5t4,";
//        String output = convertString(input);
//        System.out.println(output);
//    }
//}