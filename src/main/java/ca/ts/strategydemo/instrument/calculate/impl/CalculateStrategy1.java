package ca.ts.strategydemo.instrument.calculate.impl;


import ca.ts.strategydemo.instrument.calculate.CalculateStrategy;
import ca.ts.strategydemo.instrument.calculate.InstrumentType;
import org.springframework.stereotype.Service;

/**
 * @author: Alex Hu
 * @createTime: 2024/05/02 21:54
 * @description:
 */
@Service
public class CalculateStrategy1 implements CalculateStrategy {
    @Override
    public boolean support(InstrumentType type) {
        return (InstrumentType.INSTRUMENT_1).equals(type);
    }

    @Override
    public boolean calculate(String parameters) {
        System.out.println("CalculateStrategy1 Executed. Parameters: " + parameters + ".");
        return true;
    }
}
