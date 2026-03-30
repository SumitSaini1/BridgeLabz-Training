
public class WordInListofSentences {
    public static String findSentences(String[] sentences,String word){
        for(int i=0;i<sentences.length;i++){
            if(sentences[i].contains(word)){
                return sentences[i];
            }
        }
        return "Not Found";


    }

    public static void main(String[] args) {
        String[] sentences = {
            "Java is a programming language",
            "I am learning data structures",
            "Linear search is simple",
            "Practice makes perfect"
        };
        String word="search";
        String result=findSentences(sentences, word);
        System.out.println(result);
        

    }
    
    
}
