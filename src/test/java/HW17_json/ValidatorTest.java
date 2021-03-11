package HW17_json;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    String trueValid = "{abcdefg}{123}{okay}{bad_job}";
    String falseValid = "{{22{22}22}}}11}}awl{";
    String trueValidv2 = "{name}{username}{age}{street}";
    String falseValidv2 = "{{22{22}22}}}11}}awl{";


    @Test
    void areParenthesesBalanced() {
        assertTrue(Validator.areParenthesesBalanced(trueValid));
        assertFalse(Validator.areParenthesesBalanced(falseValid));
        assertTrue(Validator.areParenthesesBalanced(trueValidv2));
        assertFalse(Validator.areParenthesesBalanced(falseValidv2));
    }
}