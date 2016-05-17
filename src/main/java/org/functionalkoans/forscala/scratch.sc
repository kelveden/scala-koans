import java.math.BigInteger
implicit def Int2BigIntegerConvert(value: Int) = new BigInteger(value.toString)

def add(a: BigInteger, b: BigInteger) = a.add(b)

add(3,42)