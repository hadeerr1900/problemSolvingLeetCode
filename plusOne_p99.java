public class plusOne_p99 {

    public int[] plusOnefun(int[] digitsArr) {
        int n=digitsArr.length;
        for(int i=n-1;i>=0;i--){

            if(digitsArr[i]<9)
            {
                digitsArr[i]++;
                return digitsArr;
            }
            digitsArr[i]=0;
        }

       int[] result=new int[n+1];
        result[0]=1; // rest digits are already 0 by default
        return result;
       }

        ///////////////////////

    public int[] plusOneSecondSoluation(int[] digits) {
        int n = digits.length;
        String s = "";
        for (int i = 0; i <n; i++) {
            s = s + digits[i];
        }
        int revert = Integer.parseInt(s);
        int result = revert + 1;
        String StringRes = Integer.toString(result);
        digits=new int[StringRes.length()];
        for (int i = 0; i < StringRes.length(); i++) {
            char ch = StringRes.charAt(i);
            digits[i] =Integer.parseInt(String.valueOf(ch));

        }
        return digits;

    }
}