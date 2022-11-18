package bridge;

import bridge.BridgeNumberGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class BridgeNumberGeneratorTest {
    @Test
    @DisplayName("숫자 생성")
    void generate() {
        BridgeNumberGenerator bridgeNumberGeneratorOne = () -> 1;
        BridgeNumberGenerator bridgeNumberGeneratorZero = () -> 0;
        
        assertAll(
                () -> assertThat(bridgeNumberGeneratorOne.generate()).isEqualTo(1),
                () -> assertThat(bridgeNumberGeneratorZero.generate()).isZero()
        );
    }
}