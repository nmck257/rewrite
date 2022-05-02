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

class ProcedureDivisionTest : CobolTreeTest {

    @Test
    fun procedureDivision() = assertParsePrintAndProcess(
        """
            ******************************************************************
            PROCEDURE DIVISION.
                PERFORM 000-HOUSEKEEPING THRU 000-EXIT.
                PERFORM 100-MAINLINE THRU 100-EXIT
                        UNTIL NO-MORE-RECORDS.
                PERFORM 200-CLEANUP THRU 200-EXIT.
                GOBACK.

            ******************************************************************
            *  This routine should perform file open and an initial read
            ******************************************************************
            000-HOUSEKEEPING.
                DISPLAY "000-HOUSEKEEPING".
            *  Code your statement here to OPEN files
            *     ACCEPT  WS-DATE FROM DATE.
            *     OPEN INPUT INFILE.
            *     OPEN OUTPUT OUTFILE, RPTFILE, ERRFILE.

            *  Code your statement here to read the input file
            *  Remember to move "NO" to IFCODE if the input file is AT END
            *     READ INFILE INTO WS-INPUT-REC
            *         AT END
            *         MOVE 'N' TO MORE-RECORDS-SW
            *         GO TO 000-EXIT
            *     END-READ
            *     INITIALIZE  COUNTERS-AND-ACCUMULATORS,
            *                 WS-OUTPUT-REC,
            *                 WS-TOTALS-REC
            *     ADD +1 TO RECORDS-READ.
            000-EXIT.
                EXIT.

            ******************************************************************
            *  This routine contains the business logic for the program
            ******************************************************************
            100-MAINLINE.
            *  Validate patient type and insurance coverage

            *  Add to counters and total amounts

            *  Move input data to output data
            *      move in-rec TO out-rec.
            *     WRITE RPT-REC FROM WS-OUTPUT-REC.

            *  Code your statements here to read the input file
            *  Remember to move "NO" to IFCODE if the input file is AT END
            *     READ INFILE INTO WS-INPUT-REC
            *         AT END MOVE "N" TO MORE-RECORDS-SW
            *         GO TO 100-EXIT
            *     END-READ
            *     ADD +1 TO RECORDS-READ.
            100-EXIT.
                EXIT.

            ******************************************************************
            *  This routine should perform file close operations
            ******************************************************************
            200-CLEANUP.
            *  Move the final computational fields
                DISPLAY "200-CLEANUP".


            *  Code the statement write the final output record
            *     WRITE RPT-REC FROM WS-TOTALS-REC.
            *  Code the statement to close all files
            *     CLOSE OUTFILE, RPTFILE, ERRFILE, INFILE.
            *  Code the statement to Display a successful end-of-job message
                DISPLAY "NORMAL END OF JOB".
            200-EXIT.
                EXIT.
        """.trimIndent()
    )
}
