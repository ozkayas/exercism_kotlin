import java.lang.Exception
import java.lang.IllegalArgumentException

object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        var sum: Int = 0;
        if (leftStrand.length != rightStrand.length)
            throw IllegalArgumentException("left and right strands must be of equal length")

        for (i in leftStrand.indices)     {
            if (leftStrand[i]!=rightStrand[i]){
                sum++
            }
        }
        return sum
    }
}
