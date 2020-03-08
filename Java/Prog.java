class Prog  {
    public static void main(String[] args) {
        String inp = "Java is a Java stastic Language for learning";
        String[] arr = inp.split(" ");
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = i+1 ; j < arr.length ; j++) {
                if (arr[i].equalsIgnoreCase(arr[j]))
                    arr[j]="";
            }
        }
        for(int i = 0 ; i < arr.length ; i++)
            if(arr[i] != "")
                System.out.print(arr[i]+ " ");
    }
}