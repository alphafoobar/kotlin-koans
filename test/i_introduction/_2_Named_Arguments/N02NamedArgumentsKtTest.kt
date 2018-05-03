package i_introduction._2_Named_Arguments

import i_introduction._1_Java_To_Kotlin_Converter.task1
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat

class N02NamedArgumentsKtTest {

    @org.junit.Test fun testJoinToString() {
        assertThat(task1(listOf(1, 2, 3, 42, 555)), equalTo("{1, 2, 3, 42, 555}"))
    }
}
