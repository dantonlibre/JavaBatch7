package com.syntax.class28;
	//We have to calculate the average of marks obtained in three subjects by
	// student A and by student B. Create class 'Marks' with an abstract method
	// 'getPercentage' that will be returning the average percentage of marks.
	// Provide implementation of abstract method in classes 'A' and 'B'. The
	// constructor of student A takes the marks in three subjects as its parameters
	// and the marks in four subjects as its parameters for student B. Test your
	// code
	public abstract class Marks {
		public abstract int getPercentage();
	}
	class A extends Marks {
		int subjects;
		int math, history, biology;
		A(int subjects,int math, int history, int biology) {
			this.subjects = subjects;
			this.math = math;
			this.history = history;
			this.biology = biology;
		}
		public int getPercentage() {
			int average = (math + history + biology) / subjects;
			return average;
		}
	}
	class B extends A {
		int language;
		B(int subjects,int math, int history, int biology, int language) {
			super(subjects,math, history, biology);
			this.language = language;
		}
		public int getPercentage() {
			int average = (math + history + biology + language) / subjects;
			return average;
		}
	}

