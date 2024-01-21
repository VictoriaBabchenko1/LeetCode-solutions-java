package solutions;

public class Maximum69Number {
    public int maximum69Number (int num) {
        String str = Integer.toString(num);
        char arr[] = str.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '6'){
                arr[i] = '9';
                break;
            }
        }

        return Integer.parseInt(new String(arr));


//        StringBuilder res = new StringBuilder("" + num);
//
//        for(int i = 0; i < res.length(); i++){
//            if(res.charAt(i) == '6'){
//                res.setCharAt(i, '9');
//                break;
//            }
//        }
//
//        return Integer.parseInt(res.toString());
    }
}
