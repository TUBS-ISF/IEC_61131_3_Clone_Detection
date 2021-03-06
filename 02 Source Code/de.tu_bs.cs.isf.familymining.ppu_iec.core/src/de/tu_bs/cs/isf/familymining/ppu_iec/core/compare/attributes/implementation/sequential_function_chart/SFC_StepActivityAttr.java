package de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.attributes.implementation.sequential_function_chart;

import de.tu_bs.cs.isf.familymining.ppu_iec.core.compare.interfaces.attributes.language.sequential_function_chart.templates.AbstractSFCImplAttribute;
import de.tu_bs.cs.isf.familymining.ppu_iec.ppuIECmetaModel.sequentialfunctionchart.Step;
import de.tu_bs.cs.isf.familymining.rcp_e4.core.compare.templates.ResultElement;

public class SFC_StepActivityAttr extends AbstractSFCImplAttribute{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5804049127623945449L;
	public static final String UNIT_NAME = "SFC Step Activity Compare";
	public static final String UNIT_DESCRIPTION = "Compares the activity status of a step."; 
	
	public SFC_StepActivityAttr() {
		super(UNIT_NAME, UNIT_DESCRIPTION);
	}

	@Override
	public ResultElement<Step> compare(Step source, Step target) {
		if(source.isIsActive() == target.isIsActive()) {
			return new ResultElement<Step>(source, target, 1f, this);
		} else {
			return new ResultElement<Step>(source, target, 0f, this);
		}
	}
}
