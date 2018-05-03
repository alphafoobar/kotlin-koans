package i_introduction._1_Java_To_Kotlin_Converter

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class N01JavaToKotlinConverterKtTest {
    @Test fun collection() {
        assertThat(task1(listOf(1, 2, 3, 42, 555)), equalTo("{1, 2, 3, 42, 555}"))
    }
}
