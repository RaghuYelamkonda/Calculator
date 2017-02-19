package calculator.operator;

import calculator.Calculator;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public abstract class BaseOperator implements IOperator {

    protected Logger logger;
    protected List<String> operands;
    private Calculator calculator;

    public BaseOperator() {
        calculator = Calculator.getInstance();
        logger = Logger.getLogger(BaseOperator.class);
    }

    public void setOperands(List<String> operands) {
        this.operands = operands;
    }

    protected void apply(String operator, int numOperandsRequired) throws Exception {
        String expression = String.join(",", operands);
        if (operands.size() != numOperandsRequired) {
            logger.error("Operands mismatch for " + operator + " on " + expression + ". Expected " + numOperandsRequired + " but found " + operands.size());
            throw new Exception("Operands mismatch for " + operator + " on " + expression + ". Expected " + numOperandsRequired + " but found " + operands.size());
        }
        logger.debug("Applying Add operator on " + expression);
    }

    protected BigDecimal getValue(String operand, Map<String, BigDecimal> contextValues) throws Exception {
        if (contextValues.containsKey(operand)) {
            return contextValues.get(operand);
        }
        try {
            return new BigDecimal(operand);
        } catch (NumberFormatException nfe) {
            return calculator.evaluateExpression(operand, contextValues);
        }
    }
}
