// class Solution {
//     public int addDigits(int num) {
//         int sum=0;
//         int rem;
//         int newSum=0;
//         int newRem;
//         while(num>0){
//             rem=num%10;
//             num=num/10;
//             sum=sum+rem;
//         }
//         while(sum>0){
//             newRem=sum%10;
//             sum=sum/10;
//             newSum=newSum+newRem;
//         }
//         int rem3;
//         int sum3=0;
//         while(newSum>0){
//             rem3=newSum%10;
//             newSum=newSum/10;
//             sum3=sum3+rem3;
//         }
//         return sum3;
//     }
// }
class Solution {
    public int addDigits(int num) {
        if(num == 0) return 0;
        else if(num % 9 == 0) return 9;
        else return num % 9;
    }
}