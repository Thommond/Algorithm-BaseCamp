class ReplaceWord {

  String sentence;
  
  ReplaceWord(String sentence) {
    this.sentence = sentence;
  }

  public String replace(String word, String newWord) {
    return sentence.replace(word, newWord);
    }

  public static void main(String[] args) {

    String sample = "The quick brown fox jumps over the lazy dog.";
    ReplaceWord r = new ReplaceWord(sample);
    System.out.println(r.replace("fox", "cat"));


  }

}
