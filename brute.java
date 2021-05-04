class Brute {

  int[] arr;

  Brute(int[] arr) {
    this.arr = arr;
  }

  public String theBrute() {

    for (int i = 0; i < arr.length; i++) {

      for (int j = 1; j < arr.length; j++) {

        for (int k = 2; k < arr.length; k++) {

          if (j == i + 1 && k == j + 1) {
            if (arr[i] < arr[j] && arr[j] < arr[k]) {
              return arr[i] + ", " + arr[j] + " ,and " + arr[k] + " are correct sequence";
            }
          }
        }
      }
    }
    return "Nope";
  }

  public static void main(String[] args) {

  int[] intArray = new int[] {42,2,61,100,72,2,3,2};

  Brute b = new Brute(intArray);

  // Returns true that arr has incrasing numbers
  System.out.println(b.theBrute());

  }
}
