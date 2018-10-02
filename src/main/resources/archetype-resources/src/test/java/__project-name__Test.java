package ${package};

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
@DisplayName("Given my application is running")
@ExtendWith({/*Extend me*/})
class ${project-name}Test
{

    @Nested
    @DisplayName("When I want demo tests")
    class DemoTests {

        @Test
        @DisplayName("Then assertTrue should return true")
        void shouldAnswerWithTrue() {

            assertAll(
                    () -> assertTrue(true)
            );

        }

    }
}
