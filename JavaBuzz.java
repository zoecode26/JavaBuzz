public class JavaBuzz {
    public String calculate(int value){
        if (value%5 == 0 && value%3 ==0){
            return "JavaBuzz";
        }
        else if (value%3 == 0){
            return "Java";
        }
        else if (value%5 == 0){
            return "Buzz";
        }
        else {
            return Integer.toString(value);
        }
    }
}