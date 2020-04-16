import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CalculatorTests : FunSpec({
    test("1 + 1 equals 2") { calculate("1 + 1") shouldBe 2 }
})
