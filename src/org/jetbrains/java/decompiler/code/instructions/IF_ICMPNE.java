package org.jetbrains.java.decompiler.code.instructions;

import java.io.DataOutputStream;
import java.io.IOException;

import org.jetbrains.java.decompiler.code.JumpInstruction;

public class IF_ICMPNE extends JumpInstruction {

	public void writeToStream(DataOutputStream out, int offset) throws IOException {
		out.writeByte(opc_if_icmpne);
		out.writeShort(getOperand(0));
	}
	
	public int length() {
		return 3;
	}
	
}