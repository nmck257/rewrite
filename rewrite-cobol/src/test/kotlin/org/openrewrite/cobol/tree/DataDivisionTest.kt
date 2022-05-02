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

class DataDivisionTest : CobolTreeTest {

    @Test
    fun dataDivision() = assertParsePrintAndProcess(
        """
            *****************************************************************
            DATA DIVISION.
            FILE SECTION. 
            FD  File1
                    LABEL RECORDS ARE STANDARD       
                    DATA RECORD IS RecName      
                    RECORD CONTAINS RecordLength CHARACTERS
                    RECORDING MODE IS F
                    BLOCK CONTAINS 0 RECORDS.
            01  Rec1    PIC X(RecordLength).
            *****************************************************************
            WORKING-STORAGE SECTION.
            01  COUNTERS-AND-ACCUMULATORS.
                05  REC-KTR        PIC S9(4)     COMP.
                05  TOTAL-AMOUNT   PIC S9(3)V99  COMP-3.
                05  INPUT-DATA     PIC X(30).
            *****************************************************************
        """.trimIndent()
    )
}
