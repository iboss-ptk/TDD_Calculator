import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CalculatorTests : FunSpec({
    test("1 + 1 equals 2") { calculate("1 + 1") shouldBe "2" }
    test("1 + 0 equals 1") { calculate("1 + 0") shouldBe "1" }
    test("40 + 30 equals 70") { calculate("40 + 30") shouldBe "70"}
    test("2 + 2 equals 4") { calculate("2 + 2") shouldBe "4"}
})
