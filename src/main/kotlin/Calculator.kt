class Calculator {
    //parse function parses the input. Correct format would be:
    //a op b
    //a -> Int op-> String b-> Int
    fun parse(s: String): Int {
        val (a,op,b) = s.split(" ")
        return when(op) {
            "*" -> a.toInt() * b.toInt()
            "/" -> a.toInt() / b.toInt()
            "+" -> a.toInt() + b.toInt()
            "-" -> a.toInt() - b.toInt()
            "g" -> gcd(a.toInt(),b.toInt())
            else -> throw IllegalArgumentException("Invalid Operator")
        }
    }
    //gcd function calculates Greatest Common Divisor
    //takes two inputs and returns the gcd of them in Int.
    fun gcd(n1:Int, n2:Int): Int {
        var gcd = 1
        var i = 1
        while (i <= n1 && i <= n2) {
            // Checks if i is factor of both integers
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i
            ++i
        }
        return gcd
    }

}
