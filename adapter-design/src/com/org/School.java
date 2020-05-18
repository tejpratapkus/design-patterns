package com.org;

import com.org.adapter.PenAdapter;

public class School {

	public static void main(String[] args) {

		Pen pen = new PenAdapter();
		AssignmentWork aw = new AssignmentWork();
		aw.setPen(pen);
		aw.writeAssignment("This is the adapter design pattern.");
	}
}
