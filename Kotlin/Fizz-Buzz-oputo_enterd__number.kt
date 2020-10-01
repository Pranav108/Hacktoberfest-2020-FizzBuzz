fun main(args: Array<String>)
 {
 //enter an interger 
    var n = readLine()!!.toInt();
    println("     Input = $n \n");

    var range = 1..(2*n-1);
    for (i in range) {
        if(i%15==0)
        println ("FizzBuzz");
        else if(i%3==0)
        println ("Fizz");
        else if(i%5==0)
        println ("Buzz");
        else 
        println ("$i ");      
    }
    println ("\n");
    }

