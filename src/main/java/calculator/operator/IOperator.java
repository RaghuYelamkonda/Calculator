package calculator.operator;

import java.math.BigDecimal;
import java.util.Map;

public interface IOperator {

    BigDecimal apply(Map<String, BigDecimal> contextValues) throws Exception;
}
