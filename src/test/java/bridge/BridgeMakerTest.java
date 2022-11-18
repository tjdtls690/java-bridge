package bridge;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BridgeMakerTest {

    @Nested
    @DisplayName("makeBridge 메소드는")
    class Describe {

        private BridgeMaker bridgeMaker;

        @Nested
        @DisplayName("만약 유효한 generator가 초기화된 상태에서 다리의 크기가 주어지면")
        class ContextWithValidGeneratorAndSize {

            @BeforeEach
            void initBridgeMaker() {
                BridgeRandomNumberGenerator generator = new BridgeRandomNumberGenerator();
                bridgeMaker = new BridgeMaker(generator);
            }

            @ParameterizedTest
            @ValueSource(ints = {3, 4, 5, 6, 7})
            @DisplayName("주어진 크기만큼 다리를 생성해 반환한다")
            void itReturnsBridge(int size) {
                List<String> actualBridge = bridgeMaker.makeBridge(size);

                assertThat(actualBridge.size()).isSameAs(size);
            }
        }
    }
}