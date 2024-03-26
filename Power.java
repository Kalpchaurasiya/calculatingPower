//Printing the power of an integer eg.5^3 : 5*5*5=625
//Time complexity is O(log(q))
class Power{
    public static int Pow(int p, int q){
        if(q==0)
            return 1;
        int smallPow = Pow(p,q/2);
        if(q%2==0){
            return smallPow*smallPow;
        }
        return p*smallPow*smallPow;
    }
    public static void main(String[] args){
        System.out.print(Pow(5,3));
    }
}