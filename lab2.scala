// 01
def q1()={
    var i,j,k=2
    var m,n=5
    var g=4.0f
    var f=12.0f
    var c='X'

    println(k + 12 * m)
    println(m/j)
    println(n%j)
    println(m/j*j)
    println(f+10*5+g)
    i+=1
    println(i*n)
}


// Scala supports all functional programming concepts. 
//Java  introduced some functional programming features but does not support all FP concepts. 

// Java: Java is a statically typed, object-oriented programming language
// Scala: Scala is also statically typed but combines object-oriented and functional programming paradigms

// Java: Uses the Java compiler (javac) to produce bytecode that runs on the JVM
// Scala: Uses the Scala compiler (scalac) to produce bytecode for the JVM



// 02
def q2()={
    var a:Int=2
    var b:Int=3
    var c:Int=4
    var d:Int=5
    var k:Float=4.3f

    var g:Int=1
    
    // a.println( --b * a + c *d --);
    b-=1
    println(s"( --b * a + c *d --) : ${b*a+c*d}")
    d-=1

    // b.println(a++);
     println(s"a++ : $a");
    a+=1

    // c.println (–2 * ( g – k ) +c);
    println(s"(-2 * ( g - k ) +c) : ${-2*(g-k)+c}")

    // d.println (c=c++);
    println(s"c=c++ : $c")
    c+=1

    // e.println (c=++c*a++);
    c+=1
    println(s"c=++c*a++ : ${c*a}")

}

// 03
def salary(nw:Int,ot:Int):Int={
    nw*250+ot*85
}

def netsalary(nw:Int,ot:Int):Double={
    salary(nw,ot)*0.88
}

// 04
def attendence(price:Int):Int={
    120+(15-price)/5*20
}

def revenue(price:Int):Int={
    attendence(price)*price
}

def cost(price:Int):Int={
    500+attendence(price)*3
}

def profit(price:Int):Int={
    revenue(price)-cost(price)
}






