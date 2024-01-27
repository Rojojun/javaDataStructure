package org.example.structureStudy.jdkEight;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcurrencyStudyTest {

    @DisplayName("C1 + C2 후 C3의 내용을 출력한다.")
    @Test
    public void 셀_합치기() {
        ConcurrencyStudy cellOne = new ConcurrencyStudy("c1");
        ConcurrencyStudy cellTwo = new ConcurrencyStudy("c2");
        ConcurrencyStudy cellThree = new ConcurrencyStudy("c3");

        cellOne.subscribe(cellThree);

        cellOne.onNext(10);
        cellTwo.onNext(20);
    }
}