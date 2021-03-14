/**
 * Example of how to sort an array and remove the duplicate values.
 */
public class RemoveDuplicates {
  public static void main(String[] args) {
    int[] before = {100,2,3,50,5,80,25,4,75,4,3,75,2,1};
    
    System.out.println("-- before --");
    printArray(before);

    bubbleSort(before);
    
    System.out.println("--after --");
    printArray(before);

    int after[] = removeDuplicates(before);

    System.out.println("-- no dups --");
    printArray(after);
  }

  public static void printArray(int[] value) {
    for(int v = 0; v < value.length; v++) {
      System.out.print(value[v]);

      if(v != (value.length - 1)) {
        System.out.print(",");
      }
    }
    System.out.println();
  }

  public static void bubbleSort(int[] value) {
    int valueLength = value.length;

    for(int i = 0; i < valueLength ; i++) {

      for(int j = 0; j < (valueLength - i - 1); j++) {

        if(value[j] > value[j+1]) {
          int temp = value[j];
	  value[j] = value[j+1];
	  value[j+1] = temp;
	}

      }

    }
  }

  public static int[] removeDuplicates(int[] value) {
    // check for an empty array
    if(value.length == 0) { return new int[0]; }

    int resultLength = 0;
    int[] temp = new int[value.length];
    int previous = value[0];

    for(int i = 0; i < value.length; i++) {
      if(i == 0 || value[i] != previous) {
        temp[resultLength] = value[i];
	resultLength++;
      }

      previous = value[i];
    }

    int[] result = new int[resultLength];

    for(int i = 0; i < resultLength; i++) {
      result[i] = temp[i];
    }

    return result;
  }
}
