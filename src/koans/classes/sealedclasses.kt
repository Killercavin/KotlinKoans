package koans.classes

/*
Reuse your solution from the previous task, but replace the interface with the sealed interface. Then you no longer need the else branch in when.
 */

fun sealedEval(sealedExpr: SealedExpr): Int =
    when (sealedExpr) {
        is SealedNum -> sealedExpr.value
        is SealedSum -> sealedEval(sealedExpr.left)  + sealedEval(sealedExpr.right)
        // else -> throw IllegalArgumentException("Unknown expression") // this is redundant since Kotlin knows all possible values to expect
    }

sealed interface SealedExpr
class SealedNum(val value: Int) : SealedExpr
class SealedSum(val left: SealedExpr, val right: SealedExpr) : SealedExpr