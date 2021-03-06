package student_aleksey_kodin.lesson7.day1.task_1;

 class WordService {

 	// Такие методы надо разбивать на более мелкие методы!
     public String findMostFrequentWord(String text) {
     String[] textArray;
     int[] wordCountArray;
         textArray = convertStringToWordArray(text);
         wordCountArray = new int[textArray.length];

         int wordCounter = 0;
         for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
             for (String s : textArray) {
                 if (textArray[wordCount].equals(s)) {
                     wordCounter++;
                 }
             }
             wordCountArray[wordCount] = wordCounter;
             wordCounter = 0;
         }

         int max = 0;
         for (int count =0; count < wordCountArray.length; count++) {
             if (wordCountArray[count] > max) {
                 max = count;
             }
         }
      return textArray[max];
     }
     private String[] convertStringToWordArray(String text) {
         return  text.split(" ");
     }

     public static void main(String[] args) {
         WordService wordService = new WordService();
         String result = wordService.findMostFrequentWord("Это текст просто текст просто просто");
         System.out.println(result);
     }
}
