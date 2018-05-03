package i_introduction._3_Default_Arguments

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class N03DefaultArgumentsKtTest {

    @Test fun testDefaultAndNamedParams() {
        assertThat(task3(), equalTo("a42b1C42D2"))
    }
}