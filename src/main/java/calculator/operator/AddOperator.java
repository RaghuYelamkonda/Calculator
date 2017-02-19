package calculator.operator;

import java.math.BigDecimal;
import java.util.Map;

public class AddOperator extends BaseOperator {

    public BigDecimal apply(Map<String, BigDecimal> contextValues) throws Exception {
        super.apply("Add", 2);
        return getValue(operands.get(0), contextValues).add(getValue(operands.get(1), contextValues));
    }
}
