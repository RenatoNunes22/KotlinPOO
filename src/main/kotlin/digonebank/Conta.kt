package digonebank

import sun.jvm.hotspot.oops.BitData
import java.math.BigDecimal
import java.util.BitSet

class Conta(
    val agencia: String,
    val numacao: String,
    val saldo: BigDecimal
) {
    fun deposito(valor: BigDecimal){

    }
    fun saque(valor: BigDecimal){

    }
}