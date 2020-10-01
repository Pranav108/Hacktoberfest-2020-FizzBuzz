class Code {
    public List<String> fizzBuzz(int n) {
      List<String> Pr = new ArrayList<>();
        String str="";
        for(int i=1;i<=n;i++){
           if(i%15!=0){
               Pr.add("Fizz");
           }
             if(i%5==0 && i%3!=0){
                 Pr.add("Buzz");
            }
            if (i%3==0 && i%5==0 && i!=1){
                 Pr.add("FizzBuzz");
            }
            if(i%3!=0 && i%5!=0){
                 Pr.add(Integer.toString(i));
            }  
        }
        return Pr;
    }
}
