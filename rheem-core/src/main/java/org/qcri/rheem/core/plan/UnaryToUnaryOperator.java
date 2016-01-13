package org.qcri.rheem.core.plan;

import org.qcri.rheem.core.types.DataSetType;

/**
 * This operator has a single input and a single output.
 */
public abstract class UnaryToUnaryOperator<InputType, OutputType> extends OperatorBase implements ActualOperator {

    /**
     * Creates a new instance.
     */
    public UnaryToUnaryOperator(DataSetType inputType, DataSetType outputType, Operator parent) {
        super(1, 1, parent);
        this.inputSlots[0] = new InputSlot<>("input", this, inputType);
        this.outputSlots[0] = new OutputSlot<>("output", this, outputType);
    }

    public InputSlot<InputType> getInput() {
        return (InputSlot<InputType>) getInput(0);
    }

    public OutputSlot<OutputType> getOutput() {
        return (OutputSlot<OutputType>) getOutput(0);
    }

    public DataSetType getInputType() {
        return getInput().getType();
    }

    public DataSetType getOutputType() {
        return getOutput().getType();
    }
}
