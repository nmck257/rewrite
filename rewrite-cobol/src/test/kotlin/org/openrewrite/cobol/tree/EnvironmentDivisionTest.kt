/*
 * Copyright 2022 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.cobol.tree

import org.junit.jupiter.api.Test

class EnvironmentDivisionTest : CobolTreeTest {

    @Test
    fun identificationDivision() = assertParsePrintAndProcess(
        """
            *****************************************************************
            ENVIRONMENT DIVISION. 
            CONFIGURATION SECTION. 
            SOURCE-COMPUTER. IBM-3081. 
            OBJECT-COMPUTER. IBM-3081. 
            INPUT-OUTPUT SECTION.
            FILE-CONTROL. 
                SELECT INFILE ASSIGN  TO INFILEDD.
                SELECT OUTFILE ASSIGN TO OUTFILEDD.
            *****************************************************************
        """.trimIndent()
    )
}
