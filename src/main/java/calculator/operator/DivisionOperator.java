package calculator.operator;

import java.math.BigDecimal;
import java.util.Map;

public class DivisionOperator extends BaseOperator {

    public BigDecimal apply(Map<String, BigDecimal> contextValues) throws Exception {
        super.apply("Division", 2);
        BigDecimal denominator = getValue(operands.get(1), contextValues);
        if (denominator.compareTo(BigDecimal.ZERO) != 0) {
            return getValue(operands.get(0), contextValues).divide(denominator, 5, BigDecimal.ROUND_HALF_UP);
        } else {
            String input = String.join(",", operands);
            logger.error("Unable to evaluate expression. Expression contains division with 0 : " + input);
            throw new Exception("Unable to evaluate expression. Expression contains division with 0 : " + input);
        }
    }
}
