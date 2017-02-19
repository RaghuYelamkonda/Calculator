package calculator.operator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class LetOperator extends BaseOperator {

    public BigDecimal apply(Map<String, BigDecimal> contextValues) throws Exception {
        super.apply("Let", 3);
        Map<String, BigDecimal> contextValuesCopy = new HashMap<>(contextValues);
        contextValuesCopy.put(operands.get(0), getValue(operands.get(1), contextValues));
        return getValue(operands.get(2), contextValuesCopy);
    }
}
