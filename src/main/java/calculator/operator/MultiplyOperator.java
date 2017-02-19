package calculator.operator;

import java.math.BigDecimal;
import java.util.Map;

public class MultiplyOperator extends BaseOperator {

    public BigDecimal apply(Map<String, BigDecimal> contextValues) throws Exception {
        super.apply("Multiply", 2);
        return getValue(operands.get(0), contextValues).multiply(getValue(operands.get(1), contextValues));
    }
}
